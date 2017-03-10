import java.util.ArrayList;

public class Score implements Observable {
	
	private String nomJoueur;
	private int nbPointsJoueur;
	private int nbMotsTrouvesJoueur;
	private ArrayList<Observateur> listObservateur = new ArrayList <Observateur>();
	
	public Score(String nomJoueur, int nbPointsJoueur)
	{
		this.nomJoueur = nomJoueur;
		this.nbPointsJoueur = nbPointsJoueur;
		this.nbMotsTrouvesJoueur ++;
		this.updateObservateur();
	}
	
	public void addObservateur(Observateur obs)
	{
		this.listObservateur.add(obs);
	}
	
	public void updateObservateur()
	{
		for (Observateur obs : listObservateur)
			obs.update(this);
	}
	
	public void delObsevateur()
	{
		this.listObservateur = new ArrayList <Observateur>();
	}
	
	public String getNomJoueur()
	{
		return this.nomJoueur;
	}
	
	public int getNbPointsJoueur()
	{
		return this.nbPointsJoueur;
	}
	
	public int getNbMotsTrouvesJoueur()
	{
		return this.nbMotsTrouvesJoueur;
	}
}
