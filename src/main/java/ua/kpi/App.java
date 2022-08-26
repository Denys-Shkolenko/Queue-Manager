package ua.kpi;

import java.io.IOException;
import java.util.Properties;

public class App {

    public static Properties getAppProperties() throws IOException {
        Properties app = new Properties();
        app.load(App.class.getResourceAsStream("/app.properties"));
        return app;
    }

    public static Properties getServiceAccountProperties() throws IOException {
        Properties serviceAccount = new Properties();
        serviceAccount.load(App.class.getResourceAsStream("/service_account.properties"));
        return serviceAccount;
    }
}
