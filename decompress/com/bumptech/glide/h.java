// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide;

import java.util.Arrays;
import i9.g;
import java.net.URL;
import android.content.pm.PackageInfo;
import java.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import p8.d;
import android.net.Uri;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import i9.l;
import android.widget.ImageView;
import java.io.File;
import java.util.Collection;
import java.util.ArrayList;
import com.bumptech.glide.request.SingleRequest;
import java.util.Iterator;
import com.bumptech.glide.request.RequestCoordinator;
import h9.c;
import java.util.concurrent.Executor;
import java.util.List;
import android.content.Context;
import h9.f;
import h9.a;

public class h<TranscodeType> extends a<h<TranscodeType>>
{
    public static final f DOWNLOAD_ONLY_OPTIONS;
    private final Context context;
    private h<TranscodeType> errorBuilder;
    private final b glide;
    private final e glideContext;
    private boolean isDefaultTransitionOptionsSet;
    private boolean isModelSet;
    private boolean isThumbnailBuilt;
    private Object model;
    private List<h9.e<TranscodeType>> requestListeners;
    private final i requestManager;
    private Float thumbSizeMultiplier;
    private h<TranscodeType> thumbnailBuilder;
    private final Class<TranscodeType> transcodeClass;
    private j<?, ? super TranscodeType> transitionOptions;
    
    static {
        DOWNLOAD_ONLY_OPTIONS = (f)((a)((a)((a)new f()).diskCacheStrategy((r8.f)r8.f.c)).priority(Priority.LOW)).skipMemoryCache(true);
    }
    
    public h(final b glide, final i requestManager, final Class<TranscodeType> transcodeClass, final Context context) {
        this.isDefaultTransitionOptionsSet = true;
        this.glide = glide;
        this.requestManager = requestManager;
        this.transcodeClass = transcodeClass;
        this.context = context;
        this.transitionOptions = requestManager.getDefaultTransitionOptions(transcodeClass);
        this.glideContext = glide.h;
        this.initRequestListeners(requestManager.getDefaultRequestListeners());
        this.apply((a<?>)requestManager.getDefaultRequestOptions());
    }
    
    public h(final Class<TranscodeType> clazz, final h<?> h) {
        this(h.glide, h.requestManager, clazz, h.context);
        this.model = h.model;
        this.isModelSet = h.isModelSet;
        this.apply(h);
    }
    
    private c buildRequest(final i9.j<TranscodeType> j, final h9.e<TranscodeType> e, final a<?> a, final Executor executor) {
        return this.buildRequestRecursive(new Object(), j, e, null, this.transitionOptions, a.getPriority(), a.getOverrideWidth(), a.getOverrideHeight(), a, executor);
    }
    
    private c buildRequestRecursive(final Object o, final i9.j<TranscodeType> j, final h9.e<TranscodeType> e, final RequestCoordinator requestCoordinator, final j<?, ? super TranscodeType> i, final Priority priority, final int n, final int n2, final a<?> a, final Executor executor) {
        com.bumptech.glide.request.a a2;
        Object o2;
        if (this.errorBuilder != null) {
            o2 = (a2 = new com.bumptech.glide.request.a(o, requestCoordinator));
        }
        else {
            final c c = null;
            o2 = requestCoordinator;
            a2 = (com.bumptech.glide.request.a)c;
        }
        final c buildThumbnailRequestRecursive = this.buildThumbnailRequestRecursive(o, j, e, (RequestCoordinator)o2, i, priority, n, n2, a, executor);
        if (a2 == null) {
            return buildThumbnailRequestRecursive;
        }
        final int overrideWidth = this.errorBuilder.getOverrideWidth();
        final int overrideHeight = this.errorBuilder.getOverrideHeight();
        int overrideWidth2 = overrideWidth;
        int overrideHeight2 = overrideHeight;
        if (l9.j.i(n, n2)) {
            overrideWidth2 = overrideWidth;
            overrideHeight2 = overrideHeight;
            if (!this.errorBuilder.isValidOverride()) {
                overrideWidth2 = a.getOverrideWidth();
                overrideHeight2 = a.getOverrideHeight();
            }
        }
        final h<TranscodeType> errorBuilder = this.errorBuilder;
        final c buildRequestRecursive = errorBuilder.buildRequestRecursive(o, j, e, (RequestCoordinator)a2, errorBuilder.transitionOptions, errorBuilder.getPriority(), overrideWidth2, overrideHeight2, this.errorBuilder, executor);
        a2.c = buildThumbnailRequestRecursive;
        a2.d = buildRequestRecursive;
        return (c)a2;
    }
    
    private c buildThumbnailRequestRecursive(final Object o, final i9.j<TranscodeType> j, final h9.e<TranscodeType> e, final RequestCoordinator requestCoordinator, final j<?, ? super TranscodeType> i, final Priority priority, final int n, final int n2, final a<?> a, final Executor executor) {
        final h<TranscodeType> thumbnailBuilder = this.thumbnailBuilder;
        if (thumbnailBuilder != null) {
            if (!this.isThumbnailBuilt) {
                j<?, ? super TranscodeType> transitionOptions = thumbnailBuilder.transitionOptions;
                if (thumbnailBuilder.isDefaultTransitionOptionsSet) {
                    transitionOptions = i;
                }
                Priority priority2;
                if (thumbnailBuilder.isPrioritySet()) {
                    priority2 = this.thumbnailBuilder.getPriority();
                }
                else {
                    priority2 = this.getThumbnailPriority(priority);
                }
                final int overrideWidth = this.thumbnailBuilder.getOverrideWidth();
                final int overrideHeight = this.thumbnailBuilder.getOverrideHeight();
                int overrideWidth2 = overrideWidth;
                int overrideHeight2 = overrideHeight;
                if (l9.j.i(n, n2)) {
                    overrideWidth2 = overrideWidth;
                    overrideHeight2 = overrideHeight;
                    if (!this.thumbnailBuilder.isValidOverride()) {
                        overrideWidth2 = a.getOverrideWidth();
                        overrideHeight2 = a.getOverrideHeight();
                    }
                }
                final com.bumptech.glide.request.b b = new com.bumptech.glide.request.b(o, requestCoordinator);
                final c obtainRequest = this.obtainRequest(o, j, e, a, (RequestCoordinator)b, i, priority, n, n2, executor);
                this.isThumbnailBuilt = true;
                final h<TranscodeType> thumbnailBuilder2 = this.thumbnailBuilder;
                final c buildRequestRecursive = thumbnailBuilder2.buildRequestRecursive(o, j, e, (RequestCoordinator)b, transitionOptions, priority2, overrideWidth2, overrideHeight2, thumbnailBuilder2, executor);
                this.isThumbnailBuilt = false;
                b.c = obtainRequest;
                b.d = buildRequestRecursive;
                return (c)b;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        else {
            if (this.thumbSizeMultiplier != null) {
                final com.bumptech.glide.request.b b2 = new com.bumptech.glide.request.b(o, requestCoordinator);
                final c obtainRequest2 = this.obtainRequest(o, j, e, a, (RequestCoordinator)b2, i, priority, n, n2, executor);
                final c obtainRequest3 = this.obtainRequest(o, j, e, (a<?>)a.clone().sizeMultiplier((float)this.thumbSizeMultiplier), (RequestCoordinator)b2, i, this.getThumbnailPriority(priority), n, n2, executor);
                b2.c = obtainRequest2;
                b2.d = obtainRequest3;
                return (c)b2;
            }
            return this.obtainRequest(o, j, e, a, requestCoordinator, i, priority, n, n2, executor);
        }
    }
    
    private h<TranscodeType> cloneWithNullErrorAndThumbnail() {
        return this.clone().error(null).thumbnail((h<TranscodeType>)null);
    }
    
    private Priority getThumbnailPriority(final Priority priority) {
        final int n = h$a.b[((Enum)priority).ordinal()];
        if (n == 1) {
            return Priority.NORMAL;
        }
        if (n == 2) {
            return Priority.HIGH;
        }
        if (n != 3 && n != 4) {
            final StringBuilder t = a.t("unknown priority: ");
            t.append(this.getPriority());
            throw new IllegalArgumentException(t.toString());
        }
        return Priority.IMMEDIATE;
    }
    
    private void initRequestListeners(final List<h9.e<Object>> list) {
        final Iterator<h9.e<Object>> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.addListener((h9.e<TranscodeType>)iterator.next());
        }
    }
    
    private <Y extends i9.j<TranscodeType>> Y into(final Y y, final h9.e<TranscodeType> e, final a<?> a, final Executor executor) {
        ah0.b.F((Object)y);
        if (!this.isModelSet) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        final c buildRequest = this.buildRequest(y, e, a, executor);
        final c request = y.getRequest();
        if (buildRequest.h(request) && !this.isSkipMemoryCacheWithCompletePreviousRequest(a, request)) {
            ah0.b.F((Object)request);
            if (!request.isRunning()) {
                request.j();
            }
            return y;
        }
        this.requestManager.clear(y);
        y.b(buildRequest);
        this.requestManager.track(y, buildRequest);
        return y;
    }
    
    private boolean isSkipMemoryCacheWithCompletePreviousRequest(final a<?> a, final c c) {
        return !a.isMemoryCacheable() && c.e();
    }
    
    private h<TranscodeType> loadGeneric(final Object model) {
        if (this.isAutoCloneEnabled()) {
            return this.clone().loadGeneric(model);
        }
        this.model = model;
        this.isModelSet = true;
        return (h)this.selfOrThrowIfLocked();
    }
    
    private c obtainRequest(final Object o, final i9.j<TranscodeType> j, final h9.e<TranscodeType> e, final a<?> a, final RequestCoordinator requestCoordinator, final j<?, ? super TranscodeType> i, final Priority priority, final int n, final int n2, final Executor executor) {
        final Context context = this.context;
        final e glideContext = this.glideContext;
        return (c)new SingleRequest(context, glideContext, o, this.model, (Class)this.transcodeClass, (a)a, n, n2, priority, (i9.j)j, (h9.e)e, (List)this.requestListeners, requestCoordinator, glideContext.g, i.f, executor);
    }
    
    public h<TranscodeType> addListener(final h9.e<TranscodeType> e) {
        if (this.isAutoCloneEnabled()) {
            return this.clone().addListener(e);
        }
        if (e != null) {
            if (this.requestListeners == null) {
                this.requestListeners = new ArrayList<h9.e<TranscodeType>>();
            }
            this.requestListeners.add(e);
        }
        return (h)this.selfOrThrowIfLocked();
    }
    
    public h<TranscodeType> apply(final a<?> a) {
        ah0.b.F((Object)a);
        return (h)super.apply((a)a);
    }
    
    public /* bridge */ a apply(final a a) {
        return this.apply((a<?>)a);
    }
    
    public h<TranscodeType> clone() {
        final h h = (h)super.clone();
        h.transitionOptions = (j<?, ? super TranscodeType>)h.transitionOptions.a();
        if (h.requestListeners != null) {
            h.requestListeners = new ArrayList<h9.e<TranscodeType>>(h.requestListeners);
        }
        final h<TranscodeType> thumbnailBuilder = h.thumbnailBuilder;
        if (thumbnailBuilder != null) {
            h.thumbnailBuilder = thumbnailBuilder.clone();
        }
        final h<TranscodeType> errorBuilder = h.errorBuilder;
        if (errorBuilder != null) {
            h.errorBuilder = errorBuilder.clone();
        }
        return h;
    }
    
    public /* bridge */ a clone() {
        return this.clone();
    }
    
    public /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.clone();
    }
    
    @Deprecated
    public h9.b<File> downloadOnly(final int n, final int n2) {
        return this.getDownloadOnlyRequest().submit(n, n2);
    }
    
    @Deprecated
    public <Y extends i9.j<File>> Y downloadOnly(final Y y) {
        return (Y)this.getDownloadOnlyRequest().into((i9.j)y);
    }
    
    public h<TranscodeType> error(final h<TranscodeType> errorBuilder) {
        if (this.isAutoCloneEnabled()) {
            return this.clone().error(errorBuilder);
        }
        this.errorBuilder = errorBuilder;
        return (h)this.selfOrThrowIfLocked();
    }
    
    public h<TranscodeType> error(final Object o) {
        if (o == null) {
            return this.error(null);
        }
        return this.error(this.cloneWithNullErrorAndThumbnail().load(o));
    }
    
    public h<File> getDownloadOnlyRequest() {
        return new h<File>(File.class, this).apply((a<?>)h.DOWNLOAD_ONLY_OPTIONS);
    }
    
    @Deprecated
    public h9.b<TranscodeType> into(final int n, final int n2) {
        return this.submit(n, n2);
    }
    
    public <Y extends i9.j<TranscodeType>> Y into(final Y y) {
        return this.into(y, null, (Executor)l9.e.a);
    }
    
    public <Y extends i9.j<TranscodeType>> Y into(final Y y, final h9.e<TranscodeType> e, final Executor executor) {
        return this.into(y, e, this, executor);
    }
    
    public l<ImageView, TranscodeType> into(final ImageView imageView) {
        l9.j.a();
        ah0.b.F((Object)imageView);
        a a = null;
        Label_0125: {
            if (!this.isTransformationSet() && this.isTransformationAllowed() && imageView.getScaleType() != null) {
                switch (h$a.a[((Enum)imageView.getScaleType()).ordinal()]) {
                    case 6: {
                        a = this.clone().optionalCenterInside();
                        break Label_0125;
                    }
                    case 3:
                    case 4:
                    case 5: {
                        a = this.clone().optionalFitCenter();
                        break Label_0125;
                    }
                    case 2: {
                        a = this.clone().optionalCenterInside();
                        break Label_0125;
                    }
                    case 1: {
                        a = this.clone().optionalCenterCrop();
                        break Label_0125;
                    }
                }
            }
            a = this;
        }
        final e glideContext = this.glideContext;
        final Class<TranscodeType> transcodeClass = this.transcodeClass;
        glideContext.c.getClass();
        Object o;
        if (Bitmap.class.equals(transcodeClass)) {
            o = new i9.b(imageView);
        }
        else {
            if (!Drawable.class.isAssignableFrom(transcodeClass)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unhandled class: ");
                sb.append(transcodeClass);
                sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
                throw new IllegalArgumentException(sb.toString());
            }
            o = new i9.e(imageView);
        }
        return (l<ImageView, TranscodeType>)this.into(o, null, (a<?>)a, (Executor)l9.e.a);
    }
    
    public h<TranscodeType> listener(final h9.e<TranscodeType> e) {
        if (this.isAutoCloneEnabled()) {
            return this.clone().listener(e);
        }
        this.requestListeners = null;
        return this.addListener(e);
    }
    
    public h<TranscodeType> load(final Bitmap bitmap) {
        return this.loadGeneric(bitmap).apply((a<?>)f.diskCacheStrategyOf((r8.f)r8.f.b));
    }
    
    public h<TranscodeType> load(final Drawable drawable) {
        return this.loadGeneric(drawable).apply((a<?>)f.diskCacheStrategyOf((r8.f)r8.f.b));
    }
    
    public h<TranscodeType> load(final Uri uri) {
        return this.loadGeneric(uri);
    }
    
    public h<TranscodeType> load(final File file) {
        return this.loadGeneric(file);
    }
    
    public h<TranscodeType> load(final Integer n) {
        final h<TranscodeType> loadGeneric = this.loadGeneric(n);
        final Context context = this.context;
        final ConcurrentHashMap a = k9.b.a;
        final String packageName = context.getPackageName();
        d d;
        if ((d = k9.b.a.get(packageName)) == null) {
            PackageInfo packageInfo;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            }
            catch (final PackageManager$NameNotFoundException ex) {
                final StringBuilder t = a.t("Cannot resolve info for");
                t.append(context.getPackageName());
                Log.e("AppVersionSignature", t.toString(), (Throwable)ex);
                packageInfo = null;
            }
            String s;
            if (packageInfo != null) {
                s = String.valueOf(packageInfo.versionCode);
            }
            else {
                s = UUID.randomUUID().toString();
            }
            final k9.d d2 = new k9.d(s);
            if ((d = k9.b.a.putIfAbsent(packageName, d2)) == null) {
                d = d2;
            }
        }
        return loadGeneric.apply((a)f.signatureOf((d)new k9.a(context.getResources().getConfiguration().uiMode & 0x30, d)));
    }
    
    public h<TranscodeType> load(final Object o) {
        return this.loadGeneric(o);
    }
    
    public h<TranscodeType> load(final String s) {
        return this.loadGeneric(s);
    }
    
    @Deprecated
    public h<TranscodeType> load(final URL url) {
        return this.loadGeneric(url);
    }
    
    public h<TranscodeType> load(final byte[] array) {
        h h2;
        final h<TranscodeType> h = h2 = this.loadGeneric(array);
        if (!h.isDiskCacheStrategySet()) {
            h2 = h.apply((a)f.diskCacheStrategyOf((r8.f)r8.f.b));
        }
        h apply = h2;
        if (!h2.isSkipMemoryCacheSet()) {
            apply = h2.apply((a)f.skipMemoryCacheOf(true));
        }
        return apply;
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
    
    public i9.j<TranscodeType> preload() {
        return this.preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    public i9.j<TranscodeType> preload(final int n, final int n2) {
        return this.into((i9.j<TranscodeType>)new g(this.requestManager, n, n2));
    }
    
    public h9.b<TranscodeType> submit() {
        return this.submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    public h9.b<TranscodeType> submit(final int n, final int n2) {
        final h9.d d = new h9.d(n, n2);
        return this.into((h9.b<TranscodeType>)d, (h9.e<TranscodeType>)d, (Executor)l9.e.b);
    }
    
    public h<TranscodeType> thumbnail(final float n) {
        if (this.isAutoCloneEnabled()) {
            return this.clone().thumbnail(n);
        }
        if (n >= 0.0f && n <= 1.0f) {
            this.thumbSizeMultiplier = n;
            return (h)this.selfOrThrowIfLocked();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }
    
    public h<TranscodeType> thumbnail(final h<TranscodeType> thumbnailBuilder) {
        if (this.isAutoCloneEnabled()) {
            return this.clone().thumbnail(thumbnailBuilder);
        }
        this.thumbnailBuilder = thumbnailBuilder;
        return (h)this.selfOrThrowIfLocked();
    }
    
    public h<TranscodeType> thumbnail(final List<h<TranscodeType>> list) {
        h thumbnail = null;
        if (list != null && !list.isEmpty()) {
            for (int i = list.size() - 1; i >= 0; --i) {
                final h h = list.get(i);
                if (h != null) {
                    if (thumbnail == null) {
                        thumbnail = h;
                    }
                    else {
                        thumbnail = h.thumbnail(thumbnail);
                    }
                }
            }
            return this.thumbnail((h<TranscodeType>)thumbnail);
        }
        return this.thumbnail((h<TranscodeType>)null);
    }
    
    public h<TranscodeType> thumbnail(final h<TranscodeType>... array) {
        if (array != null && array.length != 0) {
            return this.thumbnail(Arrays.asList(array));
        }
        return this.thumbnail((h<TranscodeType>)null);
    }
    
    public h<TranscodeType> transition(final j<?, ? super TranscodeType> transitionOptions) {
        if (this.isAutoCloneEnabled()) {
            return this.clone().transition(transitionOptions);
        }
        ah0.b.F((Object)transitionOptions);
        this.transitionOptions = transitionOptions;
        this.isDefaultTransitionOptionsSet = false;
        return (h)this.selfOrThrowIfLocked();
    }
}
