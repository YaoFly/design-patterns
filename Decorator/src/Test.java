/**
 * Created by YaoFly on 2016/11/4.
 */
public class Test {
    public static void main(String[] args) {
        Human person = new Person();
        Decorator decorator = new DecoratorSecond(new DecoratorFirst(new DecoratorZero(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
