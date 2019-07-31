package tests;
import static org.junit.Assert.assertEquals;

import org.junit.*;

import beans.UserBean;

public class UserTest {
	
   @Test
    public void testVerifyIsOwner() throws Exception {
       boolean expectedValue = true;
       UserBean app=new UserBean();
       boolean actualValue=app.isOwnerUser("wara");
       assertEquals(expectedValue, actualValue);
    }
   
   @Test
   public void testVerifyUserOnlyString() throws Exception {
      boolean expectedValue = true;
      UserBean app=new UserBean();
      boolean actualValue=app.onlyChars("wara");
      assertEquals(expectedValue, actualValue);
   }   
   
   @Test
   public void testVerifyuserNoMoreThanSixChars() throws Exception {
      boolean expectedValue = true;
      UserBean app=new UserBean();
      boolean actualValue=app.userNoMoreThanSixChars("Teresa");
      assertEquals(expectedValue, actualValue);
   }   
}