package interfaceExterne;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DialogConnexion extends JDialog {

	  private DialogConnexionInfo zInfo = new DialogConnexionInfo();
	  private boolean sendData;
	  private JLabel pseudoLabel, mdpLabel;
	  private JTextField pseudo, mdp;

	  public DialogConnexion(JFrame parent, String title, boolean modal){
	    super(parent, title, modal);
	    this.setSize(550, 150);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	    this.initComponent();
	  }

	  public DialogConnexionInfo showZDialog(){
	    this.sendData = false;
	    this.setVisible(true);      
	    return this.zInfo;      
	  }

	  private void initComponent(){
	    //Le pseudo
	    JPanel panPseudo = new JPanel();
	    panPseudo.setBackground(Color.white);
	    panPseudo.setPreferredSize(new Dimension(220, 60));
	    pseudo = new JTextField();
	    pseudo.setPreferredSize(new Dimension(100, 25));
	    panPseudo.setBorder(BorderFactory.createTitledBorder("Pseudo"));
	    pseudoLabel = new JLabel("Saisir votre pseudo :");
	    panPseudo.add(pseudo);
	    panPseudo.add(pseudo);

	    //Le mdp
	    JPanel panMdp = new JPanel();
	    panMdp.setBackground(Color.white);
	    panMdp.setPreferredSize(new Dimension(220, 60));
	    mdp = new JTextField();
	    mdp.setPreferredSize(new Dimension(100, 25));
	    panMdp.setBorder(BorderFactory.createTitledBorder("Mot de passe"));
	    mdpLabel = new JLabel("Saisir votre mot de passe :");
	    panMdp.add(mdp);
	    panMdp.add(mdp);


	    JPanel content = new JPanel();
	    content.setBackground(Color.white);
	    content.add(panPseudo);
	    content.add(panMdp);

	    JPanel control = new JPanel();
	    JButton okBouton = new JButton("OK");
	    
	    okBouton.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent arg0) {        
	        zInfo = new DialogConnexionInfo(pseudo.getText(), mdp.getText());
	        setVisible(false);
	      }
     
	    });

	    JButton cancelBouton = new JButton("Annuler");
	    cancelBouton.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent arg0) {
	        setVisible(false);
	      }      
	    });

	    control.add(okBouton);
	    control.add(cancelBouton);

	    this.getContentPane().add(content, BorderLayout.CENTER);
	    this.getContentPane().add(control, BorderLayout.SOUTH);
	  }  
}
