package dependency_inversion;

public class Main {
    public static void main(String[] args) {
        WrongClass wrongClass = new WrongClass(new BcryptPasswordEncoder());
        RightClass rightClass = new RightClass(new BcryptPasswordEncoder());
    }
}
