
import java.util.*;

class Ride{
    String name;
    String pickup;
    String drop;
    List<String> stop;
    double fare;
    String status;

    Ride(String name, String pickup, String drop){
        this.name = name;
        this.pickup = pickup;
        this.drop = drop;
        this.stop=new ArrayList<>();
        this.fare = calculation();
        this.status ="BOOKED";
    }
    Ride(String name, String pickup, String drop, List<String> stop)
    {
         this.name = name;
        this.pickup = pickup;
        this.drop = drop;
        this.stop=stop;
        this.fare = calculation();
        this.status ="BOOKED";
}
double calculation(){
    return 50+(stop.size()*50);
}
void showdetails(){
    System.out.println("\ncustomers "+ this.name+" \nRoute : ");
    System.out.print(this.pickup);
    for(String s : stop){
        System.out.print(" --> "+s);
    }
    System.out.println(" --> "+ this.drop);
    System.out.println(this.fare);
    System.out.println(this.status);
    System.out.println("-------------------------------");
}

void cancelRide(){
    if(this.status.equals("cancelled")){
        System.out.println(" already canceled ");
    }else if(this.status.equals("cancelled")){
        System.out.println("cancelled ride cant be Completed");
    }
    else{
        this.status = "cancelled";
        this.fare=0;
        System.out.println("Sucessfully cancelled");
    }
}
void completeride(){
    if(this.status.equals("completed")){
        System.out.println(" already completed ");
    }else if(this.status.equals("completed")){
        System.out.println("Completed ride cant be cancelled");
    }
    else{
        this.status = "completed";
        this.fare=0;
        System.out.println("Sucessfully completed");
    }
}
}
public class RapdioOops {
 
    public static void main(String[] args) {
        List<String> stop = new ArrayList<>();
        Ride R1 = new Ride("ram","st.jo","Tnaggar");
        R1.showdetails();
        stop.add("pallavaram");
        stop.add("chrompet");
         Ride R2 = new Ride("mano","airpot","medavakkam",stop);
        R2.showdetails();
        R1.cancelRide();
        R1.showdetails();
        R2.completeride();
        R2.showdetails();
}
}
