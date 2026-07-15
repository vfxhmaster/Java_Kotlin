package syntax.variables;

public class Variables {

    public static void main(String[] args) {
        /*
          Примитивные типы -> Primitive types
          bit (бит)
          1 -> сигнал есть; Binary digit;
          0 -> сигнала нет; Binary digit;

          Двоичные числа -> Binary numbers;
          00000000 -> byte;
          00100100 -> byte;
          byte 2^8 -> 2 to the 8th power (256 values)
          8 bit = 1 byte;
          byte range: -128 ... 127;
         */

        // Перевод двоичных чисел в десятичные и обратно
        // Converting binary to decimal and decimal to binary
        System.out.println(Integer.parseInt("10100101", 2));
        System.out.println(Integer.toBinaryString(54));

        byte byteNumber = 115;
        System.out.println("The byte number: " + byteNumber);

        /*
          short = 2 bytes = 16 bits;
          2^16 -> 2 to the 16th power;
          short range = -32,768 ... 32,767 (65,536 total values);
         */
        short shortNumber = 1024;
        System.out.println("The short number: " + shortNumber);

        /*
          int = 4 bytes = 32 bits;
          2^32 -> 2 to the 32nd power;
          int range = -2,147,483,648 ... 2,147,483,647;
         */
        int intNumber = 1_500_000; // Подчеркивания улучшают читаемость / Underscores improve readability
        System.out.println("The integer number: " + intNumber);

        /*
          long = 8 bytes = 64 bits;
          2^64 -> 2 to the 64th power;
          long range = -9,223,372,036,854,775,808 ... 9,223,372,036,854,775,807;

          После числа пишем 'L' (всегда лучше большую L, чтобы не путать с единицей 1).
          Append 'L' after the number (always use uppercase 'L' to avoid confusion with the number 1).
         */
        long longNumber = 9876543210L;
        System.out.println(longNumber);

        /*
          float = 4 bytes = 32 bits;
          Точность 6-7 знаков после запятой; После числа пишем F(f)
          Provides a precision of 6 to 7 decimal places. You must write 'F' or 'f' after the number.
         */
        float floatNum = 3.14F;
        System.out.println("This is float number: " + floatNum);

        /*
          double = 8 bytes = 64 bits;
          Точность 15-17 знаков после запятой; Precision of 15-17 decimal places;
         */
        double doubleNum = 3.14;
        System.out.println("This is double number: " + doubleNum);

        /*
          char = 2 bytes = 16 bits;
          Хранит строго один одиночный символ в кодировке Unicode;
          Stores strictly a single character in Unicode encoding;
          Пишется всегда в одинарных кавычках ' '; Always written in single quotes ' ';
         */
        char charLetter = 'A';
        char charDigit = '5';
        char charSymbol = '$';
        System.out.println("The char variable: " + charSymbol);

        // Фишка: char — это число под капотом! / Pro-tip: char is actually a number under the hood!
        int charAsNumber = charLetter;
        System.out.println("ASCII/Unicode code of 'A' is: " + charAsNumber); // Prints 65

        /*
          boolean = 1 bit;
          Хранит только два значения — true (истина) или false (ложь).
          Stores only two values — true or false.
         */
        boolean isJavaFun = true;

        // --- var -> Local Variable Type Inference (Java 10+) ---
        // Автоматическое определение типа / Automatic type inference
        var variableNum = 15; // Компилятор понимает, что это int
        System.out.println(variableNum);

        var variableString = "Max Komisarov"; // Компилятор понимает, что это String
        System.out.println(variableString);

        var doubleVar = 5.25;
        int newInteger = (int) doubleVar; // Приведение типов / Type casting
        System.out.println("After casting newInteger: " + newInteger);

        // Внимание: var нельзя использовать без инициализации!
        // Warning: var cannot be used without initialization! (e.g., 'var x;' will cause an error)

        String developerName = "Max Komisarov";
        int currentYear = 2026;
        double javaVersion = 17.0;
        System.out.println("Текущий год: " + currentYear);
        System.out.println("Версия Java: " + javaVersion);
        System.out.println("Разработчик: " + developerName);

        // --- Конкатенация строк / String Concatenation ---
        // Склеивание строк с помощью оператора "+"
        // Gluing strings together using the "+" operator

        String greeting = "Hello, " + "world!";
        System.out.println(greeting);

        // ⚠️ ОПАСНОСТЬ: Приоритет операций! / WARNING: Operator precedence!
        // Вычисления всегда идут слева направо / Evaluation always goes from left to right:

        // Сначала строка -> всё остальное превращается в строку (конкатенация)
        // String first -> everything else becomes a string
        System.out.println("Result: " + 2 + 2); // Выведет "Result: 22" (НЕ 4!)

        // Сначала числа -> они складываются математически, а затем склеиваются со строкой
        // Numbers first -> they are added mathematically, then concatenated with the string
        System.out.println(2 + 2 + " is the result"); // Выведет "4 is the result"

        // Как исправить? Использовать скобки!
        // How to fix it? Use parentheses!
        System.out.println("Result with parens: " + (2 + 2)); // Выведет "Result with parens: 4"
    }
}