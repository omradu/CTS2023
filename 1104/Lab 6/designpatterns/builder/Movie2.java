public class Movie2 {

    String title;
    int releaseYear;
    String genre;
    boolean hasAgeLimit;
    double imdbRating;
    int durationInMinutes;
    int ticketsSold;
    boolean isAvailableIn4D;

    private Movie2() {

    }

    private Movie2(String title, int releaseYear, String genre, boolean hasAgeLimit, double imdbRating, int durationInMinutes, int ticketsSold, boolean isAvailableIn4D) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.hasAgeLimit = hasAgeLimit;
        this.imdbRating = imdbRating;
        this.durationInMinutes = durationInMinutes;
        this.ticketsSold = ticketsSold;
        this.isAvailableIn4D = isAvailableIn4D;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    private void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isHasAgeLimit() {
        return hasAgeLimit;
    }

    private void setHasAgeLimit(boolean hasAgeLimit) {
        this.hasAgeLimit = hasAgeLimit;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    private void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    private void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    private void setTicketsSold(int ticketsSold) {
        this.ticketsSold = ticketsSold;
    }

    public boolean isAvailableIn4D() {
        return isAvailableIn4D;
    }

    private void setAvailableIn4D(boolean availableIn4D) {
        isAvailableIn4D = availableIn4D;
    }

    public static class MovieBuilder2 {
        String title;
        int releaseYear;
        String genre;
        boolean hasAgeLimit;
        double imdbRating;
        int durationInMinutes;
        int ticketsSold;
        boolean isAvailableIn4D;

        public MovieBuilder2(String  title, int releaseYear) {
            this.title = title;
            this.releaseYear = releaseYear;
        }

        public MovieBuilder2 addGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieBuilder2 hasAgeLimit() {
            this.hasAgeLimit = true;
            return this;
        }

        public MovieBuilder2 addIMDBRating(double rating) {
            this.imdbRating = rating;
            return this;
        }

        public MovieBuilder2 addDurationInMinutes(int durationInMinutes) {
            this.durationInMinutes = durationInMinutes;
            return this;
        }

        public MovieBuilder2 addTicketsSold(int ticketsSold) {
            this.ticketsSold = ticketsSold;
            return this;
        }

        public MovieBuilder2 isAvailableIn4D() {
            this.isAvailableIn4D = true;
            return this;
        }

        public Movie2 build() {
            //Movie2 movie = new Movie2(this.title, this.releaseYear, this.genre, this.hasAgeLimit, this.imdbRating, this.durationInMinutes, this.ticketsSold, this.isAvailableIn4D);
            Movie2 movie = new Movie2();
            movie.title = this.title;
            movie.releaseYear = this.releaseYear;
            movie.genre = genre;
            movie.hasAgeLimit = this.hasAgeLimit;
            movie.imdbRating = this.imdbRating;
            movie.durationInMinutes = this.durationInMinutes;
            movie.ticketsSold = this.ticketsSold;
            movie.isAvailableIn4D = this.isAvailableIn4D;

            return movie;
        }
    }
}
