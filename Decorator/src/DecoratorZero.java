/**
 * Created by YaoFly on 2016/11/3.
 */
public class DecoratorZero extends Decorator {
    public DecoratorZero(Human human) {
        super(human);
    }

    public void goHome(){
        System.out.println("进房间...");
    }

    public void findMap(){
        System.out.println("找地图...");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findMap();
    }
}
