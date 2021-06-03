package session8;

public class FlightTicket {
    Date departureDate;
    Time departureTime;
    byte noOfTickets;
    Double price = 1.000;
    Double totalPrice;
    byte typeOfCabin;

    public Date getDepartureDate() {
        return departureDate;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
