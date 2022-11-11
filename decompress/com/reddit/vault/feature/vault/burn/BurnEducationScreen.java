// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.burn;

import android.os.BaseBundle;
import com.bluelinelabs.conductor.Controller;
import com.reddit.screen.BaseScreen;
import android.widget.TextView;
import com.reddit.vault.data.analytics.Action;
import com.reddit.vault.data.analytics.Noun;
import android.view.View$OnClickListener;
import android.view.View;
import java.util.Map;
import o90.xt;
import o90.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import hg2.j;
import o90.yt;
import o90.tt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import java.util.ArrayList;
import kb1.l;
import com.reddit.screen.util.b;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import i82.a;
import zg2.k;
import com.reddit.vault.d;

public final class BurnEducationScreen extends d
{
    public static final /* synthetic */ k<Object>[] k0;
    @Inject
    public a i0;
    public final ScreenViewBindingDelegate j0;
    
    static {
        k0 = new k[] { (k)e.v((Class)BurnEducationScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenBurnEducationBinding;", 0) };
    }
    
    public BurnEducationScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625148, bundle);
        this.j0 = b.a((l)this, (rg2.l)BurnEducationScreen$binding.BurnEducationScreen$binding$2.INSTANCE);
    }
    
    public final void aC() {
        super.aC();
        final BurnEducationScreen$onInitialize$$inlined$injectFeature.BurnEducationScreen$onInitialize$$inlined$injectFeature$1 instance = BurnEducationScreen$onInitialize$$inlined$injectFeature.BurnEducationScreen$onInitialize$$inlined$injectFeature$1.INSTANCE;
        final Object d4;
        Label_0211: {
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
                        break Label_0211;
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
        final tt<?, ?> value = ((ut)d4).k().get(BurnEducationScreen.class);
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
                            tt4 = subFeatureInjectors.get(BurnEducationScreen.class);
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)instance) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)BurnEducationScreen.class, r, " with a\n    dependency factory of type ", (Class)j.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void nC(final View view) {
        final TextView f = this.oC().f;
        sg2.e.e((Object)f, "binding.title");
        this.pC(f, 2131952260);
        final TextView g = this.oC().g;
        sg2.e.e((Object)g, "binding.title1");
        this.pC(g, 2131954443);
        final TextView c = this.oC().c;
        sg2.e.e((Object)c, "binding.detail1");
        this.pC(c, 2131954439);
        final TextView h = this.oC().h;
        sg2.e.e((Object)h, "binding.title2");
        this.pC(h, 2131954444);
        final TextView d = this.oC().d;
        sg2.e.e((Object)d, "binding.detail2");
        this.pC(d, 2131954440);
        final TextView i = this.oC().i;
        sg2.e.e((Object)i, "binding.title3");
        this.pC(i, 2131954445);
        final TextView e = this.oC().e;
        sg2.e.e((Object)e, "binding.detail3");
        this.pC(e, 2131954441);
        ((View)this.oC().b).setOnClickListener((View$OnClickListener)new dv1.a((Object)this, 12));
        final a i2 = this.i0;
        if (i2 != null) {
            a.a(i2, Noun.ABOUT_BURN_LINK, Action.VIEW, (String)null, (String)null, (String)null, (String)null, (String)null, (Long)null, 252);
            return;
        }
        sg2.e.n("analyticsManager");
        throw null;
    }
    
    public final s82.d oC() {
        return (s82.d)this.j0.d((l)this, (k)BurnEducationScreen.k0[0]);
    }
    
    public final void pC(final TextView textView, final int n) {
        final String string = ((View)textView).getResources().getString(n);
        sg2.e.e((Object)string, "resources.getString(stringRes)");
        final String string2 = ((BaseBundle)((Controller)this).f).getString("communityName");
        sg2.e.c((Object)string2);
        final String k0 = cj2.j.K0(string, "{communityName}", string2, false);
        final String string3 = ((BaseBundle)((Controller)this).f).getString("pointsName");
        sg2.e.c((Object)string3);
        textView.setText((CharSequence)cj2.j.K0(k0, "{pointsName}", string3, false));
    }
}
