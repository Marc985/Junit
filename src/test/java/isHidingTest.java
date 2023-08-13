import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class isHidingTest {


    @Test
    public   void  test1(){
        Assertions.assertTrue(isHiding.isHidingAnOption("X...C.....A"));
    }
    @Test
    public  void test2(){
        Assertions.assertFalse(isHiding.isHidingAnOption("X........C..A"));
    }
    @Test
    public void  test3(){
        Assertions.assertFalse(isHiding.isHidingAnOption("X....A.C.....C.C"));
    }
}
