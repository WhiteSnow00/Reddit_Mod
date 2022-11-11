// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.payment.customtab;

import qb2.a$b;
import q.j;
import ma2.h$e;
import ma2.h$d;
import java.util.Map;
import o90.xt;
import o90.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import android.text.TextUtils;
import o90.yt;
import o90.d;
import o90.tt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import java.util.ArrayList;
import ma2.h$c;
import ma2.g;
import android.os.Bundle;
import android.os.Parcelable;
import qb2.b;
import android.content.ServiceConnection;
import sg2.e;
import android.content.Context;
import android.content.Intent;
import ma2.h;
import ma2.h$a;
import q.k;
import qb2.a;
import javax.inject.Inject;
import ma2.f;
import kotlin.Metadata;
import ma2.f$a;
import android.app.Activity;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/vault/feature/vault/payment/customtab/PaymentActivity;", "Landroid/app/Activity;", "Lma2/f$a;", "<init>", "()V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class PaymentActivity extends Activity implements f$a
{
    @Inject
    public f f;
    @Inject
    public a g;
    public k h;
    
    public final void a() {
        this.c();
        this.d(0, (h)h$a.f);
    }
    
    public final void b(final String s) {
        this.c();
        final Intent putExtra = new Intent((Context)this, (Class)PaymentActivity.class).putExtra("arg_transaction_tx_id", s);
        e.e((Object)putExtra, "Intent(this, PaymentActi\u2026ION_TX_ID, transactionId)");
        ((Context)this).startActivity(putExtra);
    }
    
    public final void c() {
        try {
            final a g = this.g;
            if (g != null) {
                if (g == null) {
                    e.n("customTabsActivityHelper");
                    throw null;
                }
                final b c = g.c;
                if (c != null) {
                    ((Context)this).unbindService((ServiceConnection)c);
                    g.b = null;
                    g.a = null;
                    g.c = null;
                }
            }
        }
        catch (final IllegalStateException ex) {
            su2.a.a.e((Throwable)ex);
        }
        this.h = null;
    }
    
    public final void d(final int n, final h h) {
        this.setResult(n, new Intent().putExtra("arg_payment_result", (Parcelable)h));
        this.finish();
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Object o = this.getIntent().getParcelableExtra("arg_payment_request");
        if (o == null) {
            this.d(0, (h)new h$c("payment request wasn't found"));
            return;
        }
        final PaymentActivity$onCreate.PaymentActivity$onCreate$1 paymentActivity$onCreate$1 = new PaymentActivity$onCreate.PaymentActivity$onCreate$1((g)o, this);
        final Object d4;
        Label_0251: {
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
                        break Label_0251;
                    }
                    o = new StringBuilder();
                    ((StringBuilder)o).append("Unable to find a component of type ");
                    ((StringBuilder)o).append(ut.class.getSimpleName());
                    throw new IllegalStateException(((StringBuilder)o).toString().toString());
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
        final tt<?, ?> value = ((ut)d4).k().get(PaymentActivity.class);
        tt<?, ?> tt;
        if (value instanceof tt) {
            tt = value;
        }
        else {
            tt = null;
        }
        tt<?, ?> tt2 = tt;
        if (tt == null) {
            tt2 = tt;
            if (this instanceof d) {
                final c zk = ((d)this).Zk();
                Label_0418: {
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
                                tt2 = (tt<?, ?>)subFeatureInjectors.get(PaymentActivity.class);
                                break Label_0418;
                            }
                        }
                    }
                    tt2 = null;
                }
                if (!(tt2 instanceof tt)) {
                    tt2 = null;
                }
            }
        }
        if (tt2 == null || tt2.inject(this, (rg2.a<?>)paymentActivity$onCreate$1) == null) {
            throw new IllegalStateException(aw.b.f((Class)ma2.e.class, al0.a.p("\n    Unable to find any FeatureInjector for target class ", "PaymentActivity", " with a\n    dependency factory of type "), ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ", "PaymentActivity", " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
        }
        final a g = this.g;
        if (g == null) {
            e.n("customTabsActivityHelper");
            throw null;
        }
        final String e = ui.b.E((Context)this);
        if (e != null) {
            final b c3 = new b(g);
            ((j)c3).f = ((Context)this).getApplicationContext();
            final Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty((CharSequence)e)) {
                intent.setPackage(e);
            }
            ((Context)this).bindService(intent, (ServiceConnection)c3, 33);
            g.c = c3;
        }
        final String f = ((g)o).f;
        final a g2 = this.g;
        if (g2 != null) {
            g2.d = (a$b)new ma2.b(this, f);
            return;
        }
        sg2.e.n("customTabsActivityHelper");
        throw null;
    }
    
    public final void onDestroy() {
        this.c();
        super.onDestroy();
    }
    
    public final void onNewIntent(final Intent intent) {
        e.f((Object)intent, "intent");
        super.onNewIntent(intent);
        final String stringExtra = intent.getStringExtra("arg_transaction_tx_id");
        if (stringExtra == null) {
            this.d(0, (h)new h$d("transaction id can't be null"));
        }
        else {
            this.d(-1, (h)new h$e(stringExtra));
        }
    }
}
