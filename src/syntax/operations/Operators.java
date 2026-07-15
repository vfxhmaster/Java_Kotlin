package syntax.operations;

public class Operators {
    public static void main(String[] args) {

        // Переменные для тестов / Variables for testing
        int a = 5;
        int b = 4;

        // --- Арифметические операторы / Arithmetic Operators ---

        int sum = a + b;            // Сложение / Addition
        int difference = a - b;     // Вычитание / Subtraction
        int product = a * b;        // Умножение / Multiplication
        int quotient = a / b;       // Деление (целочисленное) / Division (integer)
        int remainder = a % b;      // Остаток от деления / Remainder (modulo)

        System.out.println("Сумма / Sum = " + sum);
        System.out.println("Разность / Difference = " + difference);
        System.out.println("Умножение / Multiplication = " + product);
        System.out.println("Деление int / Integer Division = " + quotient);
        System.out.println("Остаток / Remainder = " + remainder);

        // --- Инкрементирование (+1) и декрементирование (-1) / Increment & Decrement ---

        a = a + 1;
        a++; // Постфиксный инкремент / Postfix increment

        a = a - 1;
        a--; // Постфиксный декремент / Postfix decrement

        // Сокращенные операторы присваивания / Compound Assignment Operators
        a = a + 4;
        a += 4; // Эквивалентно a = a + 4 / Equivalent to a = a + 4
        a -= 2; // Эквивалентно a = a - 2 / Equivalent to a = a - 2

        // --- ЗОЛОТОЙ ПРИМЕР С ИНКРЕМЕНТАМИ / THE GOLDEN INCREMENT EXAMPLE ---
        // Иллюстрирует твое правило: "значение из памяти достается только при следующем обращении к букве"
        // Illustrates the rule: "the incremented value is retrieved only upon the next access to the variable"

        int x = 3;
        // 1. ++x (префиксный): x сразу увеличивается в памяти с 3 до 4. В выражение подставляется 4.
        // 2. x++ (постфиксный): берется текущее значение x из памяти (уже 4!) и подставляется в выражение.
        //    Увеличение x до 5 откладывается до следующего обращения к переменной.
        int y = ++x + x++; // 4 + 4 = 8

        System.out.println("y = " + y); // Выведет 8 / Will print 8
        System.out.println("x = " + x); // Выведет 5 / Will print 5

        // --- Операции сравнения / Comparison Operators ---

        boolean isEqual = a == b;            // Равно / Equal to
        boolean isNotEqual = a != b;         // Не равно / Not equal to
        boolean isGreater = a > b;           // Больше / Greater than
        boolean isGreaterOrEqual = a >= b;   // Больше или равно / Greater than or equal to
        boolean isLess = a < b;              // Меньше / Less than


        boolean result = (--a == b++); // Сравнение / Comparison
        System.out.println("Результат теста / Test result = " + result);

    }
}
