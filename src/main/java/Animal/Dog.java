package Animal;

public class Dog extends Animal{
    public Dog(){
        super();
    }
    public Dog(String name){
        super(name);
    }
    public Dog(String name,Gender sex){
        super(name,sex,0);
    }
    public Dog(String name,Gender sex,int age){
        super(name,sex,age);
    }
    @Override
    public void setAge(int age) throws Exception {
        if(age > 50){
            throw new Exception("A dog is not living that long");
        }
        super.setAge(age);
    }
    @Override
    public void ISound() {
        System.out.println("Gâu Gâu");
    }
}
