package com.github.hyyan.components;

import com.webforj.annotation.Attribute;
import com.webforj.annotation.JavaScript;
import com.webforj.annotation.StyleSheet;
import com.webforj.component.Composite;
import com.webforj.component.html.elements.Div;

@JavaScript(value = "ws://watching-you.js", attributes = {
    @Attribute(name = "type", value = "module") })
@StyleSheet("ws://watching-you.css")
public class WatchingYou extends Composite<Div> {
  private Div self = getBoundComponent();

  public WatchingYou() {
    self.addClassName("watching-you");
    setMarkup();
  }

  private void setMarkup() {
    self.setHtml(/* html */"""
          <div class="face">
            <div class="eyes">
              <div class="eye" id="eye1">
                <div class="eyeball" id="eyeball1"></div>
              </div>
              <div class="eye" id="eye2">
                <div class="eyeball" id="eyeball2"></div>
              </div>
            </div>
          </div>
        """);
  }
}
