// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.coins;

import com.reddit.screen.BaseScreen;
import android.os.BaseBundle;
import com.bluelinelabs.conductor.Controller;
import android.app.Activity;
import androidx.appcompat.widget.Toolbar;
import s82.t;
import android.widget.ImageButton;
import android.view.View$OnTouchListener;
import android.view.View$OnLongClickListener;
import zr1.f;
import android.view.View$OnClickListener;
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
import android.view.View;
import android.widget.ImageView;
import fb2.g;
import android.widget.LinearLayout;
import kotlin.Pair;
import x82.p;
import kb1.l;
import com.reddit.screen.util.b;
import android.os.Bundle;
import a81.e;
import android.os.Handler;
import hg2.j;
import rg2.a;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import ba2.c;
import zg2.k;
import com.reddit.vault.feature.vault.transaction.approve.ApproveTransactionScreen$a;
import com.reddit.vault.d;

public final class PurchaseCoinsScreen extends d implements ba2.d, ApproveTransactionScreen$a
{
    public static final /* synthetic */ k<Object>[] n0;
    @Inject
    public c i0;
    public final ScreenViewBindingDelegate j0;
    public a<j> k0;
    public final Handler l0;
    public final PurchaseCoinsScreen$a m0;
    
    static {
        n0 = new k[] { (k)e.v((Class)PurchaseCoinsScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenPurchaseCoinsBinding;", 0) };
    }
    
    public PurchaseCoinsScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625325, bundle);
        this.j0 = b.a((l)this, (rg2.l)PurchaseCoinsScreen$binding.PurchaseCoinsScreen$binding$2.INSTANCE);
        this.l0 = new Handler();
        this.m0 = new PurchaseCoinsScreen$a(this);
    }
    
    public PurchaseCoinsScreen(final p p2, final String s) {
        sg2.e.f((Object)p2, "entryPoint");
        sg2.e.f((Object)s, "subredditId");
        this(bg.d.J(new Pair[] { new Pair((Object)"entryPoint", (Object)p2), new Pair((Object)"subredditId", (Object)s) }));
    }
    
    public final void A() {
        final LinearLayout linearLayout = (LinearLayout)this.oC().f.b;
        sg2.e.e((Object)linearLayout, "binding.loadingView.root");
        ((View)linearLayout).setVisibility(0);
    }
    
    public final void Fm(final String s, final String s2) {
        sg2.e.f((Object)s, "title");
        this.hC();
        final ImageView g = this.oC().g;
        sg2.e.e((Object)g, "binding.pointsIcon");
        fb2.g.b(g, s2, 2131231702);
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        ((m81.d)this.pC()).A();
    }
    
    public final void ZA(final View view) {
        sg2.e.f((Object)view, "view");
        super.ZA(view);
        ((m81.d)this.pC()).o();
    }
    
    public final void ZB() {
        ((m81.d)this.pC()).destroy();
    }
    
    public final void aC() {
        super.aC();
        final Parcelable parcelable = ((Controller)this).f.getParcelable("entryPoint");
        sg2.e.c((Object)parcelable);
        final p p = (p)parcelable;
        final String string = ((BaseBundle)((Controller)this).f).getString("subredditId");
        sg2.e.c((Object)string);
        final PurchaseCoinsScreen$onInitialize.PurchaseCoinsScreen$onInitialize$1 purchaseCoinsScreen$onInitialize$1 = new PurchaseCoinsScreen$onInitialize.PurchaseCoinsScreen$onInitialize$1(p, string, this);
        final Object d4;
        Label_0249: {
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
                        break Label_0249;
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
        final tt<?, ?> value = ((ut)d4).k().get(PurchaseCoinsScreen.class);
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
            Label_0404: {
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
                            tt4 = subFeatureInjectors.get(PurchaseCoinsScreen.class);
                            break Label_0404;
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
        if (tt3 != null && tt3.inject(this, (a<?>)purchaseCoinsScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)PurchaseCoinsScreen.class, r, " with a\n    dependency factory of type ", (Class)ba2.e.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void nC(final View view) {
        final ImageButton i = this.oC().i;
        sg2.e.e((Object)i, "binding.subtractButton");
        final PurchaseCoinsScreen$onViewCreated.PurchaseCoinsScreen$onViewCreated$1 purchaseCoinsScreen$onViewCreated$1 = new PurchaseCoinsScreen$onViewCreated.PurchaseCoinsScreen$onViewCreated$1((Object)this.pC());
        ((View)i).setOnClickListener((View$OnClickListener)new qn0.c((a)purchaseCoinsScreen$onViewCreated$1, 8));
        ((View)i).setOnLongClickListener((View$OnLongClickListener)new f(2, (Object)this, (Object)purchaseCoinsScreen$onViewCreated$1));
        ((View)i).setOnTouchListener((View$OnTouchListener)new ba2.f(this, (a)purchaseCoinsScreen$onViewCreated$1));
        final ImageButton b = this.oC().b;
        sg2.e.e((Object)b, "binding.addButton");
        final PurchaseCoinsScreen$onViewCreated.PurchaseCoinsScreen$onViewCreated$2 purchaseCoinsScreen$onViewCreated$2 = new PurchaseCoinsScreen$onViewCreated.PurchaseCoinsScreen$onViewCreated$2((Object)this.pC());
        ((View)b).setOnClickListener((View$OnClickListener)new qn0.c((a)purchaseCoinsScreen$onViewCreated$2, 8));
        ((View)b).setOnLongClickListener((View$OnLongClickListener)new f(2, (Object)this, (Object)purchaseCoinsScreen$onViewCreated$2));
        ((View)b).setOnTouchListener((View$OnTouchListener)new ba2.f(this, (a)purchaseCoinsScreen$onViewCreated$2));
        ((View)this.oC().e).setOnClickListener((View$OnClickListener)new m42.a((Object)this, 7));
    }
    
    public final t oC() {
        return (t)this.j0.d((l)this, (k)PurchaseCoinsScreen.n0[0]);
    }
    
    public final c pC() {
        final c i0 = this.i0;
        if (i0 != null) {
            return i0;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void ro(final ba2.a a, final String text, final String text2) {
        sg2.e.f((Object)a, "coinsBundle");
        sg2.e.f((Object)text2, "points");
        this.oC().c.setImageResource(a.g);
        this.oC().d.setText(a.h);
        this.oC().h.setText((CharSequence)text);
        this.oC().j.setText((CharSequence)text2);
        final LinearLayout linearLayout = (LinearLayout)this.oC().f.b;
        sg2.e.e((Object)linearLayout, "binding.loadingView.root");
        ((View)linearLayout).setVisibility(8);
    }
    
    public final void vB(final Toolbar toolbar) {
        super.vB(toolbar);
        toolbar.setTitle((CharSequence)this.pC().getTitle());
    }
    
    public final void yt() {
        final Activity ba = ((Controller)this).BA();
        if (ba != null) {
            ba.onBackPressed();
        }
    }
}
