package com.hzzl.sg.enums;

/**
 * 异常状态枚举类
 */
public enum ResultEnum {
    UNKNOW_ERROR(-100, "未知错误！"),
    NEED_LOGIN(-1, "未登录！"),
    REPEAT_REGISTER(-2, "该用户已注册！"),
    USER_NOT_EXIST(-3, "不存在该用户"),
    PASSWORD_ERROR(-4, "密码错误"),
    SUCCESS(0, "成功");

    private Integer code;
    private String msg;


    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
