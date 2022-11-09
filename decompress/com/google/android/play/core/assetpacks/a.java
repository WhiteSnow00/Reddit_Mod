// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import eg.f;
import eg.h;
import java.util.List;
import eg.d;
import java.util.HashMap;
import eg.g;
import eg.i;
import java.util.Iterator;
import android.os.BaseBundle;
import java.util.Map;
import com.google.android.play.core.tasks.zzj;
import qg.e;
import qg.n;
import java.util.ArrayList;
import android.os.Bundle;
import ah2.c;
import ig.g0;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import ig.z0;
import ig.o;
import eg.e1;
import eg.k0;
import android.content.Intent;
import dg.k;
import eg.u1;

public final class a implements u1
{
    public static final k g;
    public static final Intent h;
    public final String a;
    public final k0 b;
    public final e1 c;
    public o<z0> d;
    public o<z0> e;
    public final AtomicBoolean f;
    
    static {
        g = new k("AssetPackServiceImpl");
        h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    }
    
    public a(Context context, final k0 b, final e1 c) {
        this.f = new AtomicBoolean();
        this.a = context.getPackageName();
        this.b = b;
        this.c = c;
        if (g0.b(context)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            final k g = com.google.android.play.core.assetpacks.a.g;
            final Intent h = com.google.android.play.core.assetpacks.a.h;
            final c g2 = ah2.c.g;
            this.d = (o<z0>)new o(applicationContext, g, "AssetPackService", h, (ig.k)g2);
            final Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 != null) {
                context = applicationContext2;
            }
            this.e = (o<z0>)new o(context, g, "AssetPackService-keepAlive", h, (ig.k)g2);
        }
        com.google.android.play.core.assetpacks.a.g.g("AssetPackService initiated.", new Object[0]);
    }
    
    public static Bundle h() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("playcore_version_code", 11002);
        final ArrayList list = new ArrayList();
        list.add(0);
        final Integer value = 1;
        list.add(value);
        bundle.putIntegerArrayList("supported_compression_formats", list);
        final ArrayList list2 = new ArrayList();
        list2.add(value);
        list2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", list2);
        return bundle;
    }
    
    public static <T> n i() {
        a.g.h("onError(%d)", new Object[] { -11 });
        return e.b((zzj)new AssetPackException(-11));
    }
    
    public final void a() {
        synchronized (this) {
            if (this.e == null) {
                com.google.android.play.core.assetpacks.a.g.k("Keep alive connection manager is not initialized.", new Object[0]);
                return;
            }
            final k g = com.google.android.play.core.assetpacks.a.g;
            g.j("keepAlive", new Object[0]);
            if (!this.f.compareAndSet(false, true)) {
                g.j("Service is already kept alive.", new Object[0]);
                return;
            }
            final qg.k k = new qg.k();
            this.e.b((ig.e)new i((Object)this, k, k, 0), k);
        }
    }
    
    public final void b(final int n, final String s) {
        this.j(n, 10, s);
    }
    
    public final void c(final int n) {
        if (this.d != null) {
            com.google.android.play.core.assetpacks.a.g.j("notifySessionFailed", new Object[0]);
            final qg.k k = new qg.k();
            this.d.b((ig.e)new g(this, k, n, k), k);
            return;
        }
        throw new zzck("The Play Store app is not installed or is an unofficial version.", n);
    }
    
    public final n d(final HashMap hashMap) {
        if (this.d == null) {
            return i();
        }
        com.google.android.play.core.assetpacks.a.g.j("syncPacks", new Object[0]);
        final qg.k k = new qg.k();
        this.d.b((ig.e)new d(this, k, hashMap, k), k);
        return k.a;
    }
    
    public final void e(final List<String> list) {
        if (this.d == null) {
            return;
        }
        com.google.android.play.core.assetpacks.a.g.j("cancelDownloads(%s)", new Object[] { list });
        final qg.k k = new qg.k();
        this.d.b((ig.e)new eg.c((Object)this, k, (List)list, k, 0), k);
    }
    
    public final n f(final int n, final int n2, final String s, final String s2) {
        if (this.d == null) {
            return i();
        }
        com.google.android.play.core.assetpacks.a.g.j("getChunkFileDescriptor(%s, %s, %d, session=%d)", new Object[] { s, s2, n2, n });
        final qg.k k = new qg.k();
        this.d.b((ig.e)new h(this, k, n, s, s2, n2, k), k);
        return k.a;
    }
    
    public final void g(final int n, final int n2, final String s, final String s2) {
        if (this.d != null) {
            com.google.android.play.core.assetpacks.a.g.j("notifyChunkTransferred", new Object[0]);
            final qg.k k = new qg.k();
            this.d.b((ig.e)new eg.e(this, k, n, s, s2, n2, k), k);
            return;
        }
        throw new zzck("The Play Store app is not installed or is an unofficial version.", n);
    }
    
    public final void j(final int n, final int n2, final String s) {
        if (this.d != null) {
            com.google.android.play.core.assetpacks.a.g.j("notifyModuleCompleted", new Object[0]);
            final qg.k k = new qg.k();
            this.d.b((ig.e)new f(this, k, n, s, k, n2), k);
            return;
        }
        throw new zzck("The Play Store app is not installed or is an unofficial version.", n);
    }
}
