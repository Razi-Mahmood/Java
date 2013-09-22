
public class Ball {
	int x = 250;
	int y = 250;
	
	int dx = 2;
	int dy = 1;

	public void move() {
		x = x + dx;
		y = y + dy;
		if (y >= 490) 
		{
			dy = -1 * dy;
		}
		if (y <= 10)
		{
			dy = -1 * dy;
		}
	}
	
	public void draw()
	{
		Zen.setColor(0, 255, 0);
		Zen.fillOval(x - 10, y - 10, 20, 20);
	}
}