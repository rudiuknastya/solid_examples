package open_closed.right;

public class BCryptPasswordEncoder implements PasswordEncoder{
    @Override
    public String encode(String password) {
        return "bcrypt encoded";
    }

    @Override
    public String decode(String encodedPassword) {
        return "bcrypt decoded";
    }

    @Override
    public boolean compare(String rawPassword, String encodedPassword) {
        return true;
    }
}
