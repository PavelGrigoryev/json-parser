package ru.clevertec.jsonparser.util.testbuilder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;
import ru.clevertec.jsonparser.model.Employee;
import ru.clevertec.jsonparser.model.Mood;
import ru.clevertec.jsonparser.model.Pencil;
import ru.clevertec.jsonparser.util.TestBuilder;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor(staticName = "aEmployee")
@With
public class EmployeeTestBuilder implements TestBuilder<Employee> {

    private Long id = 2L;
    private int age = 25;
    private String name = "Antony";
    private Boolean isAlive = true;
    private boolean isAngry = true;
    private BigDecimal salary = BigDecimal.valueOf(2664465.1264);
    private Set<Integer> integerSet = Set.of(265, 4654, 45646, 64654);
    private List<String> strings = List.of("Hi", "GoodBye", "Privet", "Poka");
    private Pencil pencil = PencilTestBuilder.aPencil().build();
    private List<Pencil> pencils = List.of(
            PencilTestBuilder.aPencil().withColor("White").build(),
            PencilTestBuilder.aPencil().withColor("Red").build()
            );
    private Mood mood = Mood.HAPPY;
    private double[] doubles = new double[]{2.65, 26.33, 7.663};
    private long[] longs = new long[]{546, 4564, 464};
    private Map<Integer, String> integerStringMap = Map.of(
            2, "Chaos",
            4, "Hell",
            6, "Rainbow"
    );

    @Override
    public Employee build() {
        return Employee.builder()
                .id(id)
                .age(age)
                .name(name)
                .isAlive(isAlive)
                .isAngry(isAngry)
                .salary(salary)
                .integerSet(integerSet)
                .strings(strings)
                .pencil(pencil)
                .pencils(pencils)
                .mood(mood)
                .doubles(doubles)
                .longs(longs)
                .integerStringMap(integerStringMap)
                .build();
    }

}
