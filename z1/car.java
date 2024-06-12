package z1;

public class car implements Comparable<car>{

    String model;
    int rok;

    public car(String model, int rok){
        this.model = model;
        this.rok = rok;
    }
    public int compareTo(car otherCar){
        return Integer.compare(this.rok, otherCar.rok);
    }
    public String toString(){
        return model + " " + rok;
    }
}
