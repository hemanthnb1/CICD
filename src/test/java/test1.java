import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

    @Test
    void test(){
        Main main = new Main();
        Assert.assertEquals(main.prnt(),"Helloworld");
    }

}
