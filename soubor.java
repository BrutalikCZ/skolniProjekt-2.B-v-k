import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;


public class VypocetCislaDni
{

    private SimpleDateFormat sdf = new SimpleDateFormat("d.M.yyyy");
    private int result = 0;

    public VypocetCislaDni(String date1, String date2)
    {
        Date firstDate = getDate(date1);
        Date secondDate = getDate(date2);
        calculateDifference(firstDate, secondDate);
    }

    private void calculateDifference(Date dateNextBirthday, Date todaysDate) {
        this.result = (int) ((dateNextBirthday.getTime() - todaysDate.getTime()) / (24 * 60 * 60 * 1000)) ;
    }

    private Date getDate(String dateString)
    {
        Date todaysDate = new Date();
        if (dateString.equals("today")) {
                return todaysDate;
        }
        try {
            todaysDate = this.sdf.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return todaysDate;
    }

    public int get()
    {
        return this.result;
    }
}