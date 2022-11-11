// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.protectvaultflow;

import com.reddit.screen.BaseScreen;
import java.util.Map;
import o90.xt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r92.c;
import o90.yt;
import o90.tt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import java.util.ArrayList;
import com.reddit.presentation.CoroutinesPresenter;
import sg2.e;
import android.view.View;
import android.os.Bundle;
import javax.inject.Inject;
import r92.a;
import r92.b;
import com.reddit.vault.d;

public final class ProtectVaultFlowScreen extends d implements b
{
    @Inject
    public a i0;
    
    public ProtectVaultFlowScreen() {
        super(2131625577, (Bundle)null);
    }
    
    public final void PA(final View view) {
        e.f((Object)view, "view");
        super.PA(view);
        final a i0 = this.i0;
        if (i0 != null) {
            ((ProtectVaultFlowPresenter)i0).A();
            return;
        }
        e.n("presenter");
        throw null;
    }
    
    public final void ZA(final View view) {
        e.f((Object)view, "view");
        super.ZA(view);
        final a i0 = this.i0;
        if (i0 != null) {
            ((CoroutinesPresenter)i0).o();
            return;
        }
        e.n("presenter");
        throw null;
    }
    
    public final void ZB() {
        final a i0 = this.i0;
        if (i0 != null) {
            ((CoroutinesPresenter)i0).destroy();
            return;
        }
        e.n("presenter");
        throw null;
    }
    
    public final void aC() {
        super.aC();
        final ProtectVaultFlowScreen$onInitialize.ProtectVaultFlowScreen$onInitialize$1 protectVaultFlowScreen$onInitialize$1 = new ProtectVaultFlowScreen$onInitialize.ProtectVaultFlowScreen$onInitialize$1(this);
        final Object d4;
        Label_0218: {
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
                        break Label_0218;
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
        final tt<?, ?> value = ((ut)d4).k().get(ProtectVaultFlowScreen.class);
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
            Label_0393: {
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
                            tt4 = subFeatureInjectors.get(ProtectVaultFlowScreen.class);
                            break Label_0393;
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)protectVaultFlowScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)ProtectVaultFlowScreen.class, r, " with a\n    dependency factory of type ", (Class)c.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final boolean jC() {
        return false;
    }
}
