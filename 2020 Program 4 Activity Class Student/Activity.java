/**
 * Write a description of class Activity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activity
{
    private int startTime;
    private int duration;
    private int endTime;
    private String name;
    private String day;
     
    public Activity() {
        startTime = 0;
        duration = 0;
        name = "Unknown";
        day = "Unknown";
        endTime = 0;
    }
    
    public Activity(String name, String day, int startTime, int duration) {
        startTime = 0;
        duration = 0;
        name = "Unknown";
        day = "Unknown";
        endTime = 0;
    }
    
    public int getStart() {
        return startTime;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDay() {
        return day;
    }
    
    public void setStart() {
        this.startTime = startTime;
    }
    
    public void setDur() {
        this.duration = duration;
    }
    
    public void setName(String Name) {
        this.name = name;
    }
    
    public void setDay(String day) {
        this.day = day;
    }
    
    public int getEnd() {
        
        int start = getStart();
        int dur = getDuration();
        
        
        int hours = start / 100;
        int mins = start % 100;
        int result = 0;
        mins += dur;
        
        while (mins >= 60) {
            if (mins <= 60) {
                hours += 1;
                mins -= 60;
            }
        }
        
        result += hours*100;
        result += mins;
        return result;
    }
    
    public String toString() {
        return name + "\t" + day + "\t" + startTime + "\t" + endTime;
    }
    
    public boolean overlap(Activity obj1, Activity obj2) {
        
        int start = obj1.getStart();
        int end = obj1.getEnd();
        
        int start2 = obj2.getStart();
        int end2 = obj2.getEnd();
        
        
        
        if (obj1.getDay().equals(getDay())) {
            if (start >= start2 && start < end2) {
                return true;
            } else if (start2 >= start && start2 < end) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}