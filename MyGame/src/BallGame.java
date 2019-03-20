
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100; // С�������
	double y = 100; // С��������
	boolean right = true; // ����
	
	// �����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ�Σ�");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		if (right) {
			x = x + 10;
		} else {
			x = x - 10;
		}
		
		if (x > 856 - 40 - 30) { // 856���ȣ�40���߿�30��ֱ��
			right = false;
		}
		
		if (x < 40) {
			right = true;
		}
	}
	
	// ���ڼ���
	void launchFrame() {
		setSize(856, 500);// ���͸�
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
		BallGame game = new BallGame();
		game.launchFrame();
	}
}