package com.oa.emailservice.service;

import com.oa.emailservice.entity.CopyPOJO;
import com.oa.emailservice.entity.ParamDTO;

import java.util.List;

/**
 * @author jayson
 * @version 2.0
 * @date 2021-07-07 16:41
 */
public interface EmailSendService {

    List<String> sendEmail(ParamDTO paramDTO);

    Integer copy(CopyPOJO copyPOJO);

    List<String> sendEmailLong(ParamDTO paramDTO);
}
