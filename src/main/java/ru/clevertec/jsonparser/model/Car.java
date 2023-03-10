package ru.clevertec.jsonparser.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private Integer id;
    private String quality;
    private List<Wheel> wheels;

}
