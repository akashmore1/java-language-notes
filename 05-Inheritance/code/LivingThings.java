public class LivingThings {
    private boolean hasWings;
    private String name;
    private String species;
    private int numberOfLegs;

    public LivingThings(String name, String species, int numberOfLegs, boolean hasWings) {
        this.name = name;
        this.hasWings = hasWings;
        this.species = species;
        this.numberOfLegs = numberOfLegs;
    }

    public boolean getHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void breath() {
        System.out.println("Living things breath");
    }

    public void eat(String food) {
        System.out.println("Living things eating" + food);
    }

    public void drinkWater() {
        System.out.println("Living things drink water");
    }
}
