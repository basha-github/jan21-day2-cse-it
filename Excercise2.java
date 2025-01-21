
public class Excercise2 {

	public static void main(String[] args) {
	
		int num = 1234567,max=0,min=9;
		// 0---9
		//%
		
		while(num !=0) {
			int r = num % 10;// 5
			if(r > max) max =r;
			if(r < min) min =r;// 2 < 9
			
			
			num = num / 10;// 1234567 / 10--- 123456
			
		}
		System.out.println("max---->"+max);
		System.out.println("min---->"+min);
		
		}

}
