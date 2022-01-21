package Animal;

public class Frog extends Animal{
    public Frog(){
        super();
    }
    public Frog(String name){
        super(name);
    }
    public Frog(String name,Gender sex){
        super(name,sex,0);
    }
    public Frog(String name,Gender sex,int age){
        super(name,sex,age);
    }
    @Override
    public void ISound() {
        System.out.println("Ếch ộp Ếch ộp");
    }
}
