// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.recoveryphrase.check;

import com.reddit.screen.BaseScreen;
import android.widget.TextView;
import s82.u;
import java.util.Map;
import o90.xt;
import java.util.LinkedHashSet;
import o90.yt;
import o90.tt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import com.reddit.presentation.CoroutinesPresenter;
import java.util.Iterator;
import android.view.View;
import android.view.View$OnClickListener;
import om1.a;
import com.google.android.material.chip.Chip;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import kb1.l;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import i92.b;
import zg2.k;
import i92.c;
import com.reddit.vault.d;

public final class RecoveryPhraseCheckScreen extends d implements c
{
    public static final /* synthetic */ k<Object>[] k0;
    @Inject
    public b i0;
    public final ScreenViewBindingDelegate j0;
    
    static {
        k0 = new k[] { (k)e.v((Class)RecoveryPhraseCheckScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenRecoveryPhraseCheckBinding;", 0) };
    }
    
    public RecoveryPhraseCheckScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625338, bundle);
        this.j0 = com.reddit.screen.util.b.a((l)this, (rg2.l)RecoveryPhraseCheckScreen$binding.RecoveryPhraseCheckScreen$binding$2.INSTANCE);
    }
    
    public static void oC(final ArrayList list, final ChipGroup chipGroup, final rg2.l l) {
        final LayoutInflater from = LayoutInflater.from(((View)chipGroup).getContext());
        ((ViewGroup)chipGroup).removeAllViews();
        for (final String s : list) {
            final View inflate = from.inflate(2131625572, (ViewGroup)chipGroup, false);
            sg2.e.d((Object)inflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            final Chip chip = (Chip)inflate;
            ((TextView)chip).setText((CharSequence)s);
            ((View)chip).setTag((Object)s);
            ((View)chip).setOnClickListener((View$OnClickListener)new a(15, (Object)l, (Object)s));
            ((ViewGroup)chipGroup).addView((View)chip);
        }
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        ((RecoveryPhraseCheckPresenter)this.pC()).A();
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
        final RecoveryPhraseCheckScreen$onInitialize$1 recoveryPhraseCheckScreen$onInitialize$1 = new RecoveryPhraseCheckScreen$onInitialize$1(this);
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
        final tt<?, ?> value = ((ut)d4).k().get(RecoveryPhraseCheckScreen.class);
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
                            tt4 = subFeatureInjectors.get(RecoveryPhraseCheckScreen.class);
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)recoveryPhraseCheckScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)RecoveryPhraseCheckScreen.class, r, " with a\n    dependency factory of type ", (Class)i92.d.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final b pC() {
        final b i0 = this.i0;
        if (i0 != null) {
            return i0;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void y6(final ArrayList list, final ArrayList list2) {
        final ScreenViewBindingDelegate j0 = this.j0;
        final k<Object>[] k0 = RecoveryPhraseCheckScreen.k0;
        final ChipGroup b = ((u)j0.d((l)this, (k)k0[0])).b;
        sg2.e.e((Object)b, "binding.placedChips");
        oC(list, b, (rg2.l)new RecoveryPhraseCheckScreen$displayWords$1(this));
        final ChipGroup c = ((u)this.j0.d((l)this, (k)k0[0])).c;
        sg2.e.e((Object)c, "binding.unplacedChips");
        oC(list2, c, (rg2.l)new RecoveryPhraseCheckScreen$displayWords$2(this));
    }
}
