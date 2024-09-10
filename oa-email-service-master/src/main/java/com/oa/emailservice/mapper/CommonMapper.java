package com.oa.emailservice.mapper;

import com.oa.emailservice.entity.EmailEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author jayson
 * @version 2.0
 * @date 2021-07-07 16:46
 */
@Mapper
public interface CommonMapper {

   List<EmailEntity> getEMailInfo(@Param("dateDir") String dateDir,@Param("moduleId") Integer moduleId);

    List<EmailEntity> getEMailInfoLong(@Param("dateDir") String dateDir,@Param("moduleId") Integer moduleId);
}
