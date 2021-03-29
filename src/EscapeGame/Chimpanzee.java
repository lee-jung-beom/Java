package EscapeGame;

public class Chimpanzee {
	//플레이어
	
	int hp;
	int maxHp;
	Item[] item;
	
	public Chimpanzee(int hp){
		this.maxHp = hp;
		this.hp = this.maxHp;
		this.item = new Item[3];  
	}
}
