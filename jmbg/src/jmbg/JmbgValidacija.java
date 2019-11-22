package jmbg;
import java.util.Scanner;
import jmbg.PomocnaKlasa;
public class JmbgValidacija {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String ime,prezime,jmbg;
		System.out.println("Unesite ime");
		ime=sc.nextLine();
		System.out.println("Unesite prezime");
		prezime=sc.nextLine();
		System.out.println("Unesite jmbg");
		jmbg=sc.nextLine();
		if(jmbg.length()!=13) {			
			System.out.println("Nevalidan jmbg");
			sc.close();
			return;
		}
		try {
			Long.parseLong(jmbg);
		}catch(Exception e){
			System.out.println("Nevalidan jmbg");
		}
		
		long dan = Long.parseLong(jmbg.substring(0, 2));
		if(dan>31) {
			System.out.println("Nevalidan jmbg");
			sc.close();
			return;
		}
		long mesec =Long.parseLong(jmbg.substring(2, 4));
		if(mesec>12 && mesec<1) {			
				System.out.println("Nevalidan jmbg");
				sc.close();
				return;
		}
		int rr=Integer.parseInt(jmbg.substring(7, 9));
	
		String region=PomocnaKlasa.proveraRegiona(rr);
		long godina= Long.parseLong(jmbg.substring(4,7));
		boolean prestupna =PomocnaKlasa.prestupnaGodina(godina);
		long proveraDana;
		if(prestupna)
		proveraDana=PomocnaKlasa.proveraMeseca(mesec, 29); 
		else
		proveraDana=PomocnaKlasa.proveraMeseca(mesec, 28);
		if(dan>proveraDana) {
			System.out.println("Nevalidan jmbg");
			sc.close();
			return;
		}
		
		int pol = Integer.parseInt(jmbg.substring(9,12));
		String polOsobe;
		if(pol<=500)
			polOsobe = "musko";
		else
			polOsobe = "zensko";
		
		int k = Integer.parseInt(String.valueOf(jmbg.charAt(jmbg.length()-1)));
		int[]nizBrojeva=new int[jmbg.length()];
		for(int i=0;i<jmbg.length();i++) {
			nizBrojeva[i]=Integer.parseInt(String.valueOf(jmbg.charAt(i)));
		}
		
		int l,a,b,v,g,d,dj,e,zh,z,i,j,kk;
		a=nizBrojeva[0];
		b=nizBrojeva[1];
		v=nizBrojeva[2];
		g=nizBrojeva[3];
		d=nizBrojeva[4];
		dj=nizBrojeva[5];
		e=nizBrojeva[6];
		zh=nizBrojeva[7];
		z=nizBrojeva[8];
		i=nizBrojeva[9];
		j=nizBrojeva[10];
		kk=nizBrojeva[11];
		l=11-((7*(a+e)+6*(b+zh)+5*(v+z)+4*(g+i)+3*(d+j)+2*(dj+kk))%11);
		
		if((l<10)&&(l>0)) {			
		if(l!=k) {
			System.out.println("Nevalidan jmbg");
			sc.close();
			return;
		}
		}else{
			l=0;
		}
		String nazivMeseca=PomocnaKlasa.nazivMeseca(mesec);
		long pravaGodina=PomocnaKlasa.proveraPraveGodine(godina);
		System.out.println("Ime " + ime);
		System.out.println("Prezime " + prezime);
		System.out.println("Rodjen u " + region);
		System.out.println("dana " + dan);
		System.out.println("meseca " + nazivMeseca);
		System.out.println("godine " + pravaGodina);
		System.out.println("broj deteta " + pol);
		System.out.println("dete je " + polOsobe);
		System.out.println("kontrolni broj " + l);
		sc.close();
	
	}
}
