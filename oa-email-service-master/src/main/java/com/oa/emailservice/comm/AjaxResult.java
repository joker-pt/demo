package com.oa.emailservice.comm;

/**
 * @author jayson
 * @version 2.0
 * @date 2021-07-07 16:34
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
import org.apache.axis.utils.BeanUtils;

import java.beans.ConstructorProperties;

public class AjaxResult<T> {
    private long status = 200L;
    private String error = "成功";
    private String message = "操作成功";
    private T data;
    private String logContent = "";
    private String detailed;

    public AjaxResult<T> success(String error, String message) {
        this.error = error;
        this.message = message;
        return this;
    }

    public AjaxResult<T> success(T data) {
        this.data = data;
        return this;
    }

    public AjaxResult<T> success() {
        return this;
    }

    public AjaxResult<T> success(long code, String error, String message) {
        this.error = error;
        this.message = message;
        this.status = code;
        return this;
    }

    public AjaxResult<T> error(String error) {
        this.error = error;
        this.message = error;
        this.status = 500L;
        return this;
    }

    public AjaxResult<T> error(long code, String error, T data) {
        this.error = error;
        this.message = error;
        this.data = data;
        this.status = code;
        return this;
    }

    public AjaxResult<T> error(long code, Exception error, T data) {
        this.error = error.getMessage() == null ? error.getClass().getSimpleName() : error.getMessage();
        this.message = error.getMessage();
        this.data = data;
        this.status = code;
        return this;
    }

    public AjaxResult<T> error(String error, T data) {
        this.error = error;
        this.message = error;
        this.data = data;
        this.status = 500L;
        return this;
    }

    public AjaxResult<T> log(String content) {
        this.logContent = content;
        return this;
    }

    public AjaxResult<T> detailed(String detailed) {
        this.detailed = detailed;
        return this;
    }

    public static <T> AjaxResult.AjaxResultBuilder<T> builder() {
        return new AjaxResult.AjaxResultBuilder();
    }

    public long getStatus() {
        return this.status;
    }

    public String getError() {
        return this.error;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public String getLogContent() {
        return this.logContent;
    }

    public String getDetailed() {
        return this.detailed;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public void setDetailed(String detailed) {
        this.detailed = detailed;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof AjaxResult)) {
            return false;
        } else {
            AjaxResult<?> other = (AjaxResult)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getStatus() != other.getStatus()) {
                return false;
            } else {
                label73: {
                    Object this$error = this.getError();
                    Object other$error = other.getError();
                    if (this$error == null) {
                        if (other$error == null) {
                            break label73;
                        }
                    } else if (this$error.equals(other$error)) {
                        break label73;
                    }

                    return false;
                }

                Object this$message = this.getMessage();
                Object other$message = other.getMessage();
                if (this$message == null) {
                    if (other$message != null) {
                        return false;
                    }
                } else if (!this$message.equals(other$message)) {
                    return false;
                }

                label59: {
                    Object this$data = this.getData();
                    Object other$data = other.getData();
                    if (this$data == null) {
                        if (other$data == null) {
                            break label59;
                        }
                    } else if (this$data.equals(other$data)) {
                        break label59;
                    }

                    return false;
                }

                Object this$logContent = this.getLogContent();
                Object other$logContent = other.getLogContent();
                if (this$logContent == null) {
                    if (other$logContent != null) {
                        return false;
                    }
                } else if (!this$logContent.equals(other$logContent)) {
                    return false;
                }

                Object this$detailed = this.getDetailed();
                Object other$detailed = other.getDetailed();
                if (this$detailed == null) {
                    if (other$detailed != null) {
                        return false;
                    }
                } else if (!this$detailed.equals(other$detailed)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof AjaxResult;
    }


    public String toString() {
        return "AjaxResult(status=" + this.getStatus() + ", error=" + this.getError() + ", message=" + this.getMessage() + ", data=" + this.getData() + ", logContent=" + this.getLogContent() + ", detailed=" + this.getDetailed() + ")";
    }

    @ConstructorProperties({"status", "error", "message", "data", "logContent", "detailed"})
    public AjaxResult(long status, String error, String message, T data, String logContent, String detailed) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.data = data;
        this.logContent = logContent;
        this.detailed = detailed;
    }

    public AjaxResult() {
    }

    public static class AjaxResultBuilder<T> {
        private long status;
        private String error;
        private String message;
        private T data;
        private String logContent;
        private String detailed;

        AjaxResultBuilder() {
        }

        public AjaxResult.AjaxResultBuilder<T> status(long status) {
            this.status = status;
            return this;
        }

        public AjaxResult.AjaxResultBuilder<T> error(String error) {
            this.error = error;
            return this;
        }

        public AjaxResult.AjaxResultBuilder<T> message(String message) {
            this.message = message;
            return this;
        }

        public AjaxResult.AjaxResultBuilder<T> data(T data) {
            this.data = data;
            return this;
        }

        public AjaxResult.AjaxResultBuilder<T> logContent(String logContent) {
            this.logContent = logContent;
            return this;
        }

        public AjaxResult.AjaxResultBuilder<T> detailed(String detailed) {
            this.detailed = detailed;
            return this;
        }

        public AjaxResult<T> build() {
            return new AjaxResult(this.status, this.error, this.message, this.data, this.logContent, this.detailed);
        }

        public String toString() {
            return "AjaxResult.AjaxResultBuilder(status=" + this.status + ", error=" + this.error + ", message=" + this.message + ", data=" + this.data + ", logContent=" + this.logContent + ", detailed=" + this.detailed + ")";
        }
    }
}
