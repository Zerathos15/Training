class Driver{
    String name;
    Driver(String name){                               
        this.name=name;                                
    }
    void drive(){                                     
        System.out.println("Driver "+name+" came");   
    }
}
class Car{
    Driver d;                                         
    Car(Driver d){                                  
        this.d=d;                                     
    }
    void start(){                                                                  
        d.drive();                                                                 
        System.out.println("car has started");       
    }
}
public class Main{
    public static void main(String[] args){
        Driver d=new Driver("Rocky");                 
        Car c=new Car(d);                             
        c.start();                                   
    }
}