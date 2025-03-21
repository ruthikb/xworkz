class InstaRunner{
public static void main(String[] args) {
        String login=Insta.login(9782272927l, "nyb");
        System.out.println( "login SUCCESSFUL OF "+login);
        String login2=Insta.login("Leo", "nyb");
        System.out.println( "login SUCCESSFUL OF "+login2);
    }
	}