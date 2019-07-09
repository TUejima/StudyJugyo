import java.util.List;

class HonListAggregate implements Aggregate {
    private Hon[] list = new Hon[20];
    private int numberOfStock;

    @Override
    public Iterator createItetator(){
        return new HonListIterator(this);
    }

    public void add(Hon hon){
        list[numberOfStock] = hon;
        numberOfStock += 1;
    }

    public Object getAt(int number){
        return list[number];
    }

    public int getNumberOfStock(){
        return numberOfStock;
    }
}