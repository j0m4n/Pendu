import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class panAccueil extends JPanel {
	
	public panAccueil()
	{
		JPanel panTitre = new JPanel();
		JLabel labelTitre = new JLabel();
		labelTitre.setText("Bienvenus dans le jeu du PENDU");
		labelTitre.setFont(new Font("Dialog", Font.BOLD, 30));
		panTitre.add(labelTitre);
		
		JPanel panImage= new JPanel();
		JLabel labelImage = new JLabel(new ImageIcon("images/img1.jpg"));
		panImage.add(labelImage);
		
		JPanel panSousTitre = new JPanel();
		JLabel labelSousTitre = new JLabel();
		labelSousTitre.setText("<html>Vous avez 7 coups pour trouver le mot caché...."
				+ "et sivous réussisez, on recommence <br>"
				+ "Plus vous avez trouvé de mots, plus votre score grandira. Alors"
				+ "à vous de jouer <br>"
				+ "PROVERBE:<br><BLOCKQUOTE>Pas vu pas pris <br>"
				+ "Pris PENDU !!!!<html>");
		panSousTitre.add(labelSousTitre);
		
		this.setLayout(new BorderLayout());
		this.add(panTitre, BorderLayout.NORTH);
		this.add(panImage, BorderLayout.CENTER);
		this.add(panSousTitre, BorderLayout.SOUTH);
		
	}

}
