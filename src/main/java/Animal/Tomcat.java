package Animal;

public class Tomcat extends Cat {
    public Tomcat() {
        super();
    }

    public Tomcat(String name) {
        super(name,Gender.MALE);
    }

    public Tomcat(String name, int age) {
        super(name, Gender.MALE, age);
    }

    @Override
    public void setSex(Gender sex) throws Exception {
        if (sex != Gender.MALE) {
            throw new Exception("Tomcat is male only");
        }
        super.setSex(sex);
    }

    @Override
    public void ISound() {
        System.out.println("graw graw khec khec");
    }
}
