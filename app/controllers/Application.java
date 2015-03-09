package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Chrome;
import views.html.Firefox;
import views.html.Ie;
import views.html.Index;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   *
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Introduction"));
  }

  /**
   * Returns IE history page.
   *
   * @return History of IE page.
   */
  public static Result ie() {
    return ok(Ie.render("Internet Explorer"));
  }

  /**
   * Returns Firefox history page.
   *
   * @return History of Firefox page.
   */
  public static Result firefox() {
    return ok(Firefox.render("Firefox"));
  }

  /**
   * Returns Chrome history page.
   *
   * @return History of Chrome page.
   */
  public static Result chrome() {
    return ok(Chrome.render("Chrome"));
  }


}
