package hutubill;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

import jsi.zzx.panel.SpendPanel;

public class MainFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 450);
		f.setTitle("糊涂账");
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		
		JToolBar jb = new JToolBar();
		JButton bSpend = new JButton("消费一览");
		JButton bRecord = new JButton("记一笔");
		JButton bCategory = new JButton("消费分类");
		JButton bReport = new JButton("月消费报表");
		JButton bConfig = new JButton("设置");
		JButton bBackup = new JButton("备份");
		JButton bRecover = new JButton("恢复");
		jb.add(bSpend);
		jb.add(bRecord);
        jb.add(bCategory);
        jb.add(bReport);
        jb.add(bConfig);
        jb.add(bBackup);
        jb.add(bRecover);
        
        f.setLayout(new BorderLayout());
        f.add(jb, BorderLayout.NORTH);
        f.add(new Panel(), BorderLayout.CENTER);
        f.setVisible(true);
        
        bSpend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SpendPanel sp = SpendPanel.instance;
			}
		});
        bRecord.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 
            }
        });
        bCategory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 
            }
        });
        bConfig.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 
            }
        });
        bBackup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 
            }
        });
        bRecover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 
            }
        });
	}

}
