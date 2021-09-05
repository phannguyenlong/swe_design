package exam.phase2.questiontwo.decorator;

import exam.phase2.questiontwo.Booking;

// Decorator for Booking
public abstract class BookingDecorator extends Booking {

    public BookingDecorator(Booking booking) {
        this.price = booking.getPrice(); // recivce Booking object and get it price
    }
}
