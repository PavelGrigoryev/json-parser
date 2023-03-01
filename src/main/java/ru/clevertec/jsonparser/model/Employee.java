package ru.clevertec.jsonparser.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long id;
    private int age;
    private String name;
    private Boolean isAlive;
    private boolean isAngry;
    private BigDecimal salary;
    private Set<Integer> integerSet;
    private List<String> strings;
    private Pencil pencil;
    private List<Pencil> pencils;
    private Mood mood;
    private double[] doubles;
    private long[] longs;
    private Map<Integer, String> integerStringMap;

}
