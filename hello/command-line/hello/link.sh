#!/bin/bash

jlink --modulepath %JAVA_HOME%/jmods;hello.jar --addmods com.hello --output release