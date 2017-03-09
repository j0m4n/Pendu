import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class panAccueil extends JPanel {
	
	private JPanel panTitre = new JPanel();
	private JPanel panImage= new JPanel();
	private JPanel panSousTitre = new JPanel();
	
	private JLabel labelTitre = new JLabel();
	private JLabel labelImage = new JLabel(new ImageIcon("images/img1.jpg"));
	private JLabel labelSousTitre = new JLabel();
	
	public panAccueil()
	{
		//Affiche titre
		labelTitre.setText("Bienvenus dans le jeu du PENDU");
		labelTitre.setFont(new Font("Dialog", Font.BOLD, 30));
		panTitre.add(labelTitre);
		
		//Affiche image
		panImage.add(labelImage);
		
		//Affiche sous titre
		labelSousTitre.setText("<html>Vous avez 7 coups pour trouver le mot caché...."
				+ "et sivous réussisez, on recommence <br>"
				+ "Plus vous avez trouvé de mots, plus votre score grandira. Alors"
				+ "à vous de jouer <br>"
				+ "PROVERBE:<br><BLOCKQUOTE>Pas vu pas pris <br>"
				+ "Pris PENDU !!!!</html>");
		panSousTitre.add(labelSousTitre);
		
		//Agence les �l�ments
		this.setLayout(new BorderLayout());
		this.add(panTitre, BorderLayout.NORTH);
		this.add(panImage, BorderLayout.CENTER);
		this.add(panSousTitre, BorderLayout.SOUTH);
	}

}
