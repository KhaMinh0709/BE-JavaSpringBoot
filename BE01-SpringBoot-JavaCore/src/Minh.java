public class Minh extends People {
    public Minh(){
        super("",0);

    }
    public Minh(String name, int age){

        super(name,age);
    }
    public Minh minh(String name, int age){
        return new Minh(name,age);
    }

}
