public class MoviesManager {
    protected String[] movies = new String[0];
    protected int limit;
    public MoviesManager(int limit) {
        this.limit = limit;
    }
    public MoviesManager() {
        limit = 10;
    }
    public void add(String newFilm) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newFilm;
        movies = tmp;
    }
    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else{
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}

