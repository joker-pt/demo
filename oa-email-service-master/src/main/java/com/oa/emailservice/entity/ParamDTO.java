package com.oa.emailservice.entity;

/**
 * @author jayson
 * @version 2.0
 * @date 2021-07-07 16:37
 */
public class ParamDTO {

    //模块类型id
    private Integer moduleId;
    //发送人工号
    private String sendEmpNo;
    //邮件标题
    private String subject;
    //邮件正文
    private String content;
    //文件日期目录
    private String dateDir;

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getSendEmpNo() {
        return sendEmpNo;
    }

    public void setSendEmpNo(String sendEmpNo) {
        this.sendEmpNo = sendEmpNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateDir() {
        return dateDir;
    }

    public void setDateDir(String dateDir) {
        this.dateDir = dateDir;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"moduleId\":")
                .append(moduleId);
        sb.append(",\"sendEmpNo\":\"")
                .append(sendEmpNo).append('\"');
        sb.append(",\"subject\":\"")
                .append(subject).append('\"');
        sb.append(",\"content\":\"")
                .append(content).append('\"');
        sb.append(",\"dateDir\":\"")
                .append(dateDir).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
