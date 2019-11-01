public class Cat extends Feline implements Pet {

    @Override
    public String makeSound() {
        return "mew mew";
    }

    @Override
    public void play() {
        System.out.println("Cat can play with human!");
    }
}
