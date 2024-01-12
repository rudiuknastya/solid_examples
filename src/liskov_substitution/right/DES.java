package liskov_substitution.right;

import javax.crypto.SecretKey;
import java.security.KeyPair;

public class DES implements Cipher {
    private SecretKey secretKey;

    public DES(SecretKey secretKey) {
        this.secretKey = secretKey;
    }

    @Override
    public byte[] encode(byte[] input) {
        return new byte[0];
    }

    @Override
    public byte[] decode(byte[] encodedInput) {
        return new byte[0];
    }
}
