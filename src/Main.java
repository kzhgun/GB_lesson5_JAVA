public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Vaska", 20), new Cat("Kote", 20), new Cat("Barsik", 50)};
        Plate plate = new Plate(80);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        plate.info();
        plate.addFood(100);
        plate.info();
    }
}
