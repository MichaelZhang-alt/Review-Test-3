
package Lesson8.examples;

public class AnimalList {

    public static void main(String[] args) {
        Animal zoo[] = new Animal[10];
        zoo[0] = new Animal("Zebra",250);
        zoo[1] = new Animal("Hippo", 1500);
        zoo[2] = new Animal("Owl", 40);
        
        int size = 3; //logical size
        
        for (int i = 0; i < size; i++) {
            System.out.println(zoo[i]);
        }
        
        System.out.println("We just got a baby giraffe");
        zoo[size] = new Animal("Giraffe",150);
        size++;
        
        System.out.println("Here is our zoo lineup now: ");
        
        for (int i = 0; i < size; i++) {
            System.out.println(zoo[i]);
        }
        System.out.println("Bring out the snake ray gun");
        snakeRayGun(zoo,size);
        System.out.println("And now we have");
        for (int i = 0; i < size; i++) {
            System.out.println(zoo[i]);
        }
        //all are now snakes
        //x[] and zoo[] point to the ame list of animals
        //objects sent into methods are changed permanently
        System.out.println("Snakes are now growing in size");
        for (int i = 0; i < size; i++) {
            zoo[i].grow();
            System.out.println(zoo[i]);
        }
    }
    
    public static void snakeRayGun(Animal x[], int howmany){
        for (int i = 0; i < howmany; i++) {
            x[i].setName("SNAKE");
        }
    }
    
}
