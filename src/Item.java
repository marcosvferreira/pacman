
public class Item extends GameObject {
	private int posicaoXItem;
	private int posicaoYItem;
	private boolean visivel;

	public Item() {
		
	}

	public Item(int posicaoXItem, int posicaoYItem, boolean visivel) {
		super();
		this.posicaoXItem = posicaoXItem;
		this.posicaoYItem = posicaoYItem;
		this.visivel = visivel;
	}

	
	public int getPosicaoXItem() {
		return posicaoXItem;
	}

	public void setPosicaoXItem(int posicaoXItem) {
		if (posicaoXItem < 0 || posicaoXItem > getTelaX()) {
			System.out.println("Posição inválida.");
		}
		this.posicaoXItem = posicaoXItem;
	}

	public int getPosicaoYItem() {
		return posicaoYItem;
	}

	public void setPosicaoYItem(int posicaoYItem) {
		if (posicaoYItem < 0 || posicaoYItem > getTelaY()) {
			System.out.println("Posição inválida.");
		}
		this.posicaoYItem = posicaoYItem;
	}

	public boolean isVisivel() {
		return visivel;
	}

	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}
	
	
	
	
	
}
