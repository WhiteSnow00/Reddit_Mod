// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.notice;

import com.reddit.screen.BaseScreen;
import androidx.recyclerview.widget.z;
import s82.n;
import android.view.View$OnClickListener;
import java.util.Map;
import o90.xt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import android.os.Parcelable;
import o90.yt;
import o90.tt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import com.reddit.presentation.CoroutinesPresenter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.content.res.Resources;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$n;
import dk1.a;
import fb2.g;
import xa2.h;
import java.util.ArrayList;
import com.bluelinelabs.conductor.Controller;
import com.reddit.vault.f;
import kb1.l;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import ka2.b;
import zg2.k;
import ka2.c;
import com.reddit.vault.d;

public final class InfoNoticeScreen extends d implements c, ab2.c
{
    public static final /* synthetic */ k<Object>[] k0;
    @Inject
    public b i0;
    public final ScreenViewBindingDelegate j0;
    
    static {
        k0 = new k[] { (k)e.v((Class)InfoNoticeScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenInfoNoticeBinding;", 0) };
    }
    
    public InfoNoticeScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625222, bundle);
        this.j0 = com.reddit.screen.util.b.a((l)this, (rg2.l)InfoNoticeScreen$binding.InfoNoticeScreen$binding$2.INSTANCE);
    }
    
    public final void Ml() {
        final Controller r = ((Controller)this).r;
        sg2.e.d((Object)r, "null cannot be cast to non-null type com.reddit.vault.VaultCoinConvertHandlerProvider");
        ((com.reddit.vault.e)r).zp((ab2.c)this);
    }
    
    public final void O7(int visibility, int text, final Integer n, final ArrayList list, final h h, final int text2, final Integer n2) {
        this.oC().d.setText(visibility);
        this.oC().h.setText(text);
        if (h != null) {
            final ImageView e = this.oC().e;
            sg2.e.e((Object)e, "binding.imageView");
            g.f(e, h);
        }
        final ImageView e2 = this.oC().e;
        sg2.e.e((Object)e2, "binding.imageView");
        if (h == null) {
            visibility = 1;
        }
        else {
            visibility = 0;
        }
        text = 8;
        if (visibility != 0) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((View)e2).setVisibility(visibility);
        ((TextView)this.oC().f).setText(text2);
        if (n2 != null) {
            visibility = n2.intValue();
            ((TextView)this.oC().g).setText(visibility);
        }
        final Button g = this.oC().g;
        sg2.e.e((Object)g, "binding.secondaryButton");
        if (n2 == null) {
            visibility = 1;
        }
        else {
            visibility = 0;
        }
        if (visibility != 0) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((View)g).setVisibility(visibility);
        if (n != null) {
            final TextView b = this.oC().b;
            sg2.e.e((Object)b, "binding.body");
            b.setText(n.intValue());
        }
        final TextView b2 = this.oC().b;
        sg2.e.e((Object)b2, "binding.body");
        if (n == null) {
            visibility = 1;
        }
        else {
            visibility = 0;
        }
        if (visibility != 0) {
            visibility = text;
        }
        else {
            visibility = 0;
        }
        ((View)b2).setVisibility(visibility);
        if (list != null) {
            final a adapter = new a(1);
            final Resources ia = ((Controller)this).IA();
            sg2.e.c((Object)ia);
            visibility = ia.getDimensionPixelSize(2131166906);
            this.oC().c.addItemDecoration((RecyclerView$n)new la2.d(visibility));
            ((z)adapter).n((List)list);
            this.oC().c.setAdapter((RecyclerView$Adapter)adapter);
            final RecyclerView c = this.oC().c;
            sg2.e.e((Object)c, "binding.bodyRecyclerView");
            ((View)c).setVisibility(0);
        }
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        ((ka2.e)this.pC()).A();
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
        final Parcelable parcelable = ((Controller)this).f.getParcelable("notice");
        sg2.e.c((Object)parcelable);
        final InfoNoticeScreen$onInitialize.InfoNoticeScreen$onInitialize$1 infoNoticeScreen$onInitialize$1 = new InfoNoticeScreen$onInitialize.InfoNoticeScreen$onInitialize$1((xa2.d)parcelable, this);
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
        final tt<?, ?> value = ((ut)d4).k().get(InfoNoticeScreen.class);
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
            Label_0386: {
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
                            tt4 = subFeatureInjectors.get(InfoNoticeScreen.class);
                            break Label_0386;
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)infoNoticeScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)InfoNoticeScreen.class, r, " with a\n    dependency factory of type ", (Class)ka2.d.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void dismiss() {
        ((Controller)this).p.B((Controller)this);
    }
    
    public final void nC(final View view) {
        ((View)this.oC().d).setTransitionName(((View)this.oC().a).getResources().getString(2131957961, new Object[] { ((ka2.e)this.pC()).n }));
        ((View)this.oC().h).setTransitionName(((View)this.oC().a).getResources().getString(2131957963, new Object[] { ((ka2.e)this.pC()).n }));
        ((View)this.oC().e).setTransitionName(((View)this.oC().a).getResources().getString(2131957962, new Object[] { ((ka2.e)this.pC()).n }));
        ((View)this.oC().f).setOnClickListener((View$OnClickListener)new m42.a((Object)this, 9));
        ((View)this.oC().g).setOnClickListener((View$OnClickListener)new t32.e((Object)this, 11));
    }
    
    public final n oC() {
        return (n)this.j0.d((l)this, (k)InfoNoticeScreen.k0[0]);
    }
    
    public final b pC() {
        final b i0 = this.i0;
        if (i0 != null) {
            return i0;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void wg(final String s) {
        sg2.e.f((Object)s, "subredditId");
        ((ka2.e)this.pC()).m.b(s);
    }
}
