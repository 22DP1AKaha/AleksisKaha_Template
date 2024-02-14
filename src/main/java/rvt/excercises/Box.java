package rvt.excercises;

public class Box implements Packable {
    double weight;
    public Box(double weight){
        this.weight = weight;
    }
    public double weight(){
        return weight;
    }
    public double add(double weight){
        ...
    }
}
