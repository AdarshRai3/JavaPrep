public class OOPSDemo{
    public static void main(String[] args){
        Iphone iphone = new Iphone(789);
        iphone.call();
        iphone.message();
        GalaxyPhone galaxyPhone = new GalaxyPhone(894);
        galaxyPhone.call();
        galaxyPhone.message();
    }
}

class Phone{

    private Integer ISBN;

    public Phone(Integer ISBN){
       this.ISBN=ISBN;
    }
    public Integer getISBN(){
        return ISBN;
    }
    public void setISBN(Integer ISBN){
        this.ISBN=ISBN;
    }
    protected void call(){
        System.out.println("This is VoIP Calling Functionality of a Phone");
    }
    protected void message(){
        System.out.println( "This is message sending functionality");
    }
}

class Iphone extends Phone implements PhoneFeatures{
    public Iphone(Integer ISBN){
        super(ISBN);
    }
    @Override
    public void message(){
        System.out.println("This use I-Message to send message");
    }
    
    public void battery(){
        System.out.println("This has 2000mAH battery");
    }
    public void camera(){
        System.out.println("This has 24MP camera");
    }
    
}
class GalaxyPhone extends Phone implements PhoneFeatures{
    public GalaxyPhone(Integer ISBN){
         super(ISBN);
    }
    @Override
    public void message(){
        System.out.println("This use Android message to send message");
    }
    
    
    public void battery(){
        System.out.println("This has 4000mAH battery");
    }

    public void camera(){
         System.out.println("This has 48MP Camera");
    }

}

interface PhoneFeatures{
    
    void battery();
    void camera();
}