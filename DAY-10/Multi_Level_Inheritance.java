class Animal{
    void eat(){
        System.out.println("animal eats");
    }
    
}
class cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
class kitten extends cat{
    void play(){
        System.out.println("Kitten plays");
    }
}
public class Main
{
	public static void main(String[] args) {
	kitten k=new kitten(); 
	k.sound();
	k.eat();
	k.play();
	}
}
