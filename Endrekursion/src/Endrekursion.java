
public class Endrekursion {
	 
	 
	    public static void main(String[ ] args){
	    	long sumIt = summeIterativ(11);
	    	long sumRek = summeRekursiv(11);
	    	long sumEnd = summeEndrekursiv(0, 11);
	    	long pw = powfakRekursiv(2, 3);
	    	long pwEnd = powfakEndRekursiv(1, 2, 3);
	    	long fk = rekursivFakultät(5);
	    	long fkEnd = EndrekursivFakultät(1, 5);
	    	
	        System.out.println("Summenfunktion Iterativ von 5 = "+ sumIt);
	        System.out.println("Summenfunktion Rekursiv von 5 = "+ sumRek);
	    	System.out.println(sumEnd);
	    	System.out.println(".............");
	    	System.out.println(pw);
	    	System.out.println(pwEnd);
	    	System.out.println(".............");
	    	System.out.println(fk);
	    	System.out.println(fkEnd);
	    }
	    
	    // Iterativ sowie Rekursion
	    
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
