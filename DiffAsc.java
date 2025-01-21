import java.util.Scanner;

public class DiffAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 9384720293
		
		//
		
		int upAsc = (int)'A';
		int lowAsc = (int)'a';
		int diff = upAsc - lowAsc;
		if(diff < 0) diff = -1 * diff;
		// 32
		System.out.println(diff);
		Scanner sc = new Scanner(System.in);
		char ch;
		
		// A---- 65
		// a-----97
		
		System.out.println("please enter a char");
		ch = sc.next().charAt(0);// Hello
		if( (ch >= 'A') &&(ch <='Z')) {
			ch = (char)(ch + diff);
			System.out.println("ch----->"+ch);
		}
		

	}

}
