package strategy.crypt;


public class BCrypt implements Encryptable {

    @Override
    public void encrypt(String key, String plainText) {
        System.out.println("BCrypt key : "+key+" plainText :"+plainText);
    }

}
