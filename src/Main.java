import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
    JFrame frame = new JFrame();


frame.setSize(300,580);


frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    Pinball panel = new Pinball();


frame.add(panel);

frame.setVisible(true);


}
}
