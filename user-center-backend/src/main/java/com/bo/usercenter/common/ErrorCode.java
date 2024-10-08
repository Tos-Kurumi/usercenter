package com.bo.usercenter.common;

import lombok.Getter;

/**
 * 错误码
 */

@Getter
public enum ErrorCode {
    SUCCESS(0,"ok",""),
    PRAMS_ERROR(40000,"请求参数错误",""),
    NULL_ERROR(40001,"请求数据为空",""),
    NO_AUTH(40100,"无权限",""),
    NO_LOGIN(40101,"未登录",""),
    SYSTEM_ERROR(50000,"系统内部异常","");


    private final int code;
    private final String message;
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

}
