package ru.clevertec.jsonparser.util.testbuilder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;
import ru.clevertec.jsonparser.model.Color;
import ru.clevertec.jsonparser.model.Wheel;
import ru.clevertec.jsonparser.util.TestBuilder;

@AllArgsConstructor
@NoArgsConstructor(staticName = "aWheel")
@With
public class WheelTestBuilder implements TestBuilder<Wheel> {

    private Integer quantity = 4;
    private Color color = Color.BLACK;

    @Override
    public Wheel build() {
        return Wheel.builder()
                .quantity(quantity)
                .color(color)
                .build();
    }

}
