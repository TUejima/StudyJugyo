interface Iterator{
    //取り出し位置を最初の要素へ変える
    public void first();
    //取り出し位置を次の要素へ変える
    public void next();
    //取り出し位置が最後を超えたか？
    public boolean isDone();
    //現在の取り出し位置から取り出す
    public Object getItem();
}