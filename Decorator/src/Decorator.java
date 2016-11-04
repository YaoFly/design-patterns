/**
 * Created by YaoFly on 2016/11/3.
 */
//定义装饰者
public abstract class Decorator implements Human{
    public Human human;

    public Decorator(Human human){
        this.human = human;
    }

    public void wearClothes(){
        human.wearClothes();
    }

    public void walkToWhere(){
        human.walkToWhere();
    }
}
