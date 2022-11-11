// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.crypto.lms;

import java.util.AbstractMap;
import java.util.HashMap;
import vk2.b;
import ok2.m;
import java.util.Map;

public final class LMOtsParameters
{
    public static final LMOtsParameters g;
    public static final LMOtsParameters h;
    public static final LMOtsParameters i;
    public static final LMOtsParameters j;
    public static final Map<Object, LMOtsParameters> k;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final m f;
    
    static {
        final m a = b.a;
        g = new LMOtsParameters(1, 1, 265, 7, a);
        h = new LMOtsParameters(2, 2, 133, 6, a);
        i = new LMOtsParameters(3, 4, 67, 4, a);
        j = new LMOtsParameters(4, 8, 34, 0, a);
        k = new HashMap<Object, LMOtsParameters>() {
            {
                final LMOtsParameters g = LMOtsParameters.g;
                ((AbstractMap<Integer, LMOtsParameters>)this).put(g.a, g);
                final LMOtsParameters h = LMOtsParameters.h;
                ((AbstractMap<Integer, LMOtsParameters>)this).put(h.a, h);
                final LMOtsParameters i = LMOtsParameters.i;
                ((AbstractMap<Integer, LMOtsParameters>)this).put(i.a, i);
                final LMOtsParameters j = LMOtsParameters.j;
                ((AbstractMap<Integer, LMOtsParameters>)this).put(j.a, j);
            }
        };
    }
    
    public LMOtsParameters(final int a, final int c, final int d, final int e, final m f) {
        this.a = a;
        this.b = 32;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
}
