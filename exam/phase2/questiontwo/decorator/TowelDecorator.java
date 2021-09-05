package exam.phase2.questiontwo.decorator;

import exam.phase2.questiontwo.Booking;

public class TowelDecorator extends BookingDecorator {
    public TowelDecorator(Booking booking) {
        super(booking);
        registerTowel(); // call aditional function that booking don't have
    }
    
    private void registerTowel() {
        this.price += 1; // add fee for towel
    }
}
