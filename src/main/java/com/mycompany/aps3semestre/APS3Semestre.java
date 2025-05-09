

package com.mycompany.aps3semestre;

import java.io.File;

public class APS3Semestre {

    public static void main(String[] args) {
        FirebaseInitializer.iniciarFirebase();
        CSVtoFirebase.importarCSVParaFirebase("lista-de-especies-ameacas-2020.csv");
       
    }
}
