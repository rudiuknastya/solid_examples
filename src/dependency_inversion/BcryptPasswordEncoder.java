package dependency_inversion;

public class BcryptPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(String password) {
        return "bEncoded";
    }
}
