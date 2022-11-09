// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import eg.s0;
import eg.h1;
import eg.g1;
import eg.c1;
import eg.b1;
import eg.k1;
import eg.f0;
import eg.r0;
import com.android.billingclient.api.d0;
import eg.x;
import java.util.ArrayList;
import android.os.Bundle;
import re.l;
import qd.g2;
import android.app.PendingIntent;
import eg.u;
import eg.t;
import android.content.Intent;
import android.os.Looper;
import android.content.IntentFilter;
import dg.k;
import android.content.Context;
import android.os.Handler;
import eg.e1;
import java.util.concurrent.Executor;
import eg.c0;
import eg.u1;
import ig.k0;
import jg.c;

public final class b extends c<AssetPackState>
{
    public final i g;
    public final h h;
    public final k0<u1> i;
    public final c0 j;
    public final eg.k0 k;
    public final k0<Executor> l;
    public final k0<Executor> m;
    public final e1 n;
    public final Handler o;
    
    public b(final Context context, final i g, final h h, final k0<u1> i, final eg.k0 k, final c0 j, final k0<Executor> l, final k0<Executor> m, final e1 n) {
        super(new k("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.o = new Handler(Looper.getMainLooper());
        this.g = g;
        this.h = h;
        this.i = i;
        this.k = k;
        this.j = j;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    @Override
    public final void a(final Context context, final Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            super.a.h("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        final ArrayList stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList != null && stringArrayList.size() == 1) {
            final x i = AssetPackState.i(bundleExtra, (String)stringArrayList.get(0), this.k, this.n, (u)t.f);
            super.a.g("ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[] { i });
            if (bundleExtra.getParcelable("confirmation_intent") != null) {
                this.j.getClass();
            }
            ((Executor)this.m.zza()).execute((Runnable)new g2(this, bundleExtra, i));
            ((Executor)this.l.zza()).execute((Runnable)new l(this, bundleExtra));
            return;
        }
        super.a.h("Corrupt bundle received from broadcast.", new Object[0]);
    }
    
    public final void d(Bundle a) {
        final i g = this.g;
        g.getClass();
        if (g.d((eg.r0<Boolean>)new d0(7, (Object)g, a))) {
            final h h = this.h;
            h.getClass();
            final k k = com.google.android.play.core.assetpacks.h.k;
            k.g("Run extractor loop", new Object[0]);
            if (h.j.compareAndSet(false, true)) {
                while (true) {
                    final Object o = null;
                    try {
                        a = h.i.a();
                    }
                    catch (final zzck zzck) {
                        com.google.android.play.core.assetpacks.h.k.h("Error while getting next extraction task: %s", new Object[] { zzck.getMessage() });
                        a = o;
                        if (zzck.zza >= 0) {
                            ((u1)h.h.zza()).c(zzck.zza);
                            h.a(zzck.zza, zzck);
                            a = o;
                        }
                    }
                    if (a == null) {
                        break;
                    }
                    try {
                        if (a instanceof f0) {
                            h.b.a((f0)a);
                        }
                        else if (a instanceof k1) {
                            h.c.a((k1)a);
                        }
                        else if (a instanceof b1) {
                            h.d.a((b1)a);
                        }
                        else if (a instanceof c1) {
                            h.e.a((c1)a);
                        }
                        else if (a instanceof g1) {
                            h.f.a((g1)a);
                        }
                        else if (a instanceof h1) {
                            h.g.a((h1)a);
                        }
                        else {
                            com.google.android.play.core.assetpacks.h.k.h("Unknown task type: %s", new Object[] { a.getClass().getName() });
                        }
                    }
                    catch (final Exception ex) {
                        com.google.android.play.core.assetpacks.h.k.h("Error during extraction task: %s", new Object[] { ex.getMessage() });
                        ((u1)h.h.zza()).c(((s0)a).c);
                        h.a(((s0)a).c, ex);
                    }
                }
                h.j.set(false);
            }
            else {
                k.k("runLoop already looping; return", new Object[0]);
            }
        }
    }
}
