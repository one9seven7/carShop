public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("BMW", "X5", 2017);
        Car car2 = new Car("BMW", "520d", 2013);
        Car car3 = new Car("Mercedes", "GLE", 2021);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        car1.setRokProdukcji(2022);
        car1.setModel("X5 40d");
        System.out.println(car1.toString());
    }
}
