import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class GameFrame extends Frame implements WindowListener {
	
public GameFrame() {
	//WindowListener listener = new GameWindowListener();
	addWindowListener(this);
	setVisible(true);
}
	
	
	//�׸� �׸��� �Լ� ������ ����
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		g.drawRect(100, 100, 200, 100); // �׸� �����
		g.drawString("������", 101, 101); //���� �����
	}

	@Override
	public void windowOpened(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "Hello!");
		
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "Good Bye~");
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}