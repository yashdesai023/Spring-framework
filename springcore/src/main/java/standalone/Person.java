package standalone;
import java.util.List;
import java.util.Map;
public class Person {
    private List<String> friends;
    private Map<String, Integer> feestructure;
    private String myproperties;

    public List<String> getFriends() {
        return this.friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getFeestructure() {
        return this.feestructure;
    }

    public void setFeestructure(Map<String, Integer> feestructure) {
        this.feestructure = feestructure;
    }

    public String getMyproperties() {
        return this.myproperties;
    }

    public void setMyproperties(String myproperties) {
        this.myproperties = myproperties;
    }

    @Override
    public String toString() {
        return "Person [friends=" + friends + ", feestructure=" + feestructure + ", myproperties=" + myproperties + "]";
    }

    

    

}
