/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.AlterSubjectView;
import View.RegisterSubjectView;
import View.ScheduleView;
import View.SubjectListView;

/**
 *
 * @author Lucas
 */
public class MainController
{
    //
    // View de cadastro de matéria
    //
    RegisterSubjectView registerSubjectView;
    
    //
    // View que mostra todas as disciplinas cadastradas
    //
    SubjectListView subjectListView;
    
    //
    // View do horário
    //
    ScheduleView scheduleView;
    
    //
    // Controller das matérias
    //
    SubjectController subjectController;
    
    /**
     * Construtor
     */
    public MainController()
    {
        subjectController = new SubjectController();
    }
    
    public void ShowRegisterSubjectView()
    {
        registerSubjectView = new RegisterSubjectView(subjectController);
    }
    
    public void ShowSubjectListView()
    {
        subjectListView = new SubjectListView(subjectController);
    }
    
    public void ShowScheduleView()
    {
        // TODO
    }
}
