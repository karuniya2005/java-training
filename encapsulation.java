public class encapsulation {
    public static void main(String[] args) {
        wooberuser woo=new wooberuser(18,"Nivedhan",92,"otteri","2020202020");
        System.out.println("the current age "+woo.getage());
        woo.setage
    }
}
class wooberuser{
    int id;
    String name;
    int age;
    String address;
    String phno;
    
    wooberuser(int id,String name,int age,String address,String phno)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
        this.phno=phno;
    }
}
