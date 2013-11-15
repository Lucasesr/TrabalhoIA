/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SubjectController;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class SubjectListView extends JFrame implements ActionListener
{
    //
    // Controller das matérias
    //
    SubjectController subjectController;
    
    //
    // Label
    //
    JLabel infoLabel;
    
    //
    // Botão para voltar
    //
    JButton backButton;
    
    //
    // Lista dos botões das materias
    //
    List<JButton> buttonList;
    
    //
    // Painel
    //
    JPanel panel;
    
    /**
     * Construtor
     * @param paramSubjectController 
     */
    public SubjectListView(SubjectController paramSubjectController)
    {
        this.subjectController = paramSubjectController;
        
        buttonList = new ArrayList<JButton>();
        
        infoLabel = new JLabel("Escolha a disciplina que deseja alterar");
        
        backButton = new JButton("Voltar");
        backButton.addActionListener(this);
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        panel.add(infoLabel);
        
        for(int i = 0; i < subjectController.getSubjectList().size(); i++)
        {
            JButton auxButton = new JButton(subjectController.getSubjectList().get(i).getSign() + " - " + subjectController.getSubjectList().get(i).getName());
            
            buttonList.add(auxButton);
            
            auxButton.addActionListener(this);
            
            panel.add(auxButton);
        }
        
        panel.add(backButton);
        
        this.add(panel, BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == backButton)
        {
            this.dispose();
        }
        else
        {
            for(int i = 0; i < buttonList.size(); i++)
            {
                if(e.getSource() == buttonList.get(i))
                {
                    for(int j = 0; j < subjectController.getSubjectList().size(); j++)
                    {
                        if(i == j)
                        {
                            subjectController.ShowAlterSubjectView(subjectController.getSubjectList().get(j));
                        }
                    }
                }
            }
        }
    }
}
