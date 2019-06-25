public class TanoshiiState extends DogState{
	private static TanoshiiState state = new TanoshiiState();
	private TanoshiiState() {}

	public static DogState getInstance() {
		return state;
	}

	private void tukareta(DogState moto) {
		moto.changeState(FutsuuState.getInstance());
	}

	public void tabeta(DogState moto) {
	}

	public String toString() {
		return "Šy‚µ‚¢ó‘Ô";
	}
}
