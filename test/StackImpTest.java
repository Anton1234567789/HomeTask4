
import com.company.Stack;
import com.company.StackImp;
import org.omg.CORBA.Object;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StackImpTest {

   private Stack stackImpl = new StackImp(5);

   @Test
   public void testPush() throws Exception {
      stackImpl.push(new Integer(4));
      stackImpl.push(new Integer(5));
      stackImpl.push(new Integer(7));
      Assert.assertEquals(stackImpl.pop(), new Integer(7));

   }

}
