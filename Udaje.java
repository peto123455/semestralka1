public enum Udaje {
    MINUTY("minuty", -1),
    SEKUNDY("sekundy", -1);

    private String string;
    private int pociatocnaHodnota;

    Udaje(String string, int pociatocnaHodnota) {
        this.string = string;
        this.pociatocnaHodnota = pociatocnaHodnota;
    }

    public String getString() {
        return this.string;
    }

    public int getPociatocnaHodnota() {
        return this.pociatocnaHodnota;
    }
}
