package guessnum;

import java.awt.Image;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class About extends javax.swing.JFrame {

  //用 Java 调用windows系统的exe文件，比如notepad，calc之类
  public static void openWinExe() {
      Runtime rn = Runtime.getRuntime();
      Process p = null;
      try {
          String command = "notepad";
          p = rn.exec(command);
      } catch (Exception e) {
          System.out.println("Error win exec!");
      }
  }    
  //调用其他的可执行文件，例如：自己制作的exe，或是 下载 安装的软件.
  public static void openExe(String process) {
      Runtime rn = Runtime.getRuntime();
      Process p = null;
      try {
          p = rn.exec(process);//如 "\"D:/QQ2010.exe\""，反斜杠加双引号用于显示双引号
      } catch (Exception e) {
          System.out.println("Error exec!");
      }  
  }
  
    public About() {
        initComponents();   //选择初始化所有组件的方法，这里默认使用Netbeans生成的方法
        
//        //修改窗口的咖啡图标？？不成功
//        Toolkit tool=getToolkit();
//        Image img=tool.getImage("/res/3.PNG");
//        this.setIconImage(img);
        //以上方法无效，使用以下方法...也无效，暂时放弃
        ImageIcon ic = new ImageIcon("/res/3.png");
        Image img = ic.getImage();
        this.setIconImage(img);
    }
    //以initComponents()为基础修改的初始化程序段---已停用
    private void MyInitComponents() {

        dtt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                AfterClose(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeAbout(evt);
            }
        });

        dtt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/2.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>\n本程序零技术含量，\n纯属作者本人无聊练手，\n因为很久没碰JAVA了\n短号：636484 \n企鹅：374607000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dtt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(dtt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        //一下设置居中显示，适应各种屏幕
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-181)/2, 416, 181);
    }// </editor-fold>    
//    两点注意事项：
    //1. setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);应改为....DISPOSE_ON_CLOSE
    //2.         //以下两行代码设置居中显示，适应各种屏幕
        /*java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();*/
        /*setBounds((screenSize.width-342)/2, (screenSize.height-420)/2, 342, 420);*/
        /*宽342，高408  实际填写值应稍大一些，如366和420*/
    
    //现已调用initComponents()
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("关于Ltre的声明");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                AfterClose(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeAbout(evt);
            }
        });

        dtt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/2.jpg"))); // NOI18N
        dtt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toBrowser(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>\n<center>鸣谢<br/>\n本程序零技术含量，纯属作者本人<br/>无聊练手，因为很久没碰JAVA了<br/>\n短号：636484 <br/>\n企鹅：374607000<br/>\n</center>\n</html>");

        jLabel2.setBackground(new java.awt.Color(153, 102, 255));
        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 12));
        jLabel2.setText("<html>\n<center><font size=\"5\">version 1.5更新日志<br></font></center><br/>\n<center>相对1.2.0.0版本的更新明细</center><br>\n一、删除冗余函数GuessActionPerformed()<br/>\n二、注释暂时无用函数type_numActionPerformed()，日后添加新功能时再使用<br/>\n三、调整猜数次数显示的逻辑：<br/>\n&nbsp;&nbsp;（1）当dealGuess()返回false时，不显示当前猜数次数，而是显示警告；<br/>\n&nbsp;&nbsp;（2）当dealGuess()返回true时，表明成功判断，这时才在窗口底部显示当前猜数次数。<br/>\n四、修正第一次在输入框输入字符时就显示“到此为止，你已经猜了0次”的BUG。<br/>\n五、禁用JFrame最大化。<br/>\n六、去除窗体标题栏，窗口透明化。<br/>\n</html>");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("微软雅黑", 1, 24));
        jButton1.setText("Root");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toRoot(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 51, 255));
        jButton2.setFont(new java.awt.Font("微软雅黑", 1, 24));
        jButton2.setText("Iseo");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toIseo(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 204));
        jButton3.setFont(new java.awt.Font("微软雅黑", 1, 24));
        jButton3.setText("KGJ");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toKGJ(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 51));
        jButton4.setFont(new java.awt.Font("微软雅黑", 1, 24));
        jButton4.setText("FTP");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toFTP(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-374)/2, (screenSize.height-568)/2, 374, 568);
    }// </editor-fold>//GEN-END:initComponents



    private void closeAbout(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeAbout
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_closeAbout

    private void AfterClose(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AfterClose
        
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_AfterClose

    private void toRoot(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toRoot
//        try {
//            Process p = Runtime.getRuntime().exec("iexplorer.exe http://www.baidu.com");
//        } 
//        catch (IOException e1){
//            e1.printStackTrace();
//        }
        //以上代码无法打开浏览器，并抛出异常，但是以下代码成功执行，前提是有安装IE
          try{   
              Process net= Runtime.getRuntime().exec("explorer http://172.16.128.111/");
          } 
          catch(Exception e){  
              System.out.println("Error!");
              JOptionPane.showMessageDialog(null, e.getMessage());
          }
        
//          openExe("jar://exe/36kB.exe");
       
        //以下代码可能有效，但是抛出了异常
//        String path = Object.class.getClassLoader().getResource("/exe36kB.exe").getFile();
//        try {
//            path = java.net.URLDecoder.decode(path, "utf-8");
//        } catch (UnsupportedEncodingException ex) {
//            Logger.getLogger(About.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            Runtime.getRuntime().exec(path.substring(1));
//        } catch (IOException ex) {
//            Logger.getLogger(About.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_toRoot

    private void toIseo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toIseo
        try{   
              Process net= Runtime.getRuntime().exec("explorer http://172.16.128.111/Iseo/");
          } 
          catch(Exception e){  
              System.out.println("Error!");
              JOptionPane.showMessageDialog(null, e.getMessage());
          }
    }//GEN-LAST:event_toIseo

    private void toKGJ(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toKGJ
        try{   
              Process net= Runtime.getRuntime().exec("explorer http://172.16.128.111/test1-KingGuangJong/");
          } 
        catch(Exception e){  
              System.out.println("Error!");
              JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_toKGJ

    private void toFTP(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toFTP
         try{   
              Process net= Runtime.getRuntime().exec("explorer ftp://qqqq:qqqq@172.16.128.111:21/");
        } 
        catch(Exception e){  
            System.out.println("Error!");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_toFTP
    
    //点击狼鸟人后打开浏览器
    private void toBrowser(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toBrowser
//        Browser br = new Browser();
//        br.setVisible(true);
        
    }//GEN-LAST:event_toBrowser

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                About ab = new About();
                ab.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dtt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
