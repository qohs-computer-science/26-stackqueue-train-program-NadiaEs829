import java.util.Stack;

public class Train {
    private String name, product, origin, destination;
    private int weight, miles;

    //create Engine - create it as default
    public Engine(){

    }
    //creates a train - edit it to be accommedted to the engine 
    public Train(String carName, String contains, String start, String end, int w, int m){
        name = carName;
        product = contains;
        origin = start;
        destination = end;
        weight =  w;
        miles = m;
    }//end constructor

    public String getName(){
        return name;            //is this necessary?
    }//end get method

    public int getMiles(){
        return miles;
    }

    public String getDestination(){
        return destination;
    }

    public String toString(){ //remember to change as well
        return name + product + origin + destination + weight + miles;      //add in a new line bewteen
    }//end toString

    public String getProduct(){
        return name + " containing " + product;
    }//end toString

}//end class
