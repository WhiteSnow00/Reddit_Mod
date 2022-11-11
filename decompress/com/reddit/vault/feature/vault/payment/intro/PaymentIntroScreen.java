// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.payment.intro;

import rg2.p;
import com.reddit.screen.BaseScreen;
import z0.r0;
import z0.t0;
import z0.y0;
import rg2.q;
import androidx.compose.runtime.ComposerImpl;
import com.reddit.vault.feature.vault.payment.intro.composables.PaymentIntroContentKt;
import androidx.compose.runtime.ComposerKt;
import z0.d;
import java.util.Map;
import o90.xt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import hg2.j;
import o90.yt;
import o90.tt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import java.util.ArrayList;
import o90.b;
import com.bluelinelabs.conductor.Controller;
import sg2.e;
import com.bluelinelabs.conductor.ControllerChangeType;
import com.bluelinelabs.conductor.c;
import com.reddit.screen.BaseScreen$Presentation;
import androidx.appcompat.widget.Toolbar;
import android.view.ViewGroup;
import android.view.View;
import android.os.Bundle;
import com.reddit.screen.BaseScreen$Presentation$a;
import javax.inject.Inject;
import ab2.g;
import com.reddit.screen.ComposeScreen;

public final class PaymentIntroScreen extends ComposeScreen
{
    @Inject
    public g g0;
    public final BaseScreen$Presentation$a h0;
    
    public PaymentIntroScreen() {
        this(null);
    }
    
    public PaymentIntroScreen(final Bundle bundle) {
        super(bundle);
        this.h0 = new BaseScreen$Presentation$a(true, false);
    }
    
    public static final void hC(final PaymentIntroScreen paymentIntroScreen) {
        final View q = ((Controller)paymentIntroScreen).q;
        Object parent;
        if (q != null) {
            parent = q.getParent();
        }
        else {
            parent = null;
        }
        View view;
        if (parent instanceof View) {
            view = (View)parent;
        }
        else {
            view = null;
        }
        Object parent2;
        if (view != null) {
            parent2 = view.getParent();
        }
        else {
            parent2 = null;
        }
        Object o;
        if (parent2 instanceof ViewGroup) {
            o = parent2;
        }
        else {
            o = null;
        }
        if (o != null) {
            final Toolbar toolbar = (Toolbar)((View)o).findViewById(2131431792);
            if (toolbar != null) {
                toolbar.setTitle((CharSequence)null);
            }
        }
    }
    
    public final BaseScreen$Presentation L4() {
        return (BaseScreen$Presentation)this.h0;
    }
    
    public final void RA(final c c, final ControllerChangeType controllerChangeType) {
        e.f((Object)controllerChangeType, "changeType");
        if (controllerChangeType.isEnter && !((Controller)this).i) {
            if (((Controller)this).k) {
                hC(this);
            }
            else {
                ((Controller)this).vA((Controller.e)new Controller.e() {
                    public final /* synthetic */ Controller f;
                    public final /* synthetic */ PaymentIntroScreen g;
                    
                    @Override
                    public final void i(final Controller controller, final View view) {
                        sg2.e.f((Object)controller, "controller");
                        sg2.e.f((Object)view, "view");
                        this.f.jB((Controller.e)this);
                        PaymentIntroScreen.hC(this.g);
                    }
                });
            }
        }
    }
    
    public final void aC() {
        super.aC();
        final PaymentIntroScreen$onInitialize$$inlined$injectFeature.PaymentIntroScreen$onInitialize$$inlined$injectFeature$1 instance = PaymentIntroScreen$onInitialize$$inlined$injectFeature.PaymentIntroScreen$onInitialize$$inlined$injectFeature$1.INSTANCE;
        final Object d4;
        Label_0213: {
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
                        break Label_0213;
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
        final tt<?, ?> value = ((ut)d4).k().get(PaymentIntroScreen.class);
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
            Label_0388: {
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
                            tt4 = subFeatureInjectors.get(PaymentIntroScreen.class);
                            break Label_0388;
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)instance) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)PaymentIntroScreen.class, r, " with a\n    dependency factory of type ", (Class)j.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void gC(final d d, final int n) {
        final ComposerImpl s = d.s(1425193192);
        final q<z0.c<?>, y0, t0, j> a = ComposerKt.a;
        final g g0 = this.g0;
        if (g0 != null) {
            PaymentIntroContentKt.e((rg2.a)new PaymentIntroScreen$Content.PaymentIntroScreen$Content$2(this), (rg2.a)new PaymentIntroScreen$Content.PaymentIntroScreen$Content$1((Object)g0), (d)s, 0, 0);
            final r0 u = s.U();
            if (u != null) {
                u.d = (p)new PaymentIntroScreen$Content.PaymentIntroScreen$Content$3(this, n);
            }
            return;
        }
        e.n("navigator");
        throw null;
    }
}
