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
                    IntegerFormatter.cachedFormatter = (IntegerFormatter)new IntegerFormatter.IntegerFormatter$IntegerFormatterWithHex((IntegerFormatter$1)null);
                }
            }
        }
        return IntegerFormatter.cachedFormatter;
    }
    
    public String format(final Integer n, final ViewDebug$ExportedProperty viewDebug$ExportedProperty) {
        return String.valueOf(n);
    }
}
