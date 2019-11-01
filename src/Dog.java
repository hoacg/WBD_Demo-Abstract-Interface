public class Dog extends Canine implements Pet {

    public String makeSound() {
        return "go go";
    }

    public String getFavourite() {
        return "Gặm xương";
    }

    @Override
    public void play() {
        System.out.println("Dog can play with human!");
    }
}
