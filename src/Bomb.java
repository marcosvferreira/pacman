
public class Bomb extends Item {
	private int posicaoXBomb;
	private int posicaoYBomb;
	private int removeVidas = -1;
	
	public Bomb() {
		
	}

	public Bomb(int posicaoXBomb, int posicaoYBomb, int removeVidas) {
		super();
		this.posicaoXBomb = posicaoXBomb;
		this.posicaoYBomb = posicaoYBomb;
		this.removeVidas = removeVidas;
	}

	public int getPosicaoXBomb() {
		return posicaoXBomb;
	}

	public void setPosicaoXBomb(int posicaoXBomb) {
		if (posicaoXBomb < 0 || posicaoXBomb > getTelaX()) {
			System.out.println("Posição inválida.");
		}
		this.posicaoXBomb = posicaoXBomb;
	}

	public int getPosicaoYBomb() {
		return posicaoYBomb;
	}

	public void setPosicaoYBomb(int posicaoYBomb) {
		if (posicaoYBomb < 0 || posicaoYBomb > getTelaY()) {
			System.out.println("Posição inválida.");
		}
		this.posicaoYBomb = posicaoYBomb;
	}

	public int getRemoveVidas() {
		return removeVidas;
	}

	public void setRemoveVidas(int removeVidas) {
		this.removeVidas = removeVidas;
	}
	
	
	
}
