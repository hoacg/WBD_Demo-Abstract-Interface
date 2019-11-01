public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[10];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Tiger();

        for (Animal animal : animals) {

            if (animal != null) {

                if (animal instanceof Pet) {
                    Pet pet = (Pet) animal;
                    pet.play();
                }

                System.out.println(animal.makeSound());

            }

        }
    }
}
