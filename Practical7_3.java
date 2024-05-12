class Child implements mummy, papa
{
    int month=8;
    public void dance(){
        System.out.println("I will dance with Odissy");
    }
    public static void main(String[] args){
        Child o = new Child();
        o.dance();
        System.out.println(o.month);
    }
}
Interfaces:

Papa.java:
	
public interface papa{		
int month=6;						
    public void dance();
}

Mummy.java

public interface mummy
{
    public void dance();
}
