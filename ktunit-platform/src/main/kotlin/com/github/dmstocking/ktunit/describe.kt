package com.github.dmstocking.ktunit

internal var describes = mutableMapOf<String, () -> Unit>()

fun describe(name: String, action: () -> Unit) {
    describes[name] = action
}