
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100; // 小球横坐标
	double y = 100; // 小球纵坐标
	boolean right = true; // 方向
	
	// 画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次！");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		if (right) {
			x = x + 10;
		} else {
			x = x - 10;
		}
		
		if (x > 856 - 40 - 30) { // 856宽度，40桌边框，30球直径
			right = false;
		}
		
		if (x < 40) {
			right = true;
		}
	}
	
	// 窗口加载
	void launchFrame() {
		setSize(856, 500);// 宽和高
		setLocation(400, 400);// window上的位置
		setVisible(true);
		
		// 重画窗口
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			} catch(Exception e) {
				e.printStackTrace();
			}
 		}
	}
	
	// main方法是程序执行的入口——必须要有的
	public static void main(String[] args) {
		BallGame game = new BallGame();
		game.launchFrame();
	}
}
