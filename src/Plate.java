public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }


    boolean decreaseFood(int n) {
        int a = food - n;
        if (a < 0) return false;
        food -= n;
        return true;
    }

    void info() {
        System.out.println("plate: " + food);
    }
    void addFood(int food) {
        System.out.println("Наполняем миску");
        this.food += food;
    }
}
