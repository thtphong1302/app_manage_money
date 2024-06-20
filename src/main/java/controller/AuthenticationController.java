package controller;

import lombok.AllArgsConstructor;
import model.User;
import service.AuthenticationService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@AllArgsConstructor
public class AuthenticationController implements ActionListener {
    private final AuthenticationService authenticationService;


    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonName = e.getActionCommand();
        switch (buttonName) {
            //Call action event from service
        }
    }
}
