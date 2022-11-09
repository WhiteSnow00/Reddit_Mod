// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import mj2.j0;
import android.graphics.Typeface;
import aj2.c;
import kotlin.Result;
import mk2.e;
import n2.s;
import n2.f;
import android.content.Context;
import n2.p;

public final class a implements p
{
    public final Context a;
    
    public a(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    @Override
    public final Object a(final f f) {
        final boolean b = f instanceof n2.a;
        Object l = null;
        final Typeface typeface = null;
        if (!b) {
            if (f instanceof s) {
                final int a = f.a();
                final int n = 0;
                if (a == 0) {
                    final s s = (s)f;
                    final Context a2 = this.a;
                    ah2.f.e((Object)a2, "context");
                    l = e.l(a2, s);
                }
                else if (a == 1) {
                    Object constructor-impl = null;
                    try {
                        final s s2 = (s)f;
                        final Context a3 = this.a;
                        ah2.f.e((Object)a3, "context");
                        Result.constructor-impl((Object)e.l(a3, s2));
                    }
                    finally {
                        final Throwable t;
                        constructor-impl = Result.constructor-impl((Object)c.G(t));
                    }
                    if (Result.isFailure-impl(constructor-impl)) {
                        constructor-impl = typeface;
                    }
                    l = constructor-impl;
                }
                else {
                    int n2 = n;
                    if (a == 2) {
                        n2 = 1;
                    }
                    if (n2 != 0) {
                        throw new UnsupportedOperationException("Unsupported Async font load path");
                    }
                    final StringBuilder k = a.k("Unknown loading type ");
                    k.append((Object)a80.a.L0(f.a()));
                    throw new IllegalArgumentException(k.toString());
                }
            }
            return l;
        }
        final n2.a a4 = (n2.a)f;
        ah2.f.e((Object)this.a, "context");
        throw null;
    }
    
    @Override
    public final Object b() {
        return null;
    }
    
    @Override
    public final Object c(final f f, final tg2.c<? super Typeface> c) {
        if (f instanceof n2.a) {
            f.getClass();
            ah2.f.e((Object)this.a, "context");
            throw null;
        }
        if (!(f instanceof s)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unknown font type: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }
        final s s = (s)f;
        final Context a = this.a;
        ah2.f.e((Object)a, "context");
        final Object l = g.l((CoroutineContext)j0.c, (zg2.p)new AndroidFontLoader_androidKt$loadAsync$2(s, a, null), (tg2.c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return l;
    }
}
