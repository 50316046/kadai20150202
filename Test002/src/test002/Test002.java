package test002;

import java.util.Scanner;

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Number > ");
		
		int n =Integer.parseInt(scan.next());
		//scanで取り込んだものは文字列なので整数に変換
		
		System.out.println("Number = "+n);
		
		///////////////////////////////////////////////////////////////////

		System.out.print("Input RealNumber > ");		
		
		double m =Double.parseDouble(scan.next());
		//scanで取り込んだものは文字列なので整数に変換
				
		System.out.println("RealNumber = "+n);
	}

}
