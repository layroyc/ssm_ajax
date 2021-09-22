package com.xiexin.utils.code;


import lombok.Data;

import java.util.List;


/**
 *   箭头
 * 该类  是 数据结果,  数据结果 调用  BaseResponseCode 这个对象
 * @param <T>
 */

@Data
public class DataResult <T>{


    private long count;
    private Integer currentPage;
    private Integer limit; //条数 pageSize
    private Integer totalPageNum;


    /**
     * 请求响应code， 0表示请求成功 其它表示失败
     */
    private int code;

    /**
     * 响应客户端的提示
     */
    private String msg;

    /**
     * 响应客户端内容
     */
    private T data;

    public DataResult(int code, T data) {
        this.code = code;
        this.data = data;
        this.msg=null;
    }

    public DataResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public DataResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data=null;
    }

    public DataResult() {
        this.code=BaseResponseCode.SUCCESS.getCode();
        this.msg=BaseResponseCode.SUCCESS.getMsg();
        this.data=null;
    }


    public DataResult(T data) {
        this.data = data;
        this.code=BaseResponseCode.SUCCESS.getCode();
        this.msg=BaseResponseCode.SUCCESS.getMsg();
    }

    public DataResult(ResponseCodeInterface responseCodeInterface) {
        this.data = null;
        this.code = responseCodeInterface.getCode();
        this.msg = responseCodeInterface.getMsg();
    }

    public DataResult(ResponseCodeInterface responseCodeInterface, T data) {
        this.data = data;
        this.code = responseCodeInterface.getCode();
        this.msg = responseCodeInterface.getMsg();
    }
    /**
     * 操作成功 data为null

     */
    public static <T>DataResult success(){
        return new <T>DataResult();
    }


    /**
     * 操作成功 data 不为null

     */
    public static <T>DataResult success(T data){
        return new <T>DataResult(data);
    }
    /**
     * 自定义 返回操作 data 可控

     */
    public static <T>DataResult getResult(int code,String msg,T data){
        return new <T>DataResult(code,msg,data);
    }
    /**
     *  自定义返回  data为null

     */
    public static <T>DataResult getResult(int code,String msg){
        return new <T>DataResult(code,msg);
    }
    /**
     * 自定义返回 入参一般是异常code枚举 data为空

     */
    public static <T>DataResult getResult(BaseResponseCode responseCode){
        return new <T>DataResult(responseCode);
    }
    /**
     * 自定义返回 入参一般是异常code枚举 data 可控

     */
    public static <T>DataResult getResult(BaseResponseCode responseCode, T data){

        return new <T>DataResult(responseCode,data);
    }

    // 返回的 成功或者失败的工具类
    public static <T>DataResult getDataResult(DataResult result, int i) {
        if (i == 1) {
            result.setCode(200);
            result.setMsg("操作成功");
            return result;
        } else {
            result.setCode(400);
            result.setMsg("操作失败");
            return result;
        }
    }

    //xin 返回分页的工具类
    public static <T>DataResult  getPageDataResult(Integer page,  Integer limit, DataResult result, List<T> datas, long l) {
        int totalPageNum = (int) ((l  +  limit  - 1) / limit);
        result.setData(datas);
        result.setCode(200);
        result.setCount(l);
        result.setTotalPageNum(totalPageNum);
        result.setCurrentPage(page);
        return result;
    }

}
