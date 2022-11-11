// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.createvault;

import androidx.recyclerview.widget.RecyclerView;
import com.reddit.screen.BaseScreen;
import com.bluelinelabs.conductor.Controller;
import android.content.Context;
import com.reddit.vault.widget.SizeListenerRecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.j0;
import java.util.Map;
import o90.xt;
import java.util.LinkedHashSet;
import android.os.Parcelable;
import n92.h;
import n92.i$c;
import o90.yt;
import o90.tt;
import o90.ut;
import java.util.Iterator;
import java.util.ArrayList;
import d8.c;
import kotlin.collections.CollectionsKt___CollectionsKt;
import x82.u;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import n92.n;
import android.widget.LinearLayout;
import kotlin.Pair;
import n92.i;
import kb1.l;
import com.reddit.screen.util.b;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import n92.f;
import zg2.k;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen;
import n92.g;
import com.reddit.vault.d;

public final class CreateVaultScreen extends d implements g, a, IgnoreRecoveryConfirmationScreen$a, ConfirmRestorePreviousVaultScreen$a
{
    public static final /* synthetic */ k<Object>[] l0;
    @Inject
    public f i0;
    public final ScreenViewBindingDelegate j0;
    public CreateVaultAdapter k0;
    
    static {
        l0 = new k[] { (k)e.v((Class)CreateVaultScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenCreateVaultBinding;", 0) };
    }
    
    public CreateVaultScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625177, bundle);
        this.j0 = b.a((l)this, (rg2.l)CreateVaultScreen$binding.CreateVaultScreen$binding$2.INSTANCE);
    }
    
    public CreateVaultScreen(final k92.b b, final i i) {
        sg2.e.f((Object)b, "state");
        sg2.e.f((Object)i, "mode");
        this(bg.d.J(new Pair[] { new Pair((Object)"state", (Object)b), new Pair((Object)"style", (Object)i) }));
    }
    
    public final void A() {
        final LinearLayout linearLayout = (LinearLayout)this.oC().b.b;
        sg2.e.e((Object)linearLayout, "binding.loadingView.root");
        ((View)linearLayout).setVisibility(0);
    }
    
    public final boolean KA() {
        return this.pC().t3() || super.KA();
    }
    
    public final void Oi() {
        final LinearLayout linearLayout = (LinearLayout)this.oC().b.b;
        sg2.e.e((Object)linearLayout, "binding.loadingView.root");
        ((View)linearLayout).setVisibility(8);
        final CreateVaultAdapter k0 = this.k0;
        if (k0 != null) {
            final androidx.recyclerview.widget.n.e a = androidx.recyclerview.widget.n.a((androidx.recyclerview.widget.n.b)new n((List)k0.n, k0.l.a(), 0), true);
            k0.n = k0.l.a();
            a.b(k0);
            return;
        }
        sg2.e.n("adapter");
        throw null;
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        ((m81.d)this.pC()).A();
    }
    
    public final void Qn(final u u) {
        sg2.e.f((Object)u, "phrase");
        final ArrayList e = ((Controller)this).p.e();
        final Iterator iterator = ((Controller)this).p.e().iterator();
        int n = 0;
        while (true) {
            while (iterator.hasNext()) {
                if (sg2.e.a((Object)((b8.e)iterator.next()).a, (Object)this)) {
                    ((Controller)this).p.P(CollectionsKt___CollectionsKt.j4((Iterable)e, n + 1), (com.bluelinelabs.conductor.c)new c());
                    this.pC().z5(u);
                    return;
                }
                ++n;
            }
            n = -1;
            continue;
        }
    }
    
    public final void Yk() {
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
        final Parcelable parcelable = ((Controller)this).f.getParcelable("state");
        sg2.e.c((Object)parcelable);
        final k92.b b = (k92.b)parcelable;
        final Parcelable parcelable2 = ((Controller)this).f.getParcelable("style");
        sg2.e.c((Object)parcelable2);
        final i i = (i)parcelable2;
        final CreateVaultScreen$onInitialize$1 createVaultScreen$onInitialize$1 = new CreateVaultScreen$onInitialize$1(b, i, this);
        final Object d4;
        Label_0254: {
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
                        break Label_0254;
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
        final tt<?, ?> value = ((ut)d4).k().get(CreateVaultScreen.class);
        final boolean b2 = value instanceof tt;
        final tt tt = null;
        tt<?, ?> tt2;
        if (b2) {
            tt2 = value;
        }
        else {
            tt2 = null;
        }
        tt<?, ?> tt3 = tt2;
        if (tt2 == null) {
            final o90.c zk = ((BaseScreen)this).Zk();
            tt tt4 = null;
            Label_0409: {
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
                            tt4 = subFeatureInjectors.get(CreateVaultScreen.class);
                            break Label_0409;
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)createVaultScreen$onInitialize$1) != null) {
            this.k0 = new CreateVaultAdapter(i instanceof i$c, this.pC(), this.pC());
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)CreateVaultScreen.class, r, " with a\n    dependency factory of type ", (Class)h.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void nC(final View view) {
        ((RecyclerView)this.oC().c).setHasFixedSize(true);
        final RecyclerView$l itemAnimator = ((RecyclerView)this.oC().c).getItemAnimator();
        sg2.e.d((Object)itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((j0)itemAnimator).g = false;
        final SizeListenerRecyclerView c = this.oC().c;
        final Context context = ((View)this.oC().a).getContext();
        sg2.e.e((Object)context, "binding.root.context");
        ((RecyclerView)c).setLayoutManager((RecyclerView$o)new CreateVaultLayoutManager(context));
        final SizeListenerRecyclerView c2 = this.oC().c;
        final CreateVaultAdapter k0 = this.k0;
        if (k0 != null) {
            ((RecyclerView)c2).setAdapter((RecyclerView$Adapter)k0);
            return;
        }
        sg2.e.n("adapter");
        throw null;
    }
    
    public final s82.h oC() {
        return (s82.h)this.j0.d((l)this, (k)CreateVaultScreen.l0[0]);
    }
    
    public final f pC() {
        final f i0 = this.i0;
        if (i0 != null) {
            return i0;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void s3() {
        this.pC().s3();
    }
    
    public final void x2(final x82.a a) {
        this.pC().x2(a);
    }
}
