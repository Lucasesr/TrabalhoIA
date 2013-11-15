/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Lucas
 */
public class Subject
{
    //
    // Sigla
    //
    private String sign;
    
    //
    // Nome da Matéria
    //
    private String name;
    
    //
    // Prioridade
    //
    private int priority;
    
    //
    // Lista dos dias da matéria
    //
    private List<Schedule> schedule;
    
    /**
     * Construtor
     * @param name
     * @param sign
     * @param priority
     * @param schedule 
     */
    public Subject(String sign, String name, int priority, List<Schedule> schedule)
    {
        this.sign = sign;
        this.name = name;
        this.priority = priority;
        this.schedule = schedule;
    }
    
    public String getSign()
    {
        return sign;
    }

    public void setSign(String sign)
    {
        this.sign = sign;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getPriority()
    {
        return priority;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    public List<Schedule> getSchedule()
    {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule)
    {
        this.schedule = schedule;
    }
}
