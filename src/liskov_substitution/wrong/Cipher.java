package liskov_substitution.wrong;

import javax.crypto.SecretKey;

public interface Cipher {
    public byte[] encode(byte[] input,SecretKey key);
    public byte[] decode(byte[] encodedInput, SecretKey key);
}
