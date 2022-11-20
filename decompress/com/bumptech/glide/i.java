// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide;

import i9.d;
import android.util.Log;
import android.content.res.Configuration;
import java.net.URL;
import android.net.Uri;
import java.util.Map;
import java.util.List;
import android.view.View;
import java.io.File;
import android.graphics.drawable.Drawable;
import h9.a;
import java.util.Iterator;
import java.util.Collection;
import e9.b$a;
import c9.c;
import android.graphics.Bitmap;
import e9.n;
import e9.q;
import e9.o;
import h9.e;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.Context;
import e9.b;
import h9.f;
import e9.j;
import android.content.ComponentCallbacks2;

public class i implements ComponentCallbacks2, j
{
    private static final f DECODE_TYPE_BITMAP;
    private static final f DECODE_TYPE_GIF;
    private static final f DOWNLOAD_ONLY_OPTIONS;
    private final Runnable addSelfToLifecycle;
    private final e9.b connectivityMonitor;
    public final Context context;
    private final CopyOnWriteArrayList<e<Object>> defaultRequestListeners;
    public final com.bumptech.glide.b glide;
    public final e9.i lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;
    private f requestOptions;
    private final o requestTracker;
    private final q targetTracker;
    private final n treeNode;
    
    static {
        DECODE_TYPE_BITMAP = (f)((a)f.decodeTypeOf((Class)Bitmap.class)).lock();
        DECODE_TYPE_GIF = (f)((a)f.decodeTypeOf((Class)c9.c.class)).lock();
        DOWNLOAD_ONLY_OPTIONS = (f)((a)((a)f.diskCacheStrategyOf((r8.f)r8.f.c)).priority(Priority.LOW)).skipMemoryCache(true);
    }
    
    public i(final com.bumptech.glide.b b, final e9.i i, final n n, final Context context) {
        this(b, i, n, new o(), b.l, context);
    }
    
    public i(final com.bumptech.glide.b glide, e9.i h, final n treeNode, final o requestTracker, final e9.c c, final Context context) {
        this.targetTracker = new q();
        final i$a addSelfToLifecycle = new i$a(this);
        this.addSelfToLifecycle = (Runnable)addSelfToLifecycle;
        this.glide = glide;
        this.lifecycle = h;
        this.treeNode = treeNode;
        this.requestTracker = requestTracker;
        this.context = context;
        final e9.b build = c.build(context.getApplicationContext(), (b$a)new c(requestTracker));
        this.connectivityMonitor = build;
        if (l9.j.h()) {
            l9.j.f().post((Runnable)addSelfToLifecycle);
        }
        else {
            h.c((j)this);
        }
        h.c((j)build);
        this.defaultRequestListeners = new CopyOnWriteArrayList<e<Object>>(glide.h.e);
        h = (e9.i)glide.h;
        synchronized (h) {
            if (((com.bumptech.glide.e)h).j == null) {
                ((com.bumptech.glide.e)h).j = (f)((a)((com.bumptech.glide.e)h).d.build()).lock();
            }
            final f j = ((com.bumptech.glide.e)h).j;
            monitorexit(h);
            this.setRequestOptions(j);
            synchronized (glide.m) {
                if (!glide.m.contains(this)) {
                    glide.m.add(this);
                    return;
                }
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }
    
    private void untrackOrDelegate(final i9.j<?> j) {
        final boolean untrack = this.untrack(j);
        final h9.c request = j.getRequest();
        if (!untrack) {
            final com.bumptech.glide.b glide = this.glide;
            synchronized (glide.m) {
                final Iterator iterator = glide.m.iterator();
                while (true) {
                    while (iterator.hasNext()) {
                        if (((i)iterator.next()).untrack(j)) {
                            final boolean b = true;
                            monitorexit(glide.m);
                            if (!b && request != null) {
                                j.b(null);
                                request.clear();
                            }
                            return;
                        }
                    }
                    monitorexit(glide.m);
                    final boolean b = false;
                    continue;
                }
            }
        }
    }
    
    private void updateRequestOptions(final f f) {
        synchronized (this) {
            this.requestOptions = (f)((a)this.requestOptions).apply((a)f);
        }
    }
    
    public i addDefaultRequestListener(final e<Object> e) {
        this.defaultRequestListeners.add(e);
        return this;
    }
    
    public i applyDefaultRequestOptions(final f f) {
        synchronized (this) {
            this.updateRequestOptions(f);
            return this;
        }
    }
    
    public <ResourceType> h<ResourceType> as(final Class<ResourceType> clazz) {
        return new h<ResourceType>(this.glide, this, clazz, this.context);
    }
    
    public h<Bitmap> asBitmap() {
        return this.as(Bitmap.class).apply((a<?>)i.DECODE_TYPE_BITMAP);
    }
    
    public h<Drawable> asDrawable() {
        return this.as(Drawable.class);
    }
    
    public h<File> asFile() {
        return this.as(File.class).apply((a<?>)f.skipMemoryCacheOf(true));
    }
    
    public h<c9.c> asGif() {
        return this.as(c9.c.class).apply((a<?>)i.DECODE_TYPE_GIF);
    }
    
    public void clear(final View view) {
        this.clear(new b(view));
    }
    
    public void clear(final i9.j<?> j) {
        if (j == null) {
            return;
        }
        this.untrackOrDelegate(j);
    }
    
    public h<File> download(final Object o) {
        return this.downloadOnly().load(o);
    }
    
    public h<File> downloadOnly() {
        return this.as(File.class).apply((a<?>)i.DOWNLOAD_ONLY_OPTIONS);
    }
    
    public List<e<Object>> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }
    
    public f getDefaultRequestOptions() {
        synchronized (this) {
            return this.requestOptions;
        }
    }
    
    public <T> com.bumptech.glide.j<?, T> getDefaultTransitionOptions(final Class<T> clazz) {
        final com.bumptech.glide.e h = this.glide.h;
        com.bumptech.glide.j i;
        com.bumptech.glide.j j = i = h.f.get(clazz);
        if (j == null) {
            final Iterator iterator = h.f.entrySet().iterator();
            while (true) {
                i = j;
                if (!iterator.hasNext()) {
                    break;
                }
                final Map.Entry<Class, V> entry = (Map.Entry<Class, V>)iterator.next();
                if (!entry.getKey().isAssignableFrom(clazz)) {
                    continue;
                }
                j = (com.bumptech.glide.j)entry.getValue();
            }
        }
        Object k;
        if ((k = i) == null) {
            k = com.bumptech.glide.e.k;
        }
        return (com.bumptech.glide.j<?, T>)k;
    }
    
    public boolean isPaused() {
        synchronized (this) {
            return this.requestTracker.c;
        }
    }
    
    public h<Drawable> load(final Bitmap bitmap) {
        return this.asDrawable().load(bitmap);
    }
    
    public h<Drawable> load(final Drawable drawable) {
        return this.asDrawable().load(drawable);
    }
    
    public h<Drawable> load(final Uri uri) {
        return this.asDrawable().load(uri);
    }
    
    public h<Drawable> load(final File file) {
        return this.asDrawable().load(file);
    }
    
    public h<Drawable> load(final Integer n) {
        return this.asDrawable().load(n);
    }
    
    public h<Drawable> load(final Object o) {
        return this.asDrawable().load(o);
    }
    
    public h<Drawable> load(final String s) {
        return this.asDrawable().load(s);
    }
    
    @Deprecated
    public h<Drawable> load(final URL url) {
        return this.asDrawable().load(url);
    }
    
    public h<Drawable> load(final byte[] array) {
        return this.asDrawable().load(array);
    }
    
    public /* bridge */ Object load(final Bitmap bitmap) {
        return this.load(bitmap);
    }
    
    public /* bridge */ Object load(final Drawable drawable) {
        return this.load(drawable);
    }
    
    public /* bridge */ Object load(final Uri uri) {
        return this.load(uri);
    }
    
    public /* bridge */ Object load(final File file) {
        return this.load(file);
    }
    
    public /* bridge */ Object load(final Integer n) {
        return this.load(n);
    }
    
    public /* bridge */ Object load(final Object o) {
        return this.load(o);
    }
    
    public /* bridge */ Object load(final String s) {
        return this.load(s);
    }
    
    @Deprecated
    public /* bridge */ Object load(final URL url) {
        return this.load(url);
    }
    
    public /* bridge */ Object load(final byte[] array) {
        return this.load(array);
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
    }
    
    public void onDestroy() {
        synchronized (this) {
            this.targetTracker.onDestroy();
            final Iterator iterator = l9.j.e(this.targetTracker.f).iterator();
            while (iterator.hasNext()) {
                this.clear((i9.j<?>)iterator.next());
            }
            this.targetTracker.f.clear();
            final o requestTracker = this.requestTracker;
            final Iterator iterator2 = l9.j.e(requestTracker.a).iterator();
            while (iterator2.hasNext()) {
                requestTracker.a((h9.c)iterator2.next());
            }
            requestTracker.b.clear();
            this.lifecycle.b((j)this);
            this.lifecycle.b((j)this.connectivityMonitor);
            l9.j.f().removeCallbacks(this.addSelfToLifecycle);
            this.glide.d(this);
        }
    }
    
    public void onLowMemory() {
    }
    
    public void onStart() {
        synchronized (this) {
            this.resumeRequests();
            this.targetTracker.onStart();
        }
    }
    
    public void onStop() {
        synchronized (this) {
            this.pauseRequests();
            this.targetTracker.onStop();
        }
    }
    
    public void onTrimMemory(final int n) {
        if (n == 60 && this.pauseAllRequestsOnTrimMemoryModerate) {
            this.pauseAllRequestsRecursive();
        }
    }
    
    public void pauseAllRequests() {
        synchronized (this) {
            final o requestTracker = this.requestTracker;
            requestTracker.c = true;
            for (final h9.c c : l9.j.e(requestTracker.a)) {
                if (c.isRunning() || c.e()) {
                    c.clear();
                    requestTracker.b.add(c);
                }
            }
        }
    }
    
    public void pauseAllRequestsRecursive() {
        synchronized (this) {
            this.pauseAllRequests();
            final Iterator iterator = this.treeNode.a().iterator();
            while (iterator.hasNext()) {
                ((i)iterator.next()).pauseAllRequests();
            }
        }
    }
    
    public void pauseRequests() {
        synchronized (this) {
            final o requestTracker = this.requestTracker;
            requestTracker.c = true;
            for (final h9.c c : l9.j.e(requestTracker.a)) {
                if (c.isRunning()) {
                    c.pause();
                    requestTracker.b.add(c);
                }
            }
        }
    }
    
    public void pauseRequestsRecursive() {
        synchronized (this) {
            this.pauseRequests();
            final Iterator iterator = this.treeNode.a().iterator();
            while (iterator.hasNext()) {
                ((i)iterator.next()).pauseRequests();
            }
        }
    }
    
    public void resumeRequests() {
        synchronized (this) {
            final o requestTracker = this.requestTracker;
            requestTracker.c = false;
            for (final h9.c c : l9.j.e(requestTracker.a)) {
                if (!c.e() && !c.isRunning()) {
                    c.j();
                }
            }
            requestTracker.b.clear();
        }
    }
    
    public void resumeRequestsRecursive() {
        synchronized (this) {
            l9.j.a();
            this.resumeRequests();
            final Iterator iterator = this.treeNode.a().iterator();
            while (iterator.hasNext()) {
                ((i)iterator.next()).resumeRequests();
            }
        }
    }
    
    public i setDefaultRequestOptions(final f requestOptions) {
        synchronized (this) {
            this.setRequestOptions(requestOptions);
            return this;
        }
    }
    
    public void setPauseAllRequestsOnTrimMemoryModerate(final boolean pauseAllRequestsOnTrimMemoryModerate) {
        this.pauseAllRequestsOnTrimMemoryModerate = pauseAllRequestsOnTrimMemoryModerate;
    }
    
    public void setRequestOptions(final f f) {
        synchronized (this) {
            this.requestOptions = (f)((a)((a)f).clone()).autoClone();
        }
    }
    
    @Override
    public String toString() {
        synchronized (this) {
            final StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{tracker=");
            sb.append(this.requestTracker);
            sb.append(", treeNode=");
            sb.append(this.treeNode);
            sb.append("}");
            return sb.toString();
        }
    }
    
    public void track(final i9.j<?> j, final h9.c c) {
        synchronized (this) {
            this.targetTracker.f.add(j);
            final o requestTracker = this.requestTracker;
            requestTracker.a.add(c);
            if (!requestTracker.c) {
                c.j();
            }
            else {
                c.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                requestTracker.b.add(c);
            }
        }
    }
    
    public boolean untrack(final i9.j<?> j) {
        synchronized (this) {
            final h9.c request = j.getRequest();
            if (request == null) {
                return true;
            }
            if (this.requestTracker.a(request)) {
                this.targetTracker.f.remove(j);
                j.b(null);
                return true;
            }
            return false;
        }
    }
    
    public static final class b extends d<View, Object>
    {
        public b(final View view) {
            super(view);
        }
        
        @Override
        public final void a() {
        }
        
        @Override
        public final void d(final Object o, final j9.d<? super Object> d) {
        }
        
        @Override
        public final void h(final Drawable drawable) {
        }
    }
    
    public final class c implements b$a
    {
        public final o a;
        public final i b;
        
        public c(final i b, final o a) {
            this.b = b;
            this.a = a;
        }
    }
}
