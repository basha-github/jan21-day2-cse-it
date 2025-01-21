
public class PrimeNoV2 {

	public static void main(String[] args) {
		
		long n = 37;
		int i =2;
		
		for(;(i<n/2) &&(n % i != 0);i++);
		
		if(i == n/2) System.out.println("yes");
		else System.out.println("no");
		
	}

}
