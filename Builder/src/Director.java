/**
 * Created by YaoFly on 2016/10/28.
 */
public class Director {

    public City buildCity(Builder builder){
        builder.buildTree();
        builder.buildHouse();
        builder.buildPark();
        return builder.buildCity();
    }
}
