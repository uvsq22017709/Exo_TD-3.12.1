package exo;
import java.util.Scanner;

public class ChaineCryptee {
	
	private String ChaineClair;
	private int decalage;
	
	private static char decaleCaractere(char c, int decalage) {
	    return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
	}
	
	ChaineCryptee (String c, int d){
		this.ChaineClair=c;
		this.decalage=d;
	}
	
	
	
	public String crypte(int d) {
		String resultat="";
		if (ChaineClair=="")
		{
			System.out.println("La chaine est vide");
		}
		else {
			
		
			for (int i=0; i<ChaineClair.length(); i++)
			{
				resultat+=decaleCaractere(ChaineClair.charAt(i),d);
			}
		}
		return resultat;
		
	}
	
	public String decrypte(String s,int d) {
		String resultat="";
		for (int i=0; i<s.length(); i++)
		{
			resultat+=decaleCaractere(s.charAt(i),-d);
		}
		return resultat;
	}

	public static void main(String[] args) {
		
		String a="KNOH";
		Scanner obj= new Scanner(System.in);
		
		ChaineCryptee b= new ChaineCryptee (obj.nextLine(),1);
	
		String c=b.crypte(1);
		System.out.println(c);
		
		System.out.println(b.decrypte(c,1));
		

	}

}
