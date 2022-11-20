// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import zi2.k0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import n2.n;
import android.os.Build$VERSION;
import zd.b;
import android.graphics.Typeface;
import cg.d;
import kotlin.Result;
import ng2.e;
import n2.u;
import n2.a;
import n2.f;
import android.content.Context;
import n2.r;

public final class AndroidFontLoader implements r
{
    public final Context a;
    
    public AndroidFontLoader(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    public final Object a(final f f) {
        final boolean b = f instanceof a;
        Object a = null;
        final Typeface typeface = null;
        if (!b) {
            if (f instanceof u) {
                final int a2 = f.a();
                final int n = 0;
                Typeface e;
                if (a2 == 0) {
                    final u u = (u)f;
                    final Context a3 = this.a;
                    ng2.e.e((Object)a3, "context");
                    e = if0.a.e(a3, u);
                }
                else if (a2 == 1) {
                    Object constructor-impl = null;
                    try {
                        final u u2 = (u)f;
                        final Context a4 = this.a;
                        ng2.e.e((Object)a4, "context");
                        Result.constructor-impl((Object)if0.a.e(a4, u2));
                    }
                    finally {
                        final Throwable t;
                        constructor-impl = Result.constructor-impl((Object)d.B1(t));
                    }
                    if (Result.isFailure-impl(constructor-impl)) {
                        constructor-impl = typeface;
                    }
                    e = (Typeface)constructor-impl;
                }
                else {
                    int n2 = n;
                    if (a2 == 2) {
                        n2 = 1;
                    }
                    if (n2 != 0) {
                        throw new UnsupportedOperationException("Unsupported Async font load path");
                    }
                    final StringBuilder t2 = a.t("Unknown loading type ");
                    t2.append((Object)zd.b.r1(f.a()));
                    throw new IllegalArgumentException(t2.toString());
                }
                final n d = ((u)f).d;
                final Context a5 = this.a;
                ng2.e.e((Object)a5, "context");
                ng2.e.f((Object)d, "variationSettings");
                a = e;
                if (Build$VERSION.SDK_INT >= 26) {
                    a = c.a(e, d, a5);
                }
            }
            return a;
        }
        final a a6 = (a)f;
        e.e((Object)this.a, "context");
        throw null;
    }
    
    public final Object b() {
        return null;
    }
    
    public final Object c(final f l$1, final gg2.c<? super Typeface> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof AndroidFontLoader$awaitLoad$1) {
                final AndroidFontLoader$awaitLoad$1 androidFontLoader$awaitLoad$1 = (AndroidFontLoader$awaitLoad$1)c;
                final int label = androidFontLoader$awaitLoad$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    androidFontLoader$awaitLoad$1.label = label + Integer.MIN_VALUE;
                    o = androidFontLoader$awaitLoad$1;
                    break Label_0051;
                }
            }
            o = new AndroidFontLoader$awaitLoad$1(this, (gg2.c)c);
        }
        Object o2 = ((AndroidFontLoader$awaitLoad$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((AndroidFontLoader$awaitLoad$1)o).label;
        AndroidFontLoader androidFontLoader;
        f f2;
        if (label2 != 0) {
            if (label2 == 1) {
                d.b4(o2);
                return o2;
            }
            if (label2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final f f = (f)((AndroidFontLoader$awaitLoad$1)o).L$1;
            androidFontLoader = (AndroidFontLoader)((AndroidFontLoader$awaitLoad$1)o).L$0;
            d.b4(o2);
            f2 = f;
        }
        else {
            d.b4(o2);
            if (l$1 instanceof a) {
                ((a)l$1).getClass();
                e.e((Object)this.a, "context");
                ((AndroidFontLoader$awaitLoad$1)o).label = 1;
                throw null;
            }
            if (!(l$1 instanceof u)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown font type: ");
                sb.append(l$1);
                throw new IllegalArgumentException(sb.toString());
            }
            final u u = (u)l$1;
            final Context a = this.a;
            e.e((Object)a, "context");
            ((AndroidFontLoader$awaitLoad$1)o).L$0 = this;
            ((AndroidFontLoader$awaitLoad$1)o).L$1 = l$1;
            ((AndroidFontLoader$awaitLoad$1)o).label = 2;
            o2 = g.j((CoroutineContext)k0.c, (p)new AndroidFontLoader_androidKt$loadAsync$2(u, a, (gg2.c)null), (gg2.c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            f2 = l$1;
            androidFontLoader = this;
        }
        final Typeface typeface = (Typeface)o2;
        final n d = ((u)f2).d;
        final Context a2 = androidFontLoader.a;
        e.e((Object)a2, "context");
        e.f((Object)d, "variationSettings");
        Typeface a3 = typeface;
        if (Build$VERSION.SDK_INT >= 26) {
            a3 = c.a(typeface, d, a2);
        }
        return a3;
    }
}
