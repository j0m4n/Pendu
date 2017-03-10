import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

public class Jeu   {
	
	private String motMystere;
	private String motMystereCache ="";
	private int nbre = (int)(Math.random()*336529);
	private int nbEssais;
	private boolean trouveLettre;
	private boolean trouveMot;
	private boolean finJeu;
	private int nbPoints;
	
	public Jeu ()
	{
		this.motMystere = getMotMystere();
		this.motMystereCache = initMotMystereCache();
		this.nbEssais = 0;
		this.trouveLettre = false;
		this.trouveMot = false;
		this.finJeu = false;
		this.nbPoints = 0;
	}

	public String getMotMystere()
	{
		String mot ="";
		try 
		{
			LineNumberReader reader = new LineNumberReader(new BufferedReader(new FileReader("dico/dictionnaire.txt")));
			for (String line = reader.readLine(); line != null; line = reader.readLine()) 
			{
				if(reader.getLineNumber() == nbre)
				{
					mot = reader.readLine();
					System.out.println("la solution est : " + mot);
					return mot;
				}
			}
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
	    }
		
		return mot;
	}
	
	public String initMotMystereCache()
	{

		for(int i = 0; i < this.motMystere.length(); i++)
		{
			motMystereCache += "*";
		}
		return motMystereCache;
	}
	
	public void setMotMystereCache(String mot, String lettre)
	{	
		String motTemp = motMystereCache;
		motMystereCache ="";
		lettre = lettre.toLowerCase();
		trouveLettre = false;
		
		for(int i = 0; i <  this.motMystere.length(); i++)
		{
			if(this.motMystere.substring(i, i + 1).equals(lettre))
			{
				trouveLettre =  true;
				motMystereCache += lettre;	
			}
			else 
				motMystereCache += motTemp.substring(i, i + 1);
		}
		
		if(!trouveLettre)
			nbEssais++;
	}
	
	public String getMotMystereCache()
	{
		return motMystereCache;
	}
	
	public int getNbEssais()
	{
		return nbEssais;
	}
	
	public boolean getTrouveMot()
	{
		this.trouveMot = true;
		
		for(int i = 0; i <  this.motMystereCache.length(); i++)
		{
			if(motMystereCache.substring(i, i + 1).equals("*"))
				return false;
		}
		return trouveMot;
	}
	
	public boolean isFinJeu()
	{
		if(this.getTrouveMot() || this.getNbEssais() == 7)
			return true;
		else 
			return false;
	}
	
	public int getNbPoints()
	{
		switch (this.getNbEssais())
		{
			case 0: this.nbPoints = 100;
					break;
			case 1: this.nbPoints = 50;
					break;
			case 2: this.nbPoints = 35;
					break;
			case 3: this.nbPoints = 25;
					break;
			case 4: this.nbPoints = 15;
					break;
			case 5: this.nbPoints = 10;
					break;
			case 6: this.nbPoints = 5;
					break;
			default: this.nbPoints = 0;
					break;
		}
		return this.nbPoints;
	}
	
	public boolean getTrouveLettre()
	{
		return trouveLettre;
	}
}
