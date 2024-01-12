package liskov_substitution.right.alsoRight;

import java.security.KeyPair;

public class RSA implements AsymmetricCipher{
    @Override
    public byte[] encode(byte[] input, KeyPair key) {
        return new byte[0];
    }

    @Override
    public byte[] decode(byte[] encodedInput, KeyPair key) {
        return new byte[0];
    }
}
