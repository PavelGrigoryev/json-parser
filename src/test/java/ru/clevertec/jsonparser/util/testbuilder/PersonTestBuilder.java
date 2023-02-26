package ru.clevertec.jsonparser.util.testbuilder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;
import ru.clevertec.jsonparser.model.*;
import ru.clevertec.jsonparser.util.TestBuilder;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor(staticName = "aPerson")
@With
public class PersonTestBuilder implements TestBuilder<Person> {

    private Long id = 1L;
    private String name = "Peter";
    private int age = 48;
    private Boolean isAlive;
    private boolean isAngry;
    private BigDecimal salary = BigDecimal.valueOf(2635.2364);
    private List<Car> cars = List.of(
            CarTestBuilder.aCar()
                    .withId(234)
                    .withQuality("Very Good")
                    .withWheels(List.of(
                            WheelTestBuilder.aWheel()
                                    .withQuantity(2)
                                    .withColor(Color.RED)
                                    .build(),
                            WheelTestBuilder.aWheel()
                                    .withQuantity(2)
                                    .withColor(Color.BLACK)
                                    .build()))
                    .build(),
            CarTestBuilder.aCar()
                    .withId(456)
                    .withQuality("Dast ist funtastish")
                    .build()
    );
    private double[] doubles = new double[]{2.36, 5.656, 26.61, 5463.56};
    private Car car = CarTestBuilder.aCar().build();
    private List<List<Wheel>> listOfListOfWheels = List.of(
            List.of(WheelTestBuilder.aWheel().build()),
            List.of(WheelTestBuilder.aWheel().withColor(Color.GREEN).build(), WheelTestBuilder.aWheel().build()));
    private int[][][] numbers = new int[][][]{
            new int[][]{new int[]{1, 2, 6}, new int[]{2, 5}},
            new int[][]{new int[]{78, 28, 64}, new int[]{6}},
            new int[][]{new int[]{7800, 2800}, new int[]{99}, new int[]{0, 122, 654, 64654, 546, 45646}}
    };
    private Mood mood = Mood.HAPPY;
    private Set<Mood> moods = Set.of(Mood.HAPPY, Mood.SAD, Mood.STUBBORN);
    private Map<Integer, List<Car>> mapOfListOfCar = Map.of(
            3, List.of(CarTestBuilder.aCar().withId(2).withQuality("Wow").build(),
                    CarTestBuilder.aCar().withId(1241).withQuality("he - he").withWheels(List.of(
                                    WheelTestBuilder.aWheel().withQuantity(2).build()))
                            .build()),
            99, List.of(CarTestBuilder.aCar().withId(456).withQuality("This is a joke").withWheels(List.of(
                            WheelTestBuilder.aWheel().withQuantity(3).build()))
                    .build())
    );
    private List<Map<Integer, Car>> listOfMapOfCar = List.of(
            Map.of(
                    1, CarTestBuilder.aCar().build(),
                    2, CarTestBuilder.aCar().withId(2).withQuality("Sad").withWheels(List.of(
                            WheelTestBuilder.aWheel().withQuantity(4).build())).build(),
                    3, CarTestBuilder.aCar().withId(2243).withQuality("Mda !!!!").build()
            )
    );
    private Map<Integer, Map<String, Car>> megaMap = Map.of(
            1, Map.of(
                    "1", CarTestBuilder.aCar().build(),
                    "2", CarTestBuilder.aCar().withId(2).withQuality("Woof woof").withWheels(List.of(
                            WheelTestBuilder.aWheel().withQuantity(6).build())).build(),
                    "3", CarTestBuilder.aCar().withId(2243).withQuality("Shine").build()
            )
    );
    private Map<Integer, Car[]> caravan = Map.of(
            1, new Car[]{CarTestBuilder.aCar().withQuality("Hi").build()}
    );
    private Set<Wheel[]> setOfArrayOfWheels = Set.of(new Wheel[][]{
            new Wheel[]{WheelTestBuilder.aWheel().build()}, new Wheel[] {
                    WheelTestBuilder.aWheel().withColor(Color.GREEN).build(),
                    WheelTestBuilder.aWheel().withQuantity(2).build()
    }
    });

    @Override
    public Person build() {
        return Person.builder()
                .id(id)
                .name(name)
                .age(age)
                .isAlive(isAlive)
                .isAngry(isAngry)
                .salary(salary)
                .cars(cars)
                .doubles(doubles)
                .car(car)
                .listOfListOfWheels(listOfListOfWheels)
                .numbers(numbers)
                .mood(mood)
                .moods(moods)
                .mapOfListOfCar(mapOfListOfCar)
                .listOfMapOfCar(listOfMapOfCar)
                .megaMap(megaMap)
                .caravan(caravan)
                .setOfArrayOfWheels(setOfArrayOfWheels)
                .build();
    }

}
