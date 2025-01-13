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
			public Stack <Object> trackOne = new Stack <Object>();
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
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		for(){
			if(myT.getMiles() > 700)
				myT.miles = 100;
				trackOne.add(myT);
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
			//print toString
			System.out.println(myT.toString());
			//then remove from track A
			trackA.remove(myT);
		//do all for rest of tracks
		}//end if
	}//end main
}//end class
