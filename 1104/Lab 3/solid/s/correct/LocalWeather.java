class LocalWeather{

    Location location;

    public LocalWeather() {
        location = new Location();
    }

    public int getCurrentTemp() {
        Location location = new Location();
        double latitude = location.getLatitude();
        double longtitude = location.getLongitude();

        return 0;
    }

}
