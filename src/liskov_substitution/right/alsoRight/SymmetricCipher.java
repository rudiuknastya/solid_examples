package liskov_substitution.right.alsoRight;

import javax.crypto.SecretKey;

public interface SymmetricCipher {
    public byte[] encode(byte[] input, SecretKey key);
    public byte[] decode(byte[] encodedInput, SecretKey key);
}
