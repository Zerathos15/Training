class Engine{
    void on(){ 
        System.out.println("engine has turn on");
    }
}
class Car{
    Engine e;   
    Car(){
        e=new Engine();
    }
    void start(){
        e.on();
        System.out.println("car has started");
    }
}
public class Main{
    public static void main(String[] args){
        Car c=new Car();
        c.start();
    }
}

