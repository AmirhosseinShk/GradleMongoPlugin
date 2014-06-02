package com.sourcemuse.gradle.plugin

import static com.sourcemuse.gradle.plugin.LogDestination.CONSOLE

class GradleMongoPluginExtension {
    int port = 27017
    String bindIp = '127.0.0.1'
    String logging = CONSOLE as String
    String logFilePath = 'embedded-mongo.log'
}
