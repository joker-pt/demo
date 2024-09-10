package com.oa.emailservice.aop;

import com.alibaba.fastjson.JSONObject;
import com.oa.emailservice.entity.ControllerLog;
import com.oa.emailservice.utils.IpAddr;
import io.swagger.annotations.ApiOperation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@Aspect
@Configuration
public class OperationLogAspect {
    private final static Logger logger = LoggerFactory.getLogger(OperationLogAspect.class);
    @Resource
    private HttpServletRequest request;

    @Around("execution(public * *(..)) && @annotation(com.oa.emailservice.annotation.OperationLog)")
    public Object interceptor(ProceedingJoinPoint pjp) throws Throwable {

        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();

        ApiOperation apiOperation = method.getAnnotation(ApiOperation.class);

        Object proceed = pjp.proceed();

        ControllerLog controllerLog = handleControllerLog(pjp, proceed);
        logger.info(controllerLog.toString());
        return proceed;

    }

    private ControllerLog handleControllerLog(ProceedingJoinPoint pjp, Object proceed) throws UnknownHostException {
        Object[] args = pjp.getArgs();
        long startTimeMillis = System.currentTimeMillis();
        ControllerLog controllerLog = new ControllerLog();
        controllerLog.setUserIp(IpAddr.getIpAddr(request));
        try {
            controllerLog.setParamStr(JSONObject.toJSON(args).toString());
        } catch (Exception e) {
            try {
                controllerLog.setParamStr(Arrays.toString(args));
            } catch (Exception e1) {
                controllerLog.setParamStr("json数据转换错误");
            }

        }
        controllerLog.setRequestUri(request.getRequestURI() + (request.getQueryString() == null ? "" : ("?" + request.getQueryString())));
        controllerLog.setUserAgent(request.getHeader("user-agent"));
        controllerLog.setExecutionTime(System.currentTimeMillis() - startTimeMillis);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        controllerLog.setCreateTime(sdf.format(new Date()));

        controllerLog.setComputerName(InetAddress.getLocalHost().getHostName());
        controllerLog.setReturnArgs(JSONObject.toJSON(proceed).toString());
        return controllerLog;
    }


}
