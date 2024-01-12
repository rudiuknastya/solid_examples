package liskov_substitution.wrong;

import javax.crypto.SecretKey;
import java.security.KeyPair;

public class DES implements Cipher{
    @Override
    public byte[] encode(byte[] input, SecretKey key) {
        return new byte[0];
    }

    @Override
    public byte[] decode(byte[] encodedInput, SecretKey key) {
        return new byte[0];
    }
}
