package service;

import java.util.List;

public interface CostCategoryService {
    List<CostCategoryService> getCostCategory(Long userID);
    void createCostCategory(Object o);
    void updateCostCategory(Object o);
    void deleteCostCategory(Object o);
}
