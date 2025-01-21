import java.util.Scanner;
public class Excercise1 {
	public static void main(String[] args) {
	//Write a program to check whether a character 
		//is uppercase or lowercase alphabet
		char ch;
		Scanner sc = new Scanner(System.in);
		char cod;
		int upAsc = (int)'A';
		int lowAsc = (int)'a';
		int diff = upAsc - lowAsc;
		if(diff < 0) diff = -diff;
		do {
			System.out.println("please enter a char");
			ch = sc.next().charAt(0);// Hello
			if( (ch >= 'A') &&(ch <='Z')) {
				System.out.println("ch is Upper case");
				ch = (char)(ch + diff);
			}
			else if( (ch >= 'a') &&(ch <='z')) {
				ch = (char)(ch - diff);
				System.out.println(" Lower Case");
			}
			System.out.println("after conversion ....ch--->"+ch);
			System.out.println("do u want to repeat?if yes pls press y or n");
			cod = sc.next().charAt(0);
			if(cod == 'n') cod=0;
			else cod =1;
		}while(cod == 1);
		System.out.println("ends");
	}

}
