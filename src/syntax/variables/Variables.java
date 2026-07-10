package syntax.variables;

public class Variables {

    public static void main(String[] args) {
/*
     Примитивные типы -> Primitive types
     bit
     1 -> сигнал есть; Binary digit;
     0 -> сигнала нет; Binary digit;

     Двоичные числа -> Binary numbers;
     00000000 -> byte;
     00100100 -> byte;
     byte 2^8 -> 2 to the 64th power;
     8 bit = byte;
     byte 0....255; = -128 - 127;
 */
/*
      Перевод двоичных чисел в десятичные и десятичных в двоичные;
      Converting binary to decimal and decimal to binary;

      Integer.toBinaryString(15) — переведет число 15 из десятичной системы в строку "1111" (в двоичную).
      Integer.parseInt("1111", 2) — переведет строку "1111" из двоичной системы (основание 2) обратно в число 15.
 */

        System.out.println(Integer.parseInt("10100101",2));
        System.out.println(Integer.toBinaryString(54));

        byte byteNumber = 115;
        System.out.println("The byte number: " + byteNumber);
/*
    short = 2 bytes = 16 bits;
    2^16 -> 2 to the 16th power;
    short = 65 536 = -32 768 ... 32 767;

 */
        short shortNumber = 1024;
        System.out.println("The short number: " + shortNumber);
/*
     int = 4 bytes = 32 bits;
     2^32 -> 2 to the 32nd power;
     int = 4_294_967_296 = -2 147 483 648 ... 2 147 483 647;
 */
        int intNumber = 1_500_000;
        System.out.println("The integer number: " + intNumber);
 /*
    long = 8 bytes = 64 bits;
    2^64 -> 2 to the 64th power;
    long = -9_223_372_036_854_775_808... 9_223_372_036_854_775_807 (около 9 квинтиллионов!)
    После числа пишем 'L';
    Append 'L' after the number;
    В Java можно писать как большую L, так и маленькую l (например, 300l);
    In Java, you can use either an uppercase 'L' or a lowercase 'l' (for example, 300l);
    Но на практике всегда пишут большую L, потому что маленькая l в коде слишком похожа на цифру один 1;
    However, in practice, always use uppercase 'L' because lowercase 'l' looks too much like the number one (1) in code;
  */
        long longNumber = 9876543210L;
        System.out.println(longNumber);

/*
    float = 4 bytes = 32 bits;
    Точность 6-7 знаков после запятой; После числа пишем F(f)
    It provides a precision of 6 to 7 decimal places. You must write 'F' or 'f' after the number.
 */
        float floatNum = 3.14F;
        System.out.println("This is float number: " + floatNum);
/*
    double = 8 bytes = 64 bits;
    Точность 15-17 знаков после запятой; Precision of 15–17 decimal places;
 */

        double doubleNum = 3.14;
        System.out.println("This is double number: " + doubleNum);

/*
    char = 2 bytes = 16 bites;
    Хранит: Строго один одиночный символ (букву, цифру, знак препинания или даже эмодзи) в кодировке Unicode;
    Stores: Strictly a single character (a letter, digit, punctuation mark, or even an emoji) in Unicode encoding;
    Пишется всегда в одинарных кавычка ' ';
    Always written in single quotes ' ';

 */
        char charLetter = 'A';
        char charDigit = '5';
        char charSymbol = '$';
        System.out.println("The char variable: " + charSymbol);

/*
    boolean = 1 bit;
    Хранит: Только два значения — true (истина) или false (ложь).

 */

//   var  -> Variable -> переменная;

        var variableNum = 15;
        System.out.println(variableNum);

        var variableString = "Max Komisarov";
        System.out.println(variableString);

        var doubleVar = 5.25;
        int newInteger = (int) doubleVar;
        System.out.println("After casting newInteger: " + newInteger);



        String developerName = "Max Komisarov";
        int currentYear = 2026;
        double javaVersion = 17.0;
        System.out.println("Текущий год: " + currentYear);
        System.out.println("Версия Java: " + javaVersion);
        System.out.println("Разработчик: " + developerName);
    }
}
