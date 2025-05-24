package com.windy.demo.entity;

public class ResponseModel {

    private String code;
    private String message;
    private Object data;

    public ResponseModel() {
    }

    public ResponseModel(String code, String message, Object data) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
