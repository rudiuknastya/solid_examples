package liskov_substitution.wrong;

import javax.crypto.SecretKey;
import java.security.KeyPair;

public class RSA implements Cipher{
    @Override
    public byte[] encode(byte[] input, KeyPair key) {
        return new byte[0];
    }

    @Override
    public byte[] decode(byte[] encodedInput, KeyPair key) {
        return new byte[0];
    }
}
