
public class Paddle {

	int x;
	int y;
	
	char upkey = '1';
	char downkey = '2';
	
	
	public void move() {
		if (Zen.isKeyPressed(upkey)) {
			y = y + 5;
		}
		if (Zen.isKeyPressed(downkey)) {
			y = y - 5;
		}
	}
	
	public void draw() {
		Zen.setColor(255, 0, 0);
		Zen.fillRect(x - 5, y - 50, 10, 100);
	}
}

