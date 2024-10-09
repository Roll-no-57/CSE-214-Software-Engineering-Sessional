package Factory;

import MicroProcessor.MicroProcessor;
import MicroProcessor.ATMega;
import Display.Display;
import Display.LCD;
import Identification.Identification;
import Identification.RFID;
import Payment.Payment;
import Payment.OnSpotPay;
import Storage.Storage;
import Storage.SD;
import Controller.Controller;
import Controller.OthersBased;

public class BasicPackage extends SystemPackageFactory{

    @Override
    public MicroProcessor createMicroProcessor() {
        return new ATMega();
    }
    @Override
    public Display createDisplay() {
        return new LCD();
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
        return "Basic Package";
    }



}
