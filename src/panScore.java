import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class panScore extends JPanel implements Observateur {
	
	private Score score;
	private ArrayList <Score> listeScores = new ArrayList<Score>(); 
	private JPanel panListeScore = new JPanel();
	private JLabel labelListeScore = new JLabel();
	
	public panScore() {}
	
	public panScore(Score score) 
	{
		this.initPan();
		this.update(score);
	}
	
	
	public void update(Score score)
	{
		//System.out.println("test 2");
		listeScores.add(score);
	}

	
	public void initPan()
	{
		String strScore ="";
		
		for (Score s : listeScores)
		{
			strScore += s.getNomJoueur() + " -> " + s.getNbPointsJoueur() + " ( " + 
						s.getNbMotsTrouvesJoueur() + " mots trouvés)  \n";
		}
		

		labelListeScore.setText(strScore );
		labelListeScore.setFont(new Font("Dialog", Font.BOLD, 30));
		panListeScore.add(labelListeScore,  BorderLayout.CENTER);
		this.add(panListeScore);

	}
	
}
