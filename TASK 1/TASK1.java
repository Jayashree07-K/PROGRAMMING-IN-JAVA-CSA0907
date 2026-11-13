public class TicketGeneration {
    public static void main(String[] args) {
        int fields = 50;
        int tickets = 10000;
        long start, end;
        start = System.nanoTime();
        for (int i = 0; i < tickets; i++) {
            String ticket = "";
            for (int j = 0; j < fields; j++) {
                ticket = ticket + "Field" + j + " ";
            }
        }
        end = System.nanoTime();
        System.out.println("String Time: " + (end - start));
        start = System.nanoTime();
        for (int i = 0; i < tickets; i++) {
            StringBuilder ticket = new StringBuilder();
            for (int j = 0; j < fields; j++) {
                ticket.append("Field").append(j).append(" ");
            }
        }
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start));
        start = System.nanoTime();
        for (int i = 0; i < tickets; i++) {
            StringBuffer ticket = new StringBuffer();
            for (int j = 0; j < fields; j++) {
                ticket.append("Field").append(j).append(" ");
            }
        }
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start));
    }
}
