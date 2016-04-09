package factory.object;

public class God {

	public static void main(String[] args) {

//		BugFactory bugFactory = new MantisFactory();
//		bugFactory.create("사마귀");
//
//		HumanFactory manFactory = new ManFactory();
//		manFactory.create("변진환");
//
//		HumanFactory womanFactory = new WomanFactory();
//		womanFactory.create("신효순");

		ObjectFactory humanFactory = new HumanFactory();
		Man man = humanFactory.create("man", "변진환");
		Woman woman = humanFactory.create("woman", "신효순");

		ObjectFactory bugFactory = new BugFactory();
		Mantis mantis = bugFactory.create("mantis", "사마귀");

	}
}

