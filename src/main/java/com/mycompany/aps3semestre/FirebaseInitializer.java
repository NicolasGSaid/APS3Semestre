package com.mycompany.aps3semestre;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;

import java.io.FileInputStream;

public class FirebaseInitializer {
    public static void iniciarFirebase() {
        try {
            FileInputStream serviceAccount = new FileInputStream("firebase-key.json");

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://aps3semestre-39ba5-default-rtdb.firebaseio.com/")
                    .build();

            FirebaseApp.initializeApp(options);
            System.out.println("✅ Conectado ao Firebase com sucesso!");

        } catch (Exception e) {
            System.err.println("❌ Erro ao conectar com Firebase:");
            e.printStackTrace();
        }
    }
}
