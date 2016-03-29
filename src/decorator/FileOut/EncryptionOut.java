package decorator.FileOut;

import strategy.crypt.ARIACrypt;
import strategy.crypt.UseEncrypt;

public class EncryptionOut extends Decorator {

	public EncryptionOut(FileOut delegate) {
		super(delegate);
	}

	@Override
	public void write(byte[] data) {
		byte[] encryptedData = encrypt(data);
		super.doDelegate(encryptedData);
	}

	private byte[] encrypt(byte[] data) {
		UseEncrypt useEncrypt = new UseEncrypt();
		useEncrypt.setEncryptable(new ARIACrypt());
		String key = "abcd1234@!", plainText = new String(data);
		try {
			useEncrypt.performEncrypt(key, plainText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return plainText.getBytes();
	}
}
