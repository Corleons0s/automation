import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.awt.AWTException;
//public class Spammer {
//
//    public static void main(String[] args) throws AWTException, InterruptedException {
//        int x = 1;
//
//        Robot robot = new Robot();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("ENTER YOR TEXTS");
//        String Text = scanner.nextLine();
//
//        StringSelection stringSelection = new StringSelection(Text);
//        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//        clipboard.setContents(stringSelection, null);
//
//        System.out.println("The spammer will start in 5 seconds  ");
//        Thread.sleep(5000);
//
//        while (x <= 10) {
//            Thread.sleep(1000);
//            robot.Keypress(KeyEvent.VK_CONTROL);
//            robot.KeyPress(KeyEvent.VK_V);
//            robot.KeyRelease(KeyEvent.VK_VK_CONTROL);
//            robot.KeyRelease(KeyEvent.VK_V);
//
//            robot.KeyPress(KeyEvent.VK_ENTER);
//            robot.KeyPress(KeyEvent.VK_ENTER);
//            https://www.youtube.com/watch?v=IpJSqnVnCQE&t=58s  לא עובד לי
//            x++;
//
//        }
//
//    }
