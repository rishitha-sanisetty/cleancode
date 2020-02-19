package epam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Compound_simple {
	static double totalamount;
	static double time;
	static double interestrate;

	public static double simple(){
		double simple_amount = 0;
		simple_amount = (totalamount * time * interestrate)/100;
		return simple_amount;
	}
	public static double compound(){
		double compound_amount = 0;
		compound_amount = totalamount *(Math.pow(1+(interestrate/100),time));
		return compound_amount;
	}
	

	public Compound_simple(double a,double b,double c) {
		totalamount = a;
		time = b;
		interestrate = c;
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Compound_simple object = new Compound_simple(1200,2,5.4);
		bw.write("Compound interest is : " + (double)object.compound() + "\n");
		bw.write("Simple interest is : " + (double)object.simple());
		bw.flush();
	}

}
