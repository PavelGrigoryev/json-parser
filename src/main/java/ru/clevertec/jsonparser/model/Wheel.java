package ru.clevertec.jsonparser.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Wheel {

    private Integer quantity;
    private Color color;

}
