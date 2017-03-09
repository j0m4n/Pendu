import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class panRegles extends JPanel {
	
	private JPanel panTitre = new JPanel();
	private JPanel panRegles = new JPanel();
	
	private JLabel labelTitre = new JLabel();
	private JLabel labelRegles = new JLabel();
	
	public panRegles()
	{
		//Affiche le titre
		labelTitre.setText("Le jeu du PENDU:");
		labelTitre.setFont(new Font("Dialog", Font.BOLD, 30));
		panTitre.add(labelTitre);	
		
		//Affiche les règles
		labelRegles.setText("<html>Vous avez 7 coups pour trouver le mot cachÃ©...."
				+ "et sivous rÃ©ussisez, on recommence <br>"
				+ "Plus vous avez trouvÃ© de mots, plus votre score grandira. Alors"
				+ "Ã  vous de jouer <br><br><br>"
				+ "COMPTE DES POINTS:<br>"
				+ "<BLOCKQUOTE>Mot trouvé sans erreur:.....100pts <br>"
				+ 			  "Mot trouvé avec 1 erreur:....50pts <br>"
				+ 			  "Mot trouvé avec 2 erreurs:....35pts <br>"
				+ 			  "Mot trouvé avec 3 erreurs:....25pts <br>"
				+ 			  "Mot trouvé avec 4 erreurs:....15pts <br>"
				+ 			  "Mot trouvé avec 5 erreurs:....10pts <br>"
				+ 			  "Mot trouvé avec 6 erreurs:.....5pts <br><br><br>"
				+"</BLOCKQUOTE> Je vous souhiaite bien du plaisir....<br>"
				+ "et si vous pensez pouvoir trouver en un coup, c'est qu vous pensez"
				+ "que le dictionnaire est petit ! <br>"
				+ "Hors pour votre information il contient plus de 336 000 mots donc"
				+ "bon courage ! </html> ");
		panRegles.add(labelRegles);
		
		//Agence les éléments
		this.setLayout(new BorderLayout());
		this.add(panTitre, BorderLayout.NORTH);
		this.add(panRegles, BorderLayout.CENTER);
	}
}
