class ApolloPharmacyRegistration {
    public static String ``(String customerName, String email, String phoneNumber, String address, String country, String password) {
        String registrationStatus = null;
        boolean isCustomerValid = validateCustomerDetails(customerName, email, phoneNumber, address, country, password);

        if (isCustomerValid == true) {
            registrationStatus = "Registration successful";
        } else {
            registrationStatus = "Registration unsuccessful, please try again later";
        }

        return registrationStatus;
    }

    public static boolean validateCustomerDetails(String customerName, String email, String phoneNumber, String address, String country, String password) {
        boolean isValid = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneNumberValid = false;
        boolean isAddressValid = false;
        boolean isCountryValid = false;
        boolean isPasswordValid = false;

        if (customerName != null && customerName.length() > 0) {
            isNameValid = true;
        } else {
            System.out.println("Customer Name is invalid. Please enter a valid name.");
        }

        if (email != null && email.contains("@") && email.contains(".")) {
            isEmailValid = true;
        } else {
            System.out.println("Email is invalid. Please enter a valid email address.");
        }

        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        } else {
            System.out.println("Phone Number is invalid. Please enter a valid phone number.");
        }

        if (address != null && address.length() > 0 &&!address.isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Address is invalid. Please enter a valid address.");
        }

        if (country != null && country.equalsIgnoreCase("INDIA")) {
            isCountryValid = true;
        } else {
            System.out.println("Country is invalid. Please enter a valid country name.");
        }

        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password is invalid. Please enter a valid password with at least 8 characters.");
        }

        if (isNameValid == true && isEmailValid == true && isPhoneNumberValid == true && isAddressValid == true && isCountryValid == true && isPasswordValid == true) {
            isValid = true;
        }

        return isValid;
    }
}