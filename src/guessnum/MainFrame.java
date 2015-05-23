package guessnum;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JFrame {
    int suijishu = (int)(Math.random()*100);  //随机数
    int guessTimes = 0;     //猜数计数器
    public MainFrame() {
        initComponents();
        //使窗口可以鼠标拖动
        AWTUtilities.setWindowOpaque(this, false);
        MouseDraggedAdapter adapter = new MouseDraggedAdapter(this);
        this.addMouseListener(adapter);
        this.addMouseMotionListener(adapter);
        //设置窗体背景,failed...
//        ImageIcon img = new ImageIcon("/res/danteng.jpg");
//        JLabel backlabel = new JLabel(img);
//        getLayeredPane().add(backlabel,new Integer(Integer.MIN_VALUE));
//        backlabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
//        //设置为透明才能看到背景
//        ((JPanel)this.getContentPane()).setOpaque(false);//设置为透明（opaque的意思为不透明）
//        this.getLayeredPane().add(new JLabel("/res/danteng.jpg"), rootPane);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        type_num = new javax.swing.JTextField();
        message = new javax.swing.JLabel();
        guess = new javax.swing.JButton();
        replace = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        AboutAuthor = new javax.swing.JButton();
        GuessTime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dt1 = new javax.swing.JButton();
        dt2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("用人品猜数字1.3.0.0");
        setBackground(new java.awt.Color(102, 0, 204));
        setForeground(new java.awt.Color(0, 255, 51));
        setResizable(false);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("程序将随机生成0到100中的一个数");
        jLabel1.setName("notice"); // NOI18N

        type_num.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N
        type_num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        type_num.setName("num"); // NOI18N
        type_num.setFocusable(true);
        type_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyHuicheInField(evt);
            }
        });

        message.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N

        guess.setBackground(new java.awt.Color(153, 204, 255));
        guess.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        guess.setText("猜你妹");
        guess.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        guess.setName("guess"); // NOI18N
        guess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickToGuess(evt);
            }
        });

        replace.setBackground(new java.awt.Color(103, 124, 103));
        replace.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        replace.setText("换个数");
        replace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                renum(evt);
            }
        });

        quit.setBackground(new java.awt.Color(0, 153, 153));
        quit.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        quit.setText("退出");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        AboutAuthor.setBackground(new java.awt.Color(153, 153, 255));
        AboutAuthor.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        AboutAuthor.setText("关于");
        AboutAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutAuthorActionPerformed(evt);
            }
        });

        GuessTime.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        GuessTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GuessTime.setText("这里显示你猜的次数");

        dt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/1.PNG"))); // NOI18N
        dt1.setVisible(false);

        dt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/3.PNG"))); // NOI18N
        dt2.setVisible(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("拖动这里");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(GuessTime, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(message, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(type_num, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(replace, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dt1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(guess, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(AboutAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(dt2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AboutAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guess, 0, 0, Short.MAX_VALUE)
                    .addComponent(type_num, javax.swing.GroupLayout.PREFERRED_SIZE, 53, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(dt1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(dt2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(quit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(replace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(message, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GuessTime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-418)/2, (screenSize.height-312)/2, 418, 312);
    }// </editor-fold>//GEN-END:initComponents

        public boolean dealGuess() {    //处理猜数字的复用程序段,并通过返回值来确定是否完整执行
        String temp = type_num.getText();
//        int len = temp.length();
//        for(int i = 0;i < len;i++){ //对输入框字符逐个监测
//            if(temp.charAt(i) < '0' || temp.charAt(i) > '9'){   //遇到非数字字符时，停止判断
//                GuessTime.setText("想啥呢？没让你猜别的!");   
//                return;
//            }
//        }
        if (!Pattern.matches("^[0-9]+$", temp)) {    //遇到非数字字符时，停止判断（以上判断过程繁琐，易错）
            GuessTime.setText("想啥呢？没让你猜别的!");
            type_num.setText("");
            type_num.requestFocus(true);    //输入框重新获取焦点
            System.out.println("遇到非数字字符，已跳出判断，不会计入总次数");
            return false;
        }
        if (Integer.parseInt(type_num.getText()) < suijishu) {
            dt1.setVisible(true);   //显示金馆长
            dt2.setVisible(false);
            message.setText("低了");
        } else if (Integer.parseInt(type_num.getText()) == suijishu) {
            dt1.setVisible(true);
            dt2.setVisible(true);
            message.setText("对了");
        } else {
            dt1.setVisible(false);
            dt2.setVisible(true);   //显示猪
            message.setText("高了");
        }
        type_num.setText("");
        type_num.requestFocus(true);    //输入框重新获取焦点
        guessTimes++;  //仅当该程序段成功判断数字时，计数器才会累加
        GuessTime.setText("到此为止，你已经猜了" + guessTimes + "次。");
        System.out.println("dealGuess()被调用，" + guessTimes);
        return true;
    }
    
    //换个数
    private void renum(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renum
        type_num.setText("");
        message.setText("");
        suijishu = (int) (Math.random() * 100);
        guessTimes = 0;     //猜数计数器清零
        type_num.requestFocus(true);    //输入框重新获取焦点
        dt1.setVisible(false);  //消除图标
        dt2.setVisible(false);
        message.setText("换了");
        GuessTime.setText("这里显示你猜的次数");
        System.out.println("renum()被调用，" + guessTimes);
    }//GEN-LAST:event_renum

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        System.exit(0);     
    }//GEN-LAST:event_quitActionPerformed

    //单击按钮以示输入完毕
    private void clickToGuess(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickToGuess
        dealGuess();    //处理猜测
        System.out.println("clickToGuess()被调用，" + guessTimes);
    }//GEN-LAST:event_clickToGuess

    /*  此段暂时不起作用，需要添加其他功能时再考虑
    private void type_numActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String temp = type_num.getText().substring(type_num.getText().length());//截取末字符为子串
//       if(temp.equals("\r"))    //***BUG:此处按回车无反应***
//           dealGuess();
        System.out.println("type_numActionPerformed()被调用，" + guessTimes);
    }                                        
    */    
    
    //键入回车以示输入完毕
    private void keyHuicheInField(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyHuicheInField
        if (evt.getKeyChar() == (char) KeyEvent.VK_ENTER) { //获取回车键
//            int temp_len = type_num.getText().length();   //***BUG：这两行导致按回车无法正确判断数字大小***
//            type_num.setText(type_num.getText().substring(0, temp_len-1));    //先删除内容中的回车字符，再进行处理
            dealGuess();
        }
        System.out.println("keyHuicheInField()被调用，" + guessTimes);
    }//GEN-LAST:event_keyHuicheInField
    //关于作者的声明
    private void AboutAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutAuthorActionPerformed
        About ab = new About();
        ab.setVisible(true);
        AboutJPanel Ab = new AboutJPanel();
        Ab.setVisible(true);
    }//GEN-LAST:event_AboutAuthorActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutAuthor;
    public javax.swing.JLabel GuessTime;
    public javax.swing.JButton dt1;
    private javax.swing.JButton dt2;
    private javax.swing.JButton guess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel message;
    private javax.swing.JButton quit;
    private javax.swing.JButton replace;
    private javax.swing.JTextField type_num;
    // End of variables declaration//GEN-END:variables
}
