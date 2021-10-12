import java.util.ArrayList;

public class TwoDArrayLists {
    public static void main(String[] args) throws Exception {
        
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("pizza");
        bakeryList.add("bread");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("banana");
        produceList.add("apple");
        produceList.add("lemon");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("coffee");
        drinksList.add("tea");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);


    }
}
