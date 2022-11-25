package AnimalRescuer;

public class Main {
    public static void main(String[] args) {
        Duck duck= new Duck();
        duck.setName("Ducky");
        duck.setAge(1);
        duck.setWeight(3.5);
        duck.setBreed("domestica");
        duck.setColor("negru cu dungi verzi");
        duck.setGender("Male");

        System.out.println(duck.getName() + " is a duck from the " + duck.getBreed() + " breed, is "
                + duck.getGender() + " and his color is " + duck.getColor() + ", is "
                + duck.getAge() + " years old and weighs " + duck.getWeight() + " kg.");

        duck.setTalk("mac-mac");
        duck.setEat("iarba");
        System.out.println(duck.getName()+" likes to do \""+duck.getTalk()+"\" and eat \""+ duck.getEat()+"\".");



        Chicken chicken= new Chicken();
        chicken.setName("Piu");
        chicken.setAge(1);
        chicken.setWeight(2.5);
        chicken.setBreed("europeana");
        chicken.setColor("yellow");
        chicken.setGender("Male");

        System.out.println(chicken.getName() + " is a chicken from the " + chicken.getBreed() + " breed, is "
                + chicken.getGender() + " and his color is " + chicken.getColor() + ", is "
                + chicken.getAge() + " years old and weighs " + chicken.getWeight() + " kg.");

        chicken.setTalk("pui-pui");
        chicken.setEat("malai");
        System.out.println(chicken.getName()+" likes to do \""+chicken.getTalk()+"\" and eat \""+ chicken.getEat()+"\".");




        Cat cat= new Cat();
        cat.setName("Mitzi");
        cat.setAge(2);
        cat.setWeight(2.5);
        cat.setBreed("europeana");
         cat.setColor("white");
        cat.setGender("Male");

        System.out.println(cat.getName() + " is a cat from the " + cat.getBreed() + " breed, is "
                + cat.getGender() + " and his color is " + cat.getColor() + ", is "
                + cat.getAge() + " years old and weighs " + cat.getWeight() + " kg.");

        cat.setTalk("miau-miau");
        cat.setEat("soricei");
        System.out.println(cat.getName()+" likes to do \""+cat.getTalk()+"\" and eat \""+ cat.getEat()+"\".");





        Dog dog = new Dog();
        dog.setName("Falco");
        dog.setAge(2);
        dog.setWeight(30.5);
        dog.setBreed("samoyed");
        dog.setColor("white");
        dog.setGender("Male");

        System.out.println(dog.getName() + " is a dog from the " + dog.getBreed() + " breed, is "
                + dog.getGender() + " and his color is " + dog.getColor() + ", is "
                + dog.getAge() + " years old and weighs " + dog.getWeight() + " kg.");

        dog.setTalk("ham-ham");
        dog.setEat("oase");
        System.out.println(dog.getName()+" likes to do \""+dog.getTalk()+"\" and gnaw \""+ dog.getEat()+"\".");

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Popescu Ion");
        veterinarian.setSpecialitate("veterinarian");
        System.out.println(veterinarian.getName() + " is a " + veterinarian.getSpecialitate() + ".");

        Adoption adoption = new Adoption();
        adoption.setName("Florescu Maria");
        adoption.setAmountofmoneyavailable(30);
        System.out.println(adoption.getName() + " has " + adoption.getAmountofmoneyavailable() + " euro at her disposal.");

        Recreation recreation=new Recreation();
        recreation.setName("relax");
        recreation.setRecreere("running");
        System.out.println("For "+recreation.getName()+" "+dog.getName()+" likes to "+recreation.getRecreere()+".");

        AnimalFood animalFood=new AnimalFood();
        animalFood.setName("uscata - Alpha");
        animalFood.setPrice(200);
        animalFood.setAmount(55);
        animalFood.setAvailabilityinstock(1);
        System.out.println("Mancarea \""+animalFood.getName() + "\" are pretul \"" +animalFood.getPrice() + " ron\" pentru cantitatea de \"" +animalFood.getAmount() + " kg/sac\" si in stoc este \"" +animalFood.getAvailabilityinstock()+"\" buc.");
    }
}
