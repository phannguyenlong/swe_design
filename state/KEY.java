package state;

public enum KEY {
    A("a"),
    B("b"),
    C("c"),
    CAPS_LOCK,
    SHIFT;

    private String value;

    // contructor
    KEY() {}

    KEY(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
