package bg.smg;

public class Main {

    public static void main(String[] args) {
        Pinguin pinguin = new Pinguin();
        Bird bird = new Bird();

        AnimalHouse<Pinguin> pinguinHouse = new AnimalHouse<>();
        pinguinHouse.animal=pinguin;

        AnimalHouse<Bird> birdHouse = new AnimalHouse<>();
        birdHouse.animal=bird;
    }
}
