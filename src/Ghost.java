
public class Ghost extends GameObject {
	private int direcaoGhost;
	private int posicaoYGhost;
	private int posicaoXGhost;

	public Ghost() {
	}

	public Ghost(int posicaoX, int posicaoY, int direcao) {
		this.posicaoXGhost = posicaoX;
		this.posicaoYGhost = posicaoY;
		this.direcaoGhost = direcao;

	}

	public boolean podeSeMover(int posicaoX, int posicaoY, int direcao) {
		if (posicaoXGhost >= 0 && posicaoXGhost < getTelaX() && posicaoYGhost >= 0 && posicaoYGhost < getTelaY()) {
			return true;
		}
		return false;
	}

	public void movimentaGhost() {
//		posicaoXGhost = (int) (getPosicaoX() * Math.random());
//		posicaoYGhost = (int) (getPosicaoY() * Math.random());
		direcaoGhost = (int) (direcaoGhost * Math.random());

	}

	public int getDirecaoGhost() {
		return direcaoGhost;
	}

	public void setDirecaoGhost(int direcaoGhost) {
		if (direcaoGhost < 0) {
			System.out.println("Direção inválida.");
		}
		this.direcaoGhost = direcaoGhost;
	}

	public int getPosicaoYGhost() {
		return posicaoYGhost;
	}

	public void setPosicaoYGhost(int posicaoYGhost) {
		if (posicaoYGhost < 0) {
			System.out.println("Posição inválida.");
		}
		this.posicaoYGhost = posicaoYGhost;
	}

	public int getPosicaoXGhost() {
		return posicaoXGhost;
	}

	public void setPosicaoXGhost(int posicaoXGhost) {
		if (posicaoXGhost < 0) {
			System.out.println("Posição inválida.");
		}
		this.posicaoXGhost = posicaoXGhost;
	}

}
