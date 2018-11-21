package com.ttyc.spring.chapter6.editor;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

public class CarEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Assert.isTrue(!StringUtils.isEmpty(text) && text.contains("," ), "illegal property" );

        String[] val = text.split("," );

        Car car = new Car();
        car.setName(val[0]);
        car.setColor(val[1]);

        this.setValue(car);
    }
}
