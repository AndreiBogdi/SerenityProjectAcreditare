package org.fasttrackit.features;

import org.junit.Test;

public class SearchByPrice extends BaseTest{
    @Test
    public void SearchByPrice(){
        searchSteps.executeSearch("SILVER DESERT NECKLACE");
        searchSteps.pressSort();


    }
}
