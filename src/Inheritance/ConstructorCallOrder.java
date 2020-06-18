package Inheritance;
//Constructors complete their execution in order of derivation- from superclass to subclass

//Create Super Class Apu
class Apu{
    Apu(){
        System.out.println("Inside Apu's constructor");
    }
}
//create subclass Bpu by extending Apu
class Bpu extends Apu{
    Bpu(){
        System.out.println("Inside Bpu's constructor");
    }
}
class Cpu extends Bpu{
    Cpu(){
        System.out.println("Indide Cpu's constructor");
    }
}

public class ConstructorCallOrder {
    public static void main(String[] args) {
        Cpu c= new Cpu();
    }
}
