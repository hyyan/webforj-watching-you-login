package com.github.hyyan;

import com.webforj.App;
import com.webforj.annotation.AppProfile;
import com.webforj.annotation.Routify;

@Routify(packages = "com.github.hyyan.views")
@AppProfile(name = "webforJ", shortName = "webforJ")
public class Application extends App {
}
