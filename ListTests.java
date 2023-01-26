import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;


public class ListTests {
    public class StringCheckerClass implements StringChecker{
        private String myString;
    
        public StringCheckerClass(String s){
            myString = s; 
        }
    
        @Override
        public boolean checkString(String s){
            return s.equals(myString);
        }
    }

    ArrayList<String> input1 = new ArrayList<>(); 
    ArrayList<String> input2 = new ArrayList<>(); 


    @Test
    public void testFilterEmpty(){
        StringCheckerClass scc = new StringCheckerClass("banana");
        ArrayList<String> empty = new ArrayList<>(); 
        assertEquals(empty , ListExamples.filter(input1, scc));
    }

    @Test 
    public void testFilterNotUsed(){
        StringCheckerClass scc = new StringCheckerClass("banana");
        input2.add("bananas");
        input2.add("i like bananas");
        input2.add("sea cucumbers");
        assertEquals(input1, ListExamples.filter(input2, scc));
    }

    @Test 
    public void testFilterUsed(){
        StringCheckerClass scc = new StringCheckerClass("bananas");
        input2.add("bananas");
        input2.add("eels");
        input2.add("monkeys");
        input2.add("bananas");
        ArrayList<String> bananas = new ArrayList<>(); 
        bananas.add("bananas");
        bananas.add("bananas");
        assertEquals(bananas, ListExamples.filter(input2, scc));
    }

    @Test
    public void testMerge(){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("c");
        list1.add("e");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("d");
        list2.add("f");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add("e");
        list3.add("f");
        assertEquals(list3, ListExamples.merge(list1, list2));
    }
}