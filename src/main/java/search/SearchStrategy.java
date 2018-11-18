package search;

import core.BitTexDatabase;

public interface SearchStrategy {
    public void search(BitTexDatabase bitTexDatabase, String input);
}
