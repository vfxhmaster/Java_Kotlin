package syntax.finalization;

public class Final {
    public static void main(String[] args) {
        final int firstInt = 3, secondInt = 7;
//        secondInt = 18; Без final выводится последняя строчка в консоль;
        System.out.println("firstInt = " + firstInt + ", secondInt = " + secondInt);

        final var nameOfBoss = "Max Komisarov";
//        nameOfBoss = "Max!"; Без final выводится последняя строчка в консоль;
        System.out.println(nameOfBoss);


    }
}
