//Creates a Train class which defines what a Train is
public class Train {
    private String name, product, origin, destination; 
    private int weight, miles;
    private String engineName,depart;

    public Train(String n, String d){
       engineName = n;
       depart = d;
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
    public void setMiles(int m){
        this.miles = m;
    }

    public String getDestination(){
        return destination;
    }
    public int getWeight(){
        return weight;
    }

    public String toString(){
        return name + "\n" + product + "\n" + origin + "\n"+ destination + "\n" + weight + "\n" + miles + "\n";
    }//end toString

    public String getProduct(){
        return name + " containing " + product;
    }//end toString

}//end class
