import Builder.Builder;
import Builder.TicketingSystemBuilder;
import Director.Director;
import System.TicketingSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Construct a system with Basic Package, Wifi Connection and Node.js framework
        System.out.println("Construct a system with Basic Package, Wifi Connection and Node.js framework");
        Director director = new Director();
        TicketingSystemBuilder ticketingSystemBuilder = new TicketingSystemBuilder();
        director.construct(ticketingSystemBuilder);
        TicketingSystem ticketingSystem = ticketingSystemBuilder.build();
        System.out.println(ticketingSystemBuilder.getResult());

        // Construct a system with Premium Package, Ethernet Connection and Django framework
        System.out.println("Construct a system with Premium Package, Ethernet Connection and Django framework");
        TicketingSystemBuilder ticketingSystemBuilder2 = new TicketingSystemBuilder();
        director.construct2(ticketingSystemBuilder2);
        TicketingSystem ticketingSystem2 = ticketingSystemBuilder2.build();
        System.out.println(ticketingSystemBuilder2.getResult());

        // Construct a system with Premium Package, Ethernet Connection and Node framework
        System.out.println("Construct a system with Premium Package, Ethernet Connection and Node framework");
        TicketingSystemBuilder ticketingSystemBuilder3 = new TicketingSystemBuilder();
        director.construct3(ticketingSystemBuilder3);
        TicketingSystem ticketingSystem3 = ticketingSystemBuilder3.build();
        System.out.println(ticketingSystemBuilder3.getResult());

        // Construct a system with Advanced Package, GSM Connection and Ruby framework
        System.out.println("Construct a system with Advanced Package, GSM Connection and Ruby framework");
        TicketingSystemBuilder ticketingSystemBuilder4 = new TicketingSystemBuilder();
        director.construct4(ticketingSystemBuilder4);
        TicketingSystem ticketingSystem4 = ticketingSystemBuilder4.build();
        System.out.println(ticketingSystemBuilder4.getResult());

    }
}