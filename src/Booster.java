
public class Booster extends Item {
	private int posicaoXBooster;
	private int posicaoYBooster;
	private int duracaoBooster;
	
	
	public Booster() {
		
	}
	
	public Booster(int posicaoXBooster, int posicaoYBooster, int duracaoBooster) {
		super();
		this.posicaoXBooster = posicaoXBooster;
		this.posicaoYBooster = posicaoYBooster;
		this.duracaoBooster = duracaoBooster;
	}

	
	
	
	public int getPosicaoXBooster() {
		return posicaoXBooster;
	}

	public void setPosicaoXBooster(int posicaoXBooster) {
		if (posicaoXBooster < 0 || posicaoXBooster > getTelaX()) {
			System.out.println("Posição inválida.");
		}
		this.posicaoXBooster = posicaoXBooster;
	}

	public int getPosicaoYBooster() {
		return posicaoYBooster;
	}

	public void setPosicaoYBooster(int posicaoYBooster) {
		if (posicaoYBooster < 0 || posicaoYBooster > getTelaY()) {
			System.out.println("Posição inválida.");
		}
		this.posicaoYBooster = posicaoYBooster;
	}

	public int getDuracaoBooster() {
		return duracaoBooster;
	}

	public void setDuracaoBooster(int duracaoBooster) {
		duracaoBooster = (int) (duracaoBooster * Math.random());
		if (duracaoBooster < 0 || duracaoBooster > 10) {
			duracaoBooster = 3;
		}
			this.duracaoBooster = duracaoBooster;
	}
	
	
}
