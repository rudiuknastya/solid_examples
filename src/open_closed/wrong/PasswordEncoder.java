package open_closed.wrong;

public class PasswordEncoder {
    public String encode(String password){
        return "bcrypt encoded";
    }
    String decode(String encodedPassword){
        return "bcrypt decoded";
    }
    boolean compare(String rawPassword, String encodedPassword){
        return true;
    }


}
