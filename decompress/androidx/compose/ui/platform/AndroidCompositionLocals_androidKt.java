// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import z0.c1;
import android.os.BaseBundle;
import z0.p0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import android.os.Bundle;
import android.view.ViewParent;
import z0.d$a$a;
import android.content.Context;
import mg2.q;
import androidx.compose.runtime.ComposerImpl;
import kotlin.jvm.internal.Lambda;
import z0.n0;
import android.content.res.Configuration;
import z0.s;
import l5.b$b;
import h1.c;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import java.util.LinkedHashMap;
import android.view.View;
import mg2.l;
import z0.g0;
import ah0.b;
import z0.d$a;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import cg2.j;
import z0.d;
import mg2.p;
import mg2.a;
import z0.z0;
import androidx.compose.runtime.CompositionLocalKt;
import z0.h0;
import z0.d1;
import z0.r;

public final class AndroidCompositionLocals_androidKt
{
    public static final r a;
    public static final d1 b;
    public static final d1 c;
    public static final d1 d;
    public static final d1 e;
    public static final d1 f;
    
    static {
        a = CompositionLocalKt.b((z0)h0.a, (a)AndroidCompositionLocals_androidKt$LocalConfiguration$1.INSTANCE);
        b = CompositionLocalKt.d((a)AndroidCompositionLocals_androidKt$LocalContext$1.INSTANCE);
        c = CompositionLocalKt.d((a)AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.INSTANCE);
        d = CompositionLocalKt.d((a)AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1.INSTANCE);
        e = CompositionLocalKt.d((a)AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1.INSTANCE);
        f = CompositionLocalKt.d((a)AndroidCompositionLocals_androidKt$LocalView$1.INSTANCE);
    }
    
    public static final void a(final AndroidComposeView androidComposeView, final p<? super d, ? super Integer, j> p4, d d, final int n) {
        ng2.e.f((Object)androidComposeView, "owner");
        ng2.e.f((Object)p4, "content");
        final ComposerImpl s = d.s(1396852028);
        final q a = ComposerKt.a;
        final Context context = ((View)androidComposeView).getContext();
        s.A(-492369756);
        final Object d2 = s.d0();
        final d$a$a a2 = d$a.a;
        Object y0 = d2;
        if (d2 == a2) {
            y0 = ah0.b.Y0((Object)context.getResources().getConfiguration(), (z0)h0.a);
            s.J0(y0);
        }
        s.S(false);
        final g0 g0 = (g0)y0;
        s.A(1157296644);
        final boolean m = s.m((Object)g0);
        final Object d3 = s.d0();
        Object o;
        if (m || (o = d3) == a2) {
            o = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(g0);
            s.J0(o);
        }
        s.S(false);
        androidComposeView.setConfigurationChangeObserver((l)o);
        s.A(-492369756);
        Object d4;
        if ((d4 = s.d0()) == a2) {
            ng2.e.e((Object)context, "context");
            d4 = new x(context);
            s.J0(d4);
        }
        s.S(false);
        final x x = (x)d4;
        final AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            s.A(-492369756);
            Object d5;
            if ((d5 = s.d0()) == a2) {
                final l5.d b = viewTreeOwners.b;
                final Class<?>[] a3 = i0.a;
                ng2.e.f((Object)b, "owner");
                final ViewParent parent = ((View)androidComposeView).getParent();
                ng2.e.d((Object)parent, "null cannot be cast to non-null type android.view.View");
                final View view = (View)parent;
                final Object tag = view.getTag(2131428417);
                String s2;
                if (tag instanceof String) {
                    s2 = (String)tag;
                }
                else {
                    s2 = null;
                }
                String value = s2;
                if (s2 == null) {
                    value = String.valueOf(view.getId());
                }
                ng2.e.f((Object)value, "id");
                final StringBuilder sb = new StringBuilder();
                sb.append(h1.b.class.getSimpleName());
                sb.append(':');
                sb.append(value);
                final String string = sb.toString();
                final l5.b savedStateRegistry = b.getSavedStateRegistry();
                final Bundle a4 = savedStateRegistry.a(string);
                Map map;
                if (a4 != null) {
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    final Set keySet = ((BaseBundle)a4).keySet();
                    ng2.e.e((Object)keySet, "this.keySet()");
                    final Iterator iterator = keySet.iterator();
                    while (true) {
                        map = linkedHashMap;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final String s3 = (String)iterator.next();
                        final ArrayList parcelableArrayList = a4.getParcelableArrayList(s3);
                        ng2.e.d((Object)parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        ng2.e.e((Object)s3, "key");
                        linkedHashMap.put(s3, parcelableArrayList);
                    }
                }
                else {
                    map = null;
                }
                final DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 instance = DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1.INSTANCE;
                final d1 a5 = SaveableStateRegistryKt.a;
                ng2.e.f((Object)instance, "canBeSaved");
                d = (d)new c(map, (l)instance);
                boolean b2;
                try {
                    savedStateRegistry.c(string, (b$b)new androidx.compose.ui.platform.h0((c)d));
                    b2 = true;
                }
                catch (final IllegalArgumentException ex) {
                    b2 = false;
                }
                d5 = new androidx.compose.ui.platform.g0((c)d, (a)new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(b2, savedStateRegistry, string));
                s.J0(d5);
            }
            s.S(false);
            final androidx.compose.ui.platform.g0 g2 = (androidx.compose.ui.platform.g0)d5;
            z0.s.c(j.a, (l)new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2(g2), (d)s);
            ng2.e.e((Object)context, "context");
            final Configuration to = (Configuration)((c1)g0).getValue();
            s.A(-485908294);
            final q a6 = ComposerKt.a;
            s.A(-492369756);
            final Object d6 = s.d0();
            final d$a$a a7 = d$a.a;
            g2.b b3;
            if ((b3 = (g2.b)d6) == a7) {
                b3 = new g2.b();
                s.J0((Object)b3);
            }
            s.S(false);
            final g2.b b4 = b3;
            s.A(-492369756);
            Object d7;
            if ((d7 = s.d0()) == a7) {
                d7 = new Configuration();
                if (to != null) {
                    ((Configuration)d7).setTo(to);
                }
                s.J0(d7);
            }
            s.S(false);
            final Configuration configuration = (Configuration)d7;
            s.A(-492369756);
            Object d8;
            if ((d8 = s.d0()) == a7) {
                d8 = new u(configuration, b4);
                s.J0(d8);
            }
            s.S(false);
            z0.s.c(b4, (l)new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(context, (u)d8), (d)s);
            s.S(false);
            final r a8 = AndroidCompositionLocals_androidKt.a;
            final Configuration configuration2 = (Configuration)((c1)g0).getValue();
            ng2.e.e((Object)configuration2, "configuration");
            CompositionLocalKt.a(new n0[] { a8.b((Object)configuration2), AndroidCompositionLocals_androidKt.b.b((Object)context), AndroidCompositionLocals_androidKt.d.b((Object)viewTreeOwners.a), AndroidCompositionLocals_androidKt.e.b((Object)viewTreeOwners.b), SaveableStateRegistryKt.a.b((Object)g2), AndroidCompositionLocals_androidKt.f.b((Object)androidComposeView.getView()), AndroidCompositionLocals_androidKt.c.b((Object)b4) }, (p)xd.a.C((d)s, 1471621628, (Lambda)new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3(androidComposeView, x, (p)p4, n)), (d)s, 56);
            final p0 v = s.V();
            if (v != null) {
                v.d = (p)new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4(androidComposeView, (p)p4, n);
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }
    
    public static final void b(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append("CompositionLocal ");
        sb.append(s);
        sb.append(" not present");
        throw new IllegalStateException(sb.toString().toString());
    }
}
