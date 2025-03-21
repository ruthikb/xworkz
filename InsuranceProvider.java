class InsuranceProvider{
    public static double search(String insuranceName) {
        double termPrice = 0.0;
        if (insuranceName == "SBI Insurance") {
           return termPrice = 8700;

        } else if (insuranceName == "Bajaj Alianz") {
            return termPrice = 9999.99;

        } else if (insuranceName == "LIC") {
           return  termPrice = 7999.99;

        } else if (insuranceName == "HDFC") {
            return termPrice = 11500;
            
        } else {
            System.out.println("Insurance Provider Not Found");
        }
        return termPrice;
    }

}