/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SubjectController;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author Lucas
 */
public class RegisterSubjectView extends JFrame implements ActionListener
{
    //
    // Controller das matérias
    //
    SubjectController subjectController;
    
    //
    // Horário de início da aula
    //
    String[] startTime =    {
                                "Escolher Horário",
                                "7:00",
                                "7:30",
                                "8:00",
                                "8:30",
                                "9:00",
                                "9:30",
                                "10:00",
                                "10:30",
                                "11:00",
                                "11:30",
                                "12:00",
                                "12:30",
                                "13:00",
                                "13:30",
                                "14:00",
                                "14:30",
                                "15:00",
                                "15:30",
                                "16:00",
                                "16:30",
                                "17:00",
                                "17:30",
                                "18:00",
                                "18:30",
                                "19:00",
                                "19:30",
                                "20:00",
                                "20:30",
                                "21:00",
                                "21:30",
                                "22:00",
                                "22:30",
                                "23:00",
                                "23:30",
                                "00:00",
                            };
    
    //
    // Horário de término da aula
    //
    String[] endTime =    {
                                "Escolher Horário",
                                "7:00",
                                "7:30",
                                "8:00",
                                "8:30",
                                "9:00",
                                "9:30",
                                "10:00",
                                "10:30",
                                "11:00",
                                "11:30",
                                "12:00",
                                "12:30",
                                "13:00",
                                "13:30",
                                "14:00",
                                "14:30",
                                "15:00",
                                "15:30",
                                "16:00",
                                "16:30",
                                "17:00",
                                "17:30",
                                "18:00",
                                "18:30",
                                "19:00",
                                "19:30",
                                "20:00",
                                "20:30",
                                "21:00",
                                "21:30",
                                "22:00",
                                "22:30",
                                "23:00",
                                "23:30",
                                "00:00",
                            };
    
    //
    // Labels
    //
    JLabel labelSubjectName, labelSubjectSign, labelSubjectHour, labelMonday, labelTuesday, labelWednesday, labelThursday, labelFriday, labelSaturday, labelTo;
    
    //
    // Text Fields
    //
    JTextField tfSubjectName, tfSubjectSign;
    
    //
    // Lista dos horários
    //
    JComboBox startTimeMonday, endTimeMonday, startTimeTuesday, endTimeTuesday, startTimeWednesday, endTimeWednesday, startTimeThursday, endTimeThursday, startTimeFriday, endTimeFriday, startTimeSaturday, endTimeSaturday;
    
    //
    // Botão de Cadastrar
    //
    JButton registerButton, backButton;
    
    //
    // Painel
    //
    JPanel panel;
    
    /**
     * Construtor
     */
    public RegisterSubjectView(SubjectController paramSubjectController)
    {
        this.subjectController = paramSubjectController;
        
        //
        // Inicializa as labels
        //
        labelSubjectSign = new JLabel("Código da Disciplina");
        labelSubjectName = new JLabel("Nome da Disciplina");
        labelSubjectHour = new JLabel("Horário");
        labelMonday = new JLabel("Segunda Feira");
        labelTuesday = new JLabel("Terça Feira");
        labelWednesday = new JLabel("Quarta Feira");
        labelThursday = new JLabel("Quinta Feira");
        labelFriday = new JLabel("Sexta Feira");
        labelSaturday = new JLabel("Sábado");
        
        //
        // Inicializa os TextFields
        //
        tfSubjectSign = new JTextField(10);
        tfSubjectName = new JTextField(20);
        
        //
        // Inicializando os JComboBox
        //
        startTimeMonday = new JComboBox(startTime);
        endTimeMonday = new JComboBox(endTime);
        startTimeTuesday = new JComboBox(startTime);
        endTimeTuesday = new JComboBox(endTime);
        startTimeWednesday = new JComboBox(startTime);
        endTimeWednesday = new JComboBox(endTime);
        startTimeThursday = new JComboBox(startTime);
        endTimeThursday = new JComboBox(endTime);
        startTimeFriday = new JComboBox(startTime);
        endTimeFriday = new JComboBox(endTime);
        startTimeSaturday = new JComboBox(startTime);
        endTimeSaturday = new JComboBox(endTime);
        
        //
        // Inicializando botões
        //
        registerButton = new JButton("Cadastrar");
        registerButton.addActionListener(this);
        
        backButton = new JButton("Voltar");
        backButton.addActionListener(this);
        //
        // Inicializa o painel e adiciona os componentes
        //
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(labelSubjectSign);
        panel.add(tfSubjectSign);
        panel.add(labelSubjectName);
        panel.add(tfSubjectName);
        panel.add(labelSubjectHour);
        panel.add(labelMonday);
        panel.add(startTimeMonday);
        panel.add(endTimeMonday);
        panel.add(labelTuesday);
        panel.add(startTimeTuesday);
        panel.add(endTimeTuesday);
        panel.add(labelWednesday);
        panel.add(startTimeWednesday);
        panel.add(endTimeWednesday);
        panel.add(labelThursday);
        panel.add(startTimeThursday);
        panel.add(endTimeThursday);
        panel.add(labelFriday);
        panel.add(startTimeFriday);
        panel.add(endTimeFriday);
        panel.add(labelSaturday);
        panel.add(startTimeSaturday);
        panel.add(endTimeSaturday);
        panel.add(registerButton);
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
            subjectController.RegisterSubject  (
                                                tfSubjectSign.getText(),
                                                tfSubjectName.getText(),
                                                labelMonday.getText(),
                                                startTimeMonday.getSelectedItem().toString(),
                                                endTimeMonday.getSelectedItem().toString(),
                                                labelTuesday.getText(),
                                                startTimeTuesday.getSelectedItem().toString(),
                                                endTimeTuesday.getSelectedItem().toString(),
                                                labelWednesday.getText(),
                                                startTimeWednesday.getSelectedItem().toString(),
                                                endTimeWednesday.getSelectedItem().toString(),
                                                labelThursday.getText(),
                                                startTimeThursday.getSelectedItem().toString(),
                                                endTimeThursday.getSelectedItem().toString(),
                                                labelFriday.getText(),
                                                startTimeFriday.getSelectedItem().toString(),
                                                endTimeFriday.getSelectedItem().toString(),
                                                labelSaturday.getText(),
                                                startTimeSaturday.getSelectedItem().toString(),
                                                endTimeSaturday.getSelectedItem().toString()
                                            );

            this.dispose();
        }
    }
}
