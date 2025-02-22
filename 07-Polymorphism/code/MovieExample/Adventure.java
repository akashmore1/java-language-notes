public class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void describeMovie() {
        super.describeMovie();
        System.out.println("Adventure happening");
    }
}
