
public class PrimeNoV1 {

	public static void main(String[] args) {
	
		int n = 19,r,count=0;
		
		for(int i=1;i<=n;i++) {
			r = n % i;
			if(r == 0) count++;
		}
		if(count == 2) System.out.println("yes");
		else System.out.println("no");
		
	
	
	}

}
