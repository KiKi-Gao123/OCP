package OCP;

import javax.swing.*;
import java.awt.*;


public class LoginForm extends JFrame {
    private AbstructButton button=null;
    private XMLHepler xmlHepler=null;
    public LoginForm() {
        setTitle("OCP");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(0,0,200,200);
        setLayout(null);//绝对布局
    }
    //面板容器添加控件
    public void showControl() throws InstantiationException, IllegalAccessException, ClassNotFoundException
    {
        xmlHepler=new XMLHepler();
        String btnName=xmlHepler.getButtonName();
        Container container=getContentPane();
        button=(AbstructButton)Class.forName(btnName).newInstance();//根据名字来实例化对应的按钮
        button.InitButton();
        container.add(button);
    }
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        // TODO Auto-generated method stub
        new LoginForm().showControl();
    }

}
