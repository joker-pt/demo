package com.oa.emailservice.entity;

import lombok.*;

/**
 * 操作日志实体
 * add by Jimmy
 */
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ControllerLog {
    //用户ip
    private String userIp;
    //操作参数
    private String paramStr;
    //请求操作
    private String requestUri;
    //模块
    private String module;
    //浏览器信息
    private String userAgent;
    //执行时长
    private Long executionTime;
    //操作时间
    private String createTime;
    //返回参数
    private String returnArgs;

    private String computerName;

    @Override
    public String toString() {
        return "{\n" +
                "访问IP=" + userIp + '\n' +
                "访问主机名称=" + computerName + '\n' +
                "操作时间=" + createTime + '\n' +
                "终端信息=" + userAgent + '\n' +
                "请求地址=" + requestUri + '\n' +
                "请求参数=" + paramStr + '\n' +
                "返回参数=" + returnArgs + '\n' +
                "执行时长=" + executionTime + '\n' +
                '}';
    }
}
