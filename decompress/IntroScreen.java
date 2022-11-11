// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.intro;

import android.os.BaseBundle;
import com.reddit.screen.BaseScreen;
import com.bluelinelabs.conductor.Controller;
import s82.b0;
import android.widget.TextView;
import android.widget.ImageView;
import x82.p0;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$o;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.reddit.vault.util.PointsFormat;
import java.math.BigInteger;
import x82.o$f;
import x82.p0$a;
import java.util.Map;
import o90.xt;
import o90.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import android.os.Parcelable;
import f92.i;
import o90.yt;
import o90.tt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import java.util.ArrayList;
import x82.p;
import com.reddit.presentation.CoroutinesPresenter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import kb1.l;
import com.reddit.screen.util.b;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import f92.g;
import zg2.k;
import f92.h;
import com.reddit.vault.d;

public final class IntroScreen extends d implements h
{
    public static final /* synthetic */ k<Object>[] k0;
    @Inject
    public g i0;
    public final ScreenViewBindingDelegate j0;
    
    static {
        k0 = new k[] { (k)e.v((Class)IntroScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenVaultIntroBinding;", 0) };
    }
    
    public IntroScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625403, bundle);
        this.j0 = b.a((l)this, (rg2.l)IntroScreen$binding.IntroScreen$binding$2.INSTANCE);
    }
    
    public final void A() {
        ((View)this.oC().d).setVisibility(0);
    }
    
    public final void Fg() {
        final RecyclerView$Adapter adapter = this.oC().g.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        ((View)this.oC().d).setVisibility(8);
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        ((IntroPresenter)this.pC()).A();
    }
    
    public final void ZA(final View view) {
        sg2.e.f((Object)view, "view");
        super.ZA(view);
        ((CoroutinesPresenter)this.pC()).o();
    }
    
    public final void ZB() {
        ((CoroutinesPresenter)this.pC()).destroy();
    }
    
    public final void aC() {
        super.aC();
        final p p = (p)((Controller)this).f.getParcelable("entryPoint");
        final Parcelable parcelable = ((Controller)this).f.getParcelable("state");
        sg2.e.c((Object)parcelable);
        final IntroScreen$onInitialize$1 introScreen$onInitialize$1 = new IntroScreen$onInitialize$1(p, (k92.b)parcelable, this);
        final Object d4;
        Label_0243: {
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
                        break Label_0243;
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
        final tt<?, ?> value = ((ut)d4).k().get(IntroScreen.class);
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
            final c zk = ((BaseScreen)this).Zk();
            tt tt4 = null;
            Label_0396: {
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
                            tt4 = subFeatureInjectors.get(IntroScreen.class);
                            break Label_0396;
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)introScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)IntroScreen.class, r, " with a\n    dependency factory of type ", (Class)i.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void nC(final View view) {
        final p0 f = ((IntroPresenter)this.pC()).s.f;
        final boolean b = f instanceof p0$a;
        Object f2 = null;
        p0$a p0$a;
        if (b) {
            p0$a = (p0$a)f;
        }
        else {
            p0$a = null;
        }
        if (p0$a != null) {
            f2 = p0$a.f;
        }
        if (f2 instanceof o$f) {
            final ImageView f3 = this.oC().f;
            sg2.e.e((Object)f3, "binding.pointsWaitingIcon");
            final o$f o$f = (o$f)f2;
            fb2.g.a(f3, o$f.i.f);
            final TextView e = this.oC().e;
            final x82.e e2 = (x82.e)CollectionsKt___CollectionsKt.C3(o$f.i.g);
            BigInteger bigInteger;
            if (e2 == null || (bigInteger = e2.g) == null) {
                bigInteger = BigInteger.ZERO;
            }
            sg2.e.e((Object)bigInteger, "deepLink.claimablePoints\u2026oClaim ?: BigInteger.ZERO");
            e.setText((CharSequence)PointsFormat.c(o$f.i.f, bigInteger));
        }
        this.oC().g.setLayoutManager((RecyclerView$o)new LinearLayoutManager((Context)this.lC()));
        this.oC().g.setAdapter((RecyclerView$Adapter)new f92.c(this.pC()));
        if (((BaseBundle)((Controller)this).f).getBoolean("isRegistration", false)) {
            ((View)this.oC().c).setOnClickListener((View$OnClickListener)new jp1.e((Object)this, 25));
        }
        else {
            ((View)this.oC().b).setVisibility(8);
        }
    }
    
    public final b0 oC() {
        return (b0)this.j0.d((l)this, (k)IntroScreen.k0[0]);
    }
    
    public final g pC() {
        final g i0 = this.i0;
        if (i0 != null) {
            return i0;
        }
        sg2.e.n("presenter");
        throw null;
    }
}
