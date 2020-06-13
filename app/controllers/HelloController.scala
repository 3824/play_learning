package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Request}

@Singleton
class HelloController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def get(name: Option[String]) =
    Action { implicit request: Request[AnyContent] =>
      Ok {
        name.map(s => s"Hello $s").getOrElse("""please give a name""")
      }
    }
}
