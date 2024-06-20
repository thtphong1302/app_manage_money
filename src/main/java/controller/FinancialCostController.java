package controller;

import lombok.AllArgsConstructor;
import service.FinancialCostService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@AllArgsConstructor
public class FinancialCostController implements ActionListener {
    private final FinancialCostService financialCostService;

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        switch (button) {

        }
    }
}
