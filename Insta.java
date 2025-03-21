 class Insta {
    public static String login(String username, String password) {
        String message = null;
        if (username.length() >= 4 && username != null) {
            message = "User Found";
        } else
            message = "User not F0und";
        return message;

    }
    public static String login(long phoneNum,String password){
        String message=null;
        if(phoneNum>=10 ){
            message="Phone Number Correct ";
        }
        else
            message="Phone Not Valid" ;
            return message;
    }

}