package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}
import play.api.libs.json.Json
import repositories.DataRepository


@Singleton
class ApiController @Inject()(cc: ControllerComponents) 
    extends AbstractController(cc) {

    def ping = Action { implicit request =>
        Ok("Hello, Scala!")
    }
}