public abstract class AbstractMovieBuilder {
    public abstract void addGenre(String genre);
    public abstract void hasAgeLimit();
    public abstract void addIMDBRating(double rating);
    public abstract void addDurationInMinutes(double duration);
    public abstract void addTicketsSold(int ticketsSold);
    public abstract void isAvailableIn4D();
    public abstract Movie build();
}
