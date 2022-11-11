// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide;

import android.os.BaseBundle;
import android.content.res.Configuration;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.Iterator;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentCallbacks;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import r8.j;
import android.util.Log;
import java.util.Collections;
import android.content.ContentResolver;
import com.bumptech.glide.load.ImageHeaderParser;
import u8.b$d;
import v8.b$a;
import u8.j$a;
import java.net.URL;
import u8.w$a;
import u8.v$a;
import u8.v$b;
import u8.v$d;
import v8.e$c;
import v8.d$a;
import v8.c$a;
import u8.a$b;
import u8.a$c;
import u8.t$a;
import u8.t$b;
import u8.t$c;
import u8.d$c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import u8.e$b;
import u8.e$e;
import u8.c$b;
import java.io.File;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.graphics.drawable.BitmapDrawable;
import o8.i;
import x8.w;
import u8.o;
import u8.u$a;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import x8.r;
import android.graphics.Bitmap;
import java.io.InputStream;
import h.t;
import f9.a$a;
import java.nio.ByteBuffer;
import u8.s$a;
import u8.s$b;
import u8.s$d;
import android.content.res.Resources;
import u8.s$c;
import x8.p;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import b9.a;
import android.os.Build$VERSION;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.util.List;
import com.bumptech.glide.load.engine.e;
import android.content.Context;
import java.util.ArrayList;
import d9.m;
import r8.b;
import s8.h;
import r8.d;
import android.content.ComponentCallbacks2;

public final class c implements ComponentCallbacks2
{
    public static volatile c n;
    public static volatile boolean o;
    public final d f;
    public final h g;
    public final f h;
    public final Registry i;
    public final b j;
    public final m k;
    public final d9.c l;
    public final ArrayList m;
    
    public c(final Context context, final e e, h g, final d f, final b j, final m k, d9.c resources, final int n, final a a, final j0.b b, final List list, final g g2) {
        this.m = new ArrayList();
        final MemoryCategory low = MemoryCategory.LOW;
        this.f = f;
        this.j = j;
        this.g = g;
        this.k = k;
        this.l = resources;
        resources = (d9.c)context.getResources();
        final Registry i = new Registry();
        this.i = i;
        final DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        g = (h)i.g;
        synchronized (g) {
            ((s6.b)g).a.add(defaultImageHeaderParser);
            monitorexit(g);
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 27) {
                final x8.m m = new x8.m();
                g = (h)i.g;
                synchronized (g) {
                    ((s6.b)g).a.add(m);
                }
            }
            final List<ImageHeaderParser> d = i.d();
            final b9.a a2 = new b9.a(context, d, f, j);
            final VideoDecoder videoDecoder = new VideoDecoder(f, (VideoDecoder.VideoDecoder$f)new VideoDecoder.g());
            final com.bumptech.glide.load.resource.bitmap.a a3 = new com.bumptech.glide.load.resource.bitmap.a((List)i.d(), ((Resources)resources).getDisplayMetrics(), f, j);
            Object o;
            if (g2.a.containsKey(com.bumptech.glide.d.b.class) && sdk_INT >= 28) {
                g = (h)new p();
                o = new x8.g();
            }
            else {
                o = new x8.f(a3);
                g = (h)new com.bumptech.glide.load.resource.bitmap.c(a3, j);
            }
            final z8.e e2 = new z8.e(context);
            final s$c s$c = new s$c((Resources)resources);
            final s$d s$d = new s$d((Resources)resources);
            final s$b s$b = new s$b((Resources)resources);
            final s$a s$a = new s$a((Resources)resources);
            final x8.b b2 = new x8.b(j);
            final c9.a a4 = new c9.a();
            final dn.a a5 = new dn.a(2);
            final ContentResolver contentResolver = context.getContentResolver();
            final h3.b b3 = new h3.b();
            f9.a a6 = i.b;
            synchronized (a6) {
                a6.a.add(new a$a((Class)ByteBuffer.class, (o8.a)b3));
                monitorexit(a6);
                final t t = new t((Object)j, 3);
                a6 = i.b;
                synchronized (a6) {
                    a6.a.add(new a$a((Class)InputStream.class, (o8.a)t));
                    monitorexit(a6);
                    i.c((o8.h)o, ByteBuffer.class, Bitmap.class, "Bitmap");
                    i.c((o8.h)g, InputStream.class, Bitmap.class, "Bitmap");
                    i.c((o8.h)new r(a3), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
                    i.c(videoDecoder, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
                    i.c(new VideoDecoder(f, (VideoDecoder.VideoDecoder$f)new VideoDecoder.c()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
                    final u$a a7 = u$a.a;
                    i.a(Bitmap.class, Bitmap.class, (o)a7);
                    i.c((o8.h)new w(), Bitmap.class, Bitmap.class, "Bitmap");
                    i.b(Bitmap.class, (i)b2);
                    i.c((o8.h)new x8.a((Resources)resources, (o8.h)o), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
                    i.c((o8.h)new x8.a((Resources)resources, (o8.h)g), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
                    i.c((o8.h)new x8.a((Resources)resources, (o8.h)videoDecoder), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
                    i.b(BitmapDrawable.class, (i)new j5.f((Object)f, (Object)b2));
                    i.c(new b9.i(d, a2, j), InputStream.class, b9.c.class, "Gif");
                    i.c(a2, ByteBuffer.class, b9.c.class, "Gif");
                    i.b(b9.c.class, (i)new wd.a());
                    i.a(j8.a.class, j8.a.class, (o)a7);
                    i.c(new b9.g(f), j8.a.class, Bitmap.class, "Bitmap");
                    i.c((o8.h)e2, Uri.class, Drawable.class, "legacy_append");
                    i.c((o8.h)new x8.a(e2, f), Uri.class, Bitmap.class, "legacy_append");
                    i.g((com.bumptech.glide.load.data.e.a)new y8.a$a());
                    i.a(File.class, ByteBuffer.class, (o)new c$b());
                    i.a(File.class, InputStream.class, (o)new e$e());
                    i.c(new a9.a(), File.class, File.class, "legacy_append");
                    i.a(File.class, ParcelFileDescriptor.class, (o)new e$b());
                    i.a(File.class, File.class, (o)a7);
                    i.g(new k.a(j));
                    i.g(new ParcelFileDescriptorRewinder.a());
                    g = (h)Integer.TYPE;
                    i.a((Class)g, InputStream.class, (o)s$c);
                    i.a((Class)g, ParcelFileDescriptor.class, (o)s$b);
                    i.a(Integer.class, InputStream.class, (o)s$c);
                    i.a(Integer.class, ParcelFileDescriptor.class, (o)s$b);
                    i.a(Integer.class, Uri.class, (o)s$d);
                    i.a((Class)g, AssetFileDescriptor.class, (o)s$a);
                    i.a(Integer.class, AssetFileDescriptor.class, (o)s$a);
                    i.a((Class)g, Uri.class, (o)s$d);
                    i.a(String.class, InputStream.class, (o)new d$c());
                    i.a(Uri.class, InputStream.class, (o)new d$c());
                    i.a(String.class, InputStream.class, (o)new t$c());
                    i.a(String.class, ParcelFileDescriptor.class, (o)new t$b());
                    i.a(String.class, AssetFileDescriptor.class, (o)new t$a());
                    i.a(Uri.class, InputStream.class, (o)new a$c(context.getAssets()));
                    i.a(Uri.class, ParcelFileDescriptor.class, (o)new a$b(context.getAssets()));
                    i.a(Uri.class, InputStream.class, (o)new c$a(context));
                    i.a(Uri.class, InputStream.class, (o)new d$a(context));
                    if (sdk_INT >= 29) {
                        i.a(Uri.class, InputStream.class, (o)new e$c(context));
                        i.a(Uri.class, ParcelFileDescriptor.class, (o)new v8.e$b(context));
                    }
                    i.a(Uri.class, InputStream.class, (o)new v$d(contentResolver));
                    i.a(Uri.class, ParcelFileDescriptor.class, (o)new v$b(contentResolver));
                    i.a(Uri.class, AssetFileDescriptor.class, (o)new v$a(contentResolver));
                    i.a(Uri.class, InputStream.class, (o)new w$a());
                    i.a(URL.class, InputStream.class, (o)new v8.f.a());
                    i.a(Uri.class, File.class, (o)new j$a(context));
                    i.a(u8.f.class, InputStream.class, (o)new b$a());
                    i.a(byte[].class, ByteBuffer.class, (o)new u8.b$a());
                    i.a(byte[].class, InputStream.class, (o)new b$d());
                    i.a(Uri.class, Uri.class, (o)a7);
                    i.a(Drawable.class, Drawable.class, (o)a7);
                    i.c((o8.h)new z8.f(), Drawable.class, Drawable.class, "legacy_append");
                    i.h(Bitmap.class, BitmapDrawable.class, (c9.b)new androidx.lifecycle.w((Resources)resources));
                    i.h(Bitmap.class, byte[].class, a4);
                    i.h(Drawable.class, byte[].class, (c9.b)new t6.h((Object)f, (Object)a4, (Object)a5));
                    i.h(b9.c.class, byte[].class, (c9.b)a5);
                    g = (h)new VideoDecoder(f, (VideoDecoder.VideoDecoder$f<Object>)new VideoDecoder.d());
                    i.c((o8.h)g, ByteBuffer.class, Bitmap.class, "legacy_append");
                    i.c((o8.h)new x8.a((Resources)resources, (o8.h)g), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
                    this.h = new f(context, j, i, new ui.b(), a, b, list, e, g2, n);
                }
            }
        }
    }
    
    public static void a(Context context, final GeneratedAppGlideModule generatedAppGlideModule) {
        if (!c.o) {
            c.o = true;
            final com.bumptech.glide.d d = new com.bumptech.glide.d();
            final Context applicationContext = context.getApplicationContext();
            List<e9.c> emptyList = Collections.emptyList();
            int n = 2;
            Label_0312: {
                if (generatedAppGlideModule != null && !((e9.a)generatedAppGlideModule).c()) {
                    break Label_0312;
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Loading Glide modules");
                }
                emptyList = new ArrayList<e9.c>();
                try {
                    final ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                    if (applicationInfo.metaData == null) {
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Got null app info metadata");
                        }
                    }
                    else {
                        if (Log.isLoggable("ManifestParser", 2)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Got app info metadata: ");
                            sb.append(applicationInfo.metaData);
                            Log.v("ManifestParser", sb.toString());
                        }
                        for (final String s : ((BaseBundle)applicationInfo.metaData).keySet()) {
                            if ("GlideModule".equals(((BaseBundle)applicationInfo.metaData).get(s))) {
                                ((ArrayList<e9.c>)emptyList).add(e9.e.a(s));
                                if (!Log.isLoggable("ManifestParser", 3)) {
                                    continue;
                                }
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Loaded Glide module: ");
                                sb2.append(s);
                                Log.d("ManifestParser", sb2.toString());
                            }
                        }
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Finished loading Glide modules");
                        }
                    }
                    if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
                        final Set d2 = generatedAppGlideModule.d();
                        final Iterator<e9.c> iterator2 = (Iterator<e9.c>)emptyList.iterator();
                        while (iterator2.hasNext()) {
                            final e9.c c = iterator2.next();
                            if (!d2.contains(c.getClass())) {
                                continue;
                            }
                            if (Log.isLoggable("Glide", 3)) {
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("AppGlideModule excludes manifest GlideModule: ");
                                sb3.append(c);
                                Log.d("Glide", sb3.toString());
                            }
                            iterator2.remove();
                        }
                    }
                    if (Log.isLoggable("Glide", 3)) {
                        for (final e9.c c2 : emptyList) {
                            final StringBuilder r = a.r("Discovered GlideModule from manifest: ");
                            r.append(c2.getClass());
                            Log.d("Glide", r.toString());
                        }
                    }
                    m.b e;
                    if (generatedAppGlideModule != null) {
                        e = generatedAppGlideModule.e();
                    }
                    else {
                        e = null;
                    }
                    d.n = e;
                    final Iterator<e9.c> iterator4 = emptyList.iterator();
                    while (iterator4.hasNext()) {
                        iterator4.next().a(applicationContext, d);
                    }
                    if (generatedAppGlideModule != null) {
                        ((e9.a)generatedAppGlideModule).a(applicationContext, d);
                    }
                    if (d.g == null) {
                        final t8.a.a a = new t8.a.a(false);
                        if (t8.a.h == 0) {
                            t8.a.h = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        final int h = t8.a.h;
                        a.b = h;
                        a.c = h;
                        a.d = "source";
                        d.g = a.a();
                    }
                    if (d.h == null) {
                        final int h2 = t8.a.h;
                        final t8.a.a a2 = new t8.a.a(true);
                        a2.b = 1;
                        a2.c = 1;
                        a2.d = "disk-cache";
                        d.h = a2.a();
                    }
                    if (d.o == null) {
                        if (t8.a.h == 0) {
                            t8.a.h = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        if (t8.a.h < 4) {
                            n = 1;
                        }
                        final t8.a.a a3 = new t8.a.a(true);
                        a3.b = n;
                        a3.c = n;
                        a3.d = "animation";
                        d.o = a3.a();
                    }
                    if (d.j == null) {
                        d.j = new s8.i(new s8.i.a(applicationContext));
                    }
                    if (d.k == null) {
                        d.k = new d9.e();
                    }
                    if (d.d == null) {
                        final int a4 = d.j.a;
                        if (a4 > 0) {
                            d.d = (d)new j(a4);
                        }
                        else {
                            d.d = (d)new r8.e();
                        }
                    }
                    if (d.e == null) {
                        d.e = new r8.i(d.j.c);
                    }
                    if (d.f == null) {
                        d.f = new s8.g((long)d.j.b);
                    }
                    if (d.i == null) {
                        d.i = new s8.f(applicationContext);
                    }
                    if (d.c == null) {
                        d.c = new e((h)d.f, (s8.a.a)d.i, d.h, d.g, new t8.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, t8.a.g, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(), new t8.a.b("source-unlimited", false))), d.o);
                    }
                    final List<g9.e<Object>> p2 = d.p;
                    if (p2 == null) {
                        d.p = Collections.emptyList();
                    }
                    else {
                        d.p = (List<g9.e<Object>>)Collections.unmodifiableList((List<?>)p2);
                    }
                    final g.a b = d.b;
                    b.getClass();
                    final g g = new g(b);
                    final c n2 = new c(applicationContext, d.c, (h)d.f, d.d, (b)d.e, new m(d.n, g), d.k, d.l, d.m, d.a, d.p, g);
                    final Iterator<e9.c> iterator5 = emptyList.iterator();
                    while (iterator5.hasNext()) {
                        context = (Context)iterator5.next();
                        try {
                            ((e9.f)context).b(applicationContext, n2, n2.i);
                            continue;
                        }
                        catch (final AbstractMethodError abstractMethodError) {
                            final StringBuilder r2 = a.r("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                            r2.append(context.getClass().getName());
                            throw new IllegalStateException(r2.toString(), abstractMethodError);
                        }
                        break;
                    }
                    if (generatedAppGlideModule != null) {
                        ((e9.d)generatedAppGlideModule).b(applicationContext, n2, n2.i);
                    }
                    applicationContext.registerComponentCallbacks((ComponentCallbacks)n2);
                    c.n = n2;
                    c.o = false;
                    return;
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    throw new RuntimeException("Unable to find metadata to parse GlideModules", (Throwable)ex);
                }
            }
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }
    
    public static c b(final Context context) {
        if (c.n == null) {
            final Context applicationContext = context.getApplicationContext();
            final GeneratedAppGlideModule generatedAppGlideModule = null;
            GeneratedAppGlideModule generatedAppGlideModule2;
            try {
                generatedAppGlideModule2 = (GeneratedAppGlideModule)GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(applicationContext.getApplicationContext());
            }
            catch (final InvocationTargetException ex) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", ex);
            }
            catch (final NoSuchMethodException ex2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", ex2);
            }
            catch (final IllegalAccessException ex3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", ex3);
            }
            catch (final InstantiationException ex4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", ex4);
            }
            catch (final ClassNotFoundException ex5) {
                generatedAppGlideModule2 = generatedAppGlideModule;
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                    generatedAppGlideModule2 = generatedAppGlideModule;
                }
            }
            synchronized (c.class) {
                if (c.n == null) {
                    a(context, generatedAppGlideModule2);
                }
            }
        }
        return c.n;
    }
    
    public static m c(final Context context) {
        if (context != null) {
            return b(context).k;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }
    
    public static com.bumptech.glide.j e(final Context context) {
        return c(context).f(context);
    }
    
    public static com.bumptech.glide.j f(final View view) {
        final m c = c(view.getContext());
        c.getClass();
        com.bumptech.glide.j j;
        if (k9.j.h()) {
            j = c.f(view.getContext().getApplicationContext());
        }
        else {
            if (view.getContext() == null) {
                throw new NullPointerException("Unable to obtain a request manager for a view without a Context");
            }
            final Activity a = m.a(view.getContext());
            if (a == null) {
                j = c.f(view.getContext().getApplicationContext());
            }
            else if (a instanceof androidx.fragment.app.r) {
                final androidx.fragment.app.r r = (androidx.fragment.app.r)a;
                c.k.clear();
                m.c(r.getSupportFragmentManager().J(), c.k);
                final View viewById = ((Activity)r).findViewById(16908290);
                final Fragment fragment = null;
                View view2 = view;
                Fragment fragment2 = fragment;
                Fragment fragment3;
                while (true) {
                    fragment3 = fragment2;
                    if (view2.equals(viewById)) {
                        break;
                    }
                    fragment2 = (Fragment)c.k.getOrDefault((Object)view2, (Object)null);
                    if (fragment2 != null) {
                        fragment3 = fragment2;
                        break;
                    }
                    fragment3 = fragment2;
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                    view2 = (View)view2.getParent();
                }
                c.k.clear();
                if (fragment3 != null) {
                    j = c.g(fragment3);
                }
                else {
                    j = c.h(r);
                }
            }
            else {
                c.l.clear();
                c.b(a.getFragmentManager(), c.l);
                final View viewById2 = a.findViewById(16908290);
                final android.app.Fragment fragment4 = null;
                View view3 = view;
                android.app.Fragment fragment5 = fragment4;
                while (!view3.equals(viewById2)) {
                    final android.app.Fragment fragment6 = (android.app.Fragment)c.l.getOrDefault((Object)view3, (Object)null);
                    if (fragment6 != null) {
                        fragment5 = fragment6;
                        break;
                    }
                    fragment5 = fragment6;
                    if (!(view3.getParent() instanceof View)) {
                        break;
                    }
                    view3 = (View)view3.getParent();
                    fragment5 = fragment6;
                }
                c.l.clear();
                if (fragment5 == null) {
                    j = c.e(a);
                }
                else {
                    if (fragment5.getActivity() == null) {
                        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
                    }
                    if (!k9.j.h()) {
                        if (fragment5.getActivity() != null) {
                            final d9.h n = c.n;
                            fragment5.getActivity();
                            n.c();
                        }
                        j = c.d((Context)fragment5.getActivity(), fragment5.getChildFragmentManager(), fragment5, fragment5.isVisible());
                    }
                    else {
                        j = c.f(((Context)fragment5.getActivity()).getApplicationContext());
                    }
                }
            }
        }
        return j;
    }
    
    public final void d(final com.bumptech.glide.j j) {
        synchronized (this.m) {
            if (this.m.contains(j)) {
                this.m.remove(j);
                return;
            }
            throw new IllegalStateException("Cannot unregister not yet registered manager");
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
        k9.j.a();
        ((k9.g)this.g).e(0L);
        this.f.clearMemory();
        this.j.clearMemory();
    }
    
    public final void onTrimMemory(final int n) {
        k9.j.a();
        synchronized (this.m) {
            final Iterator iterator = this.m.iterator();
            while (iterator.hasNext()) {
                ((com.bumptech.glide.j)iterator.next()).onTrimMemory(n);
            }
            monitorexit(this.m);
            final s8.g g = (s8.g)this.g;
            Label_0110: {
                if (n >= 40) {
                    ((k9.g)g).e(0L);
                    break Label_0110;
                }
                if (n < 20 && n != 15) {
                    g.getClass();
                    break Label_0110;
                }
                synchronized (g) {
                    final long b = ((k9.g)g).b;
                    monitorexit(g);
                    ((k9.g)g).e(b / 2L);
                    this.f.trimMemory(n);
                    this.j.trimMemory(n);
                }
            }
        }
    }
    
    public interface a
    {
        g9.f build();
    }
}
