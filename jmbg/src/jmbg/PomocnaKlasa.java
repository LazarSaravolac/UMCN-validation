package jmbg;

public class PomocnaKlasa {
	public static boolean prestupnaGodina(long godina) {
		  if (godina % 4 != 0) {
		    return false;
		  } else if (godina % 400 == 0) {
		    return true;
		  } else if (godina % 100 == 0) {
		    return false;
		  } else {
		    return true;
		  }
		}
	public static String nazivMeseca(long mesec) {
		String nazivMeseca;
		switch ((int)mesec) {
		case 1:
			nazivMeseca="januar";
			break;
		case 2:
			nazivMeseca="februar";
			break;
		case 3:
			nazivMeseca="mart";
			break;
		case 4:
			nazivMeseca="april";
			break;
		case 5:
			nazivMeseca="maj";
			break;
		case 6:
			nazivMeseca="jun";
			break;
		case 7:
			nazivMeseca="jul";
			break;
		case 8:
			nazivMeseca="avgust";
			break;
		case 9:
			nazivMeseca="septembar";
			break;
		case 10:
			nazivMeseca="oktobar";
			break;
		case 11:
			nazivMeseca="novembar";
			break;
		case 12:
			nazivMeseca="decembar";
			break;
		default:
			nazivMeseca="";
			break;
		}
		return nazivMeseca;
	}
	
	public static long proveraMeseca(long mesec, long februarDana) {
		long brojDana;
		int mesecInt=(int)mesec;
		switch(mesecInt) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12: brojDana=31;break;
		case 4:case 6: case 9: case 11: brojDana = 30;break;
		case 2: brojDana = februarDana;break;
		default:
			brojDana=0;
		}
		return brojDana;
	}
	
	public static long proveraPraveGodine(long godina) {
		long pravaGodina;
		if((godina<999)&&(godina>900)) {
			pravaGodina=godina+1000;
		}else {
			pravaGodina=godina+2000;
		}
		return pravaGodina;
	}
	
	public static boolean proveraGodine(long godina) {
		long pravaGodina=proveraPraveGodine(godina);
		boolean prestupna = PomocnaKlasa.prestupnaGodina(pravaGodina);
		return prestupna;
	}
	
	public static String proveraRegiona(int rr) {
		String region;
		switch(rr) {
		case 1: region = "stranci u BIH"; break;
		case 2: region = "stranci u Crnoj Gori"; break;
		case 3: region = "stranci u Hrvatskoj"; break;
		case 4: region = "stranci u Makedoniji"; break;
		case 5: region = "stranci u Sloveniji"; break;
		case 7: region = "stranci u Srbiji (bez pokrajine)"; break;
		case 8: region = "stranci u Vojvodini"; break;
		case 9: region = "stranci u Kosovo i Metohiji"; break;
		case 10: region = "Banja Luka"; break;
		case 11: region = "Bihac"; break;
		case 12: region = "Doboj"; break;
		case 13: region = "Gorazde"; break;
		case 14: region = "Livno"; break;
		case 15: region = "Mostar"; break;
		case 16: region = "Prijedor"; break;
		case 17: region = "Sarajevo"; break;
		case 18: region = "Tuzla"; break;
		case 19: region = "Zenica"; break;
		case 21: region = "Podgorica"; break;
		case 26: region = "Niksic"; break;
		case 29: region = "Pljevlja"; break;
		case 30: region = "Osijek"; break;
		case 31: region = "Bjelovar"; break;
		case 32: region = "Varazdin"; break;
		case 33: region = "Zagreb"; break;
		case 34: region = "Karlovac"; break;
		case 35: region = "Gospic"; break;
		case 36: region = "Rijeka"; break;
		case 37: region = "Sisak"; break;
		case 38: region = "Split"; break;
		case 39: region = "ostalo"; break;
		case 41: region = "Bitola"; break;
		case 42: region = "Kumanovo"; break;
		case 43: region = "Ohrid"; break;
		case 44: region = "Prilep"; break;
		case 45: region = "Skoplje"; break;
		case 46: region = "Strumica"; break;
		case 47: region = "Tetovo"; break;
		case 48: region = "Veles"; break;
		case 49: region = "Stip"; break;
		case 50: region = "Slovenija"; break;
		case 71: region = "Beograd region"; break;
		case 72: region = "Sumadija"; break;
		case 73: region = "Nis region"; break;
		case 74: region = "Juzna Morava"; break;
		case 75: region = "Zajecar"; break;
		case 76: region = "Podunavlje"; break;
		case 77: region = "Podrinje i Kolubara"; break;
		case 78: region = "Kraljevo region"; break;
		case 79: region = "Uzice region"; break;
		case 80: region = "Novi Sad region"; break;
		case 81: region = "Sombor region"; break;
		case 82: region = "Subotica region"; break;
		case 85: region = "Zrenjanin region"; break;
		case 86: region = "Pancevo region"; break;
		case 87: region = "Kikinda region"; break;
		case 88: region = "Ruma region"; break;
		case 89: region = "Sremska Mitrovica region"; break;
		case 91: region = "Pristina region"; break;
		case 92: region = "Kosovska Mitrovica region"; break;
		case 93: region = "Pec region"; break;
		case 94: region = "Djakovica region"; break;
		case 95: region = "Prizren region"; break;
		case 96: region = "Kosovsko Pomoravski region"; break;
		default: region ="";
		}
		
		return region;
	}
}
