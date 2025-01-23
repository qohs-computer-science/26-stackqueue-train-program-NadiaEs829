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
	public static Queue <Object> trackZero = new LinkedList<Object>();
	public static Queue <Object> trackOne = new LinkedList<Object>();
	public static Stack <Object> trackA = new Stack <Object>();
	public static Stack <Object> trackB = new Stack <Object>();
	public static Stack <Object> trackC = new Stack <Object>();
	public static Stack <Object> trackD = new Stack <Object>();
	public static Queue <Object> copyZero = trackZero;
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
		
		while(!copyZero.isEmpty()){
			System.out.println((copyZero.remove()).toString());
		}

		while(!trackZero.isEmpty()){
			if(((Train) trackZero.peek()).getMiles() > 700)
				trackOne.add((Train)trackZero.peek());
				((Train)trackZero.peek()).setMiles(100);
				trackZero.remove((Train)trackZero.peek());
		}//end for loop
		int weightA = 0;
		int weightB = 0;
		int weightC = 0;

		while(!trackOne.isEmpty()){
			if(((Train)trackOne.peek()).getDestination().equals("Trenton") && weightA < limitTrackA){
				trackA.add((Train)trackOne);
				trackZero.remove((Train)trackOne);
				weightA += ((Train)trackOne).getWeight();
			}//end if

			else if(((Train)trackOne.peek()).getDestination().equals("Charlotte") && weightB < limitTrackB){
				trackB.add((Train)trackOne);
				trackZero.remove((Train)trackOne);
				weightB += ((Train)trackOne).getWeight();
			}//end else-if
			else if(((Train)trackOne.peek()).getDestination().equals("Baltimore") && weightC < limitTrackC){
				trackC.add((Train)trackOne);
				trackZero.remove((Train)trackOne);
				weightC += ((Train)trackOne).getWeight();
			}//end else-if
			else{
				trackD.add((Train)trackOne);
				trackZero.remove((Train)trackOne);
			}//end else
		}//while loop

		if(weightA > limitTrackA){
			System.out.println("DEPARTING Track A");
			//print toString
			System.out.println("(engine name***)" + " leaving for Trenton with the following cars ");
			while(!trackA.isEmpty()){
				System.out.println(((Train)trackA.peek()).getProduct());
				trackA.remove(((Train)trackA.peek()));
			}//end while
		}//end if
		if(weightB > limitTrackB){
			System.out.println("DEPARTING Track B");
			//prints toString
			System.out.println("(engine name***)" + " leaving for Charlotte with the following cars ");
			while(!trackB.isEmpty()){
				System.out.println(((Train)trackB.peek()).getProduct());
				trackB.remove(((Train)trackB.peek()));
			}//end while
		}//end if

		if(weightC > limitTrackC){
			System.out.println("DEPARTING Track C");
			//print toString
			System.out.println("(engine name***)" + " leaving for Baltimore with the following cars ");
			while(!trackC.isEmpty()){
				System.out.println(((Train)trackC.peek()).getProduct());
				trackC.remove(((Train)trackC.peek()));
			}//end while
		}//end if
		//for(cars in trackD)
		System.out.println("DEPARTING Track D");
		System.out.println("(engine name***)" + "leaving for " + ((Train)trackD.peek()).getDestination() + " with the following cars: ");
		while(!trackD.isEmpty()){ 
			System.out.println(trackD.remove((Train)trackD.peek()));
		}//end while
		//}//end for loop
		System.out.println("END");
	}//end main
}//end class