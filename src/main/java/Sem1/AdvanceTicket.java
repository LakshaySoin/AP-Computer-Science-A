/*
Implement class AdvanceTicket to represent tickets purchased in advance.
An advance ticket is constructed with a ticket number and with the number of days
in advance that the ticket was purchased. Advance tickets purchased 10 or more
days before the event cost $30, and advance tickets purchased fewer than 10 days
before the event cost $40.
*/
public class AdvanceTicket extends Ticket {
    public AdvanceTicket(int num, int days) {
        super(num, days);
    }
    @Override
    public double getPrice() {
        if (this.days >= 10) {
            return 30;
        } else {
            return 40;
        }
    }
}