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

        Stove stove1 = new Stove("Gas Stove" , "Prestige" , 4000.0);
			System.out.println("Stove Type: "+stove1.type);
			System.out.println("Stove Brand: "+stove1.brand);
			System.out.println("Stove Price: Rs."+stove1.price);
			
        Stove stove2 = new Stove("Induction Stove", "Philips", 3500.0);
			System.out.println("Stove Type: "+stove2.type);
			System.out.println("Stove Brand: "+stove2.brand);
			System.out.println("Stove Price: Rs."+stove2.price);
			
        Stove stove3 = new Stove("Electric Stove", "Bajaj", 5000.0);
			System.out.println("Stove Type: "+stove3.type);
			System.out.println("Stove Brand: "+stove3.brand);
			System.out.println("Stove Price: Rs."+stove3.price);
			
        Stove stove4 = new Stove("Kerosene Stove", "Sunflame", 2500.0);
			System.out.println("Stove Type: "+stove4.type);
			System.out.println("Stove Brand: "+stove4.brand);
			System.out.println("Stove Price: Rs."+stove4.price);
			
        Stove stove5 = new Stove("Wood Stove", "Pigeon", 2000.0);
			System.out.println("Stove Type: "+stove5.type);
			System.out.println("Stove Brand: "+stove5.brand);
			System.out.println("Stove Price: Rs."+stove5.price);
			
        Stove stove6 = new Stove("Two-Burner Stove", "Butterfly", 4500.0);
			System.out.println("Stove Type: "+stove6.type);
			System.out.println("Stove Brand: "+stove6.brand);
			System.out.println("Stove Price: Rs."+stove6.price);
			
        Stove stove7 = new Stove("Three-Burner Stove", "Surya", 5500.0);
			System.out.println("Stove Type: "+stove7.type);
			System.out.println("Stove Brand: "+stove7.brand);
			System.out.println("Stove Price: Rs."+stove7.price);
    }
}
