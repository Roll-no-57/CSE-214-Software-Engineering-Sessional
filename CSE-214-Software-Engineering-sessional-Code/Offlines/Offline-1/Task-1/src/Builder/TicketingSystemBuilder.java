package Builder;

import Factory.SystemPackageFactory;
import InternetConnection.InternetConnection;
import MicroProcessor.MicroProcessor;
import Display.Display;
import Identification.Identification;
import Payment.Payment;
import Storage.Storage;
import Controller.Controller;
import Web.Web;
import System.TicketingSystem;


public class TicketingSystemBuilder implements Builder {
    private SystemPackageFactory SystemPackage;
    private MicroProcessor microProcessor;
    private Display display;
    private Identification identification;
    private Payment payment;
    private Storage storage;
    private Controller controller;

    private InternetConnection internetConnection;
    private Web framework;

    @Override
    public  void setSystemPackage(SystemPackageFactory SystemPackage) {
        this.SystemPackage = SystemPackage;
        this.microProcessor = this.SystemPackage.createMicroProcessor();
        this.display = this.SystemPackage.createDisplay();
        this.identification = this.SystemPackage.createIdentification();
        this.payment = this.SystemPackage.createPayment();
        this.storage = this.SystemPackage.createStorage();
        this.controller = this.SystemPackage.createController();
    }

    @Override
    public void setInternetConnection(InternetConnection internetConnection) {
        this.internetConnection = internetConnection;
    }

    @Override
    public void setFramework(Web framework){
        this.framework = framework;
    }

    public TicketingSystem build() {
        return new TicketingSystem(SystemPackage, internetConnection, framework);
    }

    public String getResult(){
        return "System Package: " + SystemPackage.toString() + "\n" +
                "MicroProcessor: " + microProcessor.toString() + "\n" +
                "Display: " + display.toString() + "\n" +
                "Identification: " + identification.toString() + "\n" +
                "Payment: " + payment.toString() + "\n" +
                "Storage: " + storage.toString() + "\n" +
                "Controller: " + controller.toString() + "\n" +
                "Internet Connection: " + internetConnection.toString() + "\n" +
                "Framework: " + framework.toString();
    }


}
