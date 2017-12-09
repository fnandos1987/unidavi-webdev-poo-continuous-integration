package br.edu.unidavi.continuousintegration;

import java.util.List;

/**
 *
 * @author fernando.schwambach
 */
public class BookStore {
    
    public double calculateBasketCost(List<Integer> books){
        if(books.size() == 1){
            return 8.0;        
        }
        if(books.size() == 2){
            return 16.0;        
        }        
        return 0.0;
    }    
}
