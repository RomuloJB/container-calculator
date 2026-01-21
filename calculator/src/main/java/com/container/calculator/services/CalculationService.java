package com.container.calculator.services;

import org.springframework.stereotype.Service;

import com.container.calculator.models.Calculation;

@Service
public class CalculationService {
    
    public Calculation calculate (Calculation calculation){
        Double finalCost = calculation.getInitialCost() 
            * (1 + calculation.getTaxPercentage() / 100) 
            * calculation.getDollarPrice();
        
        calculation.setFinalCost(finalCost);
        
        // Step 2: Calculate sale price
        // salePrice = finalCost * (1 + profitPercentage/100)
        Double salePrice = finalCost * (1 + calculation.getProfitPercentage() / 100);
        
        calculation.setSalePrice(salePrice);
        
        return calculation;
    }
    
}
