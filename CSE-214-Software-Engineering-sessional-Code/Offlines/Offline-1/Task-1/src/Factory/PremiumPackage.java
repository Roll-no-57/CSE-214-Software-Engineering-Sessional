package Factory;

import MicroProcessor.MicroProcessor;
import MicroProcessor.Rasberry;
import Display.Display;
import Display.TouchDis;
import Identification.Identification;
import Identification.NFC;
import Payment.Payment;
import Payment.OnSpotPay;
import Storage.Storage;
import Storage.Integrated;
import Controller.Controller;
import Controller.TouchScreenBased;



public class PremiumPackage extends SystemPackageFactory{
    @Override
    public MicroProcessor createMicroProcessor() {
        return new Rasberry();
    }
    @Override
    public Display createDisplay() {
        return new TouchDis();
    }
    @Override
    public Identification createIdentification() {
        return new NFC();
    }
    @Override
    public Payment createPayment() {
        return new OnSpotPay();
    }
    @Override
    public Storage createStorage() {
        return new Integrated();
    }
    @Override
    public Controller createController() {
        return new TouchScreenBased();
    }
    public String toString() {
        return "Premium Package";
    }
}
