package OCP;

import java.awt.*;

public class CircleButton extends AbstructButton{
    //实际按钮二 圆形按钮
    public CircleButton() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public void InitButton()//重写父类方法 圆形按钮初始化
    {
        this.setText("圆形按钮");
        this.setBackground(Color.yellow);
        this.setBounds(50,50,120,40);
    }
}
