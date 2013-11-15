/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MainController;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class MainView extends JFrame
{
    MainController mainController;
    
    //
    // Botão pra chamar view de registrar matéria
    //
    JButton registerButton;
    
    //
    // Botão pra chamar view de alterar matéria
    //
    JButton alterButton;
    
    //
    // Botão pra chamar view para ver o horário
    //
    JButton scheduleButton;
    
    //
    // Painel
    //
    JPanel panel;
    
    /**
     * Construtor
     */
    public MainView()
    {
        mainController = new MainController();
        
        //
        // Inicializa os botões
        //
        registerButton = new JButton("Cadastrar Matéria");
        registerButton.addActionListener (
                                            new ActionListener()
                                            {
                                                @Override
                                                public void actionPerformed(ActionEvent e)
                                                {
                                                    mainController.ShowRegisterSubjectView();
                                                }
                                            }
                                          );
        
        alterButton = new JButton("Alterar Matéria");
        alterButton.addActionListener (
                                            new ActionListener()
                                            {
                                                @Override
                                                public void actionPerformed(ActionEvent e)
                                                {
                                                    mainController.ShowSubjectListView();
                                                }
                                            }
                                          );
        
        scheduleButton = new JButton("Ver Horário");
        scheduleButton.addActionListener (
                                            new ActionListener()
                                            {
                                                @Override
                                                public void actionPerformed(ActionEvent e)
                                                {
                                                    mainController.ShowScheduleView();
                                                }
                                            }
                                          );
        
        //
        // Inicializa o painel e adiciona os componentes
        //
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(registerButton);
        panel.add(alterButton);
        panel.add(scheduleButton);
        
        this.add(panel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
