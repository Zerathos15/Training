import java.util.*;

class Gymes{
    String name;
    String plan;
    int valid;
    String status;
    String payment;
    String Trainer;
    Gymes(String name,String plan,int valid,String status,String pay){
        this.name=name;
        this.plan=plan;
        this.valid=valid;
        this.status=status;
        this.payment=pay;
        this.Trainer="No Personal Trainer";
    }
    Gymes(String name,String plan,int valid,String status,String pay,String tr){
        this.name=name;
        this.plan=plan;
        this.valid=valid;
        this.status=status;
        this.payment=pay;
        this.Trainer=tr;
    }
}
class GYMMS{
    ArrayList<Gymes> g;
    GYMMS(){
        g= new ArrayList<>();
    }
    void add(Gymes m){
        g.add(m);
    }
    void delete(String name){
        int idx =0;
        for(Gymes s : g){
            if(s.name.equals(name)){
                break;               
            }
            idx++;
        }
        g.remove(idx);
    }
    void updateplan(String name,String plan){
        if(plan.equals("Basic")){
            for(Gymes s : g){
            if(s.name.equals(name)){
                s.plan=plan;
                s.Trainer="No Personal Trainer";
                break;
            }
        }
        }
        else{
            String tname = Trname(name);
            for(Gymes s : g){
                if(s.name.equals(name)){
                    s.Trainer=tname;
                    s.plan=plan;
                    break;
                }
            }
        }
    }
    void updatevalid(String name,int val){
        for(Gymes s : g){
            if(s.name.equals(name)){
                s.valid=val;
                break;
            }
        }
    }
    String Trname(String name){
        int vt=0;
        for(Gymes s : g){
            if(s.name.equals(name)){
                vt=s.valid; 
            }
        }
        if(vt==1){
            return "Trainer 1";
        }
        else if(vt==1){
            return "Trainer 2";
        }
        else{
            return "Trainer 3";
        }
    }
    void updatestatus(String name,String status){
        for(Gymes s : g){
            if(s.name.equals(name)){
                s.status=status;
                break;
            }
        }
    }
    void updatetrainer(String name){
        String trname = Trname(name);
        for(Gymes s : g){
            if(s.name.equals(name)){
                s.Trainer=trname;
                break;
            }
        }
    }
    void updatepayment(String name,String pay){
        for(Gymes s : g){
            if(s.name.equals(name)){
                s.payment=pay;
                break;
            }
        }
    }
    void show(){
        for(Gymes s : g){
            System.out.println("Member Name : "+s.name);
            System.out.println("Member Plan : "+s.plan);
            if(s.valid==0){
                System.out.println("Plan Validity : Expired");
            }
            else{
                System.out.println("Plan Validity : "+s.valid+" Month");
            }
            System.out.println("Membership Status : "+s.status);
            System.out.println("Payment Status : "+s.payment);
            System.out.println("Trainer :"+s.Trainer);
            System.out.println("-----------------------------------------");
            System.out.println();
        }
    }
    void showvalid(int val){
        if(val!=0){
            for(Gymes s : g){
                if(s.valid==0){continue;}
                System.out.println("Member Name : "+s.name);
                System.out.println("Plan Validity : "+s.valid+" Month");
                System.out.println("-----------------------------------------");
                System.out.println();
            }
        }
        else{
            for(Gymes s : g){
                if(s.valid!=val){continue;}
                System.out.println("Member Name : "+s.name);
                System.out.println("Plan Validity : Expired");
                System.out.println("-----------------------------------------");
                System.out.println();
            }
        }
    }
    void showStatus(String status){
        for(Gymes s : g){
            if(s.status.equals(status)){
               System.out.println("Member Name : "+s.name);
                System.out.println("Membership Status : "+s.status);
                System.out.println("-----------------------------------------");
                System.out.println();
            }
        }
    }
    void showPlan(String plan){
        for(Gymes s : g){
            if(s.plan.equals(plan)){
               System.out.println("Member Name : "+s.name);
                System.out.println("Member Plan : "+s.plan);
                System.out.println("-----------------------------------------");
                System.out.println();
            }
        }
    }
    void showPay(String pay){
        for(Gymes s : g){
            if(s.payment.equals(pay)){
               System.out.println("Member Name : "+s.name);  
                System.out.println("Payment Status : "+s.payment);
                System.out.println("-----------------------------------------");
                System.out.println();
            }
        }
    }
    void showtrainer(String tr){
        int c=0;
        for(Gymes s:g){
            if(s.Trainer.equals(tr)){
                 if(s.valid!=0){ 
                    System.out.println("Member Name : "+s.name);  
                    System.out.println("Member Plan : "+s.plan);
                    System.out.println("Plan Validitiy :"+s.valid+"Month");
                    System.out.println("-----------------------------------------");
                    System.out.println();
                }
                c++;
            }
        }
        if(c==0){
            System.out.println("Trainer is Yet to be Assigned");
        }
    }
    void Trainerdetail(){
        System.out.println("Trainer Name : Trainer 1");
        System.out.println("Trainer Plan : Premium");
        System.out.println("Plan Duration : 1 Month");
        System.out.println("-----------------------------------------");
        System.out.println("Trainer Name : Trainer 2");
        System.out.println("Trainer Plan : Premium");
        System.out.println("Plan Duration : 6 Month");
        System.out.println("-----------------------------------------");
        System.out.println("Trainer Name : Trainer 3");
        System.out.println("Trainer Plan : Premium");
        System.out.println("Plan Duration : 12 Month");
    }
    void Plandetails(){
        System.out.println("------Basic plan-----");
        System.out.println("Fee : $1000 per Month");
        System.out.println("Duartion : 1 Month \\ 6 Month \\ 12 Month");
        System.out.println();
        System.out.println("------Premium plan-----");
        System.out.println("Fee : $2000 per Month");
        System.out.println("Duartion : 1 Month \\ 6 Month \\ 12 Month");
        System.out.println("Personal Trainer Will be Assigned");
    }
}

public class Gymmembership{
    public static void main(String[] args){
       GYMMS m = new GYMMS();
       Gymes d ;
       Scanner sc = new Scanner(System.in);
       OuterLoop:
       while(true){
            System.out.print("\n------------GYM MEMBERSHIP SYSTEM----------");
            System.out.print("\n1.Member Details \n2.Plan Details \n3.Payment Details \n4.Trainer Details\n5.Exit");
            System.out.print("\nEnter your choice :");
            int cg = sc.nextInt();
            System.out.println("-----------------------------------------");
            switch (cg) {
                case 1:
                    System.out.print("\n1.Add Members\n2.Delete Member\n3.Update Member \n4.Show Members ");
                    System.out.print("\nEnter your choice :");
                    int n = sc.nextInt();
                    sc.nextLine();
                    System.out.println("-----------------------------------------");
                    switch(n){
                        case 1:
                            System.out.print("Enter the Following Details :");
                            System.out.print("\nEnter Name: ");
                            String na;
                            na= sc.nextLine();
                            System.out.print("Enter Plan:");
                            String pl;
                            pl = sc.nextLine();
                            System.out.print("Enter Plan Duration : ");
                            String dur = sc.nextLine();
                            int va;
                            String tr = "No Personal Trainer";
                            if(dur.equals("Monthly")){
                                if(pl.equals("Premium")){
                                    tr = "Trainer 1";
                                }
                                va=1;
                            }
                            else if(dur.equals("Half-Yearly")){
                                if(pl.equals("Premium")){
                                    tr = "Trainer 2";
                                }
                                va=6;
                            }
                            else{
                                if(pl.equals("Premium")){
                                    tr = "Trainer 3";
                                }
                                va=12;
                            }
                            d = new Gymes(na, pl, va,"Active" ,"Completed",tr);
                            m.add(d);
                            System.out.println("-----------------------------------------");
                            break;
                        case 2:
                            System.out.print("Enter Name :");
                            String nam = sc.nextLine();
                            m.delete(nam);
                            System.out.println("-----------------------------------------");
                            break;
                        case 3:
                            System.out.println("Update : \n1.Validity of Plan \n2.Membership Status ");
                            System.out.print("Enter Your Choice :");
                            int n1 = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter Name :");
                            String name = sc.nextLine();
                            switch (n1) {
                                case 1:
                                    System.out.print("Enter New Validity:");
                                    int v = sc.nextInt();
                                    m.updatevalid(name, v);
                                    System.out.println("Successfully Updated!!!");
                                    break;
                                case 2:
                                    System.out.print("Enter Membership Status:");
                                    String ms = sc.nextLine();
                                    m.updatestatus(name,ms);
                                    System.out.println("Successfully Updated!!!");
                                    break;                     
                            }
                            System.out.println("-----------------------------------------");
                            break;
                        case 4:
                            System.out.print("Show : \n1.ALL Members \n2.Active Members \n3.Inactive Members");
                            System.out.print("\n Enter your choice :");
                            int mn=sc.nextInt();
                            System.out.println("-----------------------------------------");
                            switch (mn) {
                                case 1:
                                    m.show();                           
                                    break;
                                case 2:
                                    m.showStatus("Active");
                                    break;
                                case 3:
                                    m.showStatus("Inactive");
                                    break;
                            }
                            break;
                    }
                    break;  
                case 2:
                    System.out.print("\n1.Display Plans Details \n2.show Plan members \n3.Update plan details");
                    System.out.print("\nEnter your choice :");
                    int dp = sc.nextInt();
                    System.out.println("-----------------------------------------");
                    switch (dp) {
                        case 1:
                            m.Plandetails();
                            break;
                        case 2:
                            sc.nextLine();
                            System.out.print("Enter plan :");
                            String splan=sc.nextLine();
                            System.out.println("-----------------------------------------");
                            m.showPlan(splan);
                            break;
                        case 3:
                            sc.nextLine();
                            System.out.print("Enter Name:");
                            String pna = sc.nextLine();
                            System.out.print("Enter New Plan :");
                            String p = sc.nextLine();
                            m.updateplan(pna,p);
                            System.out.println("Successfully Updated!!!");
                            break;
                    }
                    break;
                case 3:
                    System.out.print("\n1.Display Payment Details \n2.Update Payment Details");
                    System.out.print("\nEnter your Choice :");
                    int pcd = sc.nextInt();
                    System.out.println("-----------------------------------------");
                    switch (pcd) {
                        case 1:
                            System.out.print("\n1.Show Completed Payment \n2.Show Pending Payment ");
                            System.out.print("\nEnter your choice :");
                            int scp = sc.nextInt();
                            System.out.println("-----------------------------------------");
                            switch (scp) {
                                case 1:
                                    m.showPay("Completed"); 
                                    break;
                                case 2:
                                    m.showPay("Pending");
                                    break;
                            }
                            break;
                        case 2:
                            sc.nextLine();
                            System.out.print("Enter Name:");
                            String pyn = sc.nextLine();
                            System.out.print("Enter Payment Status:");
                            String ps = sc.nextLine();
                            m.updatepayment(pyn, ps);
                            System.out.println("Successfully Updated!!!");
                            break;
                    }
                    break;
                case 4:
                    System.out.print("\n1.Show Assigned Members of Trainer \n2.Show Trainer Details");
                    System.out.print("\nEnter your choice :");
                    int sat = sc.nextInt();
                    System.out.println("-----------------------------------------");
                    switch (sat) {
                        case 1:
                            sc.nextLine();
                            System.out.print("Enter Trainer Name :");
                            String tna = sc.nextLine();
                            System.out.println("-----------------------------------------");
                            m.showtrainer(tna);
                            break;
                        case 2:
                            System.out.println("-----------------------------------------");
                            m.Trainerdetail();
                            break;
                    }
                    break;
                case 5:
                    break OuterLoop;
            }
       }
    }
}