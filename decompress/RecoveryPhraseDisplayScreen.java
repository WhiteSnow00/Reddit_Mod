// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.recoveryphrase.display;

import com.reddit.screen.BaseScreen;
import android.os.BaseBundle;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$a;
import com.bluelinelabs.conductor.Controller;
import s82.v;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import ig2.t;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import x82.u;
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
import kb1.l;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import j92.b;
import zg2.k;
import h92.a;
import j92.c;
import com.reddit.vault.d;

public final class RecoveryPhraseDisplayScreen extends d implements c, a
{
    public static final /* synthetic */ k<Object>[] k0;
    @Inject
    public b i0;
    public final ScreenViewBindingDelegate j0;
    
    static {
        k0 = new k[] { (k)e.v((Class)RecoveryPhraseDisplayScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenRecoveryPhraseDisplayBinding;", 0) };
    }
    
    public RecoveryPhraseDisplayScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625339, bundle);
        this.j0 = com.reddit.screen.util.b.a((l)this, (rg2.l)RecoveryPhraseDisplayScreen$binding.RecoveryPhraseDisplayScreen$binding$2.INSTANCE);
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        ((RecoveryPhraseDisplayPresenter)this.pC()).A();
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
        final RecoveryPhraseDisplayScreen$onInitialize$1 recoveryPhraseDisplayScreen$onInitialize$1 = new RecoveryPhraseDisplayScreen$onInitialize$1(((BaseBundle)((Controller)this).f).getBoolean("forOnboarding"), this);
        final Object d4;
        Label_0225: {
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
                        break Label_0225;
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
        final tt<?, ?> value = ((ut)d4).k().get(RecoveryPhraseDisplayScreen.class);
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
            Label_0400: {
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
                            tt4 = subFeatureInjectors.get(RecoveryPhraseDisplayScreen.class);
                            break Label_0400;
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)recoveryPhraseDisplayScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)RecoveryPhraseDisplayScreen.class, r, " with a\n    dependency factory of type ", (Class)j92.d.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void f6(final u u) {
        final LayoutInflater from = LayoutInflater.from(((View)this.oC().a).getContext());
        final List s1 = lw0.b.s1((Object[])new LinearLayout[] { this.oC().g, this.oC().h, this.oC().i, this.oC().j });
        final Iterator iterator = s1.iterator();
        while (iterator.hasNext()) {
            ((ViewGroup)iterator.next()).removeAllViews();
        }
        final Iterator iterator2 = CollectionsKt___CollectionsKt.r3((Iterable)CollectionsKt___CollectionsKt.v4((Iterable)u.f), 3).iterator();
        int n = 0;
        while (iterator2.hasNext()) {
            final Object next = iterator2.next();
            if (n < 0) {
                lw0.b.I2();
                throw null;
            }
            final List list = (List)next;
            final Object value = s1.get(n);
            sg2.e.e(value, "rowLayouts[row]");
            final LinearLayout linearLayout = (LinearLayout)value;
            for (final t t : list) {
                final int a = t.a;
                final String text = (String)t.b;
                final View inflate = from.inflate(2131625573, (ViewGroup)linearLayout, false);
                ((ViewGroup)linearLayout).addView(inflate);
                int n2 = 2131430305;
                final TextView textView = (TextView)a92.b.G(2131430305, inflate);
                if (textView != null) {
                    n2 = 2131432297;
                    final TextView textView2 = (TextView)a92.b.G(2131432297, inflate);
                    if (textView2 != null) {
                        final LinearLayout linearLayout2 = (LinearLayout)inflate;
                        textView.setText((CharSequence)String.valueOf(a + 1));
                        textView2.setText((CharSequence)text);
                        continue;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(n2)));
            }
            ++n;
        }
    }
    
    public final void nC(final View view) {
        ((View)this.oC().b).setOnClickListener((View$OnClickListener)new dv1.a((Object)this, 9));
        ((View)this.oC().c).setOnClickListener((View$OnClickListener)new jp1.e((Object)this, 26));
        final ArrayList list = new ArrayList(12);
        for (int i = 0; i < 12; ++i) {
            list.add("\u2026");
        }
        this.f6(new u((List)list));
    }
    
    public final v oC() {
        return (v)this.j0.d((l)this, (k)RecoveryPhraseDisplayScreen.k0[0]);
    }
    
    public final void or() {
        final Controller ja = ((Controller)this).JA();
        sg2.e.d((Object)ja, "null cannot be cast to non-null type com.reddit.vault.feature.recoveryphrase.RecoveryPhraseListener");
        ((a)ja).or();
    }
    
    public final b pC() {
        final b i0 = this.i0;
        if (i0 != null) {
            return i0;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void ys(final int imageResource, final int text, final int textColor, final String text2, final boolean b) {
        this.oC().d.setImageResource(imageResource);
        this.oC().e.setText(text);
        this.oC().e.setTextColor(textColor);
        this.oC().f.setText((CharSequence)text2);
        if (b) {
            final TextView e = this.oC().e;
            sg2.e.e((Object)e, "binding.statusText");
            final ViewGroup$LayoutParams layoutParams = ((View)e).getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            final ConstraintLayout$a layoutParams2 = (ConstraintLayout$a)layoutParams;
            layoutParams2.k = 2131431424;
            ((View)e).setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        }
        else {
            ((View)this.oC().d).setPadding(0, (int)((View)this.oC().a).getResources().getDimension(2131166540), 0, 0);
        }
    }
}
