// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import zc.l;
import zc.s;
import android.content.Context;

@Deprecated
public final class d implements a$a
{
    public final Context a;
    public final s b;
    public final a$a c;
    
    public d(final Context context, final String b) {
        final e$a e$a = new e$a();
        e$a.b = b;
        this(context, null, (HttpDataSource$a)e$a);
    }
    
    public d(final Context context, final l b, final HttpDataSource$a c) {
        this.a = context.getApplicationContext();
        this.b = b;
        this.c = (a$a)c;
    }
    
    public final a a() {
        final c c = new c(this.a, this.c.a());
        final s b = this.b;
        if (b != null) {
            c.d(b);
        }
        return (a)c;
    }
}
