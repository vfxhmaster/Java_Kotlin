package syntax.variables;

public class Variables {

    public static void main(String[] args) {
/*
     Примитивные типы -> Primitive types
     bit
     1 -> сигнал есть;
     0 -> сигнала нет;

     Двоичные числа
     00000000 -> byte;
     00100100 -> byte;
     byte 2^8
     8 bit = byte;
     byte 0....255; = -128 - 127;
 */
//      Перевод двоичных чисел в десятичные и десятичных в двоичные;
        System.out.println(Integer.parseInt("10100101",2));
        System.out.println(Integer.toBinaryString(54));

        byte byteNumber = 115;
        System.out.println("The byte number: " + byteNumber);
/*
    short = 2 bytes = 16 bits;
    2^16
    short = 65 536 = -32 768 ... 32 767;

 */
        short shortNumber = 1024;
        System.out.println("The short number: " + shortNumber);
/*
     int = 4 bytes = 32 bits;
     2^32
     int = 4_294_967_296 = -2 147 483 648 ... 2 147 483 647;
 */
        int intNumber = 1_500_000;
        System.out.println("The integer number: " + intNumber);
 /*
    long = 8 bytes = 64 bits;
    2^64
    long = -9_223_372_036_854_775_808... 9_223_372_036_854_775_807 (около 9 квинтиллионов!)
    После числа пишем L
  */
        long longNumber = 9876543210L;
        System.out.println(longNumber);

/*
    float = 4 bytes = 32 bits;
    Точность 6-7 знаков после запятой;
    После числа пишем F(f)

 */
        float floatNum = 3.14F;
        System.out.println("This is float number: " + floatNum);
/*
    double = 8 bytes = 64 bits;
    Точность 15-17 знаков после запятой;
 */

        double doubleNum = 3.14;
        System.out.println("This is double number: " + doubleNum);

/*
    char = 2 bytes = 16 bites;
    Хранит: Строго один одиночный символ (букву, цифру, знак препинания или даже эмодзи) в кодировке Unicode;
    Пишется всегда в одинарных кавычка ' ';

 */
        char charSymbol = 'F';
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


        String developerName = "Max Komisarov";
        int currentYear = 2026;
        double javaVersion = 17.0;
        System.out.println("Текущий год: " + currentYear);
        System.out.println("Версия Java: " + javaVersion);
        System.out.println("Разработчик: " + developerName);
    }
}
