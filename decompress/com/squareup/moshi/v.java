// 
// Decompiled by Procyon v0.6.0
// 

package com.squareup.moshi;

import java.io.IOException;
import jk2.f;
import jk2.e0;
import jk2.c;
import jk2.k;

public final class v extends k
{
    public final /* synthetic */ c f;
    public final /* synthetic */ w g;
    
    public v(final w g, final c c, final c f) {
        this.g = g;
        this.f = f;
        super((e0)c);
    }
    
    public final void close() throws IOException {
        if (((x)this.g).w() == 9) {
            final w g = this.g;
            final Object[] o = g.o;
            final int f = ((x)g).f;
            if (o[f] == null) {
                ((x)g).f = f - 1;
                final Object b = ((JsonReader)new q((f)this.f)).B();
                final w g2 = this.g;
                final boolean l = ((x)g2).l;
                ((x)g2).l = true;
                try {
                    g2.L(b);
                    final w g3 = this.g;
                    ((x)g3).l = l;
                    final int[] i = ((x)g3).i;
                    final int n = ((x)g3).f - 1;
                    ++i[n];
                    return;
                }
                finally {
                    ((x)this.g).l = l;
                }
            }
        }
        throw new AssertionError();
    }
}
