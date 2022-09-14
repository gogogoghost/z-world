#!/bin/sh
./gradlew :ZonePlugin:shadowJar

cp ./ZonePlugin/build/libs/ZonePlugin-all.jar /home/ghost/mc/plugins/ZonePlugin.jar