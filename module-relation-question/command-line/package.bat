jar --create --file printer/printer.jar -C printer/dist .

jar --create --file printer-client/printer-client.jar --main-class=com.printer.client.PrinterClient -C printer-client/dist .