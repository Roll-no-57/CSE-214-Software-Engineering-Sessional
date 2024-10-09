package Factory;

import Controller.Controller;
import Display.Display;
import Identification.Identification;
import MicroProcessor.MicroProcessor;
import Payment.Payment;
import Storage.Storage;

public abstract class SystemPackageFactory {
    public abstract MicroProcessor createMicroProcessor();
    public abstract Display createDisplay();
    public abstract Identification createIdentification();
    public abstract Payment createPayment();
    public abstract Storage createStorage();
    public abstract Controller createController();

}


