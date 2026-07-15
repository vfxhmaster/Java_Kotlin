package syntax.finalization;

public class Final {

    // Константы класса (обычно объявляются как public/private static final)
    // Имена констант всегда пишутся в UPPER_CASE с разделением подчеркиванием
    // Class-level constants: written in UPPER_CASE with underscores
    public static final double PI = 3.14159;
    public static final int MAX_USERS_LIMIT = 100;

    public static void main(String[] args) {
        /*
          final -> ключевое слово для создания констант (неизменяемых переменных).
          После того как переменной с модификатором final присвоено значение,
          его больше нельзя изменить (переприсвоить).

          final -> a keyword used to create constants (immutable variables).
          Once a final variable is assigned, its value cannot be changed.
         */

        // Локальные константы (Local constants)
        final int firstInt = 3;
        final int secondInt = 7; // Рекомендуется объявлять на отдельных строках для читаемости

        // secondInt = 18; // ❌ Ошибка компиляции! Без final вывелась бы последняя строчка в консоль.
        // Compilation error: Cannot assign a value to a final variable 'secondInt'

        System.out.println("firstInt = " + firstInt + ", secondInt = " + secondInt);

        // Использование final вместе с var (выводом типов)
        // Using final together with var (type inference)
        final var nameOfBoss = "Max Komisarov";

        // nameOfBoss = "Max!"; // ❌ Ошибка компиляции! Тип определен как String, но изменить значение нельзя.
        // Compilation error: Cannot assign a value to a final variable 'nameOfBoss'

        System.out.println("Boss Name: " + nameOfBoss);

        // Использование глобальной константы
        System.out.println("Math PI constant: " + PI);
    }
}