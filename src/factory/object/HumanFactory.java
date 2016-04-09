package factory.object;

public class HumanFactory extends ObjectFactory {

	@Override
	public Human create(String type, String name) {
		Human human = null;
		if ("man".equals(type)) {
			human = new Man();
		} else if ("woman".equals(type)) {
			human = new Woman();
		}
		human.setName(name);
		human.arrive();
		return human;
	}

}
