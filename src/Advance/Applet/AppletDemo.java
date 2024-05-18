package Advance.Applet;

import java.applet.Applet;
import java.awt.*;

public class AppletDemo extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World", 25, 50);
    }
}

/*
* <applet code="AppletDemo.class" width="320" height="120">
        If your browser was Java-enabled, a "Hello, World"
        message would appear here.
    </applet>
 * */
