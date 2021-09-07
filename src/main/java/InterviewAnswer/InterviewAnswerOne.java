//package InterviewAnswer;
///* @ author: Ankur Parashari
//*  Date: 1st Sep 2021
//* Test given By: Bob Macaluso
//* */
//
//import java.lang.reflect.Array;
//import java.util.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import org.junit.Test;
//
//public class InterviewAnswerOne {
//    /**
//     * Testing general Java String function knowledge
//     *
//     */
//
//    @org.junit.Test
//    public void funWithJavaStrings() {
//
//        // 1. Assert that the word 'Clearing' is present in companyName string
//        String companyName = "Publishers Clearing House";
//        if (companyName.contains("Clearing")){
//            System.out.println("the word 'Clearing' is present in companyName string");
//        } else{
//            System.out.println("the word 'Clearing' is  not present in companyName string");;
//        } ;
//
//        // 2. Assert that name1 equals name2 regardless of case and leading/trailing spaces
//        String name1 = "  Bob Evens";
//        String name2 = "BOB EVENS   ";
//
//        if(name1.trim().equalsIgnoreCase(name2.trim())) {
//
//            System.out.println("String name1 is equal to String name2 ");
//        } else {
//            System.out.println("String name1 is not equal to String name2 ");
//        }
//        // 3. Convert the above 2 strings to integer values and display the sum
//        String intValue1 = "100";
//        String intValue2 = "20";
//
//        int a = Integer.parseInt(intValue1);
//        int b = Integer.parseInt(intValue2);
//        int sum = a+b;
//        System.out.println("Sum of String intValue1 & String intValue2 is " + sum);
//    }
//
//    /**
//     * Testing knowledge of java Lists The list 'myArrayList' has already been
//     * created and populated in @before method Follow steps outlined below
//     *
//     */
//
//    @org.junit.Test
//    public void funWithArrayLists() {
//        List<String> myArrayList = new ArrayList<String>();
//        myArrayList.add("Chrome");
//        myArrayList.add("FireFox");
//        myArrayList.add("IE");
//        myArrayList.add("Safari");
//        myArrayList.add("Chrome");
//
//        // Step 1 display the number of elements in myArrayList
//        System.out.println("array list has"+ " "+myArrayList.size()+ " "+ "Elements");
//
//        // Step 2 using enhanced for-loop loop through myArrayList and display all values to console
//        System.out.println("list of browsers:");
//        for (String n : myArrayList) {
//            System.out.println(n);
//        }
//
//        // Step 3 Display the 3rd element in myArrayList
//        System.out.println("3rd element in myArrayList" + " " +myArrayList.get(2));
//
//        // Step 4 Loop thru myArrayList to determine if any elements value  = 'IE' if yes, display 'IE found @ index' and the index number in the  console then exit the loop
//        if(myArrayList.contains("IE")){
//            System.out.println("index of IE browser is " + " "+myArrayList.indexOf("IE"));
//        }else{
//            System.out.println("Index of IE not known");
//        }
//
//        // Step 5 Loop thru myArrayList to determine if any list elements value  = 'Opera'  if not , display 'Opera not found'
//        if(myArrayList.contains("Opera")){
//            System.out.println("index of Opera browser is " + " "+myArrayList.indexOf("Opera"));
//        }else{
//            System.out.println("Opera Not Found");
//        }
//    }
//
//    /**
//     * Testing knowledge of java HashMaps Follow steps outlined below
//     *
//     */
//
//    @org.junit.Test
//    public void funWithHashMaps() {
//        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
//
//        // 1 . Load the following into myHashMap
//        // * Key: = 1 Value: = "XP" Key: = 2 Value: = "WIN7" Key: = 3 Value: = "WIN8"
//        myHashMap.put(1, "XP");
//        myHashMap.put(2, "WIN7");
//        myHashMap.put(3, "WIN8");
//
//        // Step 2 Display to console the value associated with key 2
//        System.out.println("the value at key 2 is" + myHashMap.get(2));
//
//        // Step 3 Display the number of elements in myHashMap
//        System.out.println("number of elements is: " + myHashMap.size());
//
//        // Step 4 Remove the last element in myHashMap and display the number of elements in myHashMap
//        myHashMap.remove(3);
//        System.out.println("number of elements is: " + myHashMap.size());
//    }
//
//    /**
//     * Testing knowledge of java HashSets Follow steps outlined below
//     *
//     */
//    @org.junit.Test
//    public void funWithHashSets() {
//
//        // * Step 1 Create a HashSet of String objects called myHashSet
//        Set<String> myHashSet = new HashSet<>();
//        /*
//         * Step 2 add the following String objecta to myHashSet "XP" "WIN7"
//         * "WIN8" "Safari" "XP"
//         */
//        myHashSet.add("XP");
//        myHashSet.add("WIN7");
//        myHashSet.add("WIN8");
//        myHashSet.add("Safari");
//        myHashSet.add("XP");
//        System.out.println("number of elements is :" + " " + myHashSet.size());
//        // Step 3 Display to console all the values of myHashSet ... hint use
//        // iterator
//        System.out.println("List of all elements : ");
//        Iterator itr = myHashSet.iterator();
//        while (itr.hasNext()) {
//             System.out.println(itr.next());
//        }
//
//        // Step 4 Remove from myHashSet where String = 'XP"
//        myHashSet.remove("XP");
//        // Step 5 Display to console the number of elements in myHashSet
//        System.out.println("number of elements after removing xp is :" + " " + myHashSet.size());
//
//    }
//
//}
//
