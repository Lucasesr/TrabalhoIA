/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Schedule;
import Model.Subject;
import View.AlterSubjectView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class SubjectController
{
    //
    // View de alterar matéria
    //
    AlterSubjectView alterSubjectView;
    
    private List<Subject> subjectList;
    
    private int priority = 3;
    
    /**
     * Construtor
     */
    public SubjectController()
    {
        subjectList = new ArrayList<Subject>();
    }
    
    /**
     * Método que cadastra a materia
     * @param paramName
     * @param paramSign
     * @param paramInitHour
     * @param paramEndHour 
     */
    public void RegisterSubject (
                                    String paramSign, String paramName,
                                    String monday, String startTimeMonday, String endTimeMonday,
                                    String tuesday, String startTimeTuesday, String endTimeTuesday,
                                    String wednesday, String startTimeWednesday, String endTimeWednesday,
                                    String thursday, String startTimeThursday, String endTimeThursday,
                                    String friday, String startTimeFriday, String endTimeFriday,
                                    String saturday, String startTimeSaturday, String endTimeSaturday
                                )
    {
        List<Schedule> auxScheduleList = new ArrayList<Schedule>();
        
        //
        // Verifica qual dia foi setado um horário de inicio e de término
        //
        if(!startTimeMonday.equalsIgnoreCase("Escolher Horário") && !endTimeMonday.equalsIgnoreCase("Escolher Horário"))
        {
            //
            // Cria o novo horário
            //
            Schedule auxSchedule = new Schedule(monday, startTimeMonday, endTimeMonday);
            
            //
            // Adiciona na lista de horários
            //
            auxScheduleList.add(auxSchedule);
        }
        
        if(!startTimeTuesday.equalsIgnoreCase("Escolher Horário") && !endTimeTuesday.equalsIgnoreCase("Escolher Horário"))
        {
            //
            // Cria o novo horário
            //
            Schedule auxSchedule = new Schedule(tuesday, startTimeTuesday, endTimeTuesday);
            
            //
            // Adiciona na lista de horários
            //
            auxScheduleList.add(auxSchedule);
        }
        
        if(!startTimeWednesday.equalsIgnoreCase("Escolher Horário") && !endTimeWednesday.equalsIgnoreCase("Escolher Horário"))
        {
            //
            // Cria o novo horário
            //
            Schedule auxSchedule = new Schedule(wednesday, startTimeWednesday, endTimeWednesday);
            
            //
            // Adiciona na lista de horários
            //
            auxScheduleList.add(auxSchedule);
        }
        
        if(!startTimeThursday.equalsIgnoreCase("Escolher Horário") && !endTimeThursday.equalsIgnoreCase("Escolher Horário"))
        {
            //
            // Cria o novo horário
            //
            Schedule auxSchedule = new Schedule(thursday, startTimeThursday, endTimeThursday);
            
            //
            // Adiciona na lista de horários
            //
            auxScheduleList.add(auxSchedule);
        }
        
        if(!startTimeFriday.equalsIgnoreCase("Escolher Horário") && !endTimeFriday.equalsIgnoreCase("Escolher Horário"))
        {
            //
            // Cria o novo horário
            //
            Schedule auxSchedule = new Schedule(friday, startTimeFriday, endTimeFriday);
            
            //
            // Adiciona na lista de horários
            //
            auxScheduleList.add(auxSchedule);
        }
        
        if(!startTimeSaturday.equalsIgnoreCase("Escolher Horário") && !endTimeSaturday.equalsIgnoreCase("Escolher Horário"))
        {
            //
            // Cria o novo horário
            //
            Schedule auxSchedule = new Schedule(saturday, startTimeSaturday, endTimeSaturday);
            
            //
            // Adiciona na lista de horários
            //
            auxScheduleList.add(auxSchedule);
        }
        
        //
        // Cria a nova matéria
        //
        Subject subject = new Subject(paramSign, paramName, priority, auxScheduleList);
        
        //
        // Adiciona na lista de matérias
        //
        subjectList.add(subject);
    }
    
    public void ShowAlterSubjectView(Subject paramSubject)
    {
        alterSubjectView = new AlterSubjectView(paramSubject, this);
    }
    
    public List<Subject> getSubjectList()
    {
        return subjectList;
    }

    public int getPriority()
    {
        return priority;
    }
}
