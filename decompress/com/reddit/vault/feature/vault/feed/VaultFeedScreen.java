// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed;

import com.reddit.screen.BaseScreen;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import x82.n0;
import android.widget.ImageView;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import ea2.c0;
import a4.a0;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$o;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f;
import android.graphics.drawable.Drawable;
import q6.e0;
import q6.r;
import com.airbnb.lottie.LottieDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.LinearLayout;
import java.util.Map;
import o90.xt;
import java.util.LinkedHashSet;
import o90.yt;
import o90.tt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import java.util.ArrayList;
import com.reddit.presentation.CoroutinesPresenter;
import java.util.Iterator;
import x82.z;
import ea2.y;
import android.widget.ImageButton;
import java.math.BigInteger;
import x82.k0;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.n;
import ea2.v;
import java.util.List;
import android.view.View;
import jj2.f;
import ma2.h$a;
import rg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import ej2.b0;
import ej2.g;
import lg2.c;
import ma2.h$e;
import ma2.h;
import kb1.l;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import ea2.w;
import zg2.k;
import pa2.b;
import ea2.x;
import com.reddit.vault.d;

public final class VaultFeedScreen extends d implements x, b
{
    public static final /* synthetic */ k<Object>[] l0;
    @Inject
    public w i0;
    public final ScreenViewBindingDelegate j0;
    public a k0;
    
    static {
        l0 = new k[] { (k)e.v((Class)VaultFeedScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenVaultFeedBinding;", 0) };
    }
    
    public VaultFeedScreen() {
        super(2131625401, (Bundle)null);
        this.j0 = com.reddit.screen.util.b.a((l)this, (rg2.l)VaultFeedScreen$binding.VaultFeedScreen$binding$2.INSTANCE);
    }
    
    public final void Dx() {
        this.oC().h.setRefreshing(false);
    }
    
    public final void P7(final h h) {
        final VaultFeedPresenter vaultFeedPresenter = (VaultFeedPresenter)this.pC();
        if (h instanceof h$e) {
            vaultFeedPresenter.k.ll();
            final h$e h$e = (h$e)h;
            final f g = ((CoroutinesPresenter)vaultFeedPresenter).g;
            sg2.e.c((Object)g);
            ej2.g.i((b0)g, (CoroutineContext)null, (CoroutineStart)null, (p)new VaultFeedPresenter$createNewEthTransaction$1(vaultFeedPresenter, h$e, null), 3);
            vaultFeedPresenter.Dc();
        }
        else if (h instanceof h$a) {
            vaultFeedPresenter.k.ll();
            vaultFeedPresenter.Dc();
        }
    }
    
    public final void P8(final String s, final String s2, final ab2.h h) {
        sg2.e.f((Object)s, "subredditName");
        sg2.e.f((Object)s2, "correlation");
        sg2.e.f((Object)h, "navigator");
        h.a(this.lC(), s, s2);
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        ((VaultFeedPresenter)this.pC()).A();
    }
    
    public final void Qy() {
        final a k0 = this.k0;
        if (k0 != null) {
            final ea2.e e = new ea2.e(k0.m, k0.k.a());
            final int n = 1;
            final n.e a = androidx.recyclerview.widget.n.a((n.b)e, true);
            k0.m = k0.k.a();
            a.b(k0);
            final ImageButton f = this.oC().f;
            sg2.e.e((Object)f, "binding.sendPointsButton");
            final y b = ((VaultFeedPresenter)this.pC()).B;
            final int n2 = 0;
            int n3 = 0;
            Label_0178: {
                if (b != null) {
                    final z a2 = b.a;
                    if (a2 != null) {
                        final List b2 = a2.b;
                        if (b2 != null) {
                            if (!b2.isEmpty()) {
                                final Iterator iterator = b2.iterator();
                                while (iterator.hasNext()) {
                                    if (((k0)iterator.next()).j.compareTo(BigInteger.ZERO) > 0) {
                                        n3 = n;
                                        break Label_0178;
                                    }
                                }
                            }
                        }
                    }
                }
                n3 = 0;
            }
            int visibility;
            if (n3 != 0) {
                visibility = n2;
            }
            else {
                visibility = 8;
            }
            ((View)f).setVisibility(visibility);
            return;
        }
        sg2.e.n("adapter");
        throw null;
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
        final VaultFeedScreen$onInitialize.VaultFeedScreen$onInitialize$1 vaultFeedScreen$onInitialize$1 = new VaultFeedScreen$onInitialize.VaultFeedScreen$onInitialize$1(this);
        final Object d4;
        Label_0220: {
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
                        break Label_0220;
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
        final tt<?, ?> value = ((ut)d4).k().get(VaultFeedScreen.class);
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
            Label_0398: {
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
                            tt4 = subFeatureInjectors.get(VaultFeedScreen.class);
                            break Label_0398;
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)vaultFeedScreen$onInitialize$1) != null) {
            this.k0 = new a(this.pC(), this.pC());
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)VaultFeedScreen.class, r, " with a\n    dependency factory of type ", (Class)ea2.z.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void hideLoading() {
        final LinearLayout linearLayout = (LinearLayout)this.oC().d.b;
        sg2.e.e((Object)linearLayout, "binding.loadingView.root");
        ((View)linearLayout).setVisibility(8);
    }
    
    public final void jt() {
        final RecyclerView e = this.oC().e;
        sg2.e.e((Object)e, "binding.recyclerView");
        ((View)e).setVisibility(8);
        final ConstraintLayout a = this.oC().c.a();
        sg2.e.e((Object)a, "binding.emptyVault.root");
        ((View)a).setVisibility(0);
    }
    
    public final void ll() {
        this.oC().h.setRefreshing(true);
    }
    
    public final void nC(final View view) {
        final ImageView i = this.oC().i;
        sg2.e.e((Object)i, "binding.userImage");
        final n0 z = ((VaultFeedPresenter)this.pC()).z;
        sg2.e.f((Object)z, "user");
        fb2.g.d(i, z.h);
        final SwipeRefreshLayout h = this.oC().h;
        sg2.e.e((Object)h, "binding.swipeRefreshLayout");
        final LottieDrawable imageDrawable = new LottieDrawable();
        r.b(((View)h).getContext(), "loading_indicator.json").b((e0)new r5.h(imageDrawable));
        while (true) {
            try {
                ((ImageView)h.y).setImageDrawable((Drawable)imageDrawable);
                this.oC().h.setOnRefreshListener((SwipeRefreshLayout$f)new ha.b((Object)this, 10));
                this.oC().e.setLayoutManager((RecyclerView$o)new LinearLayoutManager((Context)this.lC()));
                final RecyclerView e = this.oC().e;
                final a k0 = this.k0;
                if (k0 != null) {
                    e.setAdapter((RecyclerView$Adapter)k0);
                    ((View)this.oC().g).setOnClickListener((View$OnClickListener)new t32.e((Object)this, 10));
                    ((View)this.oC().f).setOnClickListener((View$OnClickListener)new zv1.a((Object)this, 13));
                    ((View)this.oC().c.f).setOnClickListener((View$OnClickListener)new x62.a((Object)this, 9));
                    final TextView b = this.oC().c.b;
                    sg2.e.e((Object)b, "binding.emptyVault.emptyVaultDescription");
                    b.setMovementMethod((MovementMethod)new LinkMovementMethod());
                    final String string = ((View)b).getResources().getString(2131958087);
                    sg2.e.e((Object)string, "resources.getString(R.st\u2026_empty_vault_description)");
                    final String string2 = ((View)b).getResources().getString(2131958088);
                    sg2.e.e((Object)string2, "resources.getString(R.st\u2026y_vault_description_link)");
                    final Context context = ((View)b).getContext();
                    sg2.e.e((Object)context, "context");
                    final int l = a0.L(context, 2130969589, 255);
                    final c0 c0 = new c0(this);
                    final SpannableString spannableString = new SpannableString((CharSequence)string2);
                    spannableString.setSpan((Object)c0, 0, string2.length(), 33);
                    spannableString.setSpan((Object)new ForegroundColorSpan(l), 0, string2.length(), 33);
                    b.setText((CharSequence)new SpannableStringBuilder().append((CharSequence)string).append((CharSequence)"\n").append((CharSequence)spannableString));
                    return;
                }
                sg2.e.n("adapter");
                throw null;
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public final s82.a0 oC() {
        return (s82.a0)this.j0.d((l)this, (k)VaultFeedScreen.l0[0]);
    }
    
    public final w pC() {
        final w i0 = this.i0;
        if (i0 != null) {
            return i0;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void showLoading() {
        final LinearLayout linearLayout = (LinearLayout)this.oC().d.b;
        sg2.e.e((Object)linearLayout, "binding.loadingView.root");
        ((View)linearLayout).setVisibility(0);
    }
}
