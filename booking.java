import java.util.List;

public class Booking {
    private int bookingId;
    private User user;
    private Show show;
    private List<Seat> seats;
    private double totalPrice;

    public Booking(int bookingId, User user, Show show,
                   List<Seat> seats, double totalPrice) {
        this.bookingId = bookingId;
        this.user = user;
        this.show = show;
        this.seats = seats;
        this.totalPrice = totalPrice;
    }

    public int getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId +
                "\nUser: " + user.getName() +
                "\nMovie: " + show.getMovie().getName() +
                "\nTheatre: " + show.getTheatre().getName() +
                "\nDate: " + show.getDate() +
                "\nTime: " + show.getTime() +
                "\nSeats: " + seats +
                "\nTotal Price: ₹" + totalPrice;
    }
}
