import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;

public class MyGame extends GameCanvas implements Runnable{
	Thread runner;
	boolean running = false;
	protected MyGame() {
		super(false);		
		setFullScreenMode(true);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		// TODO Auto-generated method stub
		while(running){
			updateGraphics(getGraphics());
			try{
				Thread.sleep(30);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public void updateGraphics(Graphics g){		
		createBackground(g);
		flushGraphics();
	}
	
	public void createBackground(Graphics g){
		g.setColor(0x000000);
		g.fillRect(0, 50, 240, 400);
	}
	
	public void start(){
		runner = new Thread(this);
		running = true;
		runner.start();
	}
}
