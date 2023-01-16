package mediator;

import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends Frame implements ActionListener, Mediator {
  private ColleagueCheckbox checkGuest;
  private ColleagueCheckbox checkLogin;
  private ColleagueTextField textUser;
  private ColleagueTextField textPass;
  private ColleagueButton buttonOk;
  private ColleagueButton buttonCancel;

  public LoginFrame(String title) {
    super(title);
    setBackground(Color.lightGray);
    setLayout(new GridLayout(4, 2));
    createColleagues();
    add(checkGuest);
    add(checkLogin);
    add(new Label("Username:"));
    add(textUser);
    add(new Label("Password:"));
    add(textPass);
    add(buttonOk);
    add(buttonCancel);
    colleagueChanged(checkGuest);
    pack();
    setVisible(true);
  }

  public void createColleagues() {
    CheckboxGroup g = new CheckboxGroup();
    checkGuest = new ColleagueCheckbox("Guest", g, true);
    checkLogin = new ColleagueCheckbox("Login", g, false);
    textUser = new ColleagueTextField("", 10);
    textPass = new ColleagueTextField("", 10);
    textPass.setEchoChar('*');
    buttonOk = new ColleagueButton("OK");
    buttonCancel = new ColleagueButton("Cancel");
    checkGuest.setMediator(this);
    checkLogin.setMediator(this);
    textUser.setMediator(this);
    textPass.setMediator(this);
    buttonOk.setMediator(this);
    buttonCancel.setMediator(this);
    checkGuest.addItemListener(checkGuest);
    checkLogin.addItemListener(checkLogin);
    textUser.addTextListener(textUser);
    textPass.addTextListener(textPass);
    buttonOk.addActionListener(this);
    buttonCancel.addActionListener(this);
  }

  public void colleagueChanged(Colleague c) {
    if (c == checkGuest || c == checkLogin) {
      if (checkGuest.getState()) {
        textUser.setColleagueEnabled(false);
        textPass.setColleagueEnabled(false);
        buttonOk.setColleagueEnabled(true);
      } else {
        textUser.setColleagueEnabled(true);
        userpassChanged();
      }
    } else if (c == textUser || c == textPass) {
        userpassChanged();
    } else {
        System.out.println("colleagueChanged:unknown colleague = " + c);
    }
  }

  private void userpassChanged() {
    if (textUser.getText().length() > 0) {
      textPass.setColleagueEnabled(true);
      if (textPass.getText().length() > 0) {
        buttonOk.setColleagueEnabled(true);
      } else {
        buttonOk.setColleagueEnabled(false);
      }
    } else {
      textPass.setColleagueEnabled(false);
      buttonOk.setColleagueEnabled(false);
    }
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("" + e);
    System.exit(0);
  }
}
