package AbstractFactory;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaLoginItau extends TelaLogin {

	public TelaLoginItau() {
		super("C:\\Users\\chewb\\OneDrive\\Documentos\\NetBeansProjects\\Lista2 - APS\\src\\AbstractFactory\\itau.png", "Bem vindo ao Itaú.");
	}

	public void mostrarTelaLogin() {
		final ImageIcon icon = new ImageIcon(this.getLogo());
		JOptionPane.showMessageDialog(null, this.getMensagem(), "LOGON", JOptionPane.INFORMATION_MESSAGE, icon);
	}

}
