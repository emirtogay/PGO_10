package z2;

public class Item {
    int Id;
    String name;

    public Item(int Id, String name){
        this.Id = Id;
        this.name = name;
    }

    public void show(){
        System.out.println(name);
    }

    public String toString(){
        return "Id:  " + Id + ", name: " + name;
    }
    public int getId(){
        return Id;
    }
    public String getName(){
        return name;
    }
}
