package core.factory;

import core.Attributes;
import core.BibTeXEntity;
import core.records.Book;
import exception.InvalidateException;

import java.util.Map;

public class ArticleFactory extends AbstractFactory {

    public static BibTeXEntity createEntity(Map<Attributes, String> records, String key) throws InvalidateException {
        return new Book(null, null);
    }

}
