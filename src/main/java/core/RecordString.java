package core;

public class RecordString implements  BibTeXEntity {
    private String key;
    private String value;

    public RecordString(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
