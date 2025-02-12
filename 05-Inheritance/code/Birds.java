public class Birds extends LivingThings {
    private boolean canFly;

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public Birds(boolean canFly) {
        super("", "", 2, true);
        this.canFly = canFly;
    }

    public void fly() {
        if (canFly) {
            System.out.println(super.getName() + " fly high");
        } else {
            System.out.println(super.getName() + " can't fly");
        }
    }
}
