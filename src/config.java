
import Vews.ProductView;
import Vews.UsersView;

public class config {
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new UsersView().setVisible(true);
			}
		});
	}
}
