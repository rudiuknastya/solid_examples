package open_closed.wrong;

public class MoreModifiedPasswordEncoder {
    public String encode(String password, String type){
        if(type.equals("bcrypt")) {
            return "bcrypt encoded";
        } else {
            return "scrypt encoded";
        }
    }
    String decode(String encodedPassword, String type){
        if(type.equals("bcrypt")) {
            return "bcrypt decoded";
        } else {
            return "scrypt decoded";
        }
    }
    boolean compare(String rawPassword, String encodedPassword, String type){
        if(type.equals("bcrypt")) {
            return true;
        } else {
            return false;
        }
    }
}
