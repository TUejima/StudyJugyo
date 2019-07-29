c class IrairaState extends DogState{
	private static IrairaState s = new IrairaState();
	private IrairaState() {}

	public static DogState getInstance() {
		return s;
	}

	public void tukareta(DogState moto) {
	}

	public void tabeta(DogState yobidashimoto) {
		moto.changeState(TanoshiiState.getInstance());
	}

	public String toString() {
		return "‚¢‚ç‚¢‚çó‘Ô"
	}
}

