package remind.classes;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.title = "인셉션";
        movie1.review = "인생은 무한루프";

        Movie movie2 = new Movie();
        movie2.title = "어바웃타임";
        movie2.review = "인생 시간 영화!";

        Movie[] movies = new Movie[2];
        movies[0] = movie1;
        movies[1] = movie2;

        for (int i = 0; i < movies.length; i++) {
            System.out.println("영화 제목: " + movies[i].title + ", 리뷰: " + movies[i].review);
        }

        for (Movie movie : movies) {
            System.out.println("영화 제목: " + movie.title + ", 리뷰: " + movie.review);
        }
    }
}
