package com.adapter;

public class NewSoftware {

    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        // Because PrinterAdapter implements ModernPrinter, it can be seen
        // as a ModernPrinter which is integrated with NewSoftware
        ModernPrinter adapter = new PrinterAdapter(oldPrinter);
        adapter.modernPrint("Hello world");
    }
}
