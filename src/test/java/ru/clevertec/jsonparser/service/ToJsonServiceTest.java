package ru.clevertec.jsonparser.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.clevertec.jsonparser.model.Car;
import ru.clevertec.jsonparser.model.Person;
import ru.clevertec.jsonparser.model.Wheel;
import ru.clevertec.jsonparser.parser.JSON;
import ru.clevertec.jsonparser.parser.JSONImpl;
import ru.clevertec.jsonparser.util.testbuilder.CarTestBuilder;
import ru.clevertec.jsonparser.util.testbuilder.PersonTestBuilder;
import ru.clevertec.jsonparser.util.testbuilder.WheelTestBuilder;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ToJsonServiceTest {

    private JSON json;
    @Spy
    private ToJsonService toJsonService;
    @Spy
    private ToObjectService toObjectService;
    private Gson gson;

    @BeforeEach
    void setUp() {
        json = new JSONImpl(toJsonService, toObjectService);
        gson = new GsonBuilder().serializeNulls().create();
    }

    @Test
    @DisplayName("check json Person from ToJsonService should be equal json Person from Gson")
    void personToJson() {
        Person person = PersonTestBuilder.aPerson().build();

        String expectedValue = gson.toJson(person);
        String actualValue = json.toJson(person);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    @DisplayName("check json Car from ToJsonService should be equal json Car from Gson")
    void carToJson() {
        Car car = CarTestBuilder.aCar().build();

        String expectedValue = gson.toJson(car);
        String actualValue = json.toJson(car);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    @DisplayName("check json Wheel from ToJsonService should be equal json Wheel from Gson")
    void wheelToJson() {
        Wheel wheel = WheelTestBuilder.aWheel().build();

        String expectedValue = gson.toJson(wheel);
        String actualValue = json.toJson(wheel);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

}