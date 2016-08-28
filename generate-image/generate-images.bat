start jlink --modulepath %JAVA_HOME%/jmods --addmods java.base --output java.base
start jlink --modulepath %JAVA_HOME%/jmods --addmods java.se --output java.se
start jlink --modulepath %JAVA_HOME%/jmods --addmods java.compact1 --output java.compact1
start jlink --modulepath %JAVA_HOME%/jmods --addmods java.compact2 --output java.compact2
start jlink --modulepath %JAVA_HOME%/jmods --addmods java.compact3 --output java.compact3
start jlink --modulepath %JAVA_HOME%/jmods --addmods java.se.ee --output java.se.ee
start jlink --modulepath %JAVA_HOME%/jmods --addmods java.desktop --output java.desktop