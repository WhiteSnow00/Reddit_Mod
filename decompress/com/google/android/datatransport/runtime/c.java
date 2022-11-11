// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.runtime;

import android.util.Base64;
import com.google.android.datatransport.Priority;

public abstract class c
{
    public static b$a a() {
        final b$a b$a = new b$a();
        b$a.c(Priority.DEFAULT);
        return b$a;
    }
    
    public abstract String b();
    
    public abstract byte[] c();
    
    public abstract Priority d();
    
    @Override
    public final String toString() {
        final String b = this.b();
        final Priority d = this.d();
        String encodeToString;
        if (this.c() == null) {
            encodeToString = "";
        }
        else {
            encodeToString = Base64.encodeToString(this.c(), 2);
        }
        return String.format("TransportContext(%s, %s, %s)", b, d, encodeToString);
    }
    
    public abstract static class a
    {
    }
}
