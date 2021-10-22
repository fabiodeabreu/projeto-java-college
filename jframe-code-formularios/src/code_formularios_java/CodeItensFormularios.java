package code_formularios_java;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CodeItensFormularios {
public static void main(String[] args) {
		
		JFrame frame = new JFrame("código frame - Java");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		
		JLabel label = new JLabel("", JLabel.CENTER);
		label.setBounds(     10,          30,             200,            20        );
						/*posi lateral, posi altura, tamanho largura, tamanho altura*/
		
		
		JTextField textField = new JTextField();
		textField.setBounds(10, 70, 200, 20);
			
		
		JPasswordField passwordTextField = new JPasswordField();
		passwordTextField.setBounds(10, 100, 200, 20);
			
		
		JButton button = new JButton("Botão");
		button.setBounds(10, 130, 80, 20);
			
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu - clique aqui");
		JMenuItem menuItem1 = new JMenuItem("escolha 1");
		JMenuItem menuItem2 = new JMenuItem("escolha 2");
		JMenuItem menuItem3 = new JMenuItem("escolha 3");
		
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.add(menuItem3);
		menuBar.add(menu);
		
		JCheckBox checkBox = new JCheckBox("checkBox");
		checkBox.setBounds(10, 160, 200, 20);
		
		JRadioButton radioButton = new JRadioButton("radioButton");
		radioButton.setBounds(10, 180, 200, 60);
		
		String[] itens = {"item 1", "item 2", "item 3"};
		JList list = new JList(itens);
		list.setBounds(10, 240, 200, 60);
		
		String[] itenss = {"item 1", "item 2", "item 3"};
		JComboBox comboBox = new JComboBox(itenss);
		comboBox.setBounds(10, 310, 200, 20);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 360, 200, 150);
		
		JOptionPane.showMessageDialog(null, " jframe Java para criação de formulários");	
		
		JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 1, 0, 100);
		scrollBar.setBounds(10, 540, 300, 15);
		
		//JProgressBar progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 1, 100);
		
		
		frame.add(label);
		frame.add(textField);
		frame.add(passwordTextField);
		frame.add(button);
		frame.setJMenuBar(menuBar);
		frame.add(checkBox);
		frame.add(radioButton);
		frame.add(list);
		frame.add(comboBox);
		frame.add(textArea);
		frame.add(scrollBar);
		
		frame.setVisible(true);
	}

}
