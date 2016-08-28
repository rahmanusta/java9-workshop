#!/bin/bash

jlink --modulepath $JAVA_HOME/jmods --addmods java.base --output java.base;
jlink --modulepath $JAVA_HOME/jmods --addmods java.se --output java.se;
jlink --modulepath $JAVA_HOME/jmods --addmods java.compact1 --output java.compact1;
jlink --modulepath $JAVA_HOME/jmods --addmods java.compact2 --output java.compact2;
jlink --modulepath $JAVA_HOME/jmods --addmods java.compact3 --output java.compact3;
jlink --modulepath $JAVA_HOME/jmods --addmods java.se.ee --output java.se.ee;
jlink --modulepath $JAVA_HOME/jmods --addmods java.desktop --output java.desktop