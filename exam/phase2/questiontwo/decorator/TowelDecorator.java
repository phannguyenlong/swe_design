package exam.phase2.questiontwo.decorator;

import exam.phase2.questiontwo.Booking;

public class TowelDecorator extends BookingDecorator {
    public TowelDecorator(Booking booking, int quantity) {
        super(booking);
        registerTowel(quantity); // call aditional function that booking don't have
    }
    
    private void registerTowel(int quantity) {
        this.price += 1 * quantity; // add fee for towel
    }
}
