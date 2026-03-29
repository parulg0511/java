package Java_Core;

class Animal {
    String name;
    String sound;

    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    void speak() {
        System.out.println(name + " says " + sound);
    }
}

class Dog extends Animal {
    Dog(String name, String sound) {
        super(name, sound);
    }

    @Override
    void speak() {
        System.out.println(name + " says " + sound + " and wags tail");
    }
}

//Bird subclass
class Bird extends Animal {
 boolean canFly;

 Bird(String name, String sound, boolean canFly) {
     super(name, sound);
     this.canFly = canFly;
 }

 @Override
 void speak() {
     System.out.println(name + " says " + sound);
 }

 void fly() {
     if (canFly)
         System.out.println(name + " is flying");
     else
         System.out.println(name + " cannot fly");
 }
 
}

//Fish subclass
class Fish extends Animal {
 Fish(String name, String sound) {
     super(name, sound);
 }

 void swim() {
     System.out.println(name + " is swimming");
 }
 
}


public class inheritance {

	public static void main(String[] args) {
		 Dog dog = new Dog("Buddy", "Woof");
	        Bird bird = new Bird("Tweety", "Chirp", true);
	        Fish fish = new Fish("Nemo", "Blub");

	        // Call speak()
	        dog.speak();
	        bird.speak();
	        fish.speak();

	        // Call specific methods
	        bird.fly();
	        fish.swim();

	        System.out.println("\nUsing Animal array:");

	        Animal[] animals = { dog, bird, fish };

	        for (Animal a : animals) {
	            a.speak(); // polymorphism
	        }
	    }
	

	}


