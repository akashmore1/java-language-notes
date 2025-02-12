public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(false, true);
        dog.setName("Dog");
        dog.setHasWings(false);
        dog.setSpecies("Labradog");
        doLivingThingsThings(dog);

        Birds penguin = new Birds(false);
        penguin.setName("Penguin");
        penguin.setSpecies("Mammal");
        doLivingThingsThings(penguin);

        Birds Sparrow = new Birds(false);
        penguin.setName("Sparrow");
        penguin.setSpecies("Non mammal");
        doLivingThingsThings(penguin);
    }

    private static void doLivingThingsThings(LivingThings livingThings) {
        System.out.println(livingThings);
    }
}
