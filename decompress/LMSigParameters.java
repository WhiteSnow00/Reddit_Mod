// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.crypto.lms;

import java.util.AbstractMap;
import java.util.HashMap;
import vk2.b;
import ok2.m;
import java.util.Map;

public final class LMSigParameters
{
    public static final LMSigParameters e;
    public static final LMSigParameters f;
    public static final LMSigParameters g;
    public static final LMSigParameters h;
    public static final LMSigParameters i;
    public static Map<Object, LMSigParameters> j;
    public final int a;
    public final int b;
    public final int c;
    public final m d;
    
    static {
        final m a = b.a;
        e = new LMSigParameters(5, 5, a);
        f = new LMSigParameters(6, 10, a);
        g = new LMSigParameters(7, 15, a);
        h = new LMSigParameters(8, 20, a);
        i = new LMSigParameters(9, 25, a);
        LMSigParameters.j = new HashMap<Object, LMSigParameters>() {
            {
                final LMSigParameters e = LMSigParameters.e;
                ((AbstractMap<Integer, LMSigParameters>)this).put(e.a, e);
                final LMSigParameters f = LMSigParameters.f;
                ((AbstractMap<Integer, LMSigParameters>)this).put(f.a, f);
                final LMSigParameters g = LMSigParameters.g;
                ((AbstractMap<Integer, LMSigParameters>)this).put(g.a, g);
                final LMSigParameters h = LMSigParameters.h;
                ((AbstractMap<Integer, LMSigParameters>)this).put(h.a, h);
                final LMSigParameters i = LMSigParameters.i;
                ((AbstractMap<Integer, LMSigParameters>)this).put(i.a, i);
            }
        };
    }
    
    public LMSigParameters(final int a, final int c, final m d) {
        this.a = a;
        this.b = 32;
        this.c = c;
        this.d = d;
    }
}
