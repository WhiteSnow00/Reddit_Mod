// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.request;

import java.io.Serializable;
import java.util.Iterator;
import android.content.res.Resources$Theme;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import android.os.SystemClock;
import u8.k;
import java.util.Map;
import com.bumptech.glide.d;
import android.util.Log;
import android.graphics.drawable.Drawable;
import q8.l;
import java.util.concurrent.Executor;
import java.util.List;
import h9.j;
import com.bumptech.glide.Priority;
import g9.a;
import com.bumptech.glide.f;
import android.content.Context;
import g9.e;
import l9.d$a;
import g9.g;
import h9.i;
import g9.c;

public final class SingleRequest<R> implements c, i, g
{
    public static final boolean D;
    public int A;
    public boolean B;
    public RuntimeException C;
    public final String a;
    public final d$a b;
    public final Object c;
    public final e<R> d;
    public final RequestCoordinator e;
    public final Context f;
    public final f g;
    public final Object h;
    public final Class<R> i;
    public final a<?> j;
    public final int k;
    public final int l;
    public final Priority m;
    public final j<R> n;
    public final List<e<R>> o;
    public final i9.e<? super R> p;
    public final Executor q;
    public l<R> r;
    public com.bumptech.glide.load.engine.e.d s;
    public long t;
    public volatile com.bumptech.glide.load.engine.e u;
    public SingleRequest.SingleRequest$Status v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public int z;
    
    static {
        D = Log.isLoggable("Request", 2);
    }
    
    public SingleRequest(final Context f, final f g, final Object c, final Object h, final Class<R> i, final a<?> j, final int k, final int l, final Priority m, final j<R> n, final e<R> d, final List<e<R>> o, final RequestCoordinator e, final com.bumptech.glide.load.engine.e u, final i9.e<? super R> p16, final Executor q) {
        String value;
        if (SingleRequest.D) {
            value = String.valueOf(this.hashCode());
        }
        else {
            value = null;
        }
        this.a = value;
        this.b = new d$a();
        this.c = c;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.d = d;
        this.o = o;
        this.e = e;
        this.u = u;
        this.p = p16;
        this.q = q;
        this.v = SingleRequest.SingleRequest$Status.PENDING;
        if (this.C == null && g.h.a.containsKey(d.c.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }
    
    public final boolean a() {
        synchronized (this.c) {
            return this.v == SingleRequest.SingleRequest$Status.COMPLETE;
        }
    }
    
    public final void b(int n, int z) {
        this.b.a();
        final Object c = this.c;
        monitorenter(c);
        try {
            final boolean d = SingleRequest.D;
            if (d) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Got onSizeReady in ");
                sb.append(k9.f.a(this.t));
                this.l(sb.toString());
            }
            if (this.v != SingleRequest.SingleRequest$Status.WAITING_FOR_SIZE) {
                monitorexit(c);
                return;
            }
            final SingleRequest.SingleRequest$Status running = SingleRequest.SingleRequest$Status.RUNNING;
            this.v = running;
            final float sizeMultiplier = this.j.getSizeMultiplier();
            if (n != Integer.MIN_VALUE) {
                n = Math.round(n * sizeMultiplier);
            }
            this.z = n;
            if (z == Integer.MIN_VALUE) {
                n = z;
            }
            else {
                n = Math.round(sizeMultiplier * z);
            }
            this.A = n;
            if (d) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("finished setup for calling load in ");
                sb2.append(k9.f.a(this.t));
                this.l(sb2.toString());
            }
            final com.bumptech.glide.load.engine.e u = this.u;
            final f g = this.g;
            final Object h = this.h;
            final o8.d signature = this.j.getSignature();
            z = this.z;
            n = this.A;
            final Class resourceClass = this.j.getResourceClass();
            final Class<R> i = this.i;
            final Priority m = this.m;
            final q8.f diskCacheStrategy = this.j.getDiskCacheStrategy();
            final Map transformations = this.j.getTransformations();
            final boolean transformationRequired = this.j.isTransformationRequired();
            final boolean scaleOnlyOrNoTransform = this.j.isScaleOnlyOrNoTransform();
            final o8.g options = this.j.getOptions();
            final boolean memoryCacheable = this.j.isMemoryCacheable();
            final boolean useUnlimitedSourceGeneratorsPool = this.j.getUseUnlimitedSourceGeneratorsPool();
            final boolean useAnimationPool = this.j.getUseAnimationPool();
            final boolean onlyRetrieveFromCache = this.j.getOnlyRetrieveFromCache();
            final Executor q = this.q;
            try {
                final com.bumptech.glide.load.engine.e.d b = u.b(g, h, signature, z, n, resourceClass, i, m, diskCacheStrategy, transformations, transformationRequired, scaleOnlyOrNoTransform, options, memoryCacheable, useUnlimitedSourceGeneratorsPool, useAnimationPool, onlyRetrieveFromCache, (g)this, q);
                try {
                    this.s = b;
                    if (this.v != running) {
                        this.s = null;
                    }
                    if (d) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("finished onSizeReady in ");
                        sb3.append(k9.f.a(this.t));
                        this.l(sb3.toString());
                    }
                    monitorexit(c);
                    return;
                }
                finally {}
            }
            finally {}
        }
        finally {}
        while (true) {
            try {
                monitorexit(c);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean c() {
        synchronized (this.c) {
            return this.v == SingleRequest.SingleRequest$Status.CLEARED;
        }
    }
    
    public final void clear() {
        synchronized (this.c) {
            if (this.B) {
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            this.b.a();
            final SingleRequest.SingleRequest$Status v = this.v;
            final SingleRequest.SingleRequest$Status cleared = SingleRequest.SingleRequest$Status.CLEARED;
            if (v == cleared) {
                return;
            }
            this.e();
            l r = this.r;
            if (r != null) {
                this.r = null;
            }
            else {
                r = null;
            }
            final RequestCoordinator e = this.e;
            if (e == null || e.g((c)this)) {
                this.n.e(this.h());
            }
            this.v = cleared;
            monitorexit(this.c);
            if (r != null) {
                this.u.getClass();
                com.bumptech.glide.load.engine.e.e(r);
            }
        }
    }
    
    public final boolean d() {
        synchronized (this.c) {
            return this.v == SingleRequest.SingleRequest$Status.COMPLETE;
        }
    }
    
    public final void e() {
        if (!this.B) {
            this.b.a();
            this.n.b((i)this);
            final com.bumptech.glide.load.engine.e.d s = this.s;
            if (s != null) {
                synchronized (s.c) {
                    s.a.h(s.b);
                    monitorexit(s.c);
                    this.s = null;
                }
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }
    
    public final boolean f(final c c) {
        if (!(c instanceof SingleRequest)) {
            return false;
        }
        Object o = this.c;
        synchronized (o) {
            final int k = this.k;
            final int l = this.l;
            final Object h = this.h;
            final Class<R> i = this.i;
            final a<?> j = this.j;
            final Priority m = this.m;
            final List<e<R>> o2 = this.o;
            int size;
            if (o2 != null) {
                size = o2.size();
            }
            else {
                size = 0;
            }
            monitorexit(o);
            final SingleRequest singleRequest = (SingleRequest)c;
            synchronized (singleRequest.c) {
                final int k2 = singleRequest.k;
                final int l2 = singleRequest.l;
                final Object h2 = singleRequest.h;
                final Class<R> i2 = singleRequest.i;
                o = singleRequest.j;
                final Priority m2 = singleRequest.m;
                final List<e<R>> o3 = singleRequest.o;
                int size2;
                if (o3 != null) {
                    size2 = o3.size();
                }
                else {
                    size2 = 0;
                }
                monitorexit(singleRequest.c);
                if (k == k2 && l == l2) {
                    final char[] a = k9.j.a;
                    boolean b;
                    if (h == null) {
                        b = (h2 == null);
                    }
                    else if (h instanceof k) {
                        b = ((k)h).a();
                    }
                    else {
                        b = h.equals(h2);
                    }
                    if (b && i.equals(i2) && j.equals(o) && m == m2 && size == size2) {
                        return true;
                    }
                }
                return false;
            }
        }
    }
    
    public final Drawable g() {
        if (this.y == null && (this.y = this.j.getFallbackDrawable()) == null && this.j.getFallbackId() > 0) {
            this.y = this.k(this.j.getFallbackId());
        }
        return this.y;
    }
    
    public final Drawable h() {
        if (this.x == null && (this.x = this.j.getPlaceholderDrawable()) == null && this.j.getPlaceholderId() > 0) {
            this.x = this.k(this.j.getPlaceholderId());
        }
        return this.x;
    }
    
    public final boolean i() {
        final RequestCoordinator e = this.e;
        return e == null || !e.getRoot().a();
    }
    
    public final boolean isRunning() {
        synchronized (this.c) {
            final SingleRequest.SingleRequest$Status v = this.v;
            return v == SingleRequest.SingleRequest$Status.RUNNING || v == SingleRequest.SingleRequest$Status.WAITING_FOR_SIZE;
        }
    }
    
    public final void j() {
        final Object c = this.c;
        monitorenter(c);
        try {
            if (this.B) {
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            this.b.a();
            final int b = k9.f.b;
            this.t = SystemClock.elapsedRealtimeNanos();
            if (this.h == null) {
                if (k9.j.i(this.k, this.l)) {
                    this.z = this.k;
                    this.A = this.l;
                }
                int n;
                if (this.g() == null) {
                    n = 5;
                }
                else {
                    n = 3;
                }
                this.m(new GlideException("Received null model"), n);
                monitorexit(c);
                return;
            }
            final SingleRequest.SingleRequest$Status v = this.v;
            final SingleRequest.SingleRequest$Status running = SingleRequest.SingleRequest$Status.RUNNING;
            if (v == running) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            final SingleRequest.SingleRequest$Status complete = SingleRequest.SingleRequest$Status.COMPLETE;
            boolean b2 = false;
            if (v == complete) {
                this.n(this.r, DataSource.MEMORY_CACHE, false);
                monitorexit(c);
                return;
            }
            final SingleRequest.SingleRequest$Status waiting_FOR_SIZE = SingleRequest.SingleRequest$Status.WAITING_FOR_SIZE;
            this.v = waiting_FOR_SIZE;
            if (k9.j.i(this.k, this.l)) {
                this.b(this.k, this.l);
            }
            else {
                this.n.f((i)this);
            }
            final SingleRequest.SingleRequest$Status v2 = this.v;
            if (v2 == running || v2 == waiting_FOR_SIZE) {
                final RequestCoordinator e = this.e;
                if (e == null || e.i((c)this)) {
                    b2 = true;
                }
                if (b2) {
                    this.n.g(this.h());
                }
            }
            if (SingleRequest.D) {
                final StringBuilder sb = new StringBuilder();
                sb.append("finished run method in ");
                sb.append(k9.f.a(this.t));
                this.l(sb.toString());
            }
            monitorexit(c);
        }
        finally {
            monitorexit(c);
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }
    
    public final Drawable k(final int n) {
        Resources$Theme resources$Theme;
        if (this.j.getTheme() != null) {
            resources$Theme = this.j.getTheme();
        }
        else {
            resources$Theme = this.f.getTheme();
        }
        final f g = this.g;
        return z8.a.a((Context)g, (Context)g, n, resources$Theme);
    }
    
    public final void l(final String s) {
        final StringBuilder q = d.q(s, " this: ");
        q.append(this.a);
        Log.v("Request", q.toString());
    }
    
    public final void m(final GlideException ex, int n) {
        this.b.a();
        synchronized (this.c) {
            ex.setOrigin(this.C);
            final int i = this.g.i;
            if (i <= n) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Load failed for ");
                sb.append(this.h);
                sb.append(" with size [");
                sb.append(this.z);
                sb.append("x");
                sb.append(this.A);
                sb.append("]");
                Log.w("Glide", sb.toString(), (Throwable)ex);
                if (i <= 4) {
                    ex.logRootCauses("Glide");
                }
            }
            this.s = null;
            this.v = SingleRequest.SingleRequest$Status.FAILED;
            final int n2 = 1;
            this.B = true;
            try {
                final List<e<R>> o = this.o;
                int n3;
                if (o != null) {
                    final Iterator<e<R>> iterator = o.iterator();
                    n = 0;
                    while (true) {
                        n3 = n;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        n |= (iterator.next().onLoadFailed(ex, this.h, (j)this.n, this.i()) ? 1 : 0);
                    }
                }
                else {
                    n3 = 0;
                }
                final e<R> d = this.d;
                if (d != null && d.onLoadFailed(ex, this.h, (j)this.n, this.i())) {
                    n = n2;
                }
                else {
                    n = 0;
                }
                if ((n3 | n) == 0x0) {
                    this.p();
                }
                this.B = false;
                final RequestCoordinator e = this.e;
                if (e != null) {
                    e.b((c)this);
                }
            }
            finally {
                this.B = false;
            }
        }
    }
    
    public final void n(final l<?> l, final DataSource dataSource, final boolean b) {
        this.b.a();
        Object value = null;
        GlideException ex = null;
        l i;
        try {
            final Object c = this.c;
            monitorenter(c);
            try {
                this.s = null;
                if (l == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive a Resource<R> with an object of ");
                    sb.append(this.i);
                    sb.append(" inside, but instead got null.");
                    this.m(new GlideException(sb.toString()), 5);
                    monitorexit(c);
                    return;
                }
                value = l.get();
                Label_0198: {
                    if (value == null || !this.i.isAssignableFrom(((l)value).getClass())) {
                        break Label_0198;
                    }
                    final RequestCoordinator e = this.e;
                    Label_0186: {
                        if (e == null || e.h((c)this)) {
                            break Label_0186;
                        }
                        try {
                            this.r = null;
                            this.v = SingleRequest.SingleRequest$Status.COMPLETE;
                            monitorexit(c);
                            while (true) {
                                while (true) {
                                    final StringBuilder sb2;
                                    while (true) {
                                        while (true) {
                                            this.u.getClass();
                                            com.bumptech.glide.load.engine.e.e(l);
                                            return;
                                            final String s;
                                            sb2.append(s);
                                            ex = new GlideException(sb2.toString());
                                            this.m(ex, 5);
                                            monitorexit(c);
                                            continue;
                                        }
                                        this.o(l, value, dataSource);
                                        monitorexit(c);
                                        return;
                                        String s = "";
                                        continue;
                                        Label_0325: {
                                            s = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                                        }
                                        continue;
                                    }
                                    final Serializable class1 = ((l)value).getClass();
                                    sb2.append(class1);
                                    sb2.append("{");
                                    sb2.append(value);
                                    sb2.append("} inside Resource{");
                                    sb2.append(l);
                                    sb2.append("}.");
                                    iftrue(Label_0325:)(value == null);
                                    continue;
                                }
                                Label_0260: {
                                    final Serializable class1 = "";
                                }
                                continue;
                            }
                            this.r = null;
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Expected to receive an object of ");
                            sb2.append(this.i);
                            sb2.append(" but instead got ");
                            iftrue(Label_0260:)(value == null);
                        }
                        finally {}
                    }
                }
            }
            finally {}
            try {
                monitorexit(c);
                try {
                    throw;
                }
                finally {}
            }
            finally {}
        }
        finally {
            i = (l)value;
        }
        if (i != null) {
            this.u.getClass();
            com.bumptech.glide.load.engine.e.e(i);
        }
    }
    
    public final void o(final l r, final Object o, final DataSource dataSource) {
        final boolean i = this.i();
        this.v = SingleRequest.SingleRequest$Status.COMPLETE;
        this.r = (l<R>)r;
        if (this.g.i <= 3) {
            final StringBuilder r2 = a.r("Finished loading ");
            r2.append(o.getClass().getSimpleName());
            r2.append(" from ");
            r2.append(dataSource);
            r2.append(" for ");
            r2.append(this.h);
            r2.append(" with size [");
            r2.append(this.z);
            r2.append("x");
            r2.append(this.A);
            r2.append("] in ");
            r2.append(k9.f.a(this.t));
            r2.append(" ms");
            Log.d("Glide", r2.toString());
        }
        final int n = 1;
        this.B = true;
        try {
            final List<e<R>> o2 = this.o;
            int n3;
            if (o2 != null) {
                final Iterator<e<R>> iterator = o2.iterator();
                int n2 = 0;
                while (true) {
                    n3 = n2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    n2 |= (iterator.next().onResourceReady(o, this.h, (j)this.n, dataSource, i) ? 1 : 0);
                }
            }
            else {
                n3 = 0;
            }
            final e<R> d = this.d;
            int n4;
            if (d != null && d.onResourceReady(o, this.h, (j)this.n, dataSource, i)) {
                n4 = n;
            }
            else {
                n4 = 0;
            }
            if ((n4 | n3) == 0x0) {
                this.n.d(o, this.p.a(dataSource));
            }
            this.B = false;
            final RequestCoordinator e = this.e;
            if (e != null) {
                e.e((c)this);
            }
        }
        finally {
            this.B = false;
        }
    }
    
    public final void p() {
        final RequestCoordinator e = this.e;
        if (e != null && !e.i((c)this)) {
            return;
        }
        Drawable g = null;
        if (this.h == null) {
            g = this.g();
        }
        Drawable w;
        if ((w = g) == null) {
            if (this.w == null && (this.w = this.j.getErrorPlaceholder()) == null && this.j.getErrorId() > 0) {
                this.w = this.k(this.j.getErrorId());
            }
            w = this.w;
        }
        Drawable h;
        if ((h = w) == null) {
            h = this.h();
        }
        this.n.h(h);
    }
    
    public final void pause() {
        synchronized (this.c) {
            if (this.isRunning()) {
                this.clear();
            }
        }
    }
}
