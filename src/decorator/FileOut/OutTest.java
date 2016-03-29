package decorator.FileOut;

import java.io.File;
import java.io.UnsupportedEncodingException;

public class OutTest {

	public static void main(String[] args) {
		String plainText = "이상훈입니다. 디자인패턴 재밌어요";
		EncryptionOut encryptionOut = new EncryptionOut(new FileOutImpl());
		try {
			encryptionOut.write(plainText.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}
}

