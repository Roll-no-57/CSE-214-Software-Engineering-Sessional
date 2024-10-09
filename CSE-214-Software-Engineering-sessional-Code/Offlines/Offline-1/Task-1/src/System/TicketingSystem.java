package System;

import Factory.SystemPackageFactory;
import InternetConnection.InternetConnection;
import Web.Web;

public class TicketingSystem {
    private SystemPackageFactory SystemPackage;
    private InternetConnection internetConnection;
    private Web framework;

    public TicketingSystem(SystemPackageFactory SystemPackage, InternetConnection internetConnection, Web framework) {
        this.SystemPackage = SystemPackage;
        this.internetConnection = internetConnection;
        this.framework = framework;
    }

    public SystemPackageFactory getSystemPackage() {
        return SystemPackage;
    }

    public InternetConnection getInternetConnection() {
        return internetConnection;
    }

    public Web getFramework() {
        return framework;
    }

}
