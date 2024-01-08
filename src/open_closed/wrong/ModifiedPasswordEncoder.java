package open_closed.wrong;

public class ModifiedPasswordEncoder {
    public String bCryptEncode(String password){
        return "bcrypt encoded";
    }
    public String bCryptDecode(String encodedPassword){
        return "bcrypt decoded";
    }
    public boolean bCryptCompare(String rawPassword, String encodedPassword){
        return true;
    }

    public String sCryptEncode(String password){
        return "scrypt encoded";
    }
    public String sCryptDecode(String encodedPassword){
        return "scrypt decoded";
    }
    public boolean sCryptCompare(String rawPassword, String encodedPassword){
        return true;
    }
}
