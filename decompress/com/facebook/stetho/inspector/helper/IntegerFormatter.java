// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.helper;

import android.view.ViewDebug$ExportedProperty;

public class IntegerFormatter
{
    private static IntegerFormatter cachedFormatter;
    
    private IntegerFormatter() {
    }
    
    public static IntegerFormatter getInstance() {
        if (IntegerFormatter.cachedFormatter == null) {
            synchronized (IntegerFormatter.class) {
                if (IntegerFormatter.cachedFormatter == null) {
                    IntegerFormatter.cachedFormatter = new IntegerFormatterWithHex(null);
                }
            }
        }
        return IntegerFormatter.cachedFormatter;
    }
    
    public String format(final Integer n, final ViewDebug$ExportedProperty viewDebug$ExportedProperty) {
        return String.valueOf(n);
    }
    
    public static class IntegerFormatterWithHex extends IntegerFormatter
    {
        private IntegerFormatterWithHex() {
            super(null);
        }
        
        @Override
        public String format(final Integer n, final ViewDebug$ExportedProperty viewDebug$ExportedProperty) {
            if (viewDebug$ExportedProperty != null && viewDebug$ExportedProperty.formatToHexString()) {
                final StringBuilder k = a.k("0x");
                k.append(Integer.toHexString(n));
                return k.toString();
            }
            return super.format(n, viewDebug$ExportedProperty);
        }
    }
}
