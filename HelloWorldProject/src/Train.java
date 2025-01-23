public class Train {
    private String name, product, origin, destination; 
    private int weight, miles;

    public Train(){

    }
    //create Engine - create it as default
    public Train(String carName, String contains, String start, String end, int w, int m){
        name = carName;
        product = contains;
        origin = start;
        destination = end;
        weight =  w;
        miles = m;
    }//end constructor

    public String getName(){
        return name;          
    }//end get method

    public int getMiles(){
        return miles;
    }

    public String getDestination(){
        return destination;
    }

    public String toString(){ //remember to change as well
        return name + "\n" + product + "\n" + origin + "\n"+ destination + "\n" + weight + "\n" + miles + "\n";
    }//end toString

    public String getProduct(){
        return name + " containing " + product;
    }//end toString

}//end class
