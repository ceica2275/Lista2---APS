package AbstractFactory;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaLogoutCaixa extends TelaLogout{

	public TelaLogoutCaixa(){
		super("C:\\Users\\chewb\\OneDrive\\Documentos\\NetBeansProjects\\Lista2 - APS\\src\\AbstractFactory\\caixa.png","A Caixa agradece sua preferência...");
	}

	public void mostrarTelaLogout() {
		final ImageIcon icon = new ImageIcon(this.getLogo());
        JOptionPane.showMessageDialog(null, this.getMensagem(), "LOGOUT", JOptionPane.INFORMATION_MESSAGE, icon);
	}
	
}
