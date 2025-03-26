class RoadRunner
{
    public static void main(String[] roads) 
	{
        Road road1 = new Road();
        road1.displayDetails();

        Road road2 = new Road("Broadway");
        road2.displayDetails();

        Road road3 = new Road("Highway 101", "Expressway");
        road3.displayDetails();

        Road road4 = new Road("Sunset Blvd", "Scenic Route", 12.5);
        road4.displayDetails();

        Road road5 = new Road("I-95", "Interstate", 50.0, true);
        road5.displayDetails();

        Road road6 = new Road("Old Town Road", "Country Road", 8.0, false, "Gravel");
        road6.displayDetails();

        Road road7 = new Road("Golden Gate Road", "Bridge Road", 2.5, true, "Concrete", 4);
        road7.displayDetails();
    }
}