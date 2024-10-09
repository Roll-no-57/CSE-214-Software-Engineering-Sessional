package Builder;

import Factory.SystemPackageFactory;
import InternetConnection.InternetConnection;
import Web.Web;

public interface Builder {

    void setSystemPackage(SystemPackageFactory SystemPackage);
    void setInternetConnection(InternetConnection internetConnection);
    void setFramework(Web framework);

}


