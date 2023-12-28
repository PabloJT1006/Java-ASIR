import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class HolaMundo {

	private JFrame frmHolaMundo;
	private final ButtonGroup Sexo = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	
	
	public static String cesar(String cadena) {
		String abc = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789 ";
		String cadenaCod="";
        for (int i = 0; i < cadena.length() ; i++) {
            for (int j=0; j < abc.length(); j++) {
                if (cadena.charAt(i)==abc.charAt(j)) {
                    cadenaCod+=abc.charAt((j+5)%abc.length());
                }
            }
        }
        cadena=cadenaCod;
        return cadena;
    }
	
	 public static String invertir(String cadena) {
	        String cadenaInvertida = "";
	        for (int x = cadena.length() - 1; x >= 0; x--)
	            cadenaInvertida = cadenaInvertida + cadena.charAt(x);
	        return cadenaInvertida;
	    }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolaMundo window = new HolaMundo();
					window.frmHolaMundo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HolaMundo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	private void initialize() {
		frmHolaMundo = new JFrame();
		frmHolaMundo.setTitle("HolaMundo");
		frmHolaMundo.setAlwaysOnTop(true);
		frmHolaMundo.setBounds(100, 100, 634, 442);
		frmHolaMundo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHolaMundo.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("hola");
		label.setBounds(148, 40, 233, 57);
		frmHolaMundo.getContentPane().add(label);
		
		
		
		
		JCheckBox chckJakear = new JCheckBox("Jakear");
		chckJakear.setBounds(53, 271, 108, 37);
		frmHolaMundo.getContentPane().add(chckJakear);
		
		JCheckBox chckInvertir = new JCheckBox("Invertir");
		chckInvertir.setBounds(53, 310, 93, 21);
		frmHolaMundo.getContentPane().add(chckInvertir);
		
	
		
		
		JCheckBox chckMayusculas = new JCheckBox("Mayusculas");
		chckMayusculas.setBounds(53, 341, 93, 21);
		frmHolaMundo.getContentPane().add(chckMayusculas);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(240, 264, 115, 73);
		frmHolaMundo.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdHombre = new JRadioButton("Hombre");
		JRadioButton rdMujer = new JRadioButton("Mujer");

		
		ActionListener oyente = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdHombre.isSelected()) label.setText("Hombre");
				else label.setText("Mujer");
				
			}
		};

		rdHombre.setBounds(6, 15, 103, 21);
		panel.add(rdHombre);
		rdHombre.addActionListener(oyente);
		Sexo.add(rdHombre);
		rdMujer.addActionListener(oyente);
		rdMujer.setBounds(6, 46, 103, 21);
		panel.add(rdMujer);
		Sexo.add(rdMujer);
		
		
		JButton btnNewButton = new JButton("Hazme click");
		btnNewButton.setBounds(251, 167, 130, 21);
		frmHolaMundo.getContentPane().add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHolaMundo.setTitle("Me has hecho clic");
				label.setText("Has hehco clic klk");
				
				if (chckJakear.isSelected()) {
					label.setText(cesar(label.getText()));
				}
				if (chckMayusculas.isSelected()) {
					label.setText(label.getText().toUpperCase());
				} else label.setText(label.getText().toLowerCase());
				
				if (chckInvertir.isSelected()) {
					label.setText(invertir(label.getText()));
				}
				
			}
		});
		
		
		
		//CREACION DE BOTONES NEGRITA E ITALICA JUNTO CON SUS CHEKS
		JToggleButton tglItalica = new JToggleButton("I");
		tglItalica.setBounds(24, 22, 50, 21);
		frmHolaMundo.getContentPane().add(tglItalica);
		
		JToggleButton tglNegrita = new JToggleButton("N");
		tglNegrita.setBounds(96, 22, 50, 21);
		frmHolaMundo.getContentPane().add(tglNegrita);
		
		;
		JCheckBox chckNegrita = new JCheckBox("Negrita");
		chckNegrita.setBounds(409, 310, 93, 21);
		frmHolaMundo.getContentPane().add(chckNegrita);
		
		JCheckBox chckItalica = new JCheckBox("Italica");
		chckItalica.setBounds(409, 279, 93, 21);
		frmHolaMundo.getContentPane().add(chckItalica);
		
		//CREACION DEL COMBO BOX CON SU ACTION 
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.PINK);
		comboBox.setEditable(true);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(comboBox.getModel().getSelectedItem().toString());
				int pos = ((DefaultComboBoxModel<String>)comboBox.getModel()).getIndexOf(label.getText());
				if (pos ==-1) {
					comboBox.addItem(comboBox.getModel().getSelectedItem());;
				}
				
				//label.setText(comboBox.getModel().getElementAt(comboBox.getSelectedIndex()).toString());
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Fiora", "Lux", "Yone", "Vex", "Leona", "Yumi", "Garen"}));
		comboBox.setBounds(53, 107, 171, 21);
		frmHolaMundo.getContentPane().add(comboBox);
		
		//LISTA CON SUS BORDES
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "MARCAS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(454, 95, 80, 99);
		frmHolaMundo.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JList list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				label.setText(list.getSelectedValue().toString());
			}
		});
		list.setBounds(6, 15, 68, 78);
		panel_1.add(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Seat", "Audi", "BMW", "Renault", "Sega"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		
		//ACTION DEL BOTON DE ITALICA
		tglItalica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//esto tambien para comprobar que el boton este pa dentro y no de problemas
				if(tglItalica.isSelected()) {
					label.setFont(new Font(label.getFont().getName(),label.getFont().getStyle() + Font.ITALIC,label.getFont().getSize()));
					chckItalica.setSelected(true);
				}
				else {
					label.setFont(new Font(label.getFont().getName(),label.getFont().getStyle() - Font.ITALIC,label.getFont().getSize()));
					chckItalica.setSelected(false);
				}
			}
		});
		
		//Action del boton negrita
		tglNegrita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//esto tambien para comprobar que el boton este pa dentro y no de problemas
				if(tglNegrita.isSelected()) {
					label.setFont(new Font(label.getFont().getName(),label.getFont().getStyle() + Font.BOLD,label.getFont().getSize()));
					chckNegrita.setSelected(true);
				}
				else {
					label.setFont(new Font(label.getFont().getName(),label.getFont().getStyle() - Font.BOLD,label.getFont().getSize()));
					chckNegrita.setSelected(false);
				}
			}
		});
		
		//Action del chek 
		chckItalica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckItalica.isSelected()) {
					label.setFont(new Font(label.getFont().getName(),label.getFont().getStyle() + Font.ITALIC,label.getFont().getSize()));
					tglItalica.setSelected(true);
				}
				else {
					label.setFont(new Font(label.getFont().getName(),label.getFont().getStyle() - Font.ITALIC,label.getFont().getSize()));
					tglItalica.setSelected(false);
				}
			}
		});
		
		//Action del negro 
		chckNegrita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckNegrita.isSelected()) {
					label.setFont(new Font(label.getFont().getName(),label.getFont().getStyle() + Font.BOLD,label.getFont().getSize()));
					tglNegrita.setSelected(true);
				}
				else {
					label.setFont(new Font(label.getFont().getName(),label.getFont().getStyle() - Font.BOLD,label.getFont().getSize()));
					tglNegrita.setSelected(false);
				}
			}
		});
	
		//EJERCICIO TEMPERATURAS. HACERLES A LAS DOS LISTAS LO MISMO QUE EN EL COMBO CON EL DEFAULT Y EL GETiNDEX
		//ESOS INDEX VER CUALES SON Y HACER UNA OPERACION U OTRA
		
	}
}
