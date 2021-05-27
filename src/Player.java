
public class Player extends GameObject {
	private int direcao;
	private int qtdeVidas;
	private boolean invencivel = false;

	public Player() {
	}

	public Player(int direcao, int qtdeVidas, boolean invencivel) {
		super();
		if (direcao < 0 || direcao > 360) {
			System.out.println("Direção inválida.");
		}
		this.direcao = direcao;
		if (qtdeVidas <= 0) {
			System.out.println("Quantidade de vidas inválida");
		}
		this.qtdeVidas = qtdeVidas;
		this.invencivel = invencivel;
	}

	public Player(int getPosicaoX, int getPosicaoY, int direcao) {
		if (direcao < 0 || direcao > 360) {
			System.out.println("Direção inválida.");
			this.direcao = direcao;
		}
	}

	public boolean podeSeMover(int getPosicaoX, int getPosicaoY, double direcao) {
		if (getPosicaoX >= 0 && getPosicaoX < getTelaX() && getPosicaoY >= 0 && getPosicaoY < getTelaY()) {
			return true;
		}
		return false;
	}

	public void novaPosicao() {
		if (direcao == 0 || direcao < 90) {
			int novaPosicaoX = this.getPosicaoX() + 10;
			this.setPosicaoX(novaPosicaoX);
		}

		if (direcao == 90 || direcao < 180) {
			int novaPosicaoY = this.getPosicaoY() + 10;
			this.setPosicaoY(novaPosicaoY);
		}

		if (direcao == 180 || direcao < 270) {
			int novaPosicaoY = this.getPosicaoX() - 10;
			this.setPosicaoY(novaPosicaoY);
		}

		if (direcao == 270 || direcao < 360) {
			int novaPosicaoY = this.getPosicaoY() - 10;
			this.setPosicaoY(novaPosicaoY);
		}

		if (direcao == 360 || direcao > 360) {
			int novaPosicaoX = this.getPosicaoX() + 10;
			this.setPosicaoX(novaPosicaoX);
		}

	}

	public int getDirecao() {
		return direcao;
	}

	public void setDirecao(int direcao) {
		this.direcao = direcao;
	}

	public int getQtdeVidas() {
		return qtdeVidas;
	}

	public void setQtdeVidas(int qtdeVidas) {
		this.qtdeVidas = qtdeVidas;
	}

	public boolean isInvencivel() {
		return invencivel;
	}

	public void setInvencivel(boolean invencivel) {
		this.invencivel = invencivel;
	}

}
