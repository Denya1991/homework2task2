package com.company;

import Annotation.SaveTo;

public class AnnotationParameter {
    public static String getAnnotation(Class<?> classes) {
        String result = "";
        if (classes.isAnnotationPresent(SaveTo.class)) {
            SaveTo saveTo = classes.getAnnotation(SaveTo.class);
            result = saveTo.path();
        }
        return result;
    }
}
