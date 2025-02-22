public class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void describeMovie() {
        super.describeMovie();
        System.out.println("Science experiment happening");
    }
}
