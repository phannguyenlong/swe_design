package exam.phase2.questiontwo.decorator;

import exam.phase2.questiontwo.Booking;

public class CabinetDecorator extends BookingDecorator {

    public CabinetDecorator(Booking booking, int quantity) {
        super(booking);
        registerCabinet(quantity); // call aditional function that booking don't have
    }

    private void registerCabinet(int quantity) {
        this.price += 3 * quantity; // add fee for canbinet to price
    } 
}
