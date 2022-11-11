// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide;

import android.util.Log;
import java.util.Set;
import android.content.res.Configuration;
import java.net.URL;
import android.net.Uri;
import java.util.Map;
import java.util.List;
import android.view.View;
import java.io.File;
import android.graphics.drawable.Drawable;
import g9.a;
import java.util.Iterator;
import java.util.Collection;
import android.graphics.Bitmap;
import d9.n;
import d9.q;
import d9.o;
import d9.i;
import g9.e;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.Context;
import d9.b;
import g9.f;
import android.content.ComponentCallbacks2;

public class j implements ComponentCallbacks2, d9.j
{
    private static final f DECODE_TYPE_BITMAP;
    private static final f DECODE_TYPE_GIF;
    private static final f DOWNLOAD_ONLY_OPTIONS;
    private final Runnable addSelfToLifecycle;
    private final b connectivityMonitor;
    public final Context context;
    private final CopyOnWriteArrayList<e<Object>> defaultRequestListeners;
    public final com.bumptech.glide.c glide;
    public final i lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;
    private f requestOptions;
    private final o requestTracker;
    private final q targetTracker;
    private final n treeNode;
    
    static {
        DECODE_TYPE_BITMAP = (f)((a)f.decodeTypeOf((Class)Bitmap.class)).lock();
        DECODE_TYPE_GIF = (f)((a)f.decodeTypeOf((Class)b9.c.class)).lock();
        DOWNLOAD_ONLY_OPTIONS = (f)((a)((a)f.diskCacheStrategyOf((q8.f)q8.f.c)).priority(Priority.LOW)).skipMemoryCache(true);
    }
    
    public j(final com.bumptech.glide.c c, final i i, final n n, final Context context) {
        this(c, i, n, new o(), c.l, context);
    }
    
    public j(final com.bumptech.glide.c glide, i h, final n treeNode, final o requestTracker, final d9.c c, final Context context) {
        this.targetTracker = new q();
        final Runnable addSelfToLifecycle = new Runnable() {
            @Override
            public final void run() {
                final j f = j.this;
                f.lifecycle.a(f);
            }
        };
        this.addSelfToLifecycle = addSelfToLifecycle;
        this.glide = glide;
        this.lifecycle = h;
        this.treeNode = treeNode;
        this.requestTracker = requestTracker;
        this.context = context;
        final b build = c.build(context.getApplicationContext(), new c(requestTracker));
        this.connectivityMonitor = build;
        if (k9.j.h()) {
            k9.j.f().post((Runnable)addSelfToLifecycle);
        }
        else {
            h.a(this);
        }
        h.a(build);
        this.defaultRequestListeners = new CopyOnWriteArrayList<e<Object>>(glide.h.e);
        h = (i)glide.h;
        synchronized (h) {
            if (((com.bumptech.glide.f)h).j == null) {
                ((com.bumptech.glide.f)h).j = (f)((a)((com.bumptech.glide.f)h).d.build()).lock();
            }
            final f j = ((com.bumptech.glide.f)h).j;
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
    
    private void untrackOrDelegate(final h9.j<?> j) {
        final boolean untrack = this.untrack(j);
        final g9.c request = j.getRequest();
        if (!untrack) {
            final com.bumptech.glide.c glide = this.glide;
            synchronized (glide.m) {
                final Iterator iterator = glide.m.iterator();
                while (true) {
                    while (iterator.hasNext()) {
                        if (((j)iterator.next()).untrack(j)) {
                            final boolean b = true;
                            monitorexit(glide.m);
                            if (!b && request != null) {
                                j.c((g9.c)null);
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
    
    public j addDefaultRequestListener(final e<Object> e) {
        this.defaultRequestListeners.add(e);
        return this;
    }
    
    public j applyDefaultRequestOptions(final f f) {
        synchronized (this) {
            this.updateRequestOptions(f);
            return this;
        }
    }
    
    public <ResourceType> com.bumptech.glide.i<ResourceType> as(final Class<ResourceType> clazz) {
        return (com.bumptech.glide.i<ResourceType>)new com.bumptech.glide.i(this.glide, this, (Class)clazz, this.context);
    }
    
    public com.bumptech.glide.i<Bitmap> asBitmap() {
        return (com.bumptech.glide.i<Bitmap>)this.as(Bitmap.class).apply((a)j.DECODE_TYPE_BITMAP);
    }
    
    public com.bumptech.glide.i<Drawable> asDrawable() {
        return this.as(Drawable.class);
    }
    
    public com.bumptech.glide.i<File> asFile() {
        return (com.bumptech.glide.i<File>)this.as(File.class).apply((a)f.skipMemoryCacheOf(true));
    }
    
    public com.bumptech.glide.i<b9.c> asGif() {
        return (com.bumptech.glide.i<b9.c>)this.as(b9.c.class).apply((a)j.DECODE_TYPE_GIF);
    }
    
    public void clear(final View view) {
        this.clear((h9.j<?>)new j.j$b(view));
    }
    
    public void clear(final h9.j<?> j) {
        if (j == null) {
            return;
        }
        this.untrackOrDelegate(j);
    }
    
    public com.bumptech.glide.i<File> download(final Object o) {
        return (com.bumptech.glide.i<File>)this.downloadOnly().load(o);
    }
    
    public com.bumptech.glide.i<File> downloadOnly() {
        return (com.bumptech.glide.i<File>)this.as(File.class).apply((a)j.DOWNLOAD_ONLY_OPTIONS);
    }
    
    public List<e<Object>> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }
    
    public f getDefaultRequestOptions() {
        synchronized (this) {
            return this.requestOptions;
        }
    }
    
    public <T> k<?, T> getDefaultTransitionOptions(final Class<T> clazz) {
        final com.bumptech.glide.f h = this.glide.h;
        k i;
        k k = i = h.f.get(clazz);
        if (k == null) {
            final Iterator<Map.Entry<Class<?>, k<?, ?>>> iterator = h.f.entrySet().iterator();
            while (true) {
                i = k;
                if (!iterator.hasNext()) {
                    break;
                }
                final Map.Entry<Class, V> entry = iterator.next();
                if (!entry.getKey().isAssignableFrom(clazz)) {
                    continue;
                }
                k = (k)entry.getValue();
            }
        }
        Object j;
        if ((j = i) == null) {
            j = com.bumptech.glide.f.k;
        }
        return (k<?, T>)j;
    }
    
    public boolean isPaused() {
        synchronized (this) {
            return this.requestTracker.c;
        }
    }
    
    public com.bumptech.glide.i<Drawable> load(final Bitmap bitmap) {
        return (com.bumptech.glide.i<Drawable>)this.asDrawable().load(bitmap);
    }
    
    public com.bumptech.glide.i<Drawable> load(final Drawable drawable) {
        return (com.bumptech.glide.i<Drawable>)this.asDrawable().load(drawable);
    }
    
    public com.bumptech.glide.i<Drawable> load(final Uri uri) {
        return (com.bumptech.glide.i<Drawable>)this.asDrawable().load(uri);
    }
    
    public com.bumptech.glide.i<Drawable> load(final File file) {
        return (com.bumptech.glide.i<Drawable>)this.asDrawable().load(file);
    }
    
    public com.bumptech.glide.i<Drawable> load(final Integer n) {
        return (com.bumptech.glide.i<Drawable>)this.asDrawable().load(n);
    }
    
    public com.bumptech.glide.i<Drawable> load(final Object o) {
        return (com.bumptech.glide.i<Drawable>)this.asDrawable().load(o);
    }
    
    public com.bumptech.glide.i<Drawable> load(final String s) {
        return (com.bumptech.glide.i<Drawable>)this.asDrawable().load(s);
    }
    
    @Deprecated
    public com.bumptech.glide.i<Drawable> load(final URL url) {
        return (com.bumptech.glide.i<Drawable>)this.asDrawable().load(url);
    }
    
    public com.bumptech.glide.i<Drawable> load(final byte[] array) {
        return (com.bumptech.glide.i<Drawable>)this.asDrawable().load(array);
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
    }
    
    public void onDestroy() {
        synchronized (this) {
            this.targetTracker.onDestroy();
            final Iterator iterator = k9.j.e((Set)this.targetTracker.f).iterator();
            while (iterator.hasNext()) {
                this.clear((h9.j<?>)iterator.next());
            }
            this.targetTracker.f.clear();
            final o requestTracker = this.requestTracker;
            final Iterator iterator2 = k9.j.e((Set)requestTracker.a).iterator();
            while (iterator2.hasNext()) {
                requestTracker.a((g9.c)iterator2.next());
            }
            requestTracker.b.clear();
            this.lifecycle.d(this);
            this.lifecycle.d(this.connectivityMonitor);
            k9.j.f().removeCallbacks(this.addSelfToLifecycle);
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
            for (final g9.c c : k9.j.e((Set)requestTracker.a)) {
                if (c.isRunning() || c.d()) {
                    c.clear();
                    requestTracker.b.add(c);
                }
            }
        }
    }
    
    public void pauseAllRequestsRecursive() {
        synchronized (this) {
            this.pauseAllRequests();
            final Iterator<j> iterator = this.treeNode.a().iterator();
            while (iterator.hasNext()) {
                iterator.next().pauseAllRequests();
            }
        }
    }
    
    public void pauseRequests() {
        synchronized (this) {
            final o requestTracker = this.requestTracker;
            requestTracker.c = true;
            for (final g9.c c : k9.j.e((Set)requestTracker.a)) {
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
            final Iterator<j> iterator = this.treeNode.a().iterator();
            while (iterator.hasNext()) {
                iterator.next().pauseRequests();
            }
        }
    }
    
    public void resumeRequests() {
        synchronized (this) {
            final o requestTracker = this.requestTracker;
            requestTracker.c = false;
            for (final g9.c c : k9.j.e((Set)requestTracker.a)) {
                if (!c.d() && !c.isRunning()) {
                    c.j();
                }
            }
            requestTracker.b.clear();
        }
    }
    
    public void resumeRequestsRecursive() {
        synchronized (this) {
            k9.j.a();
            this.resumeRequests();
            final Iterator<j> iterator = this.treeNode.a().iterator();
            while (iterator.hasNext()) {
                iterator.next().resumeRequests();
            }
        }
    }
    
    public j setDefaultRequestOptions(final f requestOptions) {
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
    
    public void track(final h9.j<?> j, final g9.c c) {
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
    
    public boolean untrack(final h9.j<?> j) {
        synchronized (this) {
            final g9.c request = j.getRequest();
            if (request == null) {
                return true;
            }
            if (this.requestTracker.a(request)) {
                this.targetTracker.f.remove(j);
                j.c((g9.c)null);
                return true;
            }
            return false;
        }
    }
    
    public final class c implements a
    {
        public final o a;
        
        public c(final o a) {
            this.a = a;
        }
    }
}
