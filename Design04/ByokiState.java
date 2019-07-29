class ByokiState extends DogState{
	private static ByokiState state = new TanoshiiState();
	private ByokiState() {}

	public static DogState getInstance() {
		return state;
	}

	private void tukareta(DogState moto) {
		moto.changeState(FutsuuState.getInstance());
	}

	public void tabeta(DogState moto) {
		moto.changeState(TanoshiiState.getInstance());
	}

	public String toString() {
		return "ïaãCèÛë‘";
	}
}
