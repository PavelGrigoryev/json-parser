package ru.clevertec.jsonparser.util.testbuilder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;
import ru.clevertec.jsonparser.model.Pencil;
import ru.clevertec.jsonparser.util.TestBuilder;

@AllArgsConstructor
@NoArgsConstructor(staticName = "aPencil")
@With
public class PencilTestBuilder implements TestBuilder<Pencil> {

    private String color = "Black";

    @Override
    public Pencil build() {
        return Pencil.builder()
                .color(color)
                .build();
    }

}
