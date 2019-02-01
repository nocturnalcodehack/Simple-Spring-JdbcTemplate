package com.frickinwerks.helper;

import com.frickinwerks.bean.CarList;

public class FindCarInBean {

    public Integer getPrice (String s){
        return CarList.getPrice(s);
    }
}
