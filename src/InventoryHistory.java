import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class InventoryHistory {
    String id;
    String name;
    String user;
    int total;
    String type;
    LocalDateTime date;

    public InventoryHistory(String name, String user, int total, String type){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.user = user;
        this.total = total;
        this.type = type;
        this.date = LocalDateTime.now();
    }

    public String getName(){
        return name;
    }

    public String getUser(){
        return user;
    }

    public String getId(){
        return id;
    }

    public int getTotal(){
        return total;
    }

    public String getDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy, hh:mm:ss a");
        return date.format(formatter);
    }

    public String getType(){
        return type;
    }

}
