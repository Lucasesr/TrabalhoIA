/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SubjectController;
import Model.Subject;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lucas
 */
public class AlterSubjectView extends JFrame implements ActionListener
{
    //
    // Controller das matérias
    //
    SubjectController subjectController;
    
    //
    // Matéria passada como parâmetro
    //
    Subject subject;
    
    //
    // Labels
    //
    JLabel labelSubjectName, labelSubjectInfoName, labelSubjectSign, labelSubjectInfoSign, labelSubjectPriority, labelSubjectHour, labelSubjectInfoHour;
    
    //
    // Text Fields
    //
    JTextField tfSubjectPriority;
    
    //
    // Botões
    //
    JButton editButton, saveButton, cancelButton, backButton;
    
    //
    // Painel
    //
    JPanel panel;
    
    /**
     * Construtor
     */
    public AlterSubjectView(Subject paramSubject, SubjectController paramSubjectController)
    {
        this.subjectController = paramSubjectController;
        this.subject = paramSubject;
        
        String message = "";
        
        //
        // Inicializa as labels
        //
        labelSubjectSign = new JLabel("Código da Disciplina");
        labelSubjectName = new JLabel("Nome da Disciplina");
        labelSubjectPriority = new JLabel("Prioridade");
        labelSubjectHour = new JLabel("Horário");
        
        labelSubjectInfoSign = new JLabel(subject.getSign());
        labelSubjectInfoName = new JLabel(subject.getName());
        
        for(int j = 0; j < subject.getSchedule().size(); j++)
        {
            message +=  subject.getSchedule().get(j).getDay() +
                        " das " + subject.getSchedule().get(j).getStartHour() +
                        " às " + subject.getSchedule().get(j).getEndHour() + "\n";
        }
        
        labelSubjectInfoHour = new JLabel(message);
        
        tfSubjectPriority = new JTextField(subject.getPriority() + "");
        tfSubjectPriority.setEditable(false);
        
        editButton = new JButton("Alterar");
        editButton.addActionListener(this);
        
        cancelButton = new JButton("Cancelar");
        cancelButton.setEnabled(false);
        cancelButton.addActionListener(this);
        
        saveButton = new JButton("Salvar");
        saveButton.setEnabled(false);
        saveButton.addActionListener(this);
        
        backButton = new JButton("Voltar");
        backButton.addActionListener(this);
        
        
        //
        // Inicializa o painel e adiciona os componentes
        //
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        panel.add(labelSubjectSign);
        panel.add(labelSubjectInfoSign);
        panel.add(labelSubjectName);
        panel.add(labelSubjectInfoName);
        panel.add(labelSubjectPriority);
        panel.add(tfSubjectPriority);
        panel.add(labelSubjectHour);
        panel.add(labelSubjectInfoHour);
        
        panel.add(editButton);
        panel.add(saveButton);
        panel.add(cancelButton);
        panel.add(backButton);
        
        this.add(panel, BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == editButton)
        {
            cancelButton.setEnabled(true);
            saveButton.setEnabled(true);
            editButton.setEnabled(false);
            
            tfSubjectPriority.setEditable(true);
        }
        
        if(e.getSource() == cancelButton)
        {
            cancelButton.setEnabled(false);
            saveButton.setEnabled(false);
            editButton.setEnabled(true);
            
            tfSubjectPriority.setText(subject.getPriority() + "");
            tfSubjectPriority.setEditable(false);
        }
        
        if(e.getSource() == saveButton)
        {
            cancelButton.setEnabled(false);
            saveButton.setEnabled(false);
            editButton.setEnabled(true);
            
            tfSubjectPriority.setEditable(false);
            
            for(int i = 0; i < subjectController.getSubjectList().size(); i++)
            {
                if(subject == subjectController.getSubjectList().get(i))
                {
                    subjectController.getSubjectList().get(i).setPriority(Integer.parseInt(tfSubjectPriority.getText()));
                }
            }
        }
        
        if(e.getSource() == backButton)
        {
            this.dispose();
        }
    }
}
