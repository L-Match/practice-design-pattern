package com.practice.design.pattern.status_pattern;

/**
 * @Author Liu Chang
 * @Date 2020/11/23 11:14 上午
 */
public abstract class EmployeeStatus {

    protected Context context;
    public void setContext(Context context){
        this.context = context;
    }

    public void employ() {}

    public void resign() {}
}
