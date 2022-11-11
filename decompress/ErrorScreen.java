// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.errors;

import com.reddit.screen.BaseScreen;
import android.widget.Button;
import android.content.Context;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.view.View$OnLongClickListener;
import android.view.View;
import com.reddit.vault.data.analytics.Noun;
import android.os.Parcelable;
import java.util.Map;
import o90.xt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import hg2.j;
import com.reddit.vault.data.analytics.Action;
import o90.yt;
import o90.tt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import java.util.ArrayList;
import com.bluelinelabs.conductor.Router;
import com.reddit.vault.feature.vault.feed.VaultFeedScreen;
import b8.e$a;
import n92.i;
import com.reddit.vault.feature.registration.createvault.CreateVaultScreen;
import n92.i$b;
import x82.p0;
import x82.o;
import x82.p0$a;
import com.bluelinelabs.conductor.Controller;
import kotlin.Pair;
import e92.c;
import kb1.l;
import com.reddit.screen.util.b;
import android.os.Bundle;
import a81.e;
import hg2.f;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import i82.a;
import zg2.k;
import com.reddit.vault.d;

public final class ErrorScreen extends d
{
    public static final /* synthetic */ k<Object>[] l0;
    @Inject
    public a i0;
    public final ScreenViewBindingDelegate j0;
    public final f k0;
    
    static {
        l0 = new k[] { (k)e.v((Class)ErrorScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenErrorBinding;", 0) };
    }
    
    public ErrorScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625198, bundle);
        this.j0 = b.a((l)this, (rg2.l)ErrorScreen$binding.ErrorScreen$binding$2.INSTANCE);
        this.k0 = kotlin.a.b((rg2.a)new ErrorScreen$viewModel$2(bundle));
    }
    
    public ErrorScreen(final c c, final ErrorScreen.ErrorScreen$a errorScreen$a) {
        sg2.e.f((Object)c, "viewModel");
        this(bg.d.J(new Pair[] { new Pair((Object)"viewModel", (Object)c) }));
        if (errorScreen$a != null) {
            if (!(errorScreen$a instanceof Controller)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            ((Controller)this).rB((Controller)errorScreen$a);
        }
    }
    
    public final boolean KA() {
        final Controller ja = ((Controller)this).JA();
        ErrorScreen.ErrorScreen$a errorScreen$a;
        if (ja instanceof ErrorScreen.ErrorScreen$a) {
            errorScreen$a = (ErrorScreen.ErrorScreen$a)ja;
        }
        else {
            errorScreen$a = null;
        }
        if (errorScreen$a != null) {
            errorScreen$a.Bs();
        }
        if (this.k0.getValue().f()) {
            final Router p = ((Controller)this).p;
            final b8.e a = e$a.a((Controller)new CreateVaultScreen(new k92.b((p0)new p0$a((o)null)), (i)new i$b((x82.a)null)));
            a.c((com.bluelinelabs.conductor.c)new d8.b());
            a.a((com.bluelinelabs.conductor.c)new d8.b());
            p.Q(a);
        }
        else if (((Controller)this).p.f() > 1) {
            ((Controller)this).p.B((Controller)this);
        }
        else {
            final Router p2 = ((Controller)this).p;
            final b8.e a2 = e$a.a((Controller)new VaultFeedScreen());
            a2.c((com.bluelinelabs.conductor.c)new d8.b());
            p2.Q(a2);
        }
        return true;
    }
    
    public final void aC() {
        super.aC();
        Object instance = ErrorScreen$onInitialize$$inlined$injectFeature$1.INSTANCE;
        final Object d4;
        Label_0211: {
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
                        break Label_0211;
                    }
                    instance = new StringBuilder();
                    ((StringBuilder)instance).append("Unable to find a component of type ");
                    ((StringBuilder)instance).append(ut.class.getSimpleName());
                    throw new IllegalStateException(((StringBuilder)instance).toString().toString());
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
        final tt<?, ?> value = ((ut)d4).k().get(ErrorScreen.class);
        tt<?, ?> tt;
        if (value instanceof tt) {
            tt = value;
        }
        else {
            tt = null;
        }
        tt<?, ?> tt2 = tt;
        if (tt == null) {
            final o90.c zk = ((BaseScreen)this).Zk();
            Label_0376: {
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
                            tt2 = (tt<?, ?>)subFeatureInjectors.get(ErrorScreen.class);
                            break Label_0376;
                        }
                    }
                }
                tt2 = null;
            }
            if (!(tt2 instanceof tt)) {
                tt2 = null;
            }
        }
        if (tt2 != null && tt2.inject(this, (rg2.a<?>)instance) != null) {
            final Parcelable parcelable = ((Controller)this).f.getParcelable("viewModel");
            sg2.e.c((Object)parcelable);
            final c c3 = (c)parcelable;
            final Noun c4 = c3.c();
            if (c4 != null) {
                final a i0 = this.i0;
                if (i0 == null) {
                    sg2.e.n("analyticsManager");
                    throw null;
                }
                a.a(i0, c4, Action.FAIL, (String)null, (String)null, c3.e(), (String)null, c3.d(), (Long)null, 172);
            }
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)ErrorScreen.class, r, " with a\n    dependency factory of type ", (Class)j.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final boolean jC() {
        return false;
    }
    
    public final void nC(final View view) {
        final String e = this.k0.getValue().e();
        if (e != null) {
            ((View)this.oC().c).setOnLongClickListener((View$OnLongClickListener)new zr1.f(1, (Object)this, (Object)e));
        }
        final TextView d = this.oC().d;
        final c c = this.k0.getValue();
        final Context context = ((View)this.oC().d).getContext();
        sg2.e.e((Object)context, "binding.message.context");
        d.setText((CharSequence)c.g(context));
        final Button b = this.oC().b;
        int text;
        if (this.k0.getValue().f()) {
            text = 2131957116;
        }
        else {
            text = 2131953120;
        }
        ((TextView)b).setText(text);
        ((View)this.oC().b).setOnClickListener((View$OnClickListener)new x62.a((Object)this, 5));
    }
    
    public final s82.j oC() {
        return (s82.j)this.j0.d((l)this, (k)ErrorScreen.l0[0]);
    }
}
