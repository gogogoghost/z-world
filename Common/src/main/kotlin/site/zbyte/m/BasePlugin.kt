package site.zbyte.m

import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Level

open class BasePlugin :JavaPlugin(){
    fun logI(msg:String){
        logger.log(Level.INFO,"${javaClass.simpleName}:${msg}")
    }

    fun logW(msg:String){
        logger.log(Level.WARNING,"${javaClass.simpleName}:${msg}")
    }
}