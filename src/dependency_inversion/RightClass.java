package dependency_inversion;

public class RightClass {
    private final PasswordEncoder passwordEncoder;

    public RightClass(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public void updatePassword(String password){
        passwordEncoder.encode(password);
    }
}
