package items;

public class Dvd extends Materials {
    String type;

    public Dvd(String name, int totalAvail, String type){
        super(name,totalAvail);
        this.type = type;
    }

    @Override
    public int getTotalAvail() {
        return totalAvail;
    }

    @Override
    public int setTotalAvail(int number) {
        if(totalAvail > number){
            totalAvail += number;
        }
        return totalAvail;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void printAll() {
        //System.out.println("ID : "+ id);
        System.out.println("Item name : " + name);
        System.out.println("Total available : " + totalAvail);
        System.out.println("DVD type : " + type);
    }
}
