// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import yc.l;
import yc.s;
import android.content.Context;

@Deprecated
public final class d implements a
{
    public final Context a;
    public final s b;
    public final a c;
    
    public d(final Context context, final String b) {
        final e$a e$a = new e$a();
        e$a.b = b;
        this(context, null, (HttpDataSource.a)e$a);
    }
    
    public d(final Context context, final l b, final HttpDataSource.a c) {
        this.a = context.getApplicationContext();
        this.b = (s)b;
        this.c = c;
    }
    
    @Override
    public final com.google.android.exoplayer2.upstream.a a() {
        final c c = new c(this.a, this.c.a());
        final s b = this.b;
        if (b != null) {
            c.i(b);
        }
        return (com.google.android.exoplayer2.upstream.a)c;
    }
}
