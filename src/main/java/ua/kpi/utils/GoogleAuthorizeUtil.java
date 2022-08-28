package ua.kpi.utils;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.sheets.v4.SheetsScopes;
import ua.kpi.App;

import java.io.*;
import java.security.GeneralSecurityException;
import java.util.List;

public class GoogleAuthorizeUtil {

    private static final HttpTransport httpTransport = new NetHttpTransport();
    private static final GsonFactory gsonFactory = GsonFactory.getDefaultInstance();
    private static final List<String> scopes = List.of(SheetsScopes.SPREADSHEETS);

    public static Credential authorize() throws IOException, GeneralSecurityException {
        GoogleCredential credentials = new GoogleCredential.Builder()
                .setTransport(httpTransport)
                .setJsonFactory(gsonFactory)
                .setServiceAccountId(App.getServiceAccountProperties().getProperty("unique_id"))
                .setServiceAccountPrivateKeyFromP12File(
                        GoogleAuthorizeUtil.class.getResourceAsStream("/service_account_private_key.p12"))
                .setServiceAccountScopes(scopes)
                .build();
        credentials.refreshToken();

        return credentials;
    }

}
