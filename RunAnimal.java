package Oraa;
import java.util.Scanner;


public class RunAnimal {
    public static void main(String[] args) {
        String select;
        Scanner sc = new Scanner(System.in);
        
        Animal b = new Bird();
        Animal c = new Cat();
        Animal d = new Dog();



        System.out.print("Choose an aimal. Press B for Bird, C for Cat, or D for Dog: ");
        select = sc.nextLine();

        if(select.equalsIgnoreCase("B")){
        b.eat();
        b.sleep();
        b.makeSound();
        }
        if(select.equalsIgnoreCase("C")){
            c.eat();
            c.sleep();
            b.makeSound();
        }
        if(select.equalsIgnoreCase("D")){
            d.eat();
            d.sleep();
            d.makeSound();
        }

    }
    
}
