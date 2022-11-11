// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.importvault;

import com.reddit.screen.BaseScreen;
import android.widget.LinearLayout;
import s82.m;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.text.TextWatcher;
import o92.i;
import o92.h;
import o92.j;
import android.widget.TextView;
import android.view.View$OnClickListener;
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
import jj2.f;
import android.text.Editable;
import android.widget.FrameLayout;
import rg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import ej2.b0;
import ej2.g;
import ab2.a$a;
import com.reddit.vault.navigation.NavStyle;
import com.reddit.vault.feature.errors.ErrorScreen$a;
import ab2.g$a;
import java.util.Locale;
import android.view.View;
import com.bluelinelabs.conductor.Controller;
import kotlin.Pair;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen;
import x82.a;
import x82.u;
import kb1.l;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import o92.b;
import zg2.k;
import o92.c;
import com.reddit.vault.d;

public final class ImportVaultScreen extends d implements c
{
    public static final /* synthetic */ k<Object>[] k0;
    @Inject
    public b i0;
    public final ScreenViewBindingDelegate j0;
    
    static {
        k0 = new k[] { (k)e.v((Class)ImportVaultScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenImportVaultBinding;", 0) };
    }
    
    public ImportVaultScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625218, bundle);
        this.j0 = com.reddit.screen.util.b.a((l)this, (rg2.l)ImportVaultScreen$binding.ImportVaultScreen$binding$2.INSTANCE);
    }
    
    public ImportVaultScreen(final u u, final a a, final MasterKeyScreen.a a2) {
        sg2.e.f((Object)a2, "listener");
        this(bg.d.J(new Pair[] { new Pair((Object)"phrase", (Object)u), new Pair((Object)"address", (Object)a) }));
        if (a2 instanceof Controller) {
            ((Controller)this).rB((Controller)a2);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public static void oC(final ImportVaultScreen importVaultScreen) {
        sg2.e.f((Object)importVaultScreen, "this$0");
        final FrameLayout a = importVaultScreen.pC().a;
        sg2.e.e((Object)a, "binding.root");
        ui.b.G((View)a);
        final b i0 = importVaultScreen.i0;
        if (i0 != null) {
            final Editable text = ((androidx.appcompat.widget.j)importVaultScreen.pC().e).getText();
            String string;
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            final o92.e e = (o92.e)i0;
            e.k.x(true);
            final String string2 = kotlin.text.b.B1((CharSequence)string).toString();
            final Locale root = Locale.ROOT;
            final u u = new u(a.p(root, "ROOT", string2, root, "this as java.lang.String).toLowerCase(locale)"));
            if (!u.h) {
                e.k.x(false);
                g$a.a(e.m, (e92.c)e92.c.k, (ErrorScreen$a)null, (NavStyle)null, (a$a)null, 14);
            }
            else if (e.j.a == null) {
                e.l.Qn(u);
            }
            else {
                final f g = ((CoroutinesPresenter)e).g;
                sg2.e.c((Object)g);
                ej2.g.i((b0)g, (CoroutineContext)null, (CoroutineStart)null, (p)new ImportVaultPresenter$validatePhrase$1(e, u, null), 3);
            }
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        final b i0 = this.i0;
        if (i0 != null) {
            ((CoroutinesPresenter)i0).A();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void ZA(final View view) {
        sg2.e.f((Object)view, "view");
        ui.b.G(view);
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
        final ImportVaultScreen$onInitialize.ImportVaultScreen$onInitialize$1 importVaultScreen$onInitialize$1 = new ImportVaultScreen$onInitialize.ImportVaultScreen$onInitialize$1((a)((Controller)this).f.getParcelable("address"), this);
        final Object d4;
        Label_0230: {
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
                        break Label_0230;
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
        final tt<?, ?> value = ((ut)d4).k().get(ImportVaultScreen.class);
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
            Label_0408: {
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
                            tt4 = subFeatureInjectors.get(ImportVaultScreen.class);
                            break Label_0408;
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)importVaultScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)ImportVaultScreen.class, r, " with a\n    dependency factory of type ", (Class)o92.d.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void nC(final View view) {
        final u u = (u)((Controller)this).f.getParcelable("phrase");
        if (u != null) {
            ((TextView)this.pC().e).setText((CharSequence)u.g);
            ((View)this.pC().c).setEnabled(true);
        }
        ((View)this.pC().c).setOnClickListener((View$OnClickListener)new t32.e((Object)this, 6));
        ((TextView)this.pC().d.c).setText(2131954768);
        final Context context = ((View)this.pC().a).getContext();
        sg2.e.e((Object)context, "binding.root.context");
        final j j = new j(context, (rg2.l)new ImportVaultScreen$onViewCreated$inputHelper.ImportVaultScreen$onViewCreated$inputHelper$1(this));
        final MnemonicEditText e = this.pC().e;
        sg2.e.e((Object)e, "binding.mnemonicEditText");
        final RecyclerView b = this.pC().b;
        sg2.e.e((Object)b, "binding.autocompleteRecyclerView");
        j.c = new h((rg2.l)new MnemonicInputHelper$attachViews$1(j, e));
        ((TextView)e).addTextChangedListener((TextWatcher)new i(e, j, b));
        e.setCursorChangeListener((rg2.a)new MnemonicInputHelper$attachViews$3(e, j, b));
        b.setLayoutManager((RecyclerView$o)new LinearLayoutManager(((View)b).getContext(), 0, false));
        final h c = j.c;
        if (c != null) {
            b.setAdapter((RecyclerView$Adapter)c);
            return;
        }
        sg2.e.n("adapter");
        throw null;
    }
    
    public final m pC() {
        return (m)this.j0.d((l)this, (k)ImportVaultScreen.k0[0]);
    }
    
    public final void x(final boolean b) {
        if (b) {
            final FrameLayout a = this.pC().a;
            sg2.e.e((Object)a, "binding.root");
            ui.b.G((View)a);
        }
        final LinearLayout linearLayout = (LinearLayout)this.pC().d.b;
        sg2.e.e((Object)linearLayout, "binding.loadingView.root");
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)linearLayout).setVisibility(visibility);
    }
}
