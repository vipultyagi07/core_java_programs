
abstract  class Animalia{
    public abstract  void walk();
}

class Humans extends Animalia {

    @Override
    public void walk() {
        System.out.println("Human can walk");
    }
}
public class TestJava {
    public static void main(String[] args) {
        Humans humans= new Humans();
        humans.walk();
    }
}
