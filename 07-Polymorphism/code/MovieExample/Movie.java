import java.util.Scanner;

public class Movie {
    private String title;

    public Movie (String title) {
        this.title = title;
    }

    public void describeMovie() {
        System.out.println(title + " is a " + this.getClass().getSimpleName() + " movie");
    }

    public Movie getMovie(String type) {
        return switch (type.toLowerCase().charAt(0)) {
            case 'c' -> new Comedy(title);
            case 'a' -> new Adventure(title);
            case 's' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

    public static void watchMovie () {
        Scanner scanner = new Scanner(System.in);

        boolean continueToWatch = true;

        while(continueToWatch) {
            System.out.println("Please enter the name of movie you want to watch: ");
            String movieTitle = scanner.nextLine();
            Boolean inValidMovie = false;
            Movie movie;
            String movieType;
            do {
                System.out.println("Please select one of options (1, 2, 3) for getting type of movie from following: ");
                System.out.println("1. Science Fiction");
                System.out.println("2. Comedy");
                System.out.println("3. Adventure");
                movieType = scanner.nextLine();
                if(!movieType.equals("1")  && !movieType.equals("2") && !movieType.equals("3")) {
                    System.out.println("Invalid movie type input");
                    inValidMovie = true;
                }
                else {
                    inValidMovie = false;
                }
            }
            while (inValidMovie);

            switch(movieType) {
                case "1" -> {
                    movie = new ScienceFiction(movieTitle);
                }
                case "2" -> {
                    movie = new Comedy(movieTitle);
                }
                case "3" -> {
                    movie = new Adventure(movieTitle);
                }
                default -> {
                    movie = new Movie(movieTitle);
                }
            }

            movie.describeMovie();

            System.out.println("Do you want to continue watching movie? Select (y/n)");
            continueToWatch = scanner.nextLine().equals("y");
        }

        System.out.println("Thanks!");
    }
}
