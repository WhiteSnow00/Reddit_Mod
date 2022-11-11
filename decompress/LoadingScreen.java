// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.loading;

import com.reddit.screen.BaseScreen;
import java.util.Map;
import o90.xt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import android.os.Parcelable;
import o90.yt;
import o90.tt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import java.util.ArrayList;
import com.reddit.presentation.CoroutinesPresenter;
import android.view.View;
import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.Router;
import com.reddit.vault.j;
import com.reddit.vault.k;
import fb2.f;
import x82.o;
import sg2.e;
import android.os.Bundle;
import javax.inject.Inject;
import g92.b;
import g92.c;
import com.reddit.vault.d;

public final class LoadingScreen extends d implements c
{
    @Inject
    public b i0;
    
    public LoadingScreen(final Bundle bundle) {
        e.f((Object)bundle, "args");
        super(2131625577, bundle);
    }
    
    public final void Gd(final o o, final f f) {
        e.f((Object)f, "deepLinkHandler");
        final Router p2 = ((Controller)this).p;
        e.e((Object)p2, "router");
        final Controller r = ((Controller)this).r;
        e.d((Object)r, "null cannot be cast to non-null type com.reddit.vault.VaultFeaturesProvider");
        f.a(p2, o, (j)((k)r).N3());
    }
    
    public final void PA(final View view) {
        e.f((Object)view, "view");
        super.PA(view);
        final b i0 = this.i0;
        if (i0 != null) {
            ((LoadingPresenter)i0).A();
            return;
        }
        e.n("presenter");
        throw null;
    }
    
    public final void ZA(final View view) {
        e.f((Object)view, "view");
        super.ZA(view);
        final b i0 = this.i0;
        if (i0 != null) {
            ((CoroutinesPresenter)i0).o();
            return;
        }
        e.n("presenter");
        throw null;
    }
    
    public final void ZB() {
        final b i0 = this.i0;
        if (i0 != null) {
            ((CoroutinesPresenter)i0).destroy();
            return;
        }
        e.n("presenter");
        throw null;
    }
    
    public final void aC() {
        super.aC();
        final Parcelable parcelable = ((Controller)this).f.getParcelable("deepLink");
        e.c((Object)parcelable);
        final LoadingScreen$onInitialize$1 loadingScreen$onInitialize$1 = new LoadingScreen$onInitialize$1((o)parcelable, this);
        final Object d4;
        Label_0231: {
            if (o90.b.a) {
                synchronized (o90.b.b) {
                    final LinkedHashSet c = o90.b.c;
                    final ArrayList<Object> list = new ArrayList<Object>();
                    for (final Object next : c) {
                        if (next instanceof ut) {
                            list.add(next);
                        }
                    }
                    if (CollectionsKt___CollectionsKt.d4((List)list) != null) {
                        break Label_0231;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to find a component of type ");
                    sb.append(ut.class.getSimpleName());
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            final LinkedHashSet c2 = o90.b.c;
            final ArrayList list2 = new ArrayList();
            for (final Object next2 : c2) {
                if (next2 instanceof ut) {
                    list2.add(next2);
                }
            }
            d4 = CollectionsKt___CollectionsKt.d4((List)list2);
            if (d4 == null) {
                throw new IllegalStateException(aw.b.e((Class)ut.class, a.r("Unable to find a component of type ")));
            }
        }
        final tt<?, ?> value = ((ut)d4).k().get(LoadingScreen.class);
        final boolean b = value instanceof tt;
        final tt tt = null;
        tt<?, ?> tt2;
        if (b) {
            tt2 = value;
        }
        else {
            tt2 = null;
        }
        tt<?, ?> tt3 = tt2;
        if (tt2 == null) {
            final o90.c zk = ((BaseScreen)this).Zk();
            tt tt4 = null;
            Label_0383: {
                if (zk != null) {
                    final xt se = zk.se();
                    if (se != null) {
                        Object a;
                        if (!((a = se.a) instanceof yt)) {
                            a = null;
                        }
                        final yt yt = (yt)a;
                        if (yt == null) {
                            throw new IllegalStateException(android.support.v4.media.a.i(se.a, a.r("Component("), ") is not an instance of (", (Class)yt.class, ')'));
                        }
                        final Map subFeatureInjectors = yt.getSubFeatureInjectors();
                        if (subFeatureInjectors != null) {
                            tt4 = subFeatureInjectors.get(LoadingScreen.class);
                            break Label_0383;
                        }
                    }
                }
                tt4 = null;
            }
            tt3 = tt;
            if (tt4 instanceof tt) {
                tt3 = tt4;
            }
        }
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)loadingScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)LoadingScreen.class, r, " with a\n    dependency factory of type ", (Class)g92.d.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
}
