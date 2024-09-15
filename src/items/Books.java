package items;

public class Books extends Materials{
    String genre;

    public Books (String name, int totalAvail, String genre){
        super(name, totalAvail);
        this.genre = genre;
    }

    @Override
    public int setTotalAvail(int number) {
        if(totalAvail > number){
            totalAvail += number;
        }
        return totalAvail;
    }

    @Override
    public int getTotalAvail(){
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
        System.out.println("Book genre : " + genre);
    }
}
