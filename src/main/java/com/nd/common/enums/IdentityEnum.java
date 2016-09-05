package com.nd.common.enums;

/**
 * Created by newtonk on 2016/8/18 0018.
 */
public enum IdentityEnum {
    TEACHER("teacher"),//学生
    STUDENT("student");//老师


    private String code;
    IdentityEnum(String code){
        this.code= code;
    }
    public String getCode(){
        return this.code;
    }

}
