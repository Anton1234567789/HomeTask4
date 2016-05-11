
import com.company.Stack;
import com.company.StackImp;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
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
   @Test
   public void testPop() throws Exception{
   stackImpl.push(new Integer(5));
      stackImpl.print();
      Assert.assertEquals(stackImpl.pop(),new Integer(5));
   }
   @Test
   public void testClear() throws Exception{
      stackImpl.push(5);
      stackImpl.push(3);
      stackImpl.push(2);
      stackImpl.clear();
      Assert.assertEquals(stackImpl.pop(), null);
   }

}
