public class Animal extends LivingThings {
    private boolean isVeg;
    private boolean isNonVeg;

    public Animal(boolean isVeg, boolean isNonVeg) {
        super("", "", 4, false);
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public void setNonVeg(boolean nonVeg) {
        isNonVeg = nonVeg;
    }

    public boolean isNonVeg() {
        return isNonVeg;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        if (isVeg) {
            System.out.println("Eat grass");
        }

        if (isNonVeg) {
            System.out.println("Eat other animals");
        }
    }
}
