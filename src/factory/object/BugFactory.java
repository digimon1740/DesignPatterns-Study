package factory.object;

public class BugFactory extends ObjectFactory {

	@Override
	public Bug create(String type, String name) {
		Bug bug = null;
		if ("mantis".equals(type)) {
			bug = new Mantis();
		} else if ("bee".equals(type)) {
			//bug = new Bee();
		}
		bug.setName(name);
		bug.arrive();
		return bug;
	}
}
