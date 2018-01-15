/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
