package strategy.crypt;

public class PasswordEncrypt {

	public static void main(String[] args) {
		UseEncrypt useEncrypt = new UseEncrypt();
		useEncrypt.setEncryptable(new ARIACrypt());
		String key = "abcd1234@!", plainText = "암호화된 평문";
		try {
			useEncrypt.performEncrypt(key, plainText);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
