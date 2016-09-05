package com.nd.common.enums;

/**
 * Created by newtonk on 2016/8/18 0018.
 */
public enum CourseEnum {
    CN("语文"),MA("数学"),EN("英语"),HI("历史"),GE("地理"),PO("思想品德"),BI("生物"),PH("物理"),CH("化学");

    private String code;


    CourseEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static boolean isContain(String courseCode){
        for (CourseEnum courseEnum : CourseEnum.values()) {
            if(courseEnum.getCode().equals(courseCode)){
                return true;
            }
        }
        return false;
    }

    public static CourseEnum getEnum(String courseCode){
        for (CourseEnum courseEnum : CourseEnum.values()) {
            if (courseEnum.getCode().equals(courseCode)) {
                return courseEnum;
            }
        }
        return null;
    }
}
