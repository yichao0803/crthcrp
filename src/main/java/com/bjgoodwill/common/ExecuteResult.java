package com.bjgoodwill.common;

/// <summary>
/// 执行一个动作操作，返回结果的抽象
/// </summary>
public class ExecuteResult {
    /// <summary>
    /// 执行结果状态码
    /// </summary>
    private int Code;
    /// <summary>
    /// 执行结果对应的消息通知
    /// </summary>
    private String Message;

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
