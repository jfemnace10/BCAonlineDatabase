package testpack;

import javax.swing.SwingUtilities;

public class Gdrive {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Gdrive();
			}
		});
	}
	
	public Gdrive() {
		
	}
}
