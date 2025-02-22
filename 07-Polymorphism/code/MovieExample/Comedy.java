public class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void describeMovie() {
        super.describeMovie();
        System.out.println("Comedy happening");
    }
}
