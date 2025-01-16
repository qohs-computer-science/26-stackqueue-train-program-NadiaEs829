/*
 * TODO: Name; Nadia Escamilla
 * TODO: Date: 1/10/25
 * TODO: Class Period: 7
 * TODO: Program Description: construct and output the status of any train that departs the station
 */
import java.util.Scanner;
import java.io.File;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class MyProgram {
	public static int val = 0;
	public static Stack <Object> trackZero = new Stack <Object>();
	public static Stack <Object> trackOne = new Stack <Object>();
	public Queue <Object> trackA = new LinkedList<Object>();
	public Queue <Object> trackB = new LinkedList<Object>();
	public Queue <Object> trackC = new LinkedList<Object>();
	public Queue <Object> trackD = new LinkedList<Object>();
	//Train myT = new Train();
		public static void main(String[] args) {
	
			int limitTrackA = 100000, limitTrackB = 100000, limitTrackC = 100000;
			Scanner x = new Scanner(System.in);
			try{
				File f = new File("HelloWorldProject/src/data.txt");
				x = new Scanner (f);
				String name = x.nextLine();
				int num = x.nextInt();
				System.out.println(name);
				Train myT = new Train(name, name, name, name, num, num);
				trackZero.add(myT);
				x.nextLine();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		for(int num = 0; 0 < trackZero.; num++){
			if(myT.getMiles() > 700)
				myT.miles = 100;
				trackOne.push(myT);
		}//end for loop
		int weightA = 0;
		int weightB = 0;
		int weightC = 0;
		for(){
			if(myT.destination.equals("Trenton") && weightA < limitTrackA){
				trackA.add(myT);
				trackZero.remove(myT);
				weightA += myT.weight;
			}
			else if(myT.destination.equals("Charlotte") && weightB < limitTrackB){
				trackB.add(myT);
				trackZero.remove(myT);
				weightB += myT.weight;
			}
			else if(myT.destination.equals("Baltimore") && weightC < limitTrackC){
				trackC.add(myT);
				trackZero.remove(myT);
				weightC += myT.weight;
			}
			else{
				trackD.add(myT);
				trackZero.remove(myT);
			}
		}//end for loop

		if(weightA > limitTrackA){
			System.out.println("DEPART");
			//print toString
			System.out.println("(engine name***)" + " leaving for Trenton with the following cars ");
			//for(){
				System.out.println(myT.getProduct());
				trackA.remove(myT);
			//}
		}//end if
		if(weightB > limitTrackB){
			System.out.println("DEPART");
			//prints toString
			System.out.println("(engine name***)" + " leaving for Charlotte with the following cars ");
			//for(){
				System.out.println(myT.getProduct());
				trackA.remove(myT);
			//}
		}//end if

		if(weightC > limitTrackC){
			System.out.println("DEPART");
			//print toString
			System.out.println("(engine name***)" + " leaving for Baltimore with the following cars ");
			//for(){
				System.out.println(myT.getProduct());
				trackA.remove(myT);
			//}
		}//end if
		for(cars in trackD){
			Systeem.out.println("DEPART"); 
			System.out.println("(engine name***)" + "leaving for " + myT.getDetestination() + " with the following cars ");
		}//end for loop
		System.out.println("END");

	}//end main
}//end class