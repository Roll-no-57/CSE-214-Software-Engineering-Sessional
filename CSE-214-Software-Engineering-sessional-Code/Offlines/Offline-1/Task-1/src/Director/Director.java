package Director;

import Builder.Builder;
import Factory.AdvancedPackage;
import Factory.BasicPackage;
import Factory.PremiumPackage;
import InternetConnection.Ethernet;
import InternetConnection.GSM;
import InternetConnection.Wifi;
import Web.Django;
import Web.Node;
import Web.Ruby;


public class Director {

    // Construct a system with Basic Package, Wifi Connection and Node.js framework
    public void construct(Builder builder) {

        builder.setSystemPackage(new BasicPackage());
        builder.setInternetConnection(new Wifi());
        builder.setFramework(new Node());
    }

    // Construct a system with Premium Package, Ethernet Connection and Django framework
    public void construct2(Builder builder) {
        builder.setSystemPackage(new PremiumPackage());
        builder.setInternetConnection(new Ethernet());
        builder.setFramework(new Django());
    }

    // Construct a system with Advanced Package, GSM Connection and Ruby framework
    public void construct3(Builder builder) {
        builder.setSystemPackage(new PremiumPackage());
        builder.setInternetConnection(new Ethernet());
        builder.setFramework(new Node());
    }

    // Construct a system with Advanced Package, GSM Connection and Ruby framework
    public void construct4(Builder builder) {
        builder.setSystemPackage(new AdvancedPackage());
        builder.setInternetConnection(new GSM());
        builder.setFramework(new Ruby());
    }
}
