package strategy.crypt;


public class ARIACrypt implements Encryptable {

    @Override
    public void encrypt(String key, String plainText) {
        System.out.println("ARIACrypt key : "+key+" plainText :"+plainText);
    }

}
