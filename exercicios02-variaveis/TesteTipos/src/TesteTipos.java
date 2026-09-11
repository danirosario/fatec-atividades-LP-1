//daniela de toledo rosario

/*  7 – Indique os tipos da linguagem Java que aceitam cada valor da lista abaixo. 
 
	a. "Bom dia"      -> String.
	b. 3              -> é aceito nos tipos: byte, short, int e long.
	c. 235.13         -> double.
	d. true           -> boolean.
	e. -135           -> é aceito nos tipos: short, int e long.
	f. 256.23F        -> é aceito nos tipos float e double.
	g. 'A'            -> char
	h. 6463275245745L -> long
*/

public class TesteTipos 
{
	public static void main (String[] args) 
	{
		String mensagemBomDia = "Bom Dia";
		
		byte  a = 3;
		short b = 3;
		int   c = 3;
		long  d = 3;
		
		double e = 235.13;
		
		boolean bool = true;
		
		short f = -135;
		int   g = -135;
		long  h = -135;
		
		float  i = 256.23F;
		double j = 256.23F;
		
		char letra   = 'A';
		
		long k = 6463275245745L;
	}
}

