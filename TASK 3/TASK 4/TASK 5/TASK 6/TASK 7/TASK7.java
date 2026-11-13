public class TicketRedesign {
    public static void main(String[] args) {
        int fields = 50;
        StringBuilder ticket = new StringBuilder(1000);
        for (int i = 0; i < fields; i++) {
            ticket.append("Field ")
                  .append(i)
                  .append(" ");
        }
        String result = ticket.toString();
        System.out.println("Generated Ticket:");
        System.out.println(result);
    }
}
