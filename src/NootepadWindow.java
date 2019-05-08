import javax.swing.*;
import java.awt.*;

public class NootepadWindow extends JFrame
{
    JTextArea textArea;
    JMenuBar menuBar;
    JMenu mFile1;
    JMenu mFile2;
    JMenu mFile3;
    JMenu mFile4;
    JMenu mFile5;
    JMenuItem miNew;
    JMenuItem miOpen;
    JMenuItem miSave;
    JMenuItem miSave1;

    public NootepadWindow(String title, int width,int height)
    {
        setTitle(title);
        setSize(width,height);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar = new JMenuBar();
        textArea = new JTextArea();
        mFile1 = new JMenu("Файл");
        mFile2 = new JMenu("Правка");
        mFile3 = new JMenu("Формат");
        mFile4 = new JMenu("Вид");
        mFile5 = new JMenu("Справка");
        miNew = new JMenuItem("Создать");
        miOpen = new JMenuItem("Открыть...");
        miSave = new JMenuItem("Сохранить");
        miSave1 = new JMenuItem("Сохранить как...");

        mFile1.add(miNew);
        mFile1.add(miSave);
        mFile1.add(miOpen);
        mFile1.add(miSave1);

        menuBar.add(mFile1);
        menuBar.add(mFile2);
        menuBar.add(mFile3);
        menuBar.add(mFile4);
        menuBar.add(mFile5);

        setJMenuBar(menuBar);
        add(textArea, BorderLayout.CENTER);
        setVisible(true);
    }
}