package Factory;

import MicroProcessor.MicroProcessor;
import MicroProcessor.Arduino;
import Display.Display;
import Display.LED;
import Identification.Identification;
import Identification.RFID;
import Payment.Payment;
import Payment.OnSpotPay;
import Storage.Storage;
import Storage.SD;
import Controller.Controller;
import Controller.OthersBased;



public class StandardPackage extends SystemPackageFactory {
    @Override
    public MicroProcessor createMicroProcessor() {
        return new Arduino();
    }
    @Override
    public Display createDisplay() {
        return new LED();
    }
    @Override
    public Identification createIdentification() {
        return new RFID();
    }
    @Override
    public Payment createPayment() {
        return new OnSpotPay();
    }
    @Override
    public Storage createStorage() {
        return new SD();
    }
    @Override
    public Controller createController() {
        return new OthersBased();
    }

    public String toString() {
        return "Standard Package";
    }

}






















