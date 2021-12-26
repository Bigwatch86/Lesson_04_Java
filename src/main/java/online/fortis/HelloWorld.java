package online.fortis;

public class HelloWorld {

    boolean aBoolean = false; // если переменная находится не в методе, а в классе, то это "поле класса"
    char aChar = '#';
    byte aByte = 1; // 8 бит
    short aShort = 1; // 16 бит
    int aInt = 1; // 32 бита
    long aLong = 1L; // 64 бита
    float aFloat = 1.0F;
    double aDouble = 1.0D;


    static class Human { // структура данных
        int age; // 0
        String name; // null

        public void sayName() {
            System.out.println(name);
        }

        public void sayAge() {
            System.out.println(age);
        }

        public void incrementAge() {
            age = age + 1;
        }
    }



    // модификатор доступа || static -> возвращаемое значение -> имя -> (аргументы)
    public static void main(String[] args) {
        int age = 10;
        String message = "Hello World!";
        Human igor = new Human();
        Human alex = new Human();
        igor.name = "игорь";
        igor.age = 35;
        alex.name = "Александр";
        alex.age = 35;
        igor.sayName();
        alex.sayName();

        igor.incrementAge();
        igor.sayAge();
        alex.sayAge();

        //System.out.println(message);
        //System.out.println("Hello World!"); // System.out - квалификатор (откуда мы вызываем метод println)
    }
}
