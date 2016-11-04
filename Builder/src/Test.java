import java.io.FileInputStream;

/**
 * Created by YaoFly on 2016/10/28.
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        director.buildCity(new ConcreteBuilder());
    }
}
