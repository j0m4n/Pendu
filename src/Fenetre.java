import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

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
	    panJeu jeu = new panJeu();
	    
	    container.setLayout(cl);
	    container.add(accueil, "accueil");
	    container.add(regles, "regles");
	    container.add(jeu, "jeu");
	    
	    cl.show(container, "accueil");
	    
	    this.setContentPane(container);
	    
	    this.setVisible(true);
	}

	private void initMenu()
	{
		this.setJMenuBar(menuBar);
		menuBar.add(menuFichier);
		menuFichier.setMnemonic('F');
		menuFichier.add(itemNouveau);
		itemNouveau.addActionListener(new itemNouveauListener());
		itemNouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		menuFichier.add(itemScores);
		menuFichier.add(itemRegles);
		
		menuBar.add(menuAPropos);
		menuAPropos.add(itemAPropos);
		menuAPropos.setMnemonic('o');
		itemAPropos.addActionListener(new itemAProposListener());
	}
	
	public class itemAProposListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			cl.show(container, "regles");
		}
	}
	
	public class itemNouveauListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			cl.show(container, "jeu");
		}
	}
}
