// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.securevault;

import com.reddit.screen.BaseScreen;
import android.content.Context;
import com.bluelinelabs.conductor.Controller;
import s82.w;
import android.widget.ImageView;
import android.content.res.Resources;
import fb2.g;
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
import x82.e0;
import com.reddit.presentation.CoroutinesPresenter;
import com.reddit.vault.h;
import com.reddit.vault.ProtectVaultEvent;
import android.widget.Button;
import android.app.Activity;
import android.widget.TextView;
import x82.u;
import android.view.View;
import kb1.l;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import s92.b;
import zg2.k;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen;
import s92.c;
import com.reddit.vault.d;

public final class SecureVaultScreen extends d implements c, a
{
    public static final /* synthetic */ k<Object>[] k0;
    @Inject
    public b i0;
    public final ScreenViewBindingDelegate j0;
    
    static {
        k0 = new k[] { (k)e.v((Class)SecureVaultScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenSecureVaultBinding;", 0) };
    }
    
    public SecureVaultScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625351, bundle);
        this.j0 = com.reddit.screen.util.b.a((l)this, (rg2.l)SecureVaultScreen$binding.SecureVaultScreen$binding$2.INSTANCE);
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        ((SecureVaultPresenter)this.pC()).A();
    }
    
    public final void Qn(final u u) {
        sg2.e.f((Object)u, "phrase");
    }
    
    public final void S2(final int n) {
        final TextView f = this.oC().f;
        final Activity ba = ((Controller)this).BA();
        sg2.e.c((Object)ba);
        f.setText(((Context)ba).getText(2131957316));
    }
    
    public final void V6() {
        final Button e = this.oC().e;
        final Activity ba = ((Controller)this).BA();
        sg2.e.c((Object)ba);
        ((TextView)e).setText(((Context)ba).getText(2131957312));
    }
    
    public final void Yk() {
        final SecureVaultPresenter secureVaultPresenter = (SecureVaultPresenter)this.pC();
        final h m = secureVaultPresenter.m;
        if (m != null) {
            m.Sz();
        }
        final h i = secureVaultPresenter.m;
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
        final SecureVaultScreen$onInitialize.SecureVaultScreen$onInitialize$1 secureVaultScreen$onInitialize$1 = new SecureVaultScreen$onInitialize.SecureVaultScreen$onInitialize$1((e0)parcelable, this);
        final Object d4;
        Label_0229: {
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
                        break Label_0229;
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
        final tt<?, ?> value = ((ut)d4).k().get(SecureVaultScreen.class);
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
            Label_0384: {
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
                            tt4 = subFeatureInjectors.get(SecureVaultScreen.class);
                            break Label_0384;
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)secureVaultScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)SecureVaultScreen.class, r, " with a\n    dependency factory of type ", (Class)s92.d.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
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
        ((View)this.oC().e).setOnClickListener((View$OnClickListener)new zv1.a((Object)this, 11));
        final TextView d = this.oC().d;
        sg2.e.e((Object)d, "binding.learnMorePrivacy");
        LegalUtilKt.a(d, (rg2.l)new SecureVaultScreen$onViewCreated.SecureVaultScreen$onViewCreated$2(this));
        final ImageView b = this.oC().b;
        sg2.e.e((Object)b, "binding.animatedImage");
        g.e(b);
    }
    
    public final w oC() {
        return (w)this.j0.d((l)this, (k)SecureVaultScreen.k0[0]);
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
