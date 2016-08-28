package com.printer.client;

import com.printer.Printer;

/**
 *
 * @author usta
 */
public class PrinterClient {

    public static void main(String[] args) {
        
        Printer printer = new Printer();
        printer.print("Merhaba Mars");
        printer.print("Merhaba Uranüs");
        printer.print("Merhaba Jupiter");
    }

}
