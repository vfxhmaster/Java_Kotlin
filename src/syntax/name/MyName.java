package syntax.name;

/**
 * Documentation comment (Javadoc) -> Документирующий комментарий
 * Используется для автоматической генерации документации по коду.
 *
 * @author Max Komisarov
 * @version 1.0.2026
 */
public class MyName {

    // This method "main" is entry point to our program -> Точка входа в программу
    public static void main(String[] args) {

        // Single-line comment -> Однострочный комментарий

        /*
          Multi-line comment -> Многострочный комментарий
          Используется для больших пояснений.
         */

        // 1. Стандартный вывод с переносом строки / Standard output with a new line
        System.out.println("My name is Max");

        // 2. Вывод БЕЗ переноса строки / Output WITHOUT a new line
        System.out.print("Hello ");
        System.out.print("World!\n"); // \n вручную переносит строку

        // 3. Полезные спецсимволы внутри текста / Useful escape sequences
        System.out.println("This is a\tTab");       // \t делает отступ (табуляцию)
        System.out.println("He said: \"Java is cool!\""); // \" позволяет напечатать кавычки
    }
}
