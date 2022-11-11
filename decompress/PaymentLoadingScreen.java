// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.payment.loading;

import com.reddit.screen.BaseScreen;
import android.os.BaseBundle;
import s82.q;
import android.os.Parcelable;
import android.content.Context;
import ma2.g;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
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
import com.bluelinelabs.conductor.Controller;
import android.view.View;
import ma2.h;
import ma2.h$d;
import com.reddit.vault.feature.vault.payment.customtab.PaymentActivity;
import android.content.Intent;
import kb1.l;
import com.reddit.screen.util.b;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import pa2.i;
import javax.inject.Inject;
import pa2.c;
import zg2.k;
import com.reddit.vault.d;

public final class PaymentLoadingScreen extends d implements pa2.d
{
    public static final /* synthetic */ k<Object>[] l0;
    @Inject
    public c i0;
    @Inject
    public i j0;
    public final ScreenViewBindingDelegate k0;
    
    static {
        l0 = new k[] { (k)e.v((Class)PaymentLoadingScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenPaymentLoadingBinding;", 0) };
    }
    
    public PaymentLoadingScreen() {
        this(null);
    }
    
    public PaymentLoadingScreen(final Bundle bundle) {
        super(2131625279, bundle);
        this.k0 = b.a((l)this, (rg2.l)PaymentLoadingScreen$binding.PaymentLoadingScreen$binding$2.INSTANCE);
    }
    
    public final void MA(int i, final int n, final Intent intent) {
        super.MA(i, n, intent);
        if (i == 321) {
            i = PaymentActivity.i;
            Object o;
            if (intent == null) {
                o = new h$d("data can't be null");
            }
            else if ((o = intent.getParcelableExtra("arg_payment_result")) == null) {
                o = new h$d("result can't cast to PaymentResult");
            }
            final c i2 = this.i0;
            if (i2 == null) {
                sg2.e.n("presenter");
                throw null;
            }
            i2.J5((h)o);
        }
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        ui.b.G(view);
        super.PA(view);
        final c i0 = this.i0;
        if (i0 != null) {
            ((m81.d)i0).A();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void Rd(final h h) {
        final Controller ja = ((Controller)this).JA();
        pa2.b b;
        if (ja instanceof pa2.b) {
            b = (pa2.b)ja;
        }
        else {
            b = null;
        }
        if (b != null) {
            b.P7(h);
        }
        ((Controller)this).p.B((Controller)this);
    }
    
    public final void ZA(final View view) {
        sg2.e.f((Object)view, "view");
        ui.b.G(view);
        super.ZA(view);
        final c i0 = this.i0;
        if (i0 != null) {
            ((m81.d)i0).o();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void ZB() {
        final c i0 = this.i0;
        if (i0 != null) {
            ((m81.d)i0).destroy();
            return;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void aC() {
        super.aC();
        final String string = ((BaseBundle)((Controller)this).f).getString("subredditID");
        if (string == null) {
            throw new IllegalStateException("SubredditId must not be null");
        }
        final PaymentLoadingScreen$onInitialize$1 paymentLoadingScreen$onInitialize$1 = new PaymentLoadingScreen$onInitialize$1(string, this);
        final Object d4;
        Label_0228: {
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
                        break Label_0228;
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
        final tt<?, ?> value = ((ut)d4).k().get(PaymentLoadingScreen.class);
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
                            tt4 = subFeatureInjectors.get(PaymentLoadingScreen.class);
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
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)paymentLoadingScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)PaymentLoadingScreen.class, r, " with a\n    dependency factory of type ", (Class)pa2.e.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void hideLoading() {
        final LinearLayout linearLayout = (LinearLayout)this.oC().b.b;
        sg2.e.e((Object)linearLayout, "binding.loadingView.root");
        ((View)linearLayout).setVisibility(8);
    }
    
    public final void nC(final View view) {
        final WebView c = this.oC().c;
        final i j0 = this.j0;
        if (j0 != null) {
            c.setWebViewClient((WebViewClient)new pa2.h(j0));
            final WebSettings settings = this.oC().c.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setDomStorageEnabled(true);
            return;
        }
        sg2.e.n("urlLoadCallback");
        throw null;
    }
    
    public final void nm(final g g) {
        final int i = PaymentActivity.i;
        final Intent putExtra = new Intent((Context)this.lC(), (Class)PaymentActivity.class).putExtra("arg_payment_request", (Parcelable)g);
        sg2.e.e((Object)putExtra, "Intent(context, PaymentA\u2026PAYMENT_REQUEST, request)");
        ((Controller)this).startActivityForResult(putExtra, 321);
    }
    
    public final q oC() {
        return (q)this.k0.d((l)this, (k)PaymentLoadingScreen.l0[0]);
    }
    
    public final void showLoading() {
        final LinearLayout linearLayout = (LinearLayout)this.oC().b.b;
        sg2.e.e((Object)linearLayout, "binding.loadingView.root");
        ((View)linearLayout).setVisibility(0);
    }
    
    public final void su(final String s) {
        sg2.e.f((Object)s, "url");
        final WebView c = this.oC().c;
        sg2.e.e((Object)c, "binding.webView");
        ((View)c).setVisibility(0);
        this.oC().c.loadUrl(s);
    }
}
