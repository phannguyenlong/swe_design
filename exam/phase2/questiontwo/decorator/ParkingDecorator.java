package exam.phase2.questiontwo.decorator;

import exam.phase2.questiontwo.Booking;

public class ParkingDecorator extends BookingDecorator{

    public ParkingDecorator(Booking booking, int quantity) {
        super(booking);
        registerParking(quantity); // call aditional function that booking don't have
    }
    
    private void registerParking(int quantity) {
        this.price += 5 * quantity; // add fee for parking to price
    }
}
