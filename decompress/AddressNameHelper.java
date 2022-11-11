// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server;

import com.facebook.stetho.common.ProcessUtil;

public class AddressNameHelper
{
    private static final String PREFIX = "stetho_";
    
    public static String createCustomAddress(final String s) {
        final StringBuilder k = a.k("stetho_");
        k.append(ProcessUtil.getProcessName());
        k.append(s);
        return k.toString();
    }
}
