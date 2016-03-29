package decorator.FileOut;

public class FileOutImpl implements FileOut {
	@Override
	public void write(byte[] data) {
		System.out.println("bytes.length = " + data.length);
		System.out.println("String = " + new String(data));
	}
}
