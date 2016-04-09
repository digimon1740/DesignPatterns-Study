package factory.object;

public abstract class ObjectFactory {

	ObjectFactory factory;

	public abstract <T> T create(String type, String name);
}
