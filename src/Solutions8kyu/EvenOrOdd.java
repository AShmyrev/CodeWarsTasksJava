package Solutions8kyu;

public class EvenOrOdd {
    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static void testEvenOrOdd() {
        System.out.println(EvenOrOdd.evenOrOdd(5));
        System.out.println(EvenOrOdd.evenOrOdd(4));
        System.out.println(EvenOrOdd.evenOrOdd(0));
        System.out.println(EvenOrOdd.evenOrOdd(-1));
    }
}
