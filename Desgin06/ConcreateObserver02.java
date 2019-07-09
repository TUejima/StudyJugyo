class JyuurokushinHyouji implements Observer{
    public void update(Subject s){
        print(((Suuchi)s).getValue());
    }

    private void print(int n){
        System.out.println(n + "を16進数で表示します");
        final String hex = Integer.toHexString(n);
        System.out.println(hex);
    }
}