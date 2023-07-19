package FirstPackage;




public class Phone implements Telephone {

    boolean calling;
    boolean ring ;
    public void poweron(){
        System.out.println("power is on");
    }
    public void dial(String phonenumber){
        System.out.println("calling " + phonenumber);
        return calling = true;
    }
    public boolean outgoingcall(){
        if(calling = true){
            System.out.println("calling......");
            return Ring = true;
        }
        else{
            System.out.println("pls make a call first");
            return Ring = false;
        }

    }
    public boolean isringing(){
            if(Ring = true){
                System.out.println("ringing....");
                return true;
            }
            else{
                System.out.println("pls make a call first");
                return false;
            }

    }
    public void answer(String phonenumber){
          System.out.println("answered");
    }
}
