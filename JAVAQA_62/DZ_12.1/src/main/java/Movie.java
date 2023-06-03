public class Movie {
    static int classNumber;
    private int movieCount;
    private String movieId;
    private String movieName;
    private String movieDescription;
    private String movieGenre;
    private String moviePoster;
    private String moviePromo;

    private int increaseCount() {
        int i = classNumber++;
        return i;
    }

    public Movie(String movieId, String movieName, String movieDescription, String movieGenre, String moviePoster, String moviePromo) {
        movieCount = increaseCount();
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDescription = movieDescription;
        this.movieGenre = movieGenre;
        this.moviePoster = moviePoster;
        this.moviePromo = moviePromo;
    }

    public String[] movieToArray() {
        String[] result = new String[7];
        result[0] = Integer.toString(movieCount);
        result[1] = movieId;
        result[2] = movieName;
        result[3] = movieDescription;
        result[4] = movieGenre;
        result[5] = moviePoster;
        result[6] = moviePromo;
        return result;
    }

    public String movieToString() {
        return movieCount + "," + movieId + "," + movieName + "," + movieDescription +
                "," + movieGenre + "," + moviePoster + "," + moviePromo;
    }

}