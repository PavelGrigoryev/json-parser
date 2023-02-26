package ru.clevertec.jsonparser.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Builder
public class Person {

    private Long id;
    private String name;
    private int age;
    private Boolean isAlive;
    private boolean isAngry;
    private BigDecimal salary;
    private List<Car> cars;
    private double[] doubles;
    private Car car;
    private List<List<Wheel>> listOfListOfWheels;
    private int[][][] numbers;
    private Mood mood;
    private Set<Mood> moods;
    private Map<Integer, List<Car>> mapOfListOfCar;
    private List<Map<Integer,Car>> listOfMapOfCar;
    private Map<Integer, Map<String, Car>> megaMap;
    private Map<Integer, Car[]> caravan;
    private Set<Wheel[]> setOfArrayOfWheels;

}
