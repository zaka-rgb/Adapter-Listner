package EX1;

public class test {

	public static void main(String[] args) {
		Source fenetre= new Source("EX1");
		Adapter ad= new Adapter();
		fenetre.addMouseListener(ad);

	}

}
