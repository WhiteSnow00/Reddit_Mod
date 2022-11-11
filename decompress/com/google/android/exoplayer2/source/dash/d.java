// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.dash;

import android.os.Message;
import ad.c0;
import ec.c;
import java.util.TreeMap;
import android.os.Handler;
import yc.b;
import android.os.Handler$Callback;

public final class d implements Handler$Callback
{
    public final yc.b f;
    public final b g;
    public final rb.b h;
    public final Handler i;
    public final TreeMap<Long, Long> j;
    public c k;
    public boolean l;
    public boolean m;
    public boolean n;
    
    public d(final c k, final DashMediaSource$c g, final yc.b f) {
        this.k = k;
        this.g = (b)g;
        this.f = f;
        this.j = new TreeMap<Long, Long>();
        this.i = c0.l((Handler$Callback)this);
        this.h = new rb.b();
    }
    
    public final boolean handleMessage(final Message message) {
        if (this.n) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        final a a = (a)message.obj;
        final long a2 = a.a;
        final long b = a.b;
        final Long n = this.j.get(b);
        if (n == null) {
            this.j.put(b, a2);
        }
        else if (n > a2) {
            this.j.put(b, a2);
        }
        return true;
    }
    
    public static final class a
    {
        public final long a;
        public final long b;
        
        public a(final long a, final long b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public interface b
    {
    }
}
