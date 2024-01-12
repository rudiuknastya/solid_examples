package liskov_substitution.right;

import java.security.KeyPair;

public class RSA implements Cipher {
    private KeyPair keyPair;
    public RSA(KeyPair keyPair) {
        this.keyPair = keyPair;
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
