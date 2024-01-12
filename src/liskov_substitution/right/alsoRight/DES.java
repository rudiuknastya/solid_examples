package liskov_substitution.right.alsoRight;

import javax.crypto.SecretKey;

public class DES implements SymmetricCipher{
    @Override
    public byte[] encode(byte[] input, SecretKey key) {
        return new byte[0];
    }

    @Override
    public byte[] decode(byte[] encodedInput, SecretKey key) {
        return new byte[0];
    }
}
