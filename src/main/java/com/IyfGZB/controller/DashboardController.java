package com.IyfGZB.controller;

import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeTokenRequest;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.auth.oauth2.GoogleTokenResponse;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.io.*;
import java.util.List;

@Controller
public class DashboardController {

    @GetMapping("/")
    public String dashboard()
    {
        return "index";
    }

    @PostMapping("/google")
    @PermitAll
    @ResponseBody
    public String googleDrive(@RequestParam("code") String code) {

        System.out.println("--------------- "+code);
        try {


            GoogleTokenResponse tokenResponse =
                    new GoogleAuthorizationCodeTokenRequest(
                            new NetHttpTransport(),
                            JacksonFactory.getDefaultInstance(),
                            "https://www.googleapis.com/oauth2/v4/token",
                            "164955192554-24p4vju3lf1i6sjvvs0p6iaj4i7pc062.apps.googleusercontent.com",
                            "_r2cOFc5j_AUMxTLKJgHhbnu",
                            code,
                            "http://localhost:8080").setScopes(DriveScopes.all())  // Specify the same redirect URI that you use with your web
                            .execute();

            String accessToken = tokenResponse.getAccessToken();

            // Use access token to call API
            GoogleCredential credential = new GoogleCredential()
                    .setAccessToken(accessToken)
                    .createScoped(DriveScopes.all());

            Drive drive =
                    new Drive.Builder(new NetHttpTransport(), JacksonFactory.getDefaultInstance(), credential)
                            .setApplicationName("iskconconnect")
                            .build();
FileList result=drive.files().list().setQ("'136l3Fzgobs1qlFh5E6Zsz7YQtUROuErB' in parents").execute();
            List<com.google.api.services.drive.model.File> files = result.getFiles();
            files.forEach(r -> {
                System.out.println(r.getWebViewLink());
                try {
                   File file= drive.files().get(String.valueOf(r.getId())).execute();
                    System.out.println(file.getId());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
//            FileList result1 = drive.files().list().setQ("'1CA2n16A_KIRaEVohm9d0SFamVuDyo3W7' in parents")
//                    .execute();

            return "sign in success";


        } catch (Exception e) {
            System.out.println( e);
            return "sign in failed";
        }
    }


}
