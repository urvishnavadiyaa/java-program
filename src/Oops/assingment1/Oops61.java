package Oops.assingment1;

class Film {
    private String title;
    private String studio;
    private String rating;

    Film(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    Film(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "5 star";
    }

    public String getName() {
        return title;
    }

    public String getRating() {
        return rating;
    }

    public static Film[] get5StarMovies(Film[] movies) {
        int count = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating().equals("5 star")) {
                count++;
            }
        }

        Film[] result = new Film[count];
        int index = 0;

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating().equals("5 star")) {
                result[index] = movies[i];
                index++;
            }
        }


        return result;
    }
}

public class Oops61 {
    public static void main(String[] args) {
        Film[] movies = new Film[6];

        movies[0] = new Film("dhamal", "yashraj", "5 star");
        movies[1] = new Film("dhol", "dharma", "1 star");
        movies[2] = new Film("halchal", "Tsearies", "3 star");
        movies[3] = new Film("sigham", "reliance", "5 star");
        movies[4] = new Film("puspa", "balaji", "5 star");
        movies[5] = new Film("puspa2", "rajhans", "4 star");

        Film[] fiveStarMovies = Film.get5StarMovies(movies);

        System.out.println("5-Star Movies:");
        for (int i = 0; i < fiveStarMovies.length; i++) {
            System.out.println(fiveStarMovies[i].getName());
        }

    }
}
