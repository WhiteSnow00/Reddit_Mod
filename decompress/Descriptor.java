// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.ThreadBound;
import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.common.Util;
import java.util.HashMap;
import java.util.Map;

public abstract class Descriptor<E> implements NodeDescriptor<E>
{
    private Descriptor.Descriptor$Host mHost;
    
    public static Map<String, String> parseSetAttributesAsTextArg(final String s) {
        final StringBuilder sb = new StringBuilder();
        final HashMap hashMap = new HashMap();
        final int length = s.length();
        String string = "";
        String string2 = "";
        int n;
        for (int i = n = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '=') {
                string = sb.toString();
                sb.setLength(0);
            }
            else if (char1 == '\"') {
                if (n != 0) {
                    string2 = sb.toString();
                    sb.setLength(0);
                }
                n ^= 0x1;
            }
            else if (char1 == ' ' && n == 0) {
                hashMap.put(string, string2);
            }
            else {
                sb.append(char1);
            }
        }
        if (!string.isEmpty() && !string2.isEmpty()) {
            hashMap.put(string, string2);
        }
        return hashMap;
    }
    
    public final boolean checkThreadAccess() {
        return ((ThreadBound)this.getHost()).checkThreadAccess();
    }
    
    public final Descriptor.Descriptor$Host getHost() {
        return this.mHost;
    }
    
    public final void initialize(final Descriptor.Descriptor$Host mHost) {
        Util.throwIfNull((Object)mHost);
        Util.throwIfNotNull((Object)this.mHost);
        this.mHost = mHost;
    }
    
    public final boolean isInitialized() {
        return this.mHost != null;
    }
    
    public final <V> V postAndWait(final UncheckedCallable<V> uncheckedCallable) {
        return (V)((ThreadBound)this.getHost()).postAndWait((UncheckedCallable)uncheckedCallable);
    }
    
    public final void postAndWait(final Runnable runnable) {
        ((ThreadBound)this.getHost()).postAndWait(runnable);
    }
    
    public final void postDelayed(final Runnable runnable, final long n) {
        ((ThreadBound)this.getHost()).postDelayed(runnable, n);
    }
    
    public final void removeCallbacks(final Runnable runnable) {
        ((ThreadBound)this.getHost()).removeCallbacks(runnable);
    }
    
    public final void verifyThreadAccess() {
        ((ThreadBound)this.getHost()).verifyThreadAccess();
    }
}
