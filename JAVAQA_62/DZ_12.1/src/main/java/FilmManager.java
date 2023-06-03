public class FilmManager {
    private Movie[] movieСollection = new Movie[0];
    public void addMovie(Movie item) {
        Movie[] tmp = new Movie[movieСollection.length + 1];
        for (int i = 0; i < movieСollection.length; i++) {
            tmp[i] = movieСollection[i];
        }
        tmp[tmp.length - 1] = item;
        movieСollection = tmp;
    }
    public void printCollection() {
        for (int i = 0; i < movieСollection.length; i++){
            System.out.println(movieСollection[i].movieToString());
        }
    }

    public  FilmManager() {
        // return movieСollection;
    }

    public FilmManager(String movieId, String movieName, String movieDescription, String movieGenre, String moviePoster, String moviePromo){
        Movie item = new Movie(movieId, movieName, movieDescription, movieGenre, moviePoster, moviePromo); // Создание Нового обьекта (фильм)
        addMovie(item); // Добавление в коллекцию
        printCollection();
    }



}