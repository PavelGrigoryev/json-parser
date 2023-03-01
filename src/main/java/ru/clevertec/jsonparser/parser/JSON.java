package ru.clevertec.jsonparser.parser;

public interface JSON {

    String toJson(Object object);
    Object toObject(String json, Class<?> clazz);

}
