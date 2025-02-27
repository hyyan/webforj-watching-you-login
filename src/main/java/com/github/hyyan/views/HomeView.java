package com.github.hyyan.views;

import com.github.hyyan.components.WatchingYou;
import com.webforj.component.Composite;
import com.webforj.component.login.Login;
import com.webforj.component.login.Login.PasswordMediation;
import com.webforj.router.annotation.FrameTitle;
import com.webforj.router.annotation.Route;

@Route(value = "/")
@FrameTitle("Login")
public class HomeView extends Composite<Login> {
  private Login self = getBoundComponent();

  public HomeView() {
    self.setPasswordMediation(PasswordMediation.SILENT);
    self.addToAfterHeader(new WatchingYou());
    self.open();
  }
}
