#!/bin/bash

javac printer/src/module-info.java printer/src/com/printer/Printer.java -d printer/dist

javac -modulepath printer/dist printer-client/src/module-info.java printer-client/src/com/printer/client/PrinterClient.java -d printer-client/dist