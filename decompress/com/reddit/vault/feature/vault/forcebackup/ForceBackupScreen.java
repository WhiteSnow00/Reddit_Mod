// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.forcebackup;

import com.reddit.screen.BaseScreen;
import rg2.p;
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
import android.widget.Button;
import ha2.a$a;
import android.view.View;
import kb1.l;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import ha2.b;
import zg2.k;
import h92.a;
import ha2.c;
import com.reddit.vault.d;

public final class ForceBackupScreen extends d implements c, a
{
    public static final /* synthetic */ k<Object>[] k0;
    @Inject
    public b i0;
    public final ScreenViewBindingDelegate j0;
    
    static {
        k0 = new k[] { (k)e.v((Class)ForceBackupScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenForceBackupBinding;", 0) };
    }
    
    public ForceBackupScreen() {
        super(2131625205, (Bundle)null);
        this.j0 = com.reddit.screen.util.b.a((l)this, (rg2.l)ForceBackupScreen$binding.ForceBackupScreen$binding$2.INSTANCE);
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        final b i0 = this.i0;
        if (i0 != null) {
            ((ForceBackupPresenter)i0).A();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void Tb(final int text, final int text2, final int imageResource, final a$a a$a, final ha2.a a) {
        sg2.e.f((Object)a, "button2");
        this.oC().f.setText(text);
        this.oC().b.setText(text2);
        this.oC().c.setImageResource(imageResource);
        final ForceBackupScreen$displayData$bindButton$1 instance = ForceBackupScreen$displayData$bindButton$1.INSTANCE;
        final Button d = this.oC().d;
        sg2.e.e((Object)d, "binding.primaryButton");
        ((p<Button, ha2.a, Object>)instance).invoke(d, (ha2.a)a$a);
        final Button e = this.oC().e;
        sg2.e.e((Object)e, "binding.secondaryButton");
        ((p<Button, ha2.a, Object>)instance).invoke(e, a);
    }
    
    public final void ZA(final View view) {
        sg2.e.f((Object)view, "view");
        super.ZA(view);
        final b i0 = this.i0;
        if (i0 != null) {
            ((CoroutinesPresenter)i0).o();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void ZB() {
        final b i0 = this.i0;
        if (i0 != null) {
            ((CoroutinesPresenter)i0).destroy();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void aC() {
        super.aC();
        final ForceBackupScreen$onInitialize.ForceBackupScreen$onInitialize$1 forceBackupScreen$onInitialize$1 = new ForceBackupScreen$onInitialize.ForceBackupScreen$onInitialize$1(this);
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
        final tt<?, ?> value = ((ut)d4).k().get(ForceBackupScreen.class);
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
                            tt4 = subFeatureInjectors.get(ForceBackupScreen.class);
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)forceBackupScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)ForceBackupScreen.class, r, " with a\n    dependency factory of type ", (Class)ha2.d.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final s82.k oC() {
        return (s82.k)this.j0.d((l)this, (k)ForceBackupScreen.k0[0]);
    }
    
    public final void or() {
        final b i0 = this.i0;
        if (i0 != null) {
            ((ForceBackupPresenter)i0).n.w("force_backup");
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
}
