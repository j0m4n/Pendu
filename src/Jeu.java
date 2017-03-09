import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;

public class Jeu {
	
	private String motMystere;
	private String motMystereCache ="";
	private int nbre = (int)(Math.random()*336529);
	//private boolean initMot = true;
	
	public Jeu ()
	{
		this.motMystere = getMotMystere();
		this.motMystereCache = initMotMystereCache();
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
		
		for(int i = 0; i <  this.motMystere.length(); i++)
		{
			if(this.motMystere.substring(i, i + 1).equals(lettre))

				motMystereCache += lettre;	
			else 
				motMystereCache += motTemp.substring(i, i + 1);
		}
	}
	
	public String getMotMystereCache()
	{
		return motMystereCache;
	}
	
	
}
