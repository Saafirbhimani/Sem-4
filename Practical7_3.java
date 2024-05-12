class Child implements Mummy, Papa
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

