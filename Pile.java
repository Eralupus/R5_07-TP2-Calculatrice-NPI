public class Pile
{
	private String[]	 tab;
	private int   	 sommet;
	
	public Pile( int nbElementTotal)
	{
		this.tab = new String[nbElementTotal];
		this.sommet = 0;
	}
	
	public Pile ( Pile p )
	{
		this.sommet = p.sommet;
		this.tab = new String[p.tab.length];
		
		for (int cpt = 0 ; cpt < this.sommet ; cpt++ )
			this.tab[cpt] = p.tab[cpt];
	}
	
	public boolean estVide()
	{
		return this.sommet == 0;
	}
	
	public boolean estPleine()
	{
		return this.sommet == this.tab.length ;
	}
	
	public boolean empiler( String c )
	{
		if ( this.estPleine() ) return false;
		
		this.tab[this.sommet++] = c;
		return true; 
	}
	
	public String depiler()
	{
		return this.tab[--this.sommet];
	}
	
	public void retourner ()
	{
		String[] tmp = new String[this.tab.length];
		
		for ( int cpt = 0 ; cpt < this.sommet ; cpt++ )
			tmp[cpt] = this.tab[this.sommet - cpt - 1] ;
		
		this.tab = tmp;
		
	}
	
	public String ConsulterSommet()
	{
		
		return  this.tab[this.sommet] ;
	}
	
	
	
	public void supprimer()
	{
		if ( ! this.estVide() )
			this.tab[this.sommet--] = " ";
	}
	
	public String toString()
	{
		String sRet ="";
		
		for ( int cpt = this.sommet - 1 ; cpt >= 0 ; cpt-- )
			
			sRet += " |" + this.tab[cpt] + "|\n" ;
			
			sRet += "******\n" ;
			  
		
		return sRet;
	}	
}