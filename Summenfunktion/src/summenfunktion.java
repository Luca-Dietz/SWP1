
public class summenfunktion {
	 
	 
	    public static void main(String[ ] args){
	    	long sumIt = summeIterativ(5);
	    	long sumRek = summeRekursiv(5);
	        System.out.println("Summenfunktion Iterativ von 5 = "+ sumIt);
	        System.out.println("Summenfunktion Rekursiv von 5 = "+ sumRek);
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
}
