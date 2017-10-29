

package simplejavatexteditor;

import javax.swing.JTextPane;

public class SimpleJavaTextEditor extends JTextPane {

    private static final long serialVersionUID = 1L;
    public final static String AUTHOR_EMAIL = "yuantaoxie1988@gmail.com";
    public final static String NAME = "NotePad";
    public final static String EDITOR_EMAIL = "yuantaoxie1988@gmail.com";
    public final static double VERSION = 1.0;

    /**
     * @param args
     */
    public static void main(String[] args) {
        new UI().setVisible(true);
    }

}