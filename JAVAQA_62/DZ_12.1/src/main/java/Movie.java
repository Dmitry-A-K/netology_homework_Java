public class Movie {
    static int classNumber = 1;
    private int movieCount;
    private String movieId;
    private String movieName;
    private String movieDescription;
    private String movieGenre;
    private String moviePoster;
    private String moviePromo;

    private int increaseCount() {
        return classNumber++;
    }

    public Movie() {

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

    public int getMovieCount() {
        return movieCount;
    }

    public void setMovieCount(int movieCount) {
        this.movieCount = movieCount;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }

    public String getMoviePromo() {
        return moviePromo;
    }

    public void setMoviePromo(String moviePromo) {
        this.moviePromo = moviePromo;
    }

}