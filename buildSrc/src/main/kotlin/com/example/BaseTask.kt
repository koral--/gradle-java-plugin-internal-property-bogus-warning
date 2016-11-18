package com.example

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Internal

abstract class BaseTask : DefaultTask() {
	@Internal
	internal val foo = "foo"
}