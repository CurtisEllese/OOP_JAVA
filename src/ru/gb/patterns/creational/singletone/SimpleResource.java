package ru.gb.patterns.creational.singletone;

public class SimpleResource {
    private static SimpleResource resource;

    public static SimpleResource getResource() {
        if (resource == null) {
            resource = new SimpleResource();
        }
        return resource;
    }

    private SimpleResource() {}
}
