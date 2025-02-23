import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {
@Test
@DisplayName("")
void createIntArrayTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {};
        Method method = testClass.getDeclaredMethod("createIntArray", cArg);
  // Enter code here
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ( int[])method.invoke(null));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}

   @Test
   @DisplayName("")
   void createArrayTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class, String.class, String.class };
         Method method = testClass.getDeclaredMethod("createArray", cArg);
         // Enter code here
         assertArrayEquals(new String[] { "1", "2", "3", "4" }, (String[]) method.invoke(null, "1", "2", "3", "4"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void createArrayTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class, String.class, String.class };
         Method method = testClass.getDeclaredMethod("createArray", cArg);
         // Enter code here
         assertArrayEquals(new String[] { "d", "c", "b", "a" }, (String[]) method.invoke(null, "d", "c", "b", "a"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findThirdValueTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String[].class };
         Method method = testClass.getDeclaredMethod("findThirdValue", cArg);
         // Enter code here
         assertEquals(5,
               (int) method.invoke(null, "help", new String[] { "okay", "HELP", "heal", "help", "help", "help" }));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findThirdValueTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String[].class };
         Method method = testClass.getDeclaredMethod("findThirdValue", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, "okay", new String[] { "okay", "okay", "HELP", "heal", "help" }));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findThirdValueTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String[].class };
         Method method = testClass.getDeclaredMethod("findThirdValue", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, "a", new String[] { "okay", "HELP", "heal", "help" }));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findThirdValueTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String[].class };
         Method method = testClass.getDeclaredMethod("findThirdValue", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, "HEAL", new String[] { "okay", "HELP", "heal", "help" }));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findThirdValueTest6() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String[].class };
         Method method = testClass.getDeclaredMethod("findThirdValue", cArg);
         // Enter code here
         assertEquals(2, (int) method.invoke(null, "okay", new String[] { "okay", "okay", "okay", "okay" }));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findThirdValueTest7() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String[].class };
         Method method = testClass.getDeclaredMethod("findThirdValue", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, "okay", new String[] { "okay", "okay", "OKAY" }));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findValueTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int[].class };
         Method method = testClass.getDeclaredMethod("findValue", cArg);
         // Enter code here
         assertEquals(3, (int) method.invoke(null, 3, new int[] { 0, 1, 2, 3 }));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findValueTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int[].class };
         Method method = testClass.getDeclaredMethod("findValue", cArg);
         // Enter code here
         assertEquals(0, (int) method.invoke(null, 0, new int[] { 0, 1, 2, 3 }));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findValueTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int[].class };
         Method method = testClass.getDeclaredMethod("findValue", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, 10, new int[] { 0, 1, 2, 3 }));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findValueTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int[].class };
         Method method = testClass.getDeclaredMethod("findValue", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, 3, new int[] {}));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findValueTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int[].class };
         Method method = testClass.getDeclaredMethod("findValue", cArg);
         // Enter code here
         assertEquals(0, (int) method.invoke(null, 3, new int[] { 3, 3, 3, 3 }));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void findThirdValueTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String[].class };
         Method method = testClass.getDeclaredMethod("findThirdValue", cArg);
         // Enter code here
         assertEquals(-1, (int) method.invoke(null, "okay", new String[] {}));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }
}
