import org.junit.Test;

import com.shakyou.DateShakyou;

import static org.junit.Assert.*;
import java.util.Date;

public class DateShakyouTest {

	@Test
	public void constractorTest(){
		//引数無しでやってみる
		assertEquals( new Date().toString(),new DateShakyou().toString());
		
		//引数アリでやってみる
		//日にちまで
		//assertEquals( new Date(2011,1,1).toString(),new DateShakyou(2011,1,1).toString());
		
		
	}

	@Test
	public void methodTest(){
		assertEquals("" , "");
	}
	
	
}
