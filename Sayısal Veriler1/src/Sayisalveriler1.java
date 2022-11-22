
public class Sayisalveriler1 {

	public static void main(String[] args) {
		int kur = 18 ; 
	    double euroDun = 18.09 ; 
	    double euroBugun = 18.06 ;
	    boolean euroDustuMu  = false;
	    
	    
	    String  okYonu = "" ;
	    
	    if (euroDun>euroBugun)  { //true
	    okYonu = "down.svg";
	    	System.out.println(okYonu);      	
	    	}
	    
	    else if (euroDun<euroBugun) { //true
	    	okYonu = "up.svg";
	    	System.out.println(okYonu);
	    	}   
	    else { 
	    	okYonu = "equel.svg";
	    	System.out.println(okYonu);
	      	
	    	
	    }
	}
}
