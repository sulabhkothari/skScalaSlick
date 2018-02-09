import slick.sql
trait UserRepositoryComponent {
  def userRepository: UserRepository

  trait UserRepository{
    def find(id:String) : String
    def save(user:String):Unit
  }
}


class UserRespositorySlick extends UserRepositoryComponent{
  val userRepository: UserRepository = new UserRepositoryImpl

  class UserRepositoryImpl extends UserRepository{
    def find(id:String) : String = ""
    def save(user:String):Unit = println(user)
  }
}
