#!/bin/bash

jlink --compress=2 --modulepath %JAVA_HOME%/jmods;printer/printer.jar;printer-client/printer-client.jar --addmods com.printer.client --output release