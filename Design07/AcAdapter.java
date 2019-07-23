class AcAdapter extends Dengen{
    private JapaneseConsent a = new JapaneseConsent();

    public int kyuuden(){
        return (int)(a.power() * 0.16);
    }
}