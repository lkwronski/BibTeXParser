package core.records;

import core.Attributes;
import core.BibTeXEntity;
import core.Record;

import java.util.List;
import java.util.Map;

public abstract class RecordField implements BibTeXEntity {
    public static List<Attributes> optionalString;
    public static List<Attributes> requiredString;

    final public Map<Attributes, String> records;
    final public String key;

    public RecordField(Map<Attributes,String> records, String key){
        this.records = records;
        this.key = key;
    }
}
