package open_closed.right;

public interface PasswordEncoder {
    String encode(String password);
    String decode(String encodedPassword);
    boolean compare(String rawPassword, String encodedPassword);
}
