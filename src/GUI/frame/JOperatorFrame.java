package gui.frame;

import action.ActionControllable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Donghwan on 2015-05-29.
 */
abstract class JOperatorFrame extends JFrame{
    /** can give order to program root class*/
    public ActionControllable root;

    JOperatorFrame(ActionControllable root) throws HeadlessException {
        this.root = root;
    }

    JOperatorFrame(GraphicsConfiguration gc, ActionControllable root) {
        super(gc);
        this.root = root;
    }

    JOperatorFrame(String title, ActionControllable root) throws HeadlessException {
        super(title);
        this.root = root;
    }

    JOperatorFrame(String title, GraphicsConfiguration gc, ActionControllable root) {
        super(title, gc);
        this.root = root;
    }
}
