/**
 * Created by ooopic on 2017/9/5.
 */
public abstract class Character {
    WeaponBehavior weapon;

    public void fight(){
        weapon.useWeapon();
    };

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
