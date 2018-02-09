import com.typesafe.config.{Config, ConfigFactory}

object Main {
  def main(args: Array[String]): Unit = {
    import slick.jdbc.PostgresProfile.api._
    var config = ConfigFactory.load().getAnyRef("pg-postgres")
    var db:Database = Database.forConfig("pg-postgres")
    println("conn successful")

  }
}
