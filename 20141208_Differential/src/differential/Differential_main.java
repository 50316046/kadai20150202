package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Input a>");
		double a = Double.parseDouble(scan.next());
		System.out.println("Input h>");
		double h = Double.parseDouble(scan.next());
		
		Differential_lib dlib= new Differential_lib(a,h);
		System.out.println("Input h>");
		System.out.println("f(x)=x^2��x="+a+ "�ɂ���������W����"+dlib.getRx());
		System.out.println("f(x)=x^2��x="+a+ "�ɂ����鐔�l������"+dlib.getDx());
		System.out.println("���_�l �[ �v�Z�l�@/ ���_�l ���P�O�O ="+dlib.getFx());
	}
}
