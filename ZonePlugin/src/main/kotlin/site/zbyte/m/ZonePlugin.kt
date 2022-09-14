package site.zbyte.m

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.*
import java.io.File

class ZonePlugin:BasePlugin() {

    object Points:IntIdTable(){
        val owner=varchar("owner", length = 64)
        val x=integer("x")
        val y=integer("y")
        val radius=integer("radius")
    }

    private val allPoints = arrayListOf<ResultRow>()
    override fun onEnable() {
        logI("Enabling...")
        Database.connect(
            "jdbc:h2:file:${File(dataFolder, "$name.db").absolutePath}",
            "org.h2.Driver")
        SchemaUtils.create(Points)
        logI("Database done.")
        Points.selectAll().forEach {
            allPoints.add(it)
        }
        logI("Enabled.")
    }

    override fun onDisable() {

    }

    fun addPoint(owner:String,x:Int,y:Int,radius:Int){
        Points.insert {
            it[Points.owner]=owner
            it[Points.x]=x
            it[Points.y]=y
            it[Points.radius]=radius
        }
    }
}