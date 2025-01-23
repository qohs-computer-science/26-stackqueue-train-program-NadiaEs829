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
	public static Queue <Object> trackZero = new LinkedList<Object>();
	public static Queue <Object> trackOne = new LinkedList<Object>();
	public static Stack <Object> trackA = new Stack <Object>();
	public static Stack <Object> trackB = new Stack <Object>();
	public static Stack <Object> trackC = new Stack <Object>();
	public static Stack <Object> trackD = new Stack <Object>();
		public static void main(String[] args) {
	
			int limitTrackA = 100000, limitTrackB = 100000, limitTrackC = 100000;
			Scanner x = new Scanner(System.in);
			try{
				File f = new File("HelloWorldProject/src/data.txt");
				x = new Scanner (f);
				while(x.hasNext()){
					String name = x.nextLine();
					String product = x.nextLine();
					String origin = x.nextLine();
					String destination = x.nextLine();
					int weight = x.nextInt();
					int miles = x.nextInt();
					Train myT = new Train(name,product,origin,destination,weight,miles);
					trackZero.add(myT);
					x.nextLine();
				}//end while loop
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		//for(int i = 0; i <= trackZero.size(); i++)
		while(!trackZero.isEmpty()){
			System.out.println((trackZero.remove()).toString());
		}
		//while(name.equals("END"))
		//System.out.println(myT.getName());

			//for(int num = 0; 0 < trackZero.; num++)
		/* while(!trackZero.isEmpty()){
			if(myT.getMiles() > 700)
				myT.miles = 100;
				trackOne.push(myT);
		}//end for loop
		int weightA = 0;
		int weightB = 0;
		int weightC = 0;
		//for()
		while(!trackOne.isEmpty()){
			if((trackOne.peek()).getDestination().equals("Trenton") && weightA < limitTrackA){
				trackA.add(trackOne);
				trackZero.remove(myT);
				weightA += myT.weight;
			}//end if
			else if(myT.destination.equals("Charlotte") && weightB < limitTrackB){
				trackB.add(myT);
				trackZero.remove(myT);
				weightB += myT.weight;
			}//end else-if
			else if(myT.destination.equals("Baltimore") && weightC < limitTrackC){
				trackC.add(myT);
				trackZero.remove(myT);
				weightC += myT.weight;
			}//end else-if
			else{
				trackD.add(myT);
				trackZero.remove(myT);
			}//end else
		}//while loop

		if(weightA > limitTrackA){
			System.out.println("DEPARTING Track A");
			//print toString
			System.out.println("(engine name***)" + " leaving for Trenton with the following cars ");
			//for(){
				System.out.println(myT.getProduct());
				trackA.remove(myT);
			//}
		}//end if
		if(weightB > limitTrackB){
			System.out.println("DEPARTING Track B");
			//prints toString
			System.out.println("(engine name***)" + " leaving for Charlotte with the following cars ");
			//for(){
				System.out.println(myT.getProduct());
				trackA.remove(myT);
			//}
		}//end if

		if(weightC > limitTrackC){
			System.out.println("DEPARTING Track C");
			//print toString
			System.out.println("(engine name***)" + " leaving for Baltimore with the following cars ");
			//for(){
				System.out.println(myT.getProduct());
				trackA.remove(myT);
			//}
		}//end if
		//for(cars in trackD)
		System.out.println("DEPARTING Track D");
		System.out.println("(engine name***)" + "leaving for " + myT.getDetestination() + " with the following cars: ");
		while(!trackD.isEmpty()){ 
			System.out.println(trackD.remove());
		}
		//}//end for loop
		System.out.println("END");
*/
	}//end main
}//end class