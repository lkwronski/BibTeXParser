package core.records;

import core.Attributes;
import core.Record;

import java.util.Map;

import static core.Attributes.*;

public class Article extends RecordField {

    public static final Attributes[] requiredFields = {AUTHOR, TITLE, JOURNAL, YEAR};
    public static final Attributes[] optionalFields = {VOLUME, NUMBER, PAGES, MONTH, NOTE, KEY};

    public Article(Map<Attributes, String> records, String key) {
        super(records, key);
    }

}
