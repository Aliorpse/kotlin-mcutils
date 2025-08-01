package tech.aliorpse.mcutils.server

import tech.aliorpse.mcutils.modules.server.BedrockServer
import tech.aliorpse.mcutils.modules.server.JavaServer
import kotlin.test.Test

class ServerStatusTest {
    @Test
    fun javaGetStatusTest() {
        val result = JavaServer.getStatusBlocking("ltw.pcl-community.top")

        println(result)
        assert(result.ping > 0)
    }

    @Test
    fun bedrockGetStatusTest() {
        val result = BedrockServer.getStatusBlocking("asia.easecation.net")
        println(result)
        assert(result.ping > 0)
    }
}
