/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Lucas
 */
public class Schedule
{
    //
    // Dia
    //
    private String day;
    
    //
    // Horário de início
    //
    private String startHour;
    
    //
    // Horário de término
    //
    private String endHour;
    
    /**
     * Construtor
     * @param day
     * @param startHour
     * @param endHour 
     */
    public Schedule(String day, String startHour, String endHour)
    {
        this.day = day;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public String getDay()
    {
        return day;
    }

    public void setDay(String day)
    {
        this.day = day;
    }

    public String getStartHour()
    {
        return startHour;
    }

    public void setStartHour(String startHour)
    {
        this.startHour = startHour;
    }

    public String getEndHour()
    {
        return endHour;
    }

    public void setEndHour(String endHour)
    {
        this.endHour = endHour;
    }
}
