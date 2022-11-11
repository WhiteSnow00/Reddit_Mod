// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.deactivatedvault;

import com.reddit.screen.BaseScreen;
import android.view.View$OnClickListener;
import s82.i;
import java.util.Map;
import o90.xt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o90.yt;
import o90.tt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import java.util.ArrayList;
import com.reddit.presentation.CoroutinesPresenter;
import android.view.View;
import jj2.f;
import rg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import ej2.b0;
import ej2.g;
import lg2.c;
import kb1.l;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import da2.a;
import zg2.k;
import da2.b;
import com.reddit.vault.d;

public final class DeactivatedVaultAlertScreen extends d implements b
{
    public static final /* synthetic */ k<Object>[] k0;
    @Inject
    public a i0;
    public final ScreenViewBindingDelegate j0;
    
    static {
        k0 = new k[] { (k)e.v((Class)DeactivatedVaultAlertScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenDeactivatedVaultBinding;", 0) };
    }
    
    public DeactivatedVaultAlertScreen() {
        super(2131625183, (Bundle)null);
        this.j0 = com.reddit.screen.util.b.a((l)this, (rg2.l)DeactivatedVaultAlertScreen$binding.DeactivatedVaultAlertScreen$binding$2.INSTANCE);
    }
    
    public static void oC(final DeactivatedVaultAlertScreen deactivatedVaultAlertScreen) {
        sg2.e.f((Object)deactivatedVaultAlertScreen, "this$0");
        final a i0 = deactivatedVaultAlertScreen.i0;
        if (i0 != null) {
            final da2.d d = (da2.d)i0;
            final f g = d.g;
            sg2.e.c((Object)g);
            ej2.g.i((b0)g, (CoroutineContext)null, (CoroutineStart)null, (p)new DeactivatedVaultAlertPresenter$onConfirm$1(d, null), 3);
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        final a i0 = this.i0;
        if (i0 != null) {
            ((CoroutinesPresenter)i0).A();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void ZA(final View view) {
        sg2.e.f((Object)view, "view");
        super.ZA(view);
        final a i0 = this.i0;
        if (i0 != null) {
            ((CoroutinesPresenter)i0).o();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void ZB() {
        final a i0 = this.i0;
        if (i0 != null) {
            ((CoroutinesPresenter)i0).destroy();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void aC() {
        super.aC();
        final DeactivatedVaultAlertScreen$onInitialize.DeactivatedVaultAlertScreen$onInitialize$1 deactivatedVaultAlertScreen$onInitialize$1 = new DeactivatedVaultAlertScreen$onInitialize.DeactivatedVaultAlertScreen$onInitialize$1(this);
        final Object d4;
        Label_0216: {
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
                        break Label_0216;
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
        final tt<?, ?> value = ((ut)d4).k().get(DeactivatedVaultAlertScreen.class);
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
            Label_0391: {
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
                            tt4 = subFeatureInjectors.get(DeactivatedVaultAlertScreen.class);
                            break Label_0391;
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)deactivatedVaultAlertScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)DeactivatedVaultAlertScreen.class, r, " with a\n    dependency factory of type ", (Class)da2.c.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void nC(final View view) {
        ((View)((i)this.j0.d((l)this, (k)DeactivatedVaultAlertScreen.k0[0])).b).setOnClickListener((View$OnClickListener)new m42.a((Object)this, 8));
    }
}
