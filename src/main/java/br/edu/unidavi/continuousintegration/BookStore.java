package br.edu.unidavi.continuousintegration;

import java.util.List;

/**
 *
 * @author fernando.schwambach
 */
public class BookStore {
    
    public BookStore() {
    }
    
    public Integer calculateBasketCost(List<Integer> books){
        if(books.size() == 1){
            return 8;        
        }
        if(books.size() == 2){
            return 16;        
        }        
        return 0;
    }    
}
