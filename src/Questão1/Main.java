package Questão1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import Questão1.CupomFiscal.CupomBuilder;



public class Main {
    public static void main(String arsg[]) {

        Item i1 = new Item(8123, "Brinquedo", 50.0, 1);
        Item i2 = new Item(1258, "Rosquinha", 4.0, 10);
        Item i3 = new Item(2205,"Mouse", 30.0, 2);

        CupomFiscal c1 = new CupomFiscal.CupomBuilder("Loja de Tudo", "0000000000123456")
            .cnpjConsumidor("77788877788").dinheiroRecebido(300.0).build();
        
        c1.inserir(i1);

    }
}
