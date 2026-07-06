package syntax.casting;

public class Casting {
    public static void main(String[] args) {

/*
     casting -> приведения типа;
     Casting — это процесс, когда мы заставляем переменную одного типа притвориться переменной другого типа;
     В Java кастинг делится на два принципиально разных вида: автоматический (безопасный) и ручной (опасный);
 */
//        Widening Casting (Расширение / Автоматическое приведение);
        int standardNumber = 100;
        double hugeBox = standardNumber;
        System.out.println(hugeBox);

        byte byteNumber = 127;
        short varForCasting = byteNumber;
        System.out.println("After varForCasting: " + varForCasting);

/*
        Narrowing Casting (Сужение / Ручное приведение)
        Синтаксис: Перед переменной в круглых скобках пишется целевой тип: (тип)
 */
        double originalPrice = 3.99;
        int roundedPrice = (int) originalPrice;
        System.out.println(roundedPrice);

        int bigInt = 300;
        byte smallByte = (byte) bigInt;
        System.out.println("Result: " + smallByte);

        int intVariable = 6_000_012;
        byte byteNewVar = (byte) intVariable;
    }
}
