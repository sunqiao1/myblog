package com.sunqiao.myblog.util;

import java.io.Serializable;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 21:07
 * @Since 2019
 *
 *
 */
public class JsonResult implements Serializable {
    public static final int SUCCESS = 0;
    public static final int ERROR = 1;

    private int state;
    private String message;
    private Object data;

    public JsonResult() {
    }

    public JsonResult(String error) {
        state = ERROR;
        this.message = error;
    }


    public JsonResult(Object data) {
        state = SUCCESS;
        this.data = data;
    }


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static int getSUCCESS() {
        return SUCCESS;
    }

    public static int getERROR() {
        return ERROR;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "state=" + state +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
