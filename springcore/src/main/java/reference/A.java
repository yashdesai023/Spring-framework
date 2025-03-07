package reference;

public class A {
    private int x;
    private B ob;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getOb() {
        return this.ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    public A() {
    }

    @Override
    public String toString() {
        return "{" +
            " x='" + getX() + "'" +
            ", ob='" + getOb() + "'" +
            "}";
    }

}
