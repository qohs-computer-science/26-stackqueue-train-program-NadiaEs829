public class Train {
    private String name, product, origin, destination;
    private int weight, miles;

    //creates a train
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

    public String toString(){
        return name + product + origin + destination + weight + miles;      //add in a new line bewteen
    }//end toString

    public String getProduct(){
        return name + " containing " + product;
    }//end toString
}//end class
