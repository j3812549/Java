
import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100; // С�������
	double y = 100; // С��������
	
	double degree = 3.14 / 3; // ���ȣ�60��
	
	// �����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ�Σ�");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		x = x + 10 * Math.cos(degree);
		y = y + 10 * Math.sin(degree);
		
		if (y > 500 - 40 - 30 || y < 80) {
			degree = -degree;
		}
		
		if (x < 40 || x > 856 - 40 -30) {
			degree = 3.14 - degree;
		}
		
	}
	
	// ���ڼ���
	void launchFrame() {
		setSize(856, 500);// ��͸�
		setLocation(400, 400);// window�ϵ�λ��
		setVisible(true);
		
		// �ػ�����
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			} catch(Exception e) {
				e.printStackTrace();
			}
 		}
	}
	
	// main�����ǳ���ִ�е���ڡ�������Ҫ�е�
	public static void main(String[] args) {
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}
