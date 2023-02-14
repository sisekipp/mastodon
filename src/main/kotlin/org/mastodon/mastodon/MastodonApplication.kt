package org.mastodon.mastodon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MastodonApplication

fun main(args: Array<String>) {
	runApplication<MastodonApplication>(*args)
}
