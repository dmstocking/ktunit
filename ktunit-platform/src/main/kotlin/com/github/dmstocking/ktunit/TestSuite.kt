package com.github.dmstocking.ktunit

fun createTestSuites(descriptions: Map<String, () -> Unit>): List<TestSuite> {
    return descriptions.map { (k, v) ->
        describes = mutableMapOf()
        its = mutableMapOf()
        v()
        val its2 = its.toMap()
        val testSuites = createTestSuites(describes)
        return@map TestSuite(k, testSuites, createTestCases(its2))
    }
}

data class TestSuite(
    val description: String,
    val suites: List<TestSuite>,
    val cases: List<TestCase>
)
