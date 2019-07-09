import java.util.List;

public class Client{
    public static void main(String[] args){
        HonListAggregate honListAggregate = new HonListAggregate();
        Iterator iterator = honListAggregate.createIterator();
        honListAggregate.add(new Hon("はらぺこあかむし", 820));
        honListAggregate.add(new Hon("ないたみどりむし", 560));
        honListAggregate.add(new Hon("たけあげひめ", 770));
        honListAggregate.add(new Hon("きょだいほうし", 490));

        iterator.first();
        while (! iterator.isDone()){
            Hon hon = (Hon)iterator.getItem();
            System.out.pritln(hon.getName());
            iterator.next();
        }
    }
}