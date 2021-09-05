package exam.phase2.questiontwo.decorator;

import exam.phase2.questiontwo.Booking;

public class ParkingDecorator extends BookingDecorator{

    public ParkingDecorator(Booking booking) {
        super(booking);
        registerParking(); // call aditional function that booking don't have
    }
    
    private void registerParking() {
        this.price += 5; // add fee for parking to price
    }
}
