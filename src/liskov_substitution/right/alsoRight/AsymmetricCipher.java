package liskov_substitution.right.alsoRight;

import javax.crypto.SecretKey;
import java.security.KeyPair;

public interface AsymmetricCipher {
    public byte[] encode(byte[] input, KeyPair key);
    public byte[] decode(byte[] encodedInput, KeyPair key);
}
