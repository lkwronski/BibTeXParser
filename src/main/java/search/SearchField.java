package search;

import core.BitTexDatabase;

import java.util.List;
import java.util.Map;

public class SearchField {

    BitTexDatabase bitTexDatabase;

    public SearchField(BitTexDatabase bitTexDatabase) {
        this.bitTexDatabase = bitTexDatabase;
    }


    public void search(Map<SearchStrategy, String> searchStrategyStringMap){
        for (Map.Entry<SearchStrategy, String> searchStrategyStringEntry : searchStrategyStringMap){
            searchStrategyStringEntry.getKey().search(bitTexDatabase, searchStrategyStringEntry.getValue());
        }
    }

}
