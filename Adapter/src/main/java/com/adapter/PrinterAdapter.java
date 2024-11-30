package com.adapter;

public class PrinterAdapter implements ModernPrinter {

    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void modernPrint(String document) {
        oldPrinter.oldPrint(document);
    }
}
