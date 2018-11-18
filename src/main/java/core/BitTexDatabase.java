package core;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class BitTexDatabase {

    LinkedList<BibTeXEntity> elements = new LinkedList<>();


    public void put(BibTeXEntity bibTeXEntity){
        elements.add(bibTeXEntity);
    }

}