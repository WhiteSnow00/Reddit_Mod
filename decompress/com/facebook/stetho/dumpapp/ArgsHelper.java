// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.dumpapp;

import java.util.ArrayList;
import java.util.Iterator;

public class ArgsHelper
{
    public static String[] drainToArray(final Iterator<String> iterator) {
        final ArrayList list = new ArrayList();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list.toArray(new String[list.size()]);
    }
    
    public static String nextArg(final Iterator<String> iterator, final String s) throws DumpUsageException {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        throw new DumpUsageException(s);
    }
    
    public static String nextOptionalArg(final Iterator<String> iterator, String s) {
        if (iterator.hasNext()) {
            s = iterator.next();
        }
        return s;
    }
}
