/**
 * @(#)HadiahTeori.java
 *
 *
 * @author 
 * @version 1.00 2019/10/2
 */

import java.util.Scanner;
public class HadiahTeori {
	
	public static void main(String[]args)
	{
		Scanner in= new Scanner(System.in);
		char Nilaihuruf;
		String Nama;
		double NT1,NT2,NT3,NM,NF;
		double NR;
		double NA;
		
		System.out.print("Masukkan Nama         : ");
		Nama=in.nextLine();
		System.out.print("Masukkan Nilai Tugas 1: ");
		NT1=in.nextInt();
		System.out.print("Masukkan Nilai Tugas 2: ");
		NT2=in.nextInt();
		System.out.print("Masukkan Nilai Tugas 3: ");
		NT3=in.nextInt();
		System.out.print("Masukkan Nilai Mid    : ");
		NM=in.nextInt();
		System.out.print("Masukkan Nilai Final  : ");
		NF=in.nextInt();
		System.out.println();
		
		NR=(NT1+NT2+NT3)/3;
		NA=(NR*0.3)+(NM*0.3)+(NF*0.4);
		
		if(NA>=80)
		{
			Nilaihuruf='A';
		}
		else if(NA>=60 && NA<=79.9)
		{
			Nilaihuruf='B';
		}
		else if(NA>=50 && NA<=59.9)
		{
			Nilaihuruf='C';	
		}
		else if(NA>=40 && NA<=49.9)
		{
			Nilaihuruf='D';
		}
		else
		{
			Nilaihuruf='E' ;
		}
		
		System.out.println("Nama       : "+Nama);
		System.out.println("Nilai Akhir: "+NA);
		System.out.println("Nilai Huruf: "+Nilaihuruf);	
	}
}
    