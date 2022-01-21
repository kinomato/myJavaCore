package Animal;

import java.rmi.server.ExportException;

public class Kitten extends Cat {
    public Kitten() {
        super();
    }

    public Kitten(String name) {
        super(name,Gender.FEMALE);
    }

    public Kitten(String name, int age) {
        super(name, Gender.FEMALE, age);
    }

    @Override
    public void setSex(Gender sex) throws Exception {
        if(sex != Gender.FEMALE){
            throw new Exception("Kitten is female only");
        }
        super.setSex(sex);
    }

    @Override
    public void setAge(int age) throws Exception {
        if (age > 1) {
            throw new Exception("Kitten age should not exceed 1");
        }
        super.setAge(age);
    }

    @Override
    public void ISound() {
        System.out.println("Mao Mao");
    }
}
