package com.github.dmstocking.ktunit

fun createTestCases(its: Map<String, () -> Unit>): List<TestCase> {
    return its.map { (k, v) ->
        return@map TestCase(
            k,
            v
        )
    }
}

data class TestCase(
    val description: String,
    val case: () -> Unit
)
