/**
 * Created by Caleb on 9/12/2016.
 */
public abstract class car {
    honkBehavior hb;
    public car() {

    }

    public void performHonk() {
        hb.honk();
    }
}
