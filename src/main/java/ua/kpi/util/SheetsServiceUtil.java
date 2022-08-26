package ua.kpi.util;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.sheets.v4.Sheets;
import ua.kpi.App;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class SheetsServiceUtil {

    public static Sheets getSheetsService() throws IOException, GeneralSecurityException {
        Credential credential = GoogleAuthorizeUtil.authorize();

        return new Sheets
                .Builder(GoogleNetHttpTransport.newTrustedTransport(), GsonFactory.getDefaultInstance(), credential)
                .setApplicationName(App.getAppProperties().getProperty("name"))
                .build();
    }
}
