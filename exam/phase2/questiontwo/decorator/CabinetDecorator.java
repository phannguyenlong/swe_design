package exam.phase2.questiontwo.decorator;

import exam.phase2.questiontwo.Booking;

public class CabinetDecorator extends BookingDecorator {

    public CabinetDecorator(Booking booking) {
        super(booking);
        registerCabinet(); // call aditional function that booking don't have
    }

    private void registerCabinet() {
        this.price += 3; // add fee for canbinet to price
    } 
}
