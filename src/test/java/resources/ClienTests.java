package resources;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.crud.CrTp3Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CrTp3Application.class)
//@TestPropertySource(locations="classpath:test.properties")
public class ClienTests {

	public ClienTests() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
    public void onePlusOneShouldBeTwo() {
        int sum = 1 + 1;
        assertEquals(2, sum);
    }
}
