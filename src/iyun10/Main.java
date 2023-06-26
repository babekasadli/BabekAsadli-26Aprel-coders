package iyun10;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        NotNullClass myObject = new NotNullClass("Hello", null);

        // Check if fields are not null
        boolean isValid = validateFields(myObject);

        if (isValid) {
            System.out.println("All fields are not null.");
        } else {
            System.out.println("Null value found in a field.");
        }
    }

    private static boolean validateFields(Object obj) {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);

                try {
                    Object value = field.get(obj);
                    if (value == null) {
                        return false;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return true;
    }
}
