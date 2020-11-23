package com.practice.design.pattern.status_pattern;

import com.practice.design.pattern.status_pattern.status.IncomingEmployeeStatus;
import com.practice.design.pattern.status_pattern.status.RegularEmployeeStatus;
import com.practice.design.pattern.status_pattern.status.ResigningEmployeeStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author Liu Chang
 * @Date 2020/11/23 11:27 上午
 */
public class Context {

    /**
     * define all status
     */
    public final static IncomingEmployeeStatus incomingEmployeeStatus = new IncomingEmployeeStatus();

    public final static RegularEmployeeStatus regularEmployeeStatus = new RegularEmployeeStatus();

    public final static ResigningEmployeeStatus resigningEmployeeStatus = new ResigningEmployeeStatus();

    /**
     * define current status
     */
    @Getter
    private EmployeeStatus employeeStatus;

    public void setEmployeeStatus(EmployeeStatus employeeStatus){
        this.employeeStatus = employeeStatus;
        this.employeeStatus.setContext(this);
    }

}
