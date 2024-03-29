public class MovieBuilder3 extends AbstractMovieBuilder{
    Movie movie;

    public MovieBuilder3(String title, int releaseYear) {
        this.movie = new Movie();
        //Here we don't have access to the private zone
        //we solve the issue with default access level
        movie.title = title;
        movie.releaseYear = releaseYear;
    }

    @Override
    public void addGenre(String genre) {
    //TO DO
    }

    @Override
    public void hasAgeLimit() {
//TO DO
    }

    @Override
    public void addIMDBRating(double rating) {
//TO DO
    }

    @Override
    public void addDurationInMinutes(double duration) {
//TO DO
    }

    @Override
    public void addTicketsSold(int ticketsSold) {
//TO DO
    }

    @Override
    public void isAvailableIn4D() {
//TO DO
    }

    @Override
    public Movie build() {
        return this.movie;
    }
}
