package syntax.casting;

public class Casting {
    public static void main(String[] args) {
        /*
          Casting -> Приведение типов;
          Casting — это процесс, когда мы заставляем переменную одного типа
          притвориться переменной другого типа.

          В Java кастинг делится на два принципиально разных вида:
          1) Автоматический (безопасный / Widening)
          2) Ручной (опасный / Narrowing)
         */

        // ==========================================
        // 1. Widening Casting (Расширение / Автоматическое приведение)
        // Идет автоматически от меньшего типа к большему (byte -> short -> int -> long -> float -> double)
        // ==========================================

        int standardNumber = 100;
        double hugeBox = standardNumber; // Маленькое число легко помещается в большую "коробку" double
        System.out.println("Int to Double: " + hugeBox); // Выведет: 100.0

        byte byteNumber = 127;
        short varForCasting = byteNumber;
        System.out.println("After automatic casting to short: " + varForCasting); // Выведет: 127

        // ==========================================
        // 2. Narrowing Casting (Сужение / Ручное приведение)
        // Требует явного указания типа в круглых скобках: (тип)
        // Опасно потерей точности или потерей данных!
        // ==========================================

        // А. Потеря точности (Truncation / Усечение)
        double originalPrice = 3.99;
        int roundedPrice = (int) originalPrice; // Дробная часть просто отбрасывается (НЕ округляется!)
        System.out.println("Double to Int (truncated): " + roundedPrice); // Выведет: 3

        // Б. Переполнение и потеря данных (Overflow)
        int bigInt = 300;
        byte smallByte = (byte) bigInt;
        // byte вмещает от -128 до 127. Число 300 не влезает.
        // Java отсекает лишние биты, оставляя только последние 8 бит.
        System.out.println("Result of casting 300 to byte: " + smallByte); // Выведет: 44

        int intVariable = 6_000_012;
        byte byteNewVar = (byte) intVariable;
        // Огромное число принудительно сжали до 1 байта. Получим искаженные данные:
        System.out.println("Result of casting 6_000_012 to byte: " + byteNewVar); // Выведет: -116
    }
}