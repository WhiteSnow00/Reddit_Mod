// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.protectvault;

import com.reddit.screen.BaseScreen;
import com.bluelinelabs.conductor.Controller;
import android.widget.TextView;
import s82.s;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View$OnClickListener;
import android.view.MenuItem;
import android.view.MenuItem$OnMenuItemClickListener;
import q92.f;
import androidx.appcompat.widget.Toolbar;
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
import com.reddit.vault.h;
import com.reddit.vault.ProtectVaultEvent;
import x82.u;
import android.view.View;
import android.widget.Button;
import kotlin.Pair;
import x82.b0;
import kb1.l;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import q92.b;
import zg2.k;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen;
import h92.a;
import q92.c;
import com.reddit.vault.d;

public final class ProtectVaultScreen extends d implements c, a, MasterKeyScreen.a
{
    public static final /* synthetic */ k<Object>[] k0;
    @Inject
    public b i0;
    public final ScreenViewBindingDelegate j0;
    
    static {
        k0 = new k[] { (k)e.v((Class)ProtectVaultScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenProtectVaultBinding;", 0) };
    }
    
    public ProtectVaultScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625324, bundle);
        this.j0 = com.reddit.screen.util.b.a((l)this, (rg2.l)ProtectVaultScreen$binding.ProtectVaultScreen$binding$2.INSTANCE);
    }
    
    public ProtectVaultScreen(final b0 b0) {
        sg2.e.f((Object)b0, "state");
        this(bg.d.J(new Pair[] { new Pair((Object)"state", (Object)b0) }));
    }
    
    public final void It(final boolean b) {
        final Button e = this.oC().e;
        sg2.e.e((Object)e, "binding.manualBackupButton");
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)e).setVisibility(visibility);
    }
    
    public final boolean KA() {
        return !((q92.e)this.pC()).r || super.KA();
    }
    
    public final void Lm(final int text) {
        this.oC().c.setText(text);
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        ((q92.e)this.pC()).A();
    }
    
    public final void Qn(final u u) {
        sg2.e.f((Object)u, "phrase");
    }
    
    public final void Yk() {
        final q92.e e = (q92.e)this.pC();
        final h o = e.o;
        if (o != null) {
            o.Sz();
        }
        final h o2 = e.o;
        if (o2 != null) {
            o2.u6(ProtectVaultEvent.PasswordBackedUp);
        }
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
        final Parcelable parcelable = ((Controller)this).f.getParcelable("state");
        sg2.e.c((Object)parcelable);
        final ProtectVaultScreen$onInitialize.ProtectVaultScreen$onInitialize$1 protectVaultScreen$onInitialize$1 = new ProtectVaultScreen$onInitialize.ProtectVaultScreen$onInitialize$1((b0)parcelable, this);
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
        final tt<?, ?> value = ((ut)d4).k().get(ProtectVaultScreen.class);
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
                            tt4 = subFeatureInjectors.get(ProtectVaultScreen.class);
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)protectVaultScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)ProtectVaultScreen.class, r, " with a\n    dependency factory of type ", (Class)q92.d.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void iC(final Toolbar toolbar) {
        super.iC(toolbar);
        toolbar.k(2131689519);
        final MenuItem item = toolbar.getMenu().findItem(2131427519);
        item.setVisible(((q92.e)this.pC()).s);
        item.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)new f(this));
    }
    
    public final boolean jC() {
        return ((q92.e)this.pC()).r;
    }
    
    public final void nC(final View view) {
        ((View)this.oC().f).setOnClickListener((View$OnClickListener)new x62.a((Object)this, 7));
        ((View)this.oC().e).setOnClickListener((View$OnClickListener)new dv1.a((Object)this, 11));
        this.oC().d.setAnimation("protect_your_vault.json");
        this.oC().d.setRepeatCount(-1);
        this.oC().d.h();
        this.oC().d.n.g.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ck0.a((Object)this, 5));
    }
    
    public final s oC() {
        return (s)this.j0.d((l)this, (k)ProtectVaultScreen.k0[0]);
    }
    
    public final void or() {
        final q92.e e = (q92.e)this.pC();
        e.q.a(e.j.a.g);
        final h o = e.o;
        if (o != null) {
            o.Sz();
        }
        final h o2 = e.o;
        if (o2 != null) {
            o2.u6(ProtectVaultEvent.ManualBackedUp);
        }
    }
    
    public final b pC() {
        final b i0 = this.i0;
        if (i0 != null) {
            return i0;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void wt(final boolean b) {
        final TextView b2 = this.oC().b;
        sg2.e.e((Object)b2, "binding.backupCompleted");
        final int n = 8;
        int visibility;
        if (b) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((View)b2).setVisibility(visibility);
        final Button f = this.oC().f;
        sg2.e.e((Object)f, "binding.redditBackupButton");
        int visibility2 = n;
        if (b) {
            visibility2 = 0;
        }
        ((View)f).setVisibility(visibility2);
    }
}
