package Animal;

public class Cat extends Animal{

    public Cat(){
        super();
    }
    public Cat(String name){
        super(name);
    }
    public Cat(String name,Gender sex){
        super(name,sex,0);
    }
    public Cat(String name,Gender sex,int age) {
        super(name,sex,age);
    }

    @Override
    public void setAge(int age) throws Exception {
        if(age > 50){
            throw new Exception("A cat is not living that long");
        }
        super.setAge(age);
    }

    @Override
    public void ISound() {
        System.out.println("Meow meow");
    }
}
