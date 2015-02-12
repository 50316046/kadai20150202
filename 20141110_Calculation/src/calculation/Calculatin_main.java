package calculation;

import java.util.Scanner;

import lib.Calculation_lib;

public class Calculatin_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 	 	    Scanner scan = new Scanner(System.in);
			System.out.print("Iuput Number m>");
			int m=Integer.parseInt(scan.next());
			
			System.out.print("Input Nimber n>");
			int n =Integer.parseInt(scan.next());
			
			Calculation_lib clib = new Calculation_lib(m,n);
			System.out.println("m+n="+clib.getPlus());
			System.out.println("m-n="+clib.getMinus());
			System.out.println("m*n="+clib.getMultiple());
			System.out.println("m/n="+clib.getDivide());
	}

}
