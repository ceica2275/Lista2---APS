package Cliente;


import AbstractFactory.FabricaAbstrata;
import AbstractFactory.TelaLogin;
import AbstractFactory.TelaLogout;



public class Cliente {
	
    public static void testarAbstractFactory() throws Exception{
        FabricaAbstrata fbs = FabricaAbstrata.getInstance("3"); 
        TelaLogin tlgn = fbs.gerarTelaLogin();
        tlgn.mostrarTelaLogin();
        TelaLogout tlgt = fbs.gerarTelaLogout();
        tlgt.mostrarTelaLogout();

    }
    public static void main(String[] args) throws Exception{
        testarAbstractFactory();

    }
}
