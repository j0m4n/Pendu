import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class panRegles extends JPanel {
	
	public panRegles()
	{
		JPanel panTitre = new JPanel();
		JLabel labelTitre = new JLabel();
		labelTitre.setText("le jeu du PENDU:");
		labelTitre.setFont(new Font("Dialog", Font.BOLD, 30));
		panTitre.add(labelTitre);	
		
		JPanel panRegles = new JPanel();
		JLabel labelRegles = new JLabel();
		labelRegles.setText("<html>Vous avez 7 coups pour trouver le mot caché...."
				+ "et sivous réussisez, on recommence <br>"
				+ "Plus vous avez trouvé de mots, plus votre score grandira. Alors"
				+ "à vous de jouer <br>"
				+ "PROVERBE:<br><BLOCKQUOTE>Pas vu pas pris <br>"
				+ "Pris PENDU !!!!<html>");
		panRegles.add(labelRegles);
		
		this.setLayout(new BorderLayout());
		this.add(panTitre, BorderLayout.NORTH);
		this.add(panRegles, BorderLayout.CENTER);
	}
}
