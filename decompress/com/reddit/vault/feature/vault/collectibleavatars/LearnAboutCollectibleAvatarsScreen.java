// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.collectibleavatars;

import com.bluelinelabs.conductor.Controller;
import rg2.p;
import com.reddit.screen.BaseScreen;
import z0.r0;
import hg2.j;
import z0.t0;
import z0.y0;
import rg2.q;
import androidx.compose.runtime.ComposerImpl;
import rg2.l;
import ca2.f;
import sg2.e;
import androidx.compose.runtime.ComposerKt;
import z0.d;
import java.util.Map;
import o90.xt;
import o90.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o90.yt;
import o90.tt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import java.util.ArrayList;
import o90.b;
import android.os.Bundle;
import javax.inject.Inject;
import h92.a;
import com.reddit.screen.ComposeScreen;

public final class LearnAboutCollectibleAvatarsScreen extends ComposeScreen implements a
{
    @Inject
    public com.reddit.vault.feature.vault.collectibleavatars.a g0;
    
    public LearnAboutCollectibleAvatarsScreen() {
        this(null);
    }
    
    public LearnAboutCollectibleAvatarsScreen(final Bundle bundle) {
        super(bundle);
    }
    
    public final void aC() {
        super.aC();
        final LearnAboutCollectibleAvatarsScreen$onInitialize.LearnAboutCollectibleAvatarsScreen$onInitialize$1 learnAboutCollectibleAvatarsScreen$onInitialize$1 = new LearnAboutCollectibleAvatarsScreen$onInitialize.LearnAboutCollectibleAvatarsScreen$onInitialize$1(this);
        final Object d4;
        Label_0216: {
            if (b.a) {
                synchronized (b.b) {
                    final LinkedHashSet c = b.c;
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
            final LinkedHashSet c2 = b.c;
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
        final tt<?, ?> value = ((ut)d4).k().get(LearnAboutCollectibleAvatarsScreen.class);
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
            final c zk = ((BaseScreen)this).Zk();
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
                            tt4 = subFeatureInjectors.get(LearnAboutCollectibleAvatarsScreen.class);
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)learnAboutCollectibleAvatarsScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)LearnAboutCollectibleAvatarsScreen.class, r, " with a\n    dependency factory of type ", (Class)ca2.b.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void gC(final d d, final int n) {
        final ComposerImpl s = d.s(-911115654);
        final q<z0.c<?>, y0, t0, j> a = ComposerKt.a;
        final com.reddit.vault.feature.vault.collectibleavatars.a g0 = this.g0;
        if (g0 == null) {
            e.n("viewModel");
            throw null;
        }
        final f f = (f)g0.f().getValue();
        final com.reddit.vault.feature.vault.collectibleavatars.a g2 = this.g0;
        if (g2 != null) {
            LearnAboutCollectibleAvatarsScreenContentKt.a(f, (l)new LearnAboutCollectibleAvatarsScreen$Content.LearnAboutCollectibleAvatarsScreen$Content$1((Object)g2), (d)s, 8);
            final r0 u = s.U();
            if (u != null) {
                u.d = (p)new LearnAboutCollectibleAvatarsScreen$Content.LearnAboutCollectibleAvatarsScreen$Content$2(this, n);
            }
            return;
        }
        e.n("viewModel");
        throw null;
    }
    
    public final void or() {
        ((Controller)this).p.C();
    }
}
