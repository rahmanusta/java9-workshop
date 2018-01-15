start jlink --module-path %JAVA_HOME%/jmods --add-modules java.base --output java.base
start jlink --module-path %JAVA_HOME%/jmods --add-modules java.se --output java.se
start jlink --module-path %JAVA_HOME%/jmods --add-modules java.compact1 --output java.compact1
start jlink --module-path %JAVA_HOME%/jmods --add-modules java.compact2 --output java.compact2
start jlink --module-path %JAVA_HOME%/jmods --add-modules java.compact3 --output java.compact3
start jlink --module-path %JAVA_HOME%/jmods --add-modules java.se.ee --output java.se.ee
start jlink --module-path %JAVA_HOME%/jmods --add-modules java.desktop --output java.desktop