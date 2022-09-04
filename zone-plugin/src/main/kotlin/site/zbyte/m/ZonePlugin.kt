package site.zbyte.m

class ZonePlugin:BasePlugin() {
    override fun onEnable() {
        logI("I am enabled")
    }

    override fun onDisable() {
        logI("I am disabled")
    }
}