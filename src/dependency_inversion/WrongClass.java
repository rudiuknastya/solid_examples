package dependency_inversion;

public class WrongClass {
    private final BcryptPasswordEncoder bcryptPasswordEncoder;

    public WrongClass(BcryptPasswordEncoder bcryptPasswordEncoder) {
        this.bcryptPasswordEncoder = bcryptPasswordEncoder;
    }
    public void updatePassword(String password){
        bcryptPasswordEncoder.encode(password);
    }
}
