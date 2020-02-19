package epam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Construction {
	static String type;
	static int area;
	static long amount = 0;

	public Construction(String x, int house_area ) {
		type = x;
		area = house_area;
		// TODO Auto-generated constructor stub
	}
	public static long construction_cost(){
		 if(type.contentEquals("standard"))
			 amount = (1200 * area);
		 else if(type.contentEquals("above_standard"))
			 amount = (1500 * area);
		 else if(type.contentEquals("high_standard"))
			 amount = (1800 * area);
		 else if(type.contentEquals("high_standard_automated"))
			 amount = (2500 * area);
		 return amount;
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// TODO Auto-generated method stub
		Construction obj = new Construction("standard",20);
		bw.write("Area if standard is "+ obj.construction_cost()+"\n");
		Construction obj1 = new Construction("above_standard",30);
		bw.write("Area if above standard is "+ obj1.construction_cost()+"\n");
		Construction obj2 = new Construction("high_standard",30);
		bw.write("Area if high standard is  "+ obj2.construction_cost()+"\n");
		Construction obj3 = new Construction("high_standard_automated",30);
		bw.write("Area if high standard and automated is "+ obj3.construction_cost()+"\n");
		bw.flush();

		

	}

}
