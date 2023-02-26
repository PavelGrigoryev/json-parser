package ru.clevertec.jsonparser.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Car {

    private Integer id;
    private String quality;
    private List<Wheel> wheels;

}
