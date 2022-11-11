// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide;

import android.content.Context;
import java.util.Map;
import g9.e;
import java.util.List;
import android.content.ContextWrapper;

public final class f extends ContextWrapper
{
    public static final b k;
    public final r8.b a;
    public final Registry b;
    public final ui.b c;
    public final c.a d;
    public final List<e<Object>> e;
    public final Map<Class<?>, k<?, ?>> f;
    public final com.bumptech.glide.load.engine.e g;
    public final g h;
    public final int i;
    public g9.f j;
    
    static {
        k = new b();
    }
    
    public f(final Context context, final r8.b a, final Registry b, final ui.b c, final c.a d, final j0.b f, final List e, final com.bumptech.glide.load.engine.e g, final g h, final int i) {
        super(context.getApplicationContext());
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
}
