package reusing.proxy; 
 // : reusing/SpaceShipDelegation.java
/**
 * 代理:将一个成员对象置于所要构造的类中(就像组合),但与些同时我们在新类中暴露了该成员对象的所有方法(就像继承)
 * 该类的方法传递给了底层的controls对象,它的接口与使用继承得到的接口相同了,
 * 使用代理,可以选择只提供在成员对象中的方法的某个子集
 * @title SpaceShipDelegation
 * @author liujiaze@zbj.com
 * @date 2017年8月8日 上午11:43:41
 * @since v1.0.1
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    // Delegated methods:
    public void back(int velocity) {
        controls.back(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }
} /// :~
