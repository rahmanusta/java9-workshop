echo **** printer module dependencies ****
jdeps printer/printer.jar
echo ---------
echo **** printer-client module dependencies ****
jdeps -modulepath printer/printer.jar printer-client/printer-client.jar