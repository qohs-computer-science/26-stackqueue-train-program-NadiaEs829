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
	public static void main(String[] args) {

		int limitTrackA = 100000, limitTrackB = 100000, limitTrackC = 100000;
		public Stack <Object> trackZero = new Stack <Object>();
		public Stack <Object> trackOne = new Stack <Object>();
		public Queue <Object> trackA = new LinkedList<Object>();
		public Queue <Object> trackB = new LinkedList<Object>();
		public Queue <Object> trackC = new LinkedList<Object>();
		public Queue <Object> trackD = new LinkedList<Object>();
		Scanner x = new Scanner(System.in);
		try{
			File f = new File("HelloWorldProject/src/data.txt");
			x = new Scanner (f);
			String name = x.nextLine();
			System.out.println(name);
			trackZero.add(name);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}//end main
		//for()

}//end class
