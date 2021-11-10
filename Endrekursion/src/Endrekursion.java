public class Endrekursion {
	 
	    public static void main(String[ ] args){
	    	long sumIt = summeIterativ(11);
	    	System.out.println("Summenfunktion Iterativ von 5 = "+ sumIt);
	    	System.out.println("--------------------");
	    	
	    	System.out.println("Summenfunktion Rekursiv für Zahl 11: ");
	    	long startTime = System.nanoTime();
	    	long smrk = summeRekursiv(11);
	    	long stopTime = System.nanoTime();
	    	System.out.println(smrk);
	    	System.out.println("Benötigte Zeit = " + (stopTime - startTime) + " Nanosekunden");
	    	System.out.println("--------------------");
	    	System.out.println("Summenfunktion Endrekursiv für Zahl 11: ");
	    	long startTime1 = System.nanoTime();
	    	long smerk = summeEndrekursiv(0, 11);	    	
	    	long stopTime1 = System.nanoTime();
	    	System.out.println(smerk);
	    	System.out.println("Benötigte Zeit = " + (stopTime1 - startTime1) + " Nanosekunden");
	    	System.out.println("--------------------");
	    	System.out.println("Hochfunktion Rekursiv für Basis 2 Hoch 3: ");
	    	long startTime2 = System.nanoTime();
	    	long pwrk = powfakRekursiv(2, 3);
	    	long stopTime2 = System.nanoTime();
	    	System.out.println(pwrk);
	    	System.out.println("Benötigte Zeit = " + (stopTime2 - startTime2) + " Nanosekunden");
	    	System.out.println("--------------------");
	    	System.out.println("Hochfunktion Endekursiv für Basis 2 Hoch 3: ");
	    	long startTime3 = System.nanoTime();
	    	long pwerk = powfakEndRekursiv(1, 2, 3);
	    	long stopTime3 = System.nanoTime();
	    	System.out.println(pwerk);
	    	System.out.println("Benötigte Zeit = " + (stopTime3 - startTime3) + " Nanosekunden");
	    	System.out.println("--------------------");
	    	System.out.println("Fakultät Rekursiv mit Zahl 5: ");
	    	long startTime4 = System.nanoTime();
	    	long fkrk = rekursivFakultät(5);
	    	long stopTime4 = System.nanoTime();
	    	System.out.println(fkrk);
	    	System.out.println("Benötigte Zeit = " + (stopTime4 - startTime4) + " Nanosekunden");
	    	System.out.println("--------------------");
	    	System.out.println("Fakultät Endrekursiv mit Zahl 5: ");
	    	long startTime5 = System.nanoTime();
	    	long fkerk = EndrekursivFakultät(1, 5);
	    	long stopTime5 = System.nanoTime();
	    	System.out.println(fkerk);
	    	System.out.println("Benötigte Zeit = " + (stopTime5 - startTime5) + " Nanosekunden");
	    }
	    static long summeRekursiv(int n)
	    {
	        
	        if(n>=1)
	        {
	              return n+summeRekursiv(n-1);
	        }
	        else
	        { 
	              return 0;
	        }
	    }
	    static long summeIterativ(int n)
	    {
	        long summe = 0;
	        for(int i = 1; i<=n; i++)
	        {
	            summe += i;
	        }
	        return summe;
	    }
	    static long powfakRekursiv(int basis, int exp) {
	    	  if (exp==1) {
	    	    return basis;
	    	  } else {
	    	    return basis*powfakRekursiv(basis,exp-1);
	    	  }
	    }
	    static long powfakIterativ(int base, int exponent) {
	        int result = 1;
	        for (int i = 0; i < exponent; i++) {
	            result = base * result;
	        }
	        return result;
	    }
	    public static int rekursivFakultät(int a) {
			if(a<=1) {
				return 1;
			} else {
				return a * rekursivFakultät(a-1);
			}
		}
	    public static int iterativFakultät(int a) {
			int result = 1;
			for(int i = 1; i<=a; i++) {
				result *= i;
			}
			return result;
		}
	    
	    // Endrekursion
	    
	    static long summeEndrekursiv(int m, int n) {
	    	if (n == 0) {
	    		return m;
	    	}
	    		return summeEndrekursiv(m+n, n-1);
	    }
	    static long powfakEndRekursiv(int m, int basis, int exp) {
	    	  if (exp==0) {
	    	    return m;
	    	  } else {
	    	    return powfakEndRekursiv(m*basis, basis,exp-1);
	    	  }
	    }
	    public static int EndrekursivFakultät(int b, int a) {
			if(a<=1) {
				return b;
			} else {
				return EndrekursivFakultät(b*a, a-1);
			}
		}
	    
	    
}
