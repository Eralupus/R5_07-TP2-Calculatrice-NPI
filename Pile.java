public class Pile 
{
	
	private char[] ensCarac ;
	private int    sommet   ;

	
	public Pile ( int nbEltTot )
	{
		this.sommet = 0 ;
		this.ensCarac = new char[nbEltTot] ;
	}
	
	public Pile ( Pile p )
	{
		this.sommet = p.sommet;
		this.ensCarac = new char[p.ensCarac.length];
		
		for (int cpt=0; cpt<this.sommet; cpt++)
			this.ensCarac[cpt] = p.ensCarac[cpt];

	}


	
	public boolean estVide()
	{
		return this.sommet == 0;

	}
	
	public boolean estPleine()
	{
		return this.sommet == this.ensCarac.length;

	}
	
	public boolean empiler( char c )
	{
		
		if( this.estPleine() ) return false ;

		this.ensCarac[this.sommet++] = c;
		return true;
		
		
	}
		
	public char depiler()
	{
		return this.ensCarac[--this.sommet];


	
	}
	

	public void retourner()
	{
		char[] temp = new char[this.ensCarac.length];

		for(int cpt=0; cpt < this.sommet; cpt++)
		
			temp[cpt] = this.ensCarac[this.sommet-cpt-1];


		this.ensCarac = temp;

		
	
		
	}

	public String toString()
	{
		
		String sRet ="" ;
		
		for( int cpt = 0 ; cpt< this.sommet ; cpt++ )
		{
			
			sRet += this.ensCarac[cpt] ; 
		
		}
		
		return sRet ;
		
	}






}
