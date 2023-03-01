package ru.clevertec.jsonparser.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.clevertec.jsonparser.model.Employee;
import ru.clevertec.jsonparser.model.Pencil;
import ru.clevertec.jsonparser.parser.JSON;
import ru.clevertec.jsonparser.parser.JSONImpl;
import ru.clevertec.jsonparser.util.testbuilder.EmployeeTestBuilder;
import ru.clevertec.jsonparser.util.testbuilder.PencilTestBuilder;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ToObjectServiceTest {

    private JSON json;
    @Spy
    private ToJsonService toJsonService;
    @Spy
    private ToObjectService toObjectService;
    private Gson gson;

    @BeforeEach
    void setUp() {
        json = new JSONImpl(toJsonService, toObjectService);
        gson = new GsonBuilder().create();
    }

    @Test
    @DisplayName("check object Employee from ToObjectService should be equal object Employee from Gson")
    void employeeToObject() {
        Employee employee = EmployeeTestBuilder.aEmployee().build();
        String jsonString = json.toJson(employee);

        Employee expectedValue = gson.fromJson(jsonString, Employee.class);

        Employee actualValue = (Employee) json.toObject(jsonString, Employee.class);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    @DisplayName("check object Pencil from ToObjectService should be equal object Pencil from Gson")
    void pencilToObject() {
        Pencil pencil = PencilTestBuilder.aPencil().build();
        String jsonString = json.toJson(pencil);

        Pencil expectedValue = gson.fromJson(jsonString, Pencil.class);

        Pencil actualValue = (Pencil) json.toObject(jsonString, Pencil.class);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

}