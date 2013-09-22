
class PongGame {

	public static void main(String[] args) {
		Zen.create(500, 500);
		Zen.setColor(255, 255, 255);
		Zen.fillRect(0, 0, 500, 500);
		Zen.setColor(0, 0, 0);
		Zen.drawLine(250, 0, 250, 500);
		Ball b = new Ball();
		Paddle p1 = new Paddle();
		p1.x = 20;
		p1.y = 250;
		Paddle p2 = new Paddle();
		p2.x = 480;
		p2.y = 250;
		p2.upkey = '3';
		p2.downkey = '4';
		
		int p1score = 0;
		int p2score = 0;
		
		
		while (true) {
			drawBackground();
			Zen.setColor(255, 255, 255);
			Zen.setFont("Cambria-60");
			Zen.drawText(p1score + "-" + p2score, 200, 50);
			b.draw();
			b.move();
			p1.draw();
			p1.move();
			p2.draw();
			p2.move();
			
			if (b.x <= 10) {
				p2score = p2score + 1;
				//b.x = 250;
				//b.y = 250;
				b.dx = (int) (Math.random() * 3);
			}
			
			if (b.x >= 490) {
				p1score = p1score + 1;
				b.x = 250;
				b.y = 250;
			}
			
			if (Math.abs(p1.x - b.x ) <= 15 && Math.abs(p1.y - b.y ) <= 50 )
			{
				b.dx = -1 * b.dx;	
			}
		
			if (Math.abs(p2.x - b.x ) <= 15 && Math.abs(p2.y - b.y ) <= 50 )
			{
				b.dx = -1 * b.dx;	
			}
		
			Zen.flipBuffer();
			Zen.sleep(10);
			
		}

	}
	public static void drawBackground()
	{
		Zen.setColor(0, 0, 0);
		Zen.fillRect(0, 0, 500, 500);
		
		
		
		
		
		
	}
}
