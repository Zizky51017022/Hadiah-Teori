/**
 * @(#)HadiahTeoriBuffer.java
 *
 *
 * @author 
 * @version 1.00 2019/10/2
 */

import java.io.*;
public class HadiahTeoriBuffer {
	public static void main(String[] args) throws IOException
	{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		
		char NH;
		String Nama;
		double NT1,NT2,NT3,NM,NF;
		double NR;
		double NA;
	
		System.out.println("Inputan Buffered Reader");
		System.out.print("Masukkan Nama         : ");
		Nama=in.readLine();
		System.out.print("Masukkan Nilai Tugas 1: ");
		NT1=Integer.parseInt(in.readLine());
		System.out.print("Masukkan Nilai Tugas 2: ");
		NT2=Integer.parseInt(in.readLine());
		System.out.print("Masukkan Nilai Tugas 3: ");
		NT3=Integer.parseInt(in.readLine());
		System.out.print("Masukkan Nilai Mid    : ");
		NM=Integer.parseInt(in.readLine());
		System.out.print("Masukkan Nilai Final  : ");
		NF=Integer.parseInt(in.readLine());
		System.out.println();
		
		NR=(NT1+NT2+NT3)/3;
		NA=(NR*0.3)+(NM*0.3)+(NF*0.4);
		
		if(NA>=80)
		{
			NH='A';
		}
		else if(NA>=60 && NA<=79.9)
		{
			NH='B';
		}
		else if(NA>=50 && NA<=59.9)
		{
			NH='C';	
		}
		else if(NA>=40 && NA<=49.9)
		{
			NH='D';
		}
		else
		{
			NH='E' ;
		}
		
		System.out.println("Nama       : "+Nama);
		System.out.println("Nilai Akhir: "+NA);
		System.out.println("Nilai Huruf: "+NH);
	
	}
}