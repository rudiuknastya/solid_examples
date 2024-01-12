package liskov_substitution.right;

import javax.crypto.SecretKey;

public interface Cipher {
    public byte[] encode(byte[] input);
    public byte[] decode(byte[] encodedInput);
}
