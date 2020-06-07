package com.revature.libraryconsoleapp.menu;

import com.revature.libraryconsoleapp.models.User;

public class SessionMenuFactory {

    public ISessionMenu createSession(User user) {
      ISessionMenu sessionMenu = null;

      switch (user.getAccess()) {
          case ADMIN:
              sessionMenu = new AdminMenu();
              break;

          case PATRON:
              sessionMenu = new PatronMenu();
              break;
      }
      return sessionMenu;
    }
}
