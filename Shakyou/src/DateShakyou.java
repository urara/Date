import java.util.Date;
import sun.util.calendar.BaseCalendar;
import sun.util.calendar.CalendarSystem;

public class DateShakyou implements java.io.Serializable, Cloneable{

	

	//�O���S���A���J�����_�[�̎擾
	private static final BaseCalendar gcal = CalendarSystem.getGregorianCalendar();
	
	//�����E�X���J�����_�[�p
	private static BaseCalendar jcal;
	
	private transient long fastTime;
	
	private transient BaseCalendar.Date cdate;
	
	private static int defaultCenturyStart;
		
	private static final long serialVersionUID = 1L;
	
	public DateShakyou(){
		this(System.currentTimeMillis());
	}

	public DateShakyou(long date) {
		fastTime = date;
	}
	
}
