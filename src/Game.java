
public class Game {
	public static void main(String[] args) {
		
		
		Player player = new Player(50, 50, 180);
		
		player.novaPosicao(0, 0, 0);
		System.out.println("NOVA POSI��O  Posi��o X: " + player.getPosicaoX()  + "Posi��o Y: " +  player.getPosicaoY() + "Vidas: " + player.getQtdeVidas());
		
		Ghost blinky = new Ghost();
		blinky.movimentaGhost();
		System.out.println("Blinky X: " + blinky.getPosicaoXGhost() + "Blinky Y: " + blinky.getPosicaoYGhost() + "Blinky Dire��o: " + blinky.getDirecaoGhost());
		
		
		Ghost pinky = new Ghost();
		pinky.setPosicaoXGhost(7);
		pinky.setPosicaoYGhost(80);
		pinky.setDirecaoGhost(360);
		System.out.println("Pinky X: " + pinky.getPosicaoXGhost() + "Pinky Y: " + pinky.getPosicaoYGhost() + "Pinky Dire��o: " + pinky.getDirecaoGhost());

		Ghost inky = new Ghost();
		inky.setPosicaoXGhost(100);
		inky.setPosicaoYGhost(77);
		inky.setDirecaoGhost(89);
		System.out.println("Inky X: " + inky.getPosicaoXGhost() + "Inky Y: " + inky.getPosicaoYGhost() + "Inky Dire��o: " + inky.getDirecaoGhost());

		
		Ghost clyde = new Ghost();
		clyde.setPosicaoXGhost(63);
		clyde.setPosicaoYGhost(24);
		clyde.setDirecaoGhost(18);
		System.out.println("Clyde X: " + clyde.getPosicaoXGhost() + "Clyde Y: " + clyde.getPosicaoYGhost() + "Clyde Dire��o: " + clyde.getDirecaoGhost());

		
		Booster booster1 = new Booster ();
		booster1.setPosicaoXBooster(1);
		booster1.setPosicaoYBooster(1);
		booster1.setDuracaoBooster(2);
		System.out.println("Booster X: " + booster1.getPosicaoXBooster() + " Booster Y: " + booster1.getPosicaoYBooster() + "Dura��o Booster: " + booster1.getDuracaoBooster());
		
		Bomb bomb1 = new Bomb ();
		bomb1.setPosicaoXBomb(44);
		bomb1.setPosicaoYBomb(55);
		bomb1.setRemoveVidas(0);
		System.out.println("Bomb X: " + bomb1.getPosicaoXBomb() + " Bomb Y: " + bomb1.getPosicaoYBomb() + "Explodiu: " + bomb1.getRemoveVidas());

		
	}
}
