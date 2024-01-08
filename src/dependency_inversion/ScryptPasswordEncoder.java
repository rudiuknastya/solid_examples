package dependency_inversion;

public class ScryptPasswordEncoder implements PasswordEncoder{
    @Override
    public String encode(String password) {
        return "sEncoded";
    }
}
