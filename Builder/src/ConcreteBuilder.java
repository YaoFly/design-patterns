/**
 * Created by YaoFly on 2016/10/28.
 */
public class ConcreteBuilder implements Builder {
    public City city;

    public ConcreteBuilder(){
        System.out.println("开始建造..");
        city = new City();
    }

    @Override
    public void buildTree() {
        city.setTree("");
        System.out.println("建造树木..");
    }

    @Override
    public void buildHouse() {
        city.setHouse("");
        System.out.println("建造房屋..");
    }

    @Override
    public void buildPark() {
        city.setPark("");
        System.out.println("建造公园..");
    }

    public City buildCity() {
        System.out.println("生成城市..");
        return city;
    }

}
