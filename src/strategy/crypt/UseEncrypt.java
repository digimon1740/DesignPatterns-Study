package strategy.crypt;

import java.security.InvalidAlgorithmParameterException;

public class UseEncrypt {

	private Encryptable encryptable;

	public UseEncrypt() {
	}

	public void setEncryptable(Encryptable encryptable) {
		this.encryptable = encryptable;
	}

	public void performEncrypt(String key, String plainText) throws Exception {
		if (encryptable == null) {
			return;
		}
        if (key == null || key.length() == 0) {
            throw new InvalidAlgorithmParameterException();
        }
        if (plainText == null || plainText.length() == 0) {
            throw new InvalidAlgorithmParameterException();
        }
		encryptable.encrypt(key,plainText);
	}

}
