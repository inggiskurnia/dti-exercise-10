package items;

public class Magazines extends Materials{
    int edition;

    public Magazines(String name, int totalAvail, int edition){
        super(name,totalAvail);
        this.edition = edition;
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
        System.out.println("Magazine edition : " + edition);
    }
}
