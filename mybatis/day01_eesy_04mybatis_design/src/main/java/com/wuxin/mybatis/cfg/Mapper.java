package com.wuxin.mybatis.cfg;

/**
 * @author wuxin
 * @create 2020-03-29-17:48
 * 用于封装执行SQl语句和结果类型的全限定类名
 */
public class Mapper {
    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    private String queryString;//sql
    private String resultType;//实体类的全限定类名
}
