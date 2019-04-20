package calculator;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;

public class CalculatorView extends JFrame {

	@Autowired
	private CalculatorService calculatorService;

	public CalculatorView() {

		this.setSize(400, 400);
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JButton jButton = new JButton("Add");

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double valor1 = Double.parseDouble(text1.getText());
				double valor2 = Double.parseDouble(text2.getText());
				label.setText(String.valueOf(calculatorService.addition(valor1, valor2)));

			}
		});
		
		GridLayout gr = new GridLayout();
		
		gr.setColumns(2);
		gr.setRows(2);
		
		panel.setLayout(gr);
		
		panel.add(label);
		panel.add(text1);
		panel.add(text2);
		panel.add(jButton);
		
		this.setContentPane(panel);
		this.setTitle("Calculator with spring.");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}

}
