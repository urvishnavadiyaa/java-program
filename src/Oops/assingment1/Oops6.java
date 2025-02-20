package Oops.assingment1;

class Movie {
    private String title;
    private String studio;
    String rating;

    Movie(String title,String studio,String rating) {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }

    Movie(String title,String studio) {
        this.title=title;
        this.studio=studio;
        this.rating="5 star";
    }
    public String getname() {
        this.title=title;
        return title;
    }
    public static Movie[] get5StarMovies(Movie m[]) {
        Movie m2[] = new Movie[m.length];
        int j=0;
        for(int i=0;i<m.length;i++) {
            if(m[i].rating == "5 star") {
                m2[j] = m[i];
                j++;
            }
        }
        return m2;
    }

}

public class Oops6 {
    public static void main(String[] args) {
        Movie m[] = new Movie[6];

        Movie m1 = new Movie("dhamal","yashraj");
        Movie m2 = new Movie("dhol","dharma");
        Movie m3 = new Movie("halchal","Tsearies");
        Movie m4 = new Movie("sigham","reliance");
        Movie m5 = new Movie("puspa","balaji");
        Movie m6 = new Movie("puspa2","rajhans");

        m1 = new Movie("dhamal","yashraj","5 star");
        m[0] = m1;
        m2 = new Movie("dhol","dharma","1 star");
        m[1] =m2;
        m3 = new Movie("halchal","Tsearies","3 star");
        m[2] = m3;
        m4 = new Movie("sigham","reliance","5 star");
        m[3] = m4;
        m5 = new Movie("puspa","balaji","5 star");
        m[4] = m5;
        m6 = new Movie("puspa2","rajhans","4 star");
        m[5] =m6;

        Movie mve[] =Movie.get5StarMovies(m);
        for(int i=0;i<mve.length;i++) {
            if(mve[i] != null) {
                System.out.println(mve[i].getname());
            }
        }
    }
}
