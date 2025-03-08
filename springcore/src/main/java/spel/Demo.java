package spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Demo {

    //Spring Expression Language (SpEL)

    //Arithmetic Operations

    @Value("#{ 22 + 11 }")
    private int x;
    @Value("#{ 22 + 55 + 33 }")
    private int y;

    //Mathematical Operations

    @Value("#{ T(java.lang.Math).sqrt(144) }") //T() is used to call static methods
    private double z;

    //Boolean Operations
    @Value("#{22>11}")
    private boolean isActive;


    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Demo [isActive=" + isActive + ", x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}
