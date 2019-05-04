package com.github.dmstocking.ktunit

internal var its = mutableMapOf<String, () -> Unit>()

fun it(name: String, action: () -> Unit) {
    its[name] = action
}