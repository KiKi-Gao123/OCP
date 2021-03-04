package OCP;

import javax.swing.*;

public abstract class AbstructButton extends JButton {
    //设计抽象类 满足所有按钮的需求
    public AbstructButton() {
        // TODO Auto-generated constructor stub
    }
    public abstract void InitButton();//抽象方法没有方法体 且子类必须重写

}
