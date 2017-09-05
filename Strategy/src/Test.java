/**
 * Created by ooopic on 2017/9/5.
 */
public class Test {
    public static void main(String[] args) {
        Character character = new King();
        character.setWeapon(new KnifeBehavior());
        character.fight();
    }
}
