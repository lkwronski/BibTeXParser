package core.records;

import core.Attributes;

import java.util.Map;

import static core.Attributes.*;

public class Book extends RecordField {

    public static final Attributes[] requiredFields = {EDITOR, TITLE, PUBLISHER, YEAR};
    public static final Attributes[] optionalFields = {VOLUME, SERIES, ADDRESS, EDITION, MONTH, NOTE, KEY};

    public Book(Map<Attributes, String> records, String key) {
        super(records, key);
    }
}
