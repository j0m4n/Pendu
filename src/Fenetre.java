import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Fenetre extends JFrame
{
	private JMenuBar menuBar = new JMenuBar();
	
	private JMenu menuFichier = new JMenu("Fichier");
	private JMenuItem itemNouveau = new JMenuItem("Nouveau");
	private JMenuItem itemScores = new JMenuItem("Scores");
	private JMenuItem itemRegles= new JMenuItem("Règles");
	
	private JMenu menuAPropos = new JMenu("aPropos");
	private JMenuItem itemAPropos= new JMenuItem("A Propos");
	
	private CardLayout cl = new CardLayout();
	private JPanel container = new JPanel();
	
	public Fenetre()
	{
		this.setSize(900,600);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.initMenu();
	    
	    panAccueil accueil = new panAccueil();
	    panRegles regles = new panRegles();
	    
	    container.setLayout(cl);
	    container.add(accueil, "CARD_1");
	    container.add(regles, "CARD_2");
	    
	    cl.show(container, "CARD_1");
	    
	    this.setContentPane(container);
	    
	    this.setVisible(true);
	}

	private void initMenu()
	{
		this.setJMenuBar(menuBar);
		menuBar.add(menuFichier);
		menuFichier.setMnemonic('F');
		menuFichier.add(itemNouveau);
		menuFichier.add(itemScores);
		menuFichier.add(itemRegles);
		
		menuBar.add(menuAPropos);
		menuAPropos.add(itemAPropos);
		menuAPropos.setMnemonic('o');
		
		
	}
}
