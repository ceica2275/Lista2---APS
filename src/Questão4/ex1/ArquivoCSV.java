package Questão4.ex1;


import java.io.File;
import java.io.FileWriter;

public class ArquivoCSV implements Implementador{
    private static final String CSV = "/tmp/arquivoCsv.csv";
    public void operacaoConcreta() {
        
        try {
            System.out.println("Iniciando geração do CSV");
             
            FileWriter fw = new FileWriter(new File(CSV));
             
        }catch (Exception e) {
            e.printStackTrace();
        } 
    }
}