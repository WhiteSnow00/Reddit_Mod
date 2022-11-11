// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.settings.learnmore;

import android.widget.TextView;
import com.reddit.screen.BaseScreen;
import android.os.BaseBundle;
import com.bluelinelabs.conductor.Controller;
import s82.o;
import android.view.View$OnClickListener;
import androidx.viewpager.widget.ViewPager$j;
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
import android.widget.LinearLayout;
import kotlin.Pair;
import x82.p;
import kb1.l;
import com.reddit.screen.util.b;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import y92.c;
import zg2.k;
import com.reddit.vault.d;

public final class LearnMoreScreen extends com.reddit.vault.d implements d
{
    public static final /* synthetic */ k<Object>[] k0;
    @Inject
    public c i0;
    public final ScreenViewBindingDelegate j0;
    
    static {
        k0 = new k[] { (k)e.v((Class)LearnMoreScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenLearnMoreBinding;", 0) };
    }
    
    public LearnMoreScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625234, bundle);
        this.j0 = b.a((l)this, (rg2.l)LearnMoreScreen$binding.LearnMoreScreen$binding$2.INSTANCE);
    }
    
    public LearnMoreScreen(final p p2, final boolean b) {
        sg2.e.f((Object)p2, "entryPoint");
        this(bg.d.J(new Pair[] { new Pair((Object)"entryPoint", (Object)p2), new Pair((Object)"allowVaultCreation", (Object)b) }));
    }
    
    public final void A() {
        ((View)this.oC().b.b).setVisibility(0);
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        final c i0 = this.i0;
        if (i0 != null) {
            ((LearnMorePresenter)i0).A();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void ZA(final View view) {
        sg2.e.f((Object)view, "view");
        super.ZA(view);
        final c i0 = this.i0;
        if (i0 != null) {
            ((CoroutinesPresenter)i0).o();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void ZB() {
        final c i0 = this.i0;
        if (i0 != null) {
            ((CoroutinesPresenter)i0).destroy();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void aC() {
        super.aC();
        final Parcelable parcelable = ((Controller)this).f.getParcelable("entryPoint");
        sg2.e.c((Object)parcelable);
        final LearnMoreScreen$onInitialize.LearnMoreScreen$onInitialize$1 learnMoreScreen$onInitialize$1 = new LearnMoreScreen$onInitialize.LearnMoreScreen$onInitialize$1((p)parcelable, ((BaseBundle)((Controller)this).f).getBoolean("allowVaultCreation"), this);
        final Object d4;
        Label_0240: {
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
                        break Label_0240;
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
        final tt<?, ?> value = ((ut)d4).k().get(LearnMoreScreen.class);
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
            Label_0395: {
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
                            tt4 = subFeatureInjectors.get(LearnMoreScreen.class);
                            break Label_0395;
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)learnMoreScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)LearnMoreScreen.class, r, " with a\n    dependency factory of type ", (Class)y92.e.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void nC(final View view) {
        this.oC().f.addOnPageChangeListener((ViewPager$j)new LearnMoreScreen$a(this));
        ((View)this.oC().d).setOnClickListener((View$OnClickListener)new t32.e((Object)this, 8));
        ((View)this.oC().c).setOnClickListener((View$OnClickListener)new zv1.a((Object)this, 12));
    }
    
    public final o oC() {
        return (o)this.j0.d((l)this, (k)LearnMoreScreen.k0[0]);
    }
    
    public final void xz(final int text, final ArrayList list) {
        ((TextView)this.oC().c).setText(text);
        this.oC().f.setAdapter((androidx.viewpager.widget.a)new y92.a(list));
        final PageIndicator e = this.oC().e;
        final androidx.viewpager.widget.a adapter = this.oC().f.getAdapter();
        sg2.e.c((Object)adapter);
        e.setPageCount(adapter.getCount());
        ((View)this.oC().b.b).setVisibility(8);
    }
}
