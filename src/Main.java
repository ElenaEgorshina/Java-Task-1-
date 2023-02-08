public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int amount = 15_000; // стоимость 1 билета в руб

        int needForMile = 20; // рублей для 1 бонусной мили

        int mile = amount / needForMile;

        System.out.println("Итого миль: " + mile);

    }


}