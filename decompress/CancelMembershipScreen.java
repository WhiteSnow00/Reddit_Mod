// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.membership.cancel;

import com.reddit.screen.BaseScreen;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.widget.LinearLayout;
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
import x82.i;
import x82.p;
import com.reddit.presentation.CoroutinesPresenter;
import android.content.res.Resources;
import java.util.Date;
import x82.h;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.bluelinelabs.conductor.Controller;
import kb1.l;
import android.os.Bundle;
import a81.e;
import java.text.DateFormat;
import com.reddit.vault.util.BiometricsHandler;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import ja2.b;
import zg2.k;
import com.reddit.vault.feature.errors.ErrorScreen$a;
import ja2.c;
import com.reddit.vault.d;

public final class CancelMembershipScreen extends d implements c, ErrorScreen$a
{
    public static final /* synthetic */ k<Object>[] n0;
    @Inject
    public b i0;
    public final ScreenViewBindingDelegate j0;
    public final BiometricsHandler k0;
    public final DateFormat l0;
    public boolean m0;
    
    static {
        n0 = new k[] { (k)e.v((Class)CancelMembershipScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenCancelMembershipBinding;", 0) };
    }
    
    public CancelMembershipScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625150, bundle);
        this.j0 = com.reddit.screen.util.b.a((l)this, (rg2.l)CancelMembershipScreen$binding.CancelMembershipScreen$binding$2.INSTANCE);
        this.k0 = new BiometricsHandler((d)this);
        this.l0 = DateFormat.getDateInstance(2);
    }
    
    public final void Bs() {
        ((Controller)this).p.B((Controller)this);
    }
    
    public final void C(final CharSequence charSequence) {
        sg2.e.f((Object)charSequence, "errorMessage");
        Toast.makeText((Context)this.lC(), charSequence, 1).show();
    }
    
    public final void I8() {
        final Activity ba = ((Controller)this).BA();
        if (ba != null) {
            ba.onBackPressed();
        }
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        final b i0 = this.i0;
        if (i0 != null) {
            ((CancelMembershipPresenter)i0).A();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void Rr(final h h, final Date date, final String s, final String s2) {
        sg2.e.f((Object)h, "community");
        sg2.e.f((Object)s, "member");
        sg2.e.f((Object)s2, "membership");
        final Resources resources = ((View)this.oC().a).getResources();
        this.oC().f.setText((CharSequence)resources.getString(2131954453, new Object[] { h.x, s }));
        this.oC().b.setText((CharSequence)resources.getString(2131954451, new Object[] { s2, h.x }));
        this.oC().g.setText((CharSequence)resources.getString(2131954454, new Object[] { this.l0.format(date) }));
        ((TextView)this.oC().c).setText((CharSequence)resources.getString(2131954452, new Object[] { s2 }));
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
        final Parcelable parcelable = ((Controller)this).f.getParcelable("entryPoint");
        sg2.e.c((Object)parcelable);
        final p p = (p)parcelable;
        final Parcelable parcelable2 = ((Controller)this).f.getParcelable("community");
        sg2.e.c((Object)parcelable2);
        final h h = (h)parcelable2;
        final Parcelable parcelable3 = ((Controller)this).f.getParcelable("communityMembershipInfo");
        sg2.e.c((Object)parcelable3);
        final CancelMembershipScreen$onInitialize.CancelMembershipScreen$onInitialize$1 cancelMembershipScreen$onInitialize$1 = new CancelMembershipScreen$onInitialize.CancelMembershipScreen$onInitialize$1(p, h, (i)parcelable3, this);
        final Object d4;
        Label_0261: {
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
                        break Label_0261;
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
        final tt<?, ?> value = ((ut)d4).k().get(CancelMembershipScreen.class);
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
            Label_0415: {
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
                            tt4 = subFeatureInjectors.get(CancelMembershipScreen.class);
                            break Label_0415;
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)cancelMembershipScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)CancelMembershipScreen.class, r, " with a\n    dependency factory of type ", (Class)ja2.d.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void hideLoading() {
        this.m0 = false;
        ((View)this.oC().e.b).setVisibility(8);
        this.hC();
    }
    
    public final boolean jC() {
        return this.m0 ^ true;
    }
    
    public final void nC(final View view) {
        ((TextView)this.oC().e.c).setText(2131954765);
        ((View)this.oC().c).setOnClickListener((View$OnClickListener)new x62.a((Object)this, 10));
        ((View)this.oC().d).setOnClickListener((View$OnClickListener)new dv1.a((Object)this, 13));
    }
    
    public final s82.e oC() {
        return (s82.e)this.j0.d((l)this, (k)CancelMembershipScreen.n0[0]);
    }
    
    public final void showLoading() {
        this.m0 = true;
        ((View)this.oC().e.b).setVisibility(0);
        this.hC();
    }
}
