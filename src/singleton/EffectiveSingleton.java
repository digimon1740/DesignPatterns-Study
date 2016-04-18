package singleton;

public enum EffectiveSingleton {
	INSTANCE;

	public void init () {
		System.out.println("Initialize Effective Singleton");
	}
}

