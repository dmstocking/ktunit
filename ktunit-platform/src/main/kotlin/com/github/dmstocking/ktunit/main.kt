package com.github.dmstocking.ktunit

import java.nio.file.Files
import java.nio.file.Paths
import java.util.function.BiPredicate
import javax.script.ScriptEngineManager

fun main() {
    val engine = ScriptEngineManager(ClassLoader.getSystemClassLoader())
        .getEngineByExtension("kts")
    val pwd = Paths.get(".").toAbsolutePath().normalize()
    Files.find(pwd, Int.MAX_VALUE, BiPredicate { path, attr -> path.fileName.toString().endsWith(".spec.kts") })
        .forEach { path ->
            val scriptReader = Files.newBufferedReader(path)
            engine.eval(scriptReader)
        }
    val testPlan = TestPlan(createTestSuites(describes))
    println(testPlan)
}
