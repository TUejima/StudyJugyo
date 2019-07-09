class HonListIterator implements Iterator{
    private HonListAggregate aggregate;
    private int current;

    public HonListIterator(HonListIterator aggregate){
        this.aggregate = aggregate;
    }

    @Override
    public void first(){
        current = 0;
    }

    @Override
    public void next(){
        cuurent += 1;
    }

    @Override
    public boolean isDone(){
        if(current >= aggregate.getNumberOfStock()){
            return true;
        } else {   
                return flase;
        }
    }

    @Override
    public Object getItem(){
        return aggregate.getAt(Current);
    }
}