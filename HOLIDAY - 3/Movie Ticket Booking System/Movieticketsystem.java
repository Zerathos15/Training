import java.util.*;

class Mo{    
    String mi;
    String mn;
    String ml;
    String mg;
    double md;
    Mo(String mi,String mn,String ml,String mg,double md){
        this.mi=mi;
        this.mn=mn;
        this.ml=ml;
        this.mg=mg;
        this.md=md;
    }
}
class Movie{
    ArrayList<Mo> mv ;
    Movie(){
        mv=new ArrayList<>();
    }
    void add(Mo m){
        mv.add(m);
    }
    void remove(String name){
        int idx=0;
        for(Mo v: mv){
            if(v.mn.equals(name)){
                break;
            }
            idx++;
        }
        mv.remove(idx);
    }
    String mname(String id){
        String bn="";
        for(Mo s : mv){
            if(s.mi.equals(id)){
                bn=s.mn;
                break;
            }
        }
        return bn;
    }
    void show(){
        for(Mo s:mv){
            System.out.println("Movie ID :"+s.mi);
            System.out.println("Movie Name :"+s.mn);
            System.out.println("Movie Language :"+s.ml);
            System.out.println("Movie Genre :"+s.mg);
            System.out.println("Movie Duration :"+s.md+"hrs");
            System.out.println("----------------------------");
        }
    }
}
class Us{
    String na;
    String pa;
    Us(String na,String pa){
        this.na=na;
        this.pa=pa;
    }
}
class User{
    ArrayList<Us> u;
    User(){
        u = new ArrayList<>();
    }
    void Add(Us m){
        u.add(m);
    }
    String Validate(Scanner sc){
        boolean flag = false;
        String name="";
        String pass="";
        OuterLoop:
        while(true){
            System.out.print("Enter Name :");
            name = sc.nextLine();
            System.out.print("Enter Password :");
            pass = sc.nextLine();
            for(int i=0;i<u.size();i++){
                if(name.equals(u.get(i).na)){
                    if(pass.equals(u.get(i).pa)){
                        flag = true;
                        System.out.println("----------Welcome "+u.get(i).na+"----------");
                        System.out.println("----------------------------");
                        break OuterLoop;
                    }
                }
            }
            if(flag==false){
                System.out.println("Username and Password Doesnt Match Please Try Again!!!");
            }
        }
        return name;
    }
}
class Ad{
    String nam;
    String pas;
    Ad(String nam,String Pas){
        this.nam=nam;
        this.pas=pas;
    }
}
class Admin{
    ArrayList<Ad> a;
    Admin(){
        a = new ArrayList<>();
    }
    void add(Ad m){
        a.add(m);
    }
    void Login(Scanner sc){
        boolean fla = false;
        String namee="";
        String apass="";
        System.out.print(a.size());
        OuterLoop:
        while(true){
            System.out.print("Enter Name :");
            namee = sc.nextLine();
            System.out.print("Enter Password :");
            apass = sc.nextLine();
            for(int i=0;i<a.size();i++){
                if(namee.equals(a.get(i).nam)){
                    if(apass.equals(a.get(i).pas)){
                        fla = true;
                        System.out.println("Welcome "+a.get(i).nam);
                        System.out.println("----------------------------");
                        break OuterLoop;
                    }
                }
            }
            if(fla==false){
                System.out.println("AdminName and Password Doesnt Match Please Try Again!!!");
            }
        }
    }

}
class S{
    String name;
    boolean av;
}
class Seat{
    S arr[];
    Seat(){
        arr = new S[30];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new S();
            arr[i].av = false;   
        }
    }
    void book(int[] nu,String name,String uname){
        for(int i=0;i<nu.length;i++){
            arr[nu[i]-1].av=true;
        }
        System.out.println("SuccessFully Booked!!!");
        System.out.println("----------Ticket Details----------");
        System.out.print("\nName :"+uname);
        System.out.print("\nMovie Name :"+name);
        System.out.print("\nNo.Of.Tickets :"+nu.length);
        System.out.println();
    }
    void avail(){
        for(int i=0;i<30;i++){
            if(arr[i].av==true){
                continue;
            }
            else{
                System.out.println(i+1);
            }
        }
    }
}


public class Movieticketsystem{
    public static void main(String[] args) {
        Movie m = new Movie();
        Admin ad = new Admin();
        User us = new User();
        Seat sn = new Seat();
        Mo ml1 = new Mo("01","Vikram","Tamil","Action/Thriller",2.54);
        Mo ml2 = new Mo("02","Master","Tamil","Action/Drama",2.59);
        Mo ml3 = new Mo("03","96","Tamil","Romance/Drama",2.38);
        Mo ml4 = new Mo("04","Kaithi","Tamil","Action/Thriller",2.25);
        Mo ml5 = new Mo("05","Soorarai Pottru","Tamil","Drama/Biography",2.33);
        Mo ml6 = new Mo("06","Doctor","Tamil","Action/Comedy",2.31);
        m.add(ml1);
        m.add(ml2);
        m.add(ml3);
        m.add(ml4);
        m.add(ml5);
        m.add(ml6);
        Scanner sc = new Scanner(System.in);
        OuterLoop:
        while(true){
            System.out.println();
            System.out.println("----------Welcome To MBook----------");
            System.out.print("\n1.Login\n2.Register\n3.LogOut");
            System.out.print("\nEnter Your Choice :");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.print("\n1.User\n2.Admin");
                    System.out.print("\nEnter Your Choice :");
                    int uc=sc.nextInt();
                    sc.nextLine();
                    switch (uc) {
                        case 1:
                            String un=us.Validate(sc);
                            m.show();
                            System.out.print("\nEnter No.of.Seats :");
                            int as = sc.nextInt();
                            int arr[] = new int[as];
                            Seat sa = new Seat();
                            System.out.print("Enter Movie ID :");
                            sc.nextLine();
                            String id = sc.nextLine();
                            String bn = m.mname(id);
                            sa.avail();
                            for(int i=0;i<arr.length;i++){
                                System.out.print("\nEnter Seat Number :");
                                arr[i]=sc.nextInt();
                            }
                            sa.book(arr,bn,un);
                            break;
                        case 2:
                            ad.Login(sc);
                            System.out.print("\n1.Add Movie \n2.Remove Movie");
                            System.out.print("Enter Your Choice :");
                            int ac = sc.nextInt();
                            sc.nextLine();
                            switch (ac) {
                                case 1:
                                    String Mon,Mol,Mog,Moi;
                                    float Mod;
                                    System.out.print("\nEnter Movie ID :");
                                    Moi = sc.nextLine();
                                    System.out.print("\nEnter Movie Name :");
                                    Mon = sc.nextLine();
                                    System.out.print("\nEnter Movie Language :");
                                    Mol = sc.nextLine();
                                    System.out.print("\nEnter Movie Genre :");
                                    Mog = sc.nextLine();
                                    System.out.print("\nEnter Duration :");
                                    Mod = sc.nextFloat();
                                    Mo ml7 = new Mo(Moi, Mon, Mol, Mog, Mod);
                                    m.add(ml7);
                                    break;
                                case 2:
                                    System.out.print("\nEnter Movie Name :");
                                    String Movn = sc.nextLine();
                                    m.remove(Movn);
                                    break;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.print("\n1.User\n2.Admin");
                    System.out.print("\nEnter Your Choice :");
                    int rc = sc.nextInt();
                    sc.nextLine();
                    switch (rc) {
                        case 1:
                            System.out.print("Enter UserName :");
                            String una = sc.nextLine();
                            System.out.print("Enter Password :");
                            String upas = sc.nextLine();
                            Us ul = new Us(una, upas);
                            us.Add(ul);
                            System.out.println("------------Successfully Registered------------");
                            break;
                        case 2:
                            System.out.print("Enter AdminName :");
                            String ana = sc.nextLine();
                            System.out.print("Enter Password :");
                            String apas = sc.nextLine();
                            Ad al = new Ad(ana, apas);
                            ad.add(al);
                            System.out.println("------------Successfully Registered------------");
                            break;
                    }
                    break;
                case 3:
                    break OuterLoop;
            }
        }
    }
}