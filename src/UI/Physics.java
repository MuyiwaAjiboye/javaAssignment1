package UI;

public class Physics {
    public static float getGravity() {
        return Gravity;
    }

    public void setGravity(float Gravity) {
        this.Gravity = Gravity;
    }

    private static float Gravity = 10;
}