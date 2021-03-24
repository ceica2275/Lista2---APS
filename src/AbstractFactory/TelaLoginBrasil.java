package AbstractFactory;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaLoginBrasil extends TelaLogin {

	public TelaLoginBrasil() {
		super("C:\\Users\\chewb\\OneDrive\\Documentos\\NetBeansProjects\\Lista2 - APS\\src\\AbstractFactory\\brasil.png", "Bem vindo ao Banco do Brasil.");
	}

	public void mostrarTelaLogin() {
		final ImageIcon icon = new ImageIcon(this.getLogo());
		JOptionPane.showMessageDialog(null, this.getMensagem(), "LOGON", JOptionPane.INFORMATION_MESSAGE, icon);
	}

}
