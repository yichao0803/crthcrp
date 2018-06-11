package com.bjgoodwill.common;

import com.bjgoodwill.common.ExecuteResult;
import com.bjgoodwill.common.DataResult;

public class BaseController {
    protected int SUCCESCODE = 0;
    protected int ERRORCODE99 = 99;
    protected String SUCCESMESSAGE = "";

    protected  ExecuteResult FromBoolean(Boolean result)
    {
       return  FromBoolean(result,0,"");
    }

    protected  ExecuteResult FromBoolean(Boolean result, int code, String message)
    {
        ExecuteResult exeResult=new ExecuteResult();
        exeResult.setCode(result ? 0 : code);
        exeResult.setMessage(message);
        return  exeResult;
    }

    protected DataResult FromObject(Object data, long total)
    {
         return  FromObject(data,total,0,"");
    }

    protected DataResult FromObject(Object data, long total, int code, String message)
    {
        DataResult dataResult=new DataResult();
        dataResult.setData(data);
        dataResult.setCode(code);
        dataResult.setTotal(total);
        dataResult.setMessage(message);
        return dataResult;
    }

    protected  String FromBooleanToJson(Boolean result)
    {
        return  this.ToJson(FromBoolean(result));
    }

    protected  String FromBooleanToJson(Boolean result, int code, String message)
    {
        return  this.ToJson(FromBoolean(result,code,message));
    }

    protected  String FromObjectToJson(Object data, long total)
    {
        return  this.ToJson(FromObject(data,total));
    }

    protected  String FromObjectToJson(Object data, long total, int code, String message)
    {
        return  this.ToJson(FromObject(data,total,code,message));
    }

    protected  String ToJson(ExecuteResult executeResult){
        return com.alibaba.fastjson.JSON.toJSONString(executeResult,false);
    }
}
