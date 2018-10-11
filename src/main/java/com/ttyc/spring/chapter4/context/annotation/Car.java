package com.ttyc.spring.chapter4.context.annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car{
    private String name;
    private String color;
}
