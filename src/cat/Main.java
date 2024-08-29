package cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("AICAT");
        cat.setBreeds("Persian");
        cat.setWeight(3.1);

        System.out.printf(cat.getName()+"이 ");
        cat.claw();

        System.out.printf(cat.getName()+"이 ");
        cat.meow();

        cat.CatInfo();


    }
}