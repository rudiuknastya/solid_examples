package open_closed.right;

public class SCryptPasswordEncoder implements PasswordEncoder{
    @Override
    public String encode(String password){
        return "scrypt encoded";
    }
    @Override
    public  String decode(String encodedPassword){
        return "scrypt decoded";
    }
    @Override
    public boolean compare(String rawPassword, String encodedPassword){
        return false;
    }
}
