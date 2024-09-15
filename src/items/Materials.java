package items;

import interfaces.GetDetails;

import java.util.UUID;

public abstract class Materials implements GetDetails {
    String id;
    String name;
    int totalAvail;

    public Materials(String name, int totalAvail){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.totalAvail = totalAvail;
    }

    public abstract int getTotalAvail();
    public abstract int setTotalAvail(int number);
    public abstract String getName();
}
