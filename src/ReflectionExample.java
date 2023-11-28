import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionExample {
    private String field1;
    public int field2;
    protected double field3;

    public ReflectionExample() {
    }

    public ReflectionExample(String field1, int field2, double field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public void method1() {
        System.out.println("Method 1");
    }

    private String method2(int param) {
        return "Method 2 with parameter: " + param;
    }

    protected void method3() {
        System.out.println("Method 3");
    }

    public static void main(String[] args) {
        Class<?> clazz = ReflectionExample.class;

        // Отримання інформації про поля
        System.out.println("Поля класу:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("  " + Modifier.toString(field.getModifiers()) +
                    " " + field.getType().getName() +
                    " " + field.getName());
        }

        // Отримання інформації про конструктори
        System.out.println("\nКонструктори класу:");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("  " + Modifier.toString(constructor.getModifiers()) +
                    " " + constructor.getName());
        }

        // Отримання інформації про методи
        System.out.println("\nМетоди класу:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("  " + Modifier.toString(method.getModifiers()) +
                    " " + method.getReturnType().getName() +
                    " " + method.getName());
        }
    }
}
