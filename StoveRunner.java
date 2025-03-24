public class StoveRunner {
    public static void main(String[] args) {

        Stove of1 = new Stove();
        of1.brand="Prestige";
        of1.price=7500.00;
        of1.model="2023";
        System.out.println("Stove Brand is "+ of1.brand);
        System.out.println("Stove Price is "+ of1.price);
        System.out.println("Stove Model is "+ of1.model);


        Stove of2 = new Stove();
        of2.brand="Faber";
        of2.price=18500.00;
        of2.model="2024";
        System.out.println("Stove Brand is "+ of2.brand);
        System.out.println("Stove Price is "+ of2.price);
        System.out.println("Stove Model is "+ of2.model);


        Stove of3 = new Stove();
        of3.brand="Bosch";
        of3.price=22500.00;
        of3.model="2025";
        System.out.println("Stove Brand is "+ of3.brand);
        System.out.println("Stove Price is "+ of3.price);
        System.out.println("Stove Model is "+ of3.model);
    }
}