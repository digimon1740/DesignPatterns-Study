package strategy.crypt;


public class AESCrypt implements Encryptable {

    @Override
    public void encrypt(String key, String plainText) {
        System.out.println("AESCrypt key : "+key+" plainText :"+plainText);
    }

}
