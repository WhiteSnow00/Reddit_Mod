// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.collectiblesecurevault;

import com.reddit.screen.BaseScreen;
import com.bluelinelabs.conductor.Controller;
import s82.f;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.res.Resources;
import com.reddit.vault.util.LegalUtilKt;
import android.view.View$OnClickListener;
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
import x82.g;
import com.reddit.vault.h;
import com.reddit.vault.ProtectVaultEvent;
import x82.u;
import com.reddit.presentation.CoroutinesPresenter;
import android.view.View;
import kb1.l;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import l92.b;
import zg2.k;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen;
import l92.c;
import com.reddit.vault.d;

public final class CollectibleSecureVaultScreen extends d implements c, a
{
    public static final /* synthetic */ k<Object>[] k0;
    @Inject
    public b i0;
    public final ScreenViewBindingDelegate j0;
    
    static {
        k0 = new k[] { (k)e.v((Class)CollectibleSecureVaultScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenCollectibleSecureVaultBinding;", 0) };
    }
    
    public CollectibleSecureVaultScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625161, bundle);
        this.j0 = com.reddit.screen.util.b.a((l)this, (rg2.l)CollectibleSecureVaultScreen$binding.CollectibleSecureVaultScreen$binding$2.INSTANCE);
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        ((CoroutinesPresenter)this.pC()).A();
    }
    
    public final void Qn(final u u) {
        sg2.e.f((Object)u, "phrase");
    }
    
    public final void Yk() {
        final l92.e e = (l92.e)this.pC();
        final h m = e.m;
        if (m != null) {
            m.Sz();
        }
        final h i = e.m;
        if (i != null) {
            i.u6(ProtectVaultEvent.PasswordBackedUp);
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
        final CollectibleSecureVaultScreen$onInitialize$1 collectibleSecureVaultScreen$onInitialize$1 = new CollectibleSecureVaultScreen$onInitialize$1((g)parcelable, this);
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
        final tt<?, ?> value = ((ut)d4).k().get(CollectibleSecureVaultScreen.class);
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
            Label_0383: {
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
                            tt4 = subFeatureInjectors.get(CollectibleSecureVaultScreen.class);
                            break Label_0383;
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)collectibleSecureVaultScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)CollectibleSecureVaultScreen.class, r, " with a\n    dependency factory of type ", (Class)l92.d.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final boolean jC() {
        return true;
    }
    
    public final void nC(final View view) {
        final Resources ia = ((Controller)this).IA();
        String string;
        if (ia != null) {
            string = ia.getString(2131957313);
        }
        else {
            string = null;
        }
        sg2.e.c((Object)string);
        this.oC().c.setText((CharSequence)y3.b.a(string, 0));
        ((View)this.oC().e).setOnClickListener((View$OnClickListener)new t32.e((Object)this, 5));
        ((View)this.oC().f).setOnClickListener((View$OnClickListener)new zv1.a((Object)this, 10));
        final TextView d = this.oC().d;
        sg2.e.e((Object)d, "binding.learnMorePrivacy");
        LegalUtilKt.a(d, (rg2.l)new CollectibleSecureVaultScreen$onViewCreated$3(this));
        final ImageView b = this.oC().b;
        sg2.e.e((Object)b, "binding.animatedImage");
        fb2.g.e(b);
    }
    
    public final f oC() {
        return (f)this.j0.d((l)this, (k)CollectibleSecureVaultScreen.k0[0]);
    }
    
    public final b pC() {
        final b i0 = this.i0;
        if (i0 != null) {
            return i0;
        }
        sg2.e.n("presenter");
        throw null;
    }
}
