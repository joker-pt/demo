package com.oa.emailservice.entity;

/**
 * @author jayson
 * @version 2.0
 * @date 2021-07-07 16:38
 */
public class EmailEntity {

    //收件人工号
    private String toEmpNo;
    //收件人名称
    private String toEmpName;
    //抄送人工号
    private String ccEmpNos;
    //密送人工号
    private String bccEmpNos;
    //模块id
    private Integer moduleId;
    //模块名称
    private String moduleName;
    //文件路径，多个逗号隔开
    private String filePath;

    //文件路径，多个逗号隔开
    private Integer isAttach;

    public String getToEmpNo() {
        return toEmpNo;
    }

    public void setToEmpNo(String toEmpNo) {
        this.toEmpNo = toEmpNo;
    }

    public String getToEmpName() {
        return toEmpName;
    }

    public void setToEmpName(String toEmpName) {
        this.toEmpName = toEmpName;
    }

    public String getCcEmpNos() {
        return ccEmpNos;
    }

    public void setCcEmpNos(String ccEmpNos) {
        this.ccEmpNos = ccEmpNos;
    }

    public String getBccEmpNos() {
        return bccEmpNos;
    }

    public void setBccEmpNos(String bccEmpNos) {
        this.bccEmpNos = bccEmpNos;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getIsAttach() {
        return isAttach;
    }

    public void setIsAttach(Integer isAttach) {
        this.isAttach = isAttach;
    }

    @Override
    public String toString() {
        return "EmailEntity{" +
                "toEmpNo='" + toEmpNo + '\'' +
                ", toEmpName='" + toEmpName + '\'' +
                ", ccEmpNos='" + ccEmpNos + '\'' +
                ", bccEmpNos='" + bccEmpNos + '\'' +
                ", moduleId=" + moduleId +
                ", moduleName='" + moduleName + '\'' +
                ", filePath='" + filePath + '\'' +
                ", isAttach=" + isAttach +
                '}';
    }
}
