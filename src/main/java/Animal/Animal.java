package Animal;

public abstract class Animal {
    private String name;
    private Gender sex;
    private int age;

    public Animal(){};
    public Animal(String name) {
        this(name, null, 0);
    }

    public Animal(String name, Gender sex) {
        this(name, sex, 0);
    }

    public Animal(String name, Gender sex, int age) {
        this.name = name;
        this.sex = sex;
        if (age < 0) {
            throw new IllegalArgumentException("age cannot be lower than 0");
        } else {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) throws Exception {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age <0){
            throw new Exception("age cannot be lower than 0");
        }
        this.age = age;
    }

    public abstract void ISound();
}
