class NishinHyouji implements Observer{
    public void update(Subject s){
        print(((Suuchi)s).getValue());
    }

    private void print(int n){
        System.out.println(n + "を2進数で表示します");
        final String bin = Integer.toBinaryString(n);
        System.out.println(bin);
    }
}