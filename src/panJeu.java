import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panJeu extends JPanel{
	
	private JPanel container = new JPanel();
	private JPanel panTitre = new JPanel();
	private JPanel panClavier = new JPanel();
	private JPanel panClavier1 = new JPanel();
	private JPanel panClavier2 = new JPanel();
	private JPanel panImage = new JPanel();
	
	private JLabel labelTitre = new JLabel();
	private JLabel labelImage2 = new JLabel(new ImageIcon("images/img2.jpg"));
	private JLabel labelImage3 = new JLabel(new ImageIcon("images/img3.jpg"));
	private JLabel labelImage4 = new JLabel(new ImageIcon("images/img4.jpg"));
	private JLabel labelImage5 = new JLabel(new ImageIcon("images/img5.jpg"));
	private JLabel labelImage6 = new JLabel(new ImageIcon("images/img6.jpg"));
	private JLabel labelImage7 = new JLabel(new ImageIcon("images/img7.jpg"));
	private JLabel labelImage8 = new JLabel(new ImageIcon("images/img8.jpg"));
	private JLabel labelImage9 = new JLabel(new ImageIcon("images/img9.jpg"));
	private String motMystere ;
	//private String motMystere ="****Mot Mystere ****";
	
	private String[] alphabet = {"A","B","C","D","E","F","G","H","I"
			,"J","K","L","M","N","O","P","Q","R","S","T","U"
			,"V", "W", "X","Y","Z"};
	private JButton[] clavier = new JButton[alphabet.length ];

	private CardLayout cl = new CardLayout();//layout pour les images
	
	private Jeu nouveauJeu = new Jeu();
	
	public panJeu()
	{
		initPanneau();
		//this.removeAll();
	}
	
	private void initPanneau()
	{
		//Affiche le nombre de mots trouv�s et le score
		motMystere = nouveauJeu.getMotMystereCache();
		labelTitre.setText("<html>Nombre de mots trouvés : <br><br>"
				          + "votre score actuel est de :  <br><br>"
				          + "<h1 style = \"color.blue\">" + motMystere + "</h1></html>");
		labelTitre.setFont(new Font("Dialog", Font.BOLD, 15));
		panTitre.add(labelTitre);
		
		//affiche images
		panImage.setLayout(cl);
		panImage.add(labelImage2, "img2");
		panImage.add(labelImage3, "img3");
		panImage.add(labelImage4, "img4");
		panImage.add(labelImage5, "img5");
		panImage.add(labelImage6, "img6");
		panImage.add(labelImage7, "img7");
		panImage.add(labelImage8, "img8");
		panImage.add(labelImage9, "img9");
	    cl.show(panImage, "img9");
	
		//Affiche Clavier
		panClavier1.setLayout(new GridLayout(3,7)); 
		panClavier2.setLayout(new GridLayout(1,5)); 
		panClavier2.setPreferredSize(new Dimension(15, 90));
		panClavier2.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 40));
		
		for (int i = 0; i < alphabet.length; i++)
		{
			clavier[i] = new JButton(alphabet[i]);
			clavier[i].addActionListener(new BoutonListener());
			
			if (i <  alphabet.length - 5)
				panClavier1.add(clavier[i]);
			else 
				panClavier2.add(clavier[i]);
		}
		
		//Agence �l�ments
		panClavier.setLayout(new BorderLayout());
		panClavier.add(panClavier1, BorderLayout.CENTER);
		panClavier.add(panClavier2, BorderLayout.SOUTH);

		BorderLayout bl = new BorderLayout();
		bl.setHgap(30);
		bl.setVgap(30);
		
		this.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		this.setLayout(bl);
		this.add(panTitre, BorderLayout.NORTH);
		this.add(panClavier, BorderLayout.CENTER);
		this.add(panImage, BorderLayout.EAST);
	}
	
	private void remove()
	{
		this.removeAll();
	}
	
	class BoutonListener implements ActionListener 
	{
		public void actionPerformed (ActionEvent arg0) 
		{
			
			String str = ((JButton)arg0.getSource()).getText();
			nouveauJeu.setMotMystereCache(motMystere, str);
			motMystere = nouveauJeu.getMotMystereCache();
			System.out.println(nouveauJeu.getMotMystereCache());
		}
	}
}
