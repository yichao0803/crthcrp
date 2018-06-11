package com.bjgoodwill.common;
// import  com.bjgoodwill.common.ExecuteResult;

/// <summary>
/// 执行一个获取操作，返回结果的抽象
/// </summary>
/// <typeparam name="T"></typeparam>
public class DataResult extends ExecuteResult{
    /// <summary>
    /// 结果集
    /// </summary>
    private Object Data;
    /// <summary>
    /// 总大小
    /// </summary>
    private long Total;

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }

    public long getTotal() {
        return Total;
    }

    public void setTotal(long total) {
        Total = total;
    }
}
