#!/bin/sh
./gradlew :zone-plugin:shadowJar

cp ./zone-plugin/build/libs/zone-plugin-all.jar /home/ghost/mc/plugins/zone-plugin.jar