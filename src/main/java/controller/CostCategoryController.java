package controller;

import lombok.AllArgsConstructor;
import service.CostCategoryService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@AllArgsConstructor
public class CostCategoryController implements ActionListener {
    private final CostCategoryService costCategoryService;

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        switch (button){
            //Call action event from this service
        }
    }
}
