// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.settings;

import com.reddit.screen.BaseScreen;
import com.bluelinelabs.conductor.Controller;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.e$a;
import s82.c0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.LinearLayoutManager;
import u92.j;
import android.widget.LinearLayout;
import java.util.Map;
import o90.xt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.io.Serializable;
import o90.yt;
import o90.tt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import java.util.ArrayList;
import com.reddit.presentation.CoroutinesPresenter;
import android.view.View;
import android.content.Context;
import android.widget.Toast;
import jj2.f;
import rg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import ej2.b0;
import ej2.g;
import lg2.c;
import kotlin.Pair;
import kb1.l;
import android.os.Bundle;
import a81.e;
import u92.i;
import com.reddit.vault.util.BiometricsHandler;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import zg2.k;
import h92.a;
import t92.b;
import com.reddit.vault.d;

public final class SettingsScreen extends d implements b, a
{
    public static final /* synthetic */ k<Object>[] m0;
    @Inject
    public t92.a i0;
    public final ScreenViewBindingDelegate j0;
    public final BiometricsHandler k0;
    public i l0;
    
    static {
        m0 = new k[] { (k)e.v((Class)SettingsScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenVaultSettingsBinding;", 0) };
    }
    
    public SettingsScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625405, bundle);
        this.j0 = com.reddit.screen.util.b.a((l)this, (rg2.l)SettingsScreen$binding.SettingsScreen$binding$2.INSTANCE);
        this.k0 = new BiometricsHandler((d)this);
    }
    
    public SettingsScreen(final SettingsScreenEntryPoint settingsScreenEntryPoint) {
        sg2.e.f((Object)settingsScreenEntryPoint, "reference");
        this(bg.d.J(new Pair[] { new Pair((Object)"entryPoint", (Object)settingsScreenEntryPoint) }));
    }
    
    public static void oC(final SettingsScreen settingsScreen) {
        sg2.e.f((Object)settingsScreen, "this$0");
        final SettingsPresenter settingsPresenter = (SettingsPresenter)settingsScreen.qC();
        final f g = ((CoroutinesPresenter)settingsPresenter).g;
        sg2.e.c((Object)g);
        ej2.g.i((b0)g, (CoroutineContext)null, (CoroutineStart)null, (p)new SettingsPresenter$onSignOut$1(settingsPresenter, null), 3);
    }
    
    public final void C(final CharSequence charSequence) {
        sg2.e.f((Object)charSequence, "errorMessage");
        Toast.makeText((Context)this.lC(), charSequence, 1).show();
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        ((SettingsPresenter)this.qC()).A();
    }
    
    public final void ZA(final View view) {
        sg2.e.f((Object)view, "view");
        super.ZA(view);
        ((CoroutinesPresenter)this.qC()).o();
    }
    
    public final void ZB() {
        ((CoroutinesPresenter)this.qC()).destroy();
    }
    
    public final void aC() {
        super.aC();
        final Serializable serializable = ((Controller)this).f.getSerializable("entryPoint");
        sg2.e.d((Object)serializable, "null cannot be cast to non-null type com.reddit.vault.feature.settings.SettingsScreenEntryPoint");
        final SettingsScreen$onInitialize.SettingsScreen$onInitialize$1 settingsScreen$onInitialize$1 = new SettingsScreen$onInitialize.SettingsScreen$onInitialize$1(this, (SettingsScreenEntryPoint)serializable);
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
        final tt<?, ?> value = ((ut)d4).k().get(SettingsScreen.class);
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
                            tt4 = subFeatureInjectors.get(SettingsScreen.class);
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)settingsScreen$onInitialize$1) != null) {
            this.l0 = new i();
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)SettingsScreen.class, r, " with a\n    dependency factory of type ", (Class)t92.c.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void hideLoading() {
        final LinearLayout linearLayout = (LinearLayout)this.pC().b.b;
        sg2.e.e((Object)linearLayout, "binding.loadingView.root");
        ((View)linearLayout).setVisibility(8);
    }
    
    public final void lc(final List<? extends j> k) {
        sg2.e.f((Object)k, "items");
        final i l0 = this.l0;
        if (l0 != null) {
            l0.k = k;
            ((RecyclerView$Adapter)l0).notifyDataSetChanged();
            return;
        }
        sg2.e.n("adapter");
        throw null;
    }
    
    public final void nC(final View view) {
        this.pC().c.setLayoutManager((RecyclerView$o)new LinearLayoutManager((Context)this.lC()));
        final RecyclerView c = this.pC().c;
        final i l0 = this.l0;
        if (l0 != null) {
            c.setAdapter((RecyclerView$Adapter)l0);
            return;
        }
        sg2.e.n("adapter");
        throw null;
    }
    
    public final void or() {
        ((SettingsPresenter)this.qC()).Ac();
        ((Controller)this).p.C();
    }
    
    public final c0 pC() {
        return (c0)this.j0.d((l)this, (k)SettingsScreen.m0[0]);
    }
    
    public final t92.a qC() {
        final t92.a i0 = this.i0;
        if (i0 != null) {
            return i0;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void qm() {
        android.support.v4.media.a.e(new e$a((Context)this.lC()), 2131955087, 2131955086, 2131952326, (DialogInterface$OnClickListener)null).setPositiveButton(2131955087, (DialogInterface$OnClickListener)new em.a((Object)this, 6)).show();
    }
    
    public final void showLoading() {
        final LinearLayout linearLayout = (LinearLayout)this.pC().b.b;
        sg2.e.e((Object)linearLayout, "binding.loadingView.root");
        ((View)linearLayout).setVisibility(0);
    }
}
