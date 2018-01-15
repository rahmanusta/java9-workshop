#!/bin/bash

jlink --module-path %JAVA_HOME%/jmods;hello.jar --add-modules com.hello --output release