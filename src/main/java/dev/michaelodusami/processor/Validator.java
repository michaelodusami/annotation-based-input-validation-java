package dev.michaelodusami.processor;

import java.lang.reflect.Field;
import dev.michaelodusami.annotations.*;

public class Validator {
    
    public static void validate(Object object)
    {
        Class<?> clazz = object.getClass();

        for (Field field : clazz.getDeclaredFields())
        {
            field.setAccessible(true);

            try {
                Object value = field.get(object);

                if (field.isAnnotationPresent(NonNull.class))
                {
                    NonNull NonNull = field.getAnnotation(NonNull.class);
                    if (value == null)
                    {
                        throw new RuntimeException(NonNull.message());
                    }
                }
            }
            catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
