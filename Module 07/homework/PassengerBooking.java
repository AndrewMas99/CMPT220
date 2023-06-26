
import java.util.Random;

public class PassengerBooking {
    private AirlinePassenger passenger;
    private String flightNumber;
    private String seatNumber;
    private String bookingDateTime;
    private String bookingTime;
    private String bookingNumber;

    public void setPassenger(AirlinePassenger passenger) {
        this.passenger = passenger;
    }

    public AirlinePassenger getPassenger() {
        return this.passenger;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return this.seatNumber;
    }

    public void setBookingDateTime(String bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
        this.bookingTime = getBookingTimeFromDateTime(bookingDateTime);
    }

    public String getBookingDateTime() {
        return this.bookingDateTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
        this.bookingDateTime = getBookingDateTimeFromDateAndTime(this.bookingDateTime, bookingTime);
    }

    public String getBookingTime() {
        return this.bookingTime;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public String getBookingNumber() {
        return this.bookingNumber;
    }

    public String toString() {
        return "Booking Information:\n" +
                "----------------------\n" +
                "Booking Number: " + this.bookingNumber + "\n" +
                "Passenger: " + this.passenger.toString() + "\n" +
                "Flight Number: " + this.flightNumber + "\n" +
                "Seat Number: " + this.seatNumber + "\n" +
                "Booking Date and Time: " + this.bookingDateTime + " " + this.bookingTime + "\n";
    }

    private String generateBookingNumber() {
        Random random = new Random();
        double ran6 = random.nextInt(900000) + 100000;
        //System.out.println(bookingNumber);
        String bookingNumber = String.valueOf(ran6);
        return bookingNumber;
    }

    private String getBookingTimeFromDateTime(String dateTime) {
        int indexOfSpace = dateTime.indexOf(" ");
        return dateTime.substring(indexOfSpace + 1);
    }

    private String getBookingDateTimeFromDateAndTime(String date, String time) {
        int indexOfSpace = date.indexOf(" ");
        return date.substring(0, indexOfSpace) + " " + time;
    }
}
