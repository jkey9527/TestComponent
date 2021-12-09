import com.java.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestTransactional {

    @Autowired
    private AccountService as;

    @Test
    public void test1(){
        as.account("tom","marry",500.00);
    }

    @Test
    public void test2(){
        as.account("tom","marry",500.00);
    }
}
