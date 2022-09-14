//
//import org.jetbrains.exposed.sql.Database
//import org.jetbrains.exposed.sql.SchemaUtils
//import org.jetbrains.exposed.sql.Table
//import org.jetbrains.exposed.sql.insert
//import org.jetbrains.exposed.sql.transactions.transaction
//
//
//object Users: Table(){
//    val id=integer("id").autoIncrement()
//    val name=varchar("name", length = 50)
//
//    override val primaryKey: PrimaryKey?
//        get() = PrimaryKey(id)
//}
//
//fun main(){
//    Database.connect("jdbc:h2:file:~/main.db","org.h2.Driver")
//    transaction {
//        SchemaUtils.create(Users)
//        val id=Users.insert {
//            it[name] = "张三"
//        } get Users.id
//        println("id is:$id")
//    }
//}