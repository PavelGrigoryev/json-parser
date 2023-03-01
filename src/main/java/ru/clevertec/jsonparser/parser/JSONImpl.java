package ru.clevertec.jsonparser.parser;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.clevertec.jsonparser.service.ToJsonService;
import ru.clevertec.jsonparser.service.ToObjectService;

@Service
@RequiredArgsConstructor
public class JSONImpl implements JSON {

    private final ToJsonService toJsonService;
    private final ToObjectService toObjectService;

    @Override
    public String toJson(Object object) {
        return toJsonService.toJson(object);
    }

    @Override
    public Object toObject(String json, Class<?> clazz) {
        return toObjectService.toObject(json, clazz);
    }

}
