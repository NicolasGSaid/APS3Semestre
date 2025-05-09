package com.mycompany.aps3semestre;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVtoFirebase {

    public static void importarCSVParaFirebase(String caminhoCSV) {
        List<Especie> especies = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(caminhoCSV))) {
            String[] linha;
            boolean cabecalho = true;

            while ((linha = csvReader.readNext()) != null) {
                if (cabecalho) {
                    cabecalho = false;
                    continue; 
                }

                String grupo = linha[0];
                String nomePopular = linha[2];
                String nomeCientifico = linha[3];
                String categoria = linha[4];
                String bioma = linha[11];

                Especie especie = new Especie(grupo, nomePopular, nomeCientifico, categoria, bioma);
                especies.add(especie);
            }


            DatabaseReference ref = FirebaseDatabase.getInstance().getReference("especies");
            ref.setValueAsync(especies);
            System.out.println("✅ Dados enviados para o Firebase com sucesso!");

        } catch (Exception e) {
            System.err.println("❌ Erro ao processar o CSV:");
            e.printStackTrace();
        }
    }
}
