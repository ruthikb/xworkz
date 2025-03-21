public class Google {
        public static String login(String email, String password) {
            String message = null;
            if (email.length() >= 10 && email != null) {
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
            else {
                message="Phone Not Valid" ;
                  
        }
        return message;
        }
    }