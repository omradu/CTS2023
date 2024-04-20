public class TrainTicketingSystem implements AbstractTrainTicketingSystem{
    private int numberOfWagons = 7;
    private int numberOfSeatsPerWagon = 100;
    private int numberOfBookedSeats = 0;

    @Override
    public void reserveTicket(int wagonNb, int seatNb) {
        boolean isValidWagon = wagonNb>=1 && wagonNb<=numberOfWagons;
        boolean isValidSeat = seatNb>=1 && seatNb<=numberOfSeatsPerWagon;
        if(isValidSeat && isValidWagon && numberOfBookedSeats<700){
            System.out.println("Ticket issued for wagon " +
                    wagonNb  + " and seat " + seatNb);
            numberOfBookedSeats++;
        }
    }
}
