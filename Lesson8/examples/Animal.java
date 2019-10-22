
package Lesson8.examples;

public class Animal {
    private double weight;
    private String name;
    
    public Animal(String nm, double wt){
        weight = wt;
        name = nm;
    }
    
    public String getName(){
        return name;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public void grow(){
        weight += .1 * weight;
    }
    
    public String toString(){
        return "Name: " + name + "\tWeight: " + weight;
    }
    
    public void setName(String nm){
        name = nm;
    }
}
