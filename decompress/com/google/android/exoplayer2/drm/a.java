// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.q$f;
import bd.c0;
import com.google.android.exoplayer2.q;
import b5.k;
import java.util.UUID;
import com.google.common.collect.o0;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collection;
import com.google.common.primitives.Ints;
import java.util.Map;
import com.google.android.exoplayer2.upstream.e$a;
import com.google.android.exoplayer2.q$d;
import bb.b;

public final class a implements b
{
    public final Object a;
    public q$d b;
    public DefaultDrmSessionManager c;
    
    public a() {
        this.a = new Object();
    }
    
    public static DefaultDrmSessionManager a(final q$d q$d) {
        final e$a e$a = new e$a();
        final byte[] array = null;
        e$a.b = null;
        final Uri b = q$d.b;
        String string;
        if (b == null) {
            string = null;
        }
        else {
            string = b.toString();
        }
        final i i = new i(string, q$d.f, e$a);
        for (final Map.Entry<String, V> entry : q$d.c.entrySet()) {
            final String s = entry.getKey();
            final String s2 = (String)entry.getValue();
            s.getClass();
            s2.getClass();
            synchronized (i.d) {
                i.d.put(s, s2);
                continue;
            }
            break;
        }
        final DefaultDrmSessionManager$b defaultDrmSessionManager$b = new DefaultDrmSessionManager$b();
        final UUID a = q$d.a;
        final k d = h.d;
        a.getClass();
        defaultDrmSessionManager$b.b = a;
        defaultDrmSessionManager$b.c = (g$c)d;
        defaultDrmSessionManager$b.d = q$d.d;
        defaultDrmSessionManager$b.e = q$d.e;
        final int[] v0 = Ints.v0((Collection)q$d.g);
        for (final int n : v0) {
            boolean b2 = true;
            if (n != 2) {
                b2 = (n == 1 && b2);
            }
            ah0.b.C(b2);
        }
        final DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(defaultDrmSessionManager$b.b, defaultDrmSessionManager$b.c, i, defaultDrmSessionManager$b.a, defaultDrmSessionManager$b.d, v0.clone(), defaultDrmSessionManager$b.e, defaultDrmSessionManager$b.f, defaultDrmSessionManager$b.g);
        final byte[] h = q$d.h;
        byte[] copy = array;
        if (h != null) {
            copy = Arrays.copyOf(h, h.length);
        }
        ah0.b.H(defaultDrmSessionManager.m.isEmpty());
        defaultDrmSessionManager.v = 0;
        defaultDrmSessionManager.w = copy;
        return defaultDrmSessionManager;
    }
    
    public final d b(final q q) {
        q.g.getClass();
        final q$d c = ((q$f)q.g).c;
        if (c != null) {
            if (c0.a >= 18) {
                synchronized (this.a) {
                    if (!c0.a((Object)c, (Object)this.b)) {
                        this.b = c;
                        this.c = a(c);
                    }
                    final DefaultDrmSessionManager c2 = this.c;
                    c2.getClass();
                    return (d)c2;
                }
            }
        }
        return (d)d.a;
    }
}
