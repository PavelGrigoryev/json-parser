package ru.clevertec.jsonparser.util.testbuilder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;
import ru.clevertec.jsonparser.model.Car;
import ru.clevertec.jsonparser.model.Color;
import ru.clevertec.jsonparser.model.Wheel;
import ru.clevertec.jsonparser.util.TestBuilder;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor(staticName = "aCar")
@With
public class CarTestBuilder implements TestBuilder<Car> {

    private Integer id = 200;
    private String quality = "Nice!";
    private List<Wheel> wheels = List.of(
            WheelTestBuilder.aWheel().withQuantity(2).withColor(Color.RED).build(),
            WheelTestBuilder.aWheel().withQuantity(2).withColor(Color.YELLOW).build()
    );

    @Override
    public Car build() {
        return Car.builder()
                .id(id)
                .quality(quality)
                .wheels(wheels)
                .build();
    }

}
