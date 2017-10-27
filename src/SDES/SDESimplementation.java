package SDES;

public class SDESimplementation {

    public static byte[] Encrypt(byte[] rawkey, byte[] plaintext){
		SDES sdes = new SDES();
		sdes.keyGenerator(rawkey);

		return (sdes.finalPermutation(sdes.fK(sdes.switchFunction(sdes.fK(
		        sdes.initialPermutation(plaintext),sdes.K1)),sdes.K2)));
	}

	public static byte[] Decrypt(byte[] rawkey, byte[] ciphertext){
        SDES sdes = new SDES();
        sdes.keyGenerator(rawkey);

        return (sdes.finalPermutation(sdes.fK(sdes.switchFunction(sdes.fK(
                sdes.initialPermutation(ciphertext),sdes.K2)),sdes.K1)));
	}

    public static void main(String[] args) {
<<<<<<< HEAD
        byte key[] = {0,1,1,1,0,0,1,1,0,1};
        byte plaintext[] = {0,1,1,0,0,0,0,1};

//        System.out.println("Cipher text after Enryption");
//        byte cipherText[] = Encrypt(key, plaintext);
//        for (byte cipher:cipherText)
//            System.out.print(cipher+" ");
//            System.out.println();

        System.out.println("Plain text after Decryption");
        byte plainText[] = Decrypt(key,plaintext);
=======
        byte key[] = {1,1,1,0,0,0,1,1,1,0};
        byte plaintext[] = {0,1,0,1,0,1,0,1};

        System.out.println("Cipher text after Enryption");
        byte cipherText[] = Encrypt(key, plaintext);
        for (byte cipher:cipherText)
            System.out.print(cipher+" ");
            System.out.println();

        System.out.println("Plain text after Decryption");
        byte plainText[] = Decrypt(key,cipherText);
>>>>>>> master
        for (byte plain:plainText) {
            System.out.print(plain+" ");
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> master
