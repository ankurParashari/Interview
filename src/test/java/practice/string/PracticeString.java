package practice.string;

//import com.sun.org.glassfish.gmbal.Description;
import practice.random.RandomNumAndPatterns;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeString {
    String name = "          Possibly Its Not known";
    String anotherName = "possibly its not known";

    @Test (priority = 3)
  //  @Description(value = "not sure")
    public void test_003_differentStringMethods() {


        System.out.println("Result after converting to lowerCase:\n"+ name.toLowerCase().trim());
        System.out.println("Main string contains 'its'"+ name.toLowerCase().trim().contains("its"));
        System.out.println("Main string without spaces looks like:"+name.trim());
        System.out.println("Character present at index 15 is:"+name.charAt(15));
        System.out.println("Index of letter Y is:"+name.indexOf("y"));

    }

    @Test(priority = 1, groups = "regression", suiteName = "not known")


    public void test001_CheckAssertions(){

        Assert.assertEquals(name.indexOf("y"),17);
        Assert.assertEquals(name.toLowerCase().trim().contains("its"),true);
        Assert.assertTrue(name.toLowerCase().trim().contains("its"));
        Assert.assertEquals(name.toLowerCase().trim().contains("nothing"), false);
    }

    @Test(priority = 2)
    public void test003_randomCheck(){

        RandomNumAndPatterns pc = new RandomNumAndPatterns();
        String randomString = pc.givenUsingJava8_whenGeneratingRandomAlphanumericString_thenCorrect();
        Assert.assertEquals(randomString.length(),20);
        if(randomString.length() == 29){

            System.out.println("random number generation is working fine");

        }else {
            System.out.println("Check the random number method - its not working fine");
        }
    }
    @Test
    public void test004_PatternPrint(){

        RandomNumAndPatterns obj = new RandomNumAndPatterns();
        obj.practicePatternOne();
        obj.practicePatternTwo();

    }

}






