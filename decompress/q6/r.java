// 
// Decompiled by Procyon v0.6.0
// 

package q6;

import java.util.Iterator;
import java.util.zip.ZipEntry;
import android.graphics.Bitmap;
import java.util.Map;
import android.graphics.BitmapFactory;
import android.content.res.Resources$NotFoundException;
import rk2.b0$a;
import c7.c;
import java.lang.ref.WeakReference;
import b7.w;
import rk2.b0;
import java.io.Closeable;
import c7.g;
import com.airbnb.lottie.parser.moshi.a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import rk2.g0;
import rk2.u;
import java.io.InputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;
import ak0.m;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import w6.f;
import java.util.concurrent.Callable;
import java.util.HashMap;

public final class r
{
    public static final HashMap a;
    public static final byte[] b;
    
    static {
        a = new HashMap();
        b = new byte[] { 80, 75, 3, 4 };
    }
    
    public static i0<h> a(final String s, final Callable<h0<h>> callable) {
        Object o;
        if (s == null) {
            o = null;
        }
        else {
            o = f.b.a.get((Object)s);
        }
        if (o != null) {
            return new i0<h>(new o(o, 0), false);
        }
        if (s != null) {
            final HashMap a = r.a;
            if (a.containsKey(s)) {
                return (i0<h>)a.get(s);
            }
        }
        final i0 i0 = new i0(callable, false);
        if (s != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            i0.b(new p(s, atomicBoolean));
            i0.a(new q(s, atomicBoolean));
            if (!atomicBoolean.get()) {
                r.a.put(s, i0);
            }
        }
        return i0;
    }
    
    public static i0<h> b(final Context context, final String s) {
        final String l = m.l("asset_", s);
        return a(l, new q6.m(s, l, 0, context.getApplicationContext()));
    }
    
    public static h0<h> c(final Context context, final String s, final String s2) {
        try {
            if (!s.endsWith(".zip") && !s.endsWith(".lottie")) {
                return d(context.getAssets().open(s), s2);
            }
            return h(new ZipInputStream(context.getAssets().open(s)), s2);
        }
        catch (final IOException ex) {
            return new h0<h>(ex);
        }
    }
    
    public static h0<h> d(final InputStream inputStream, final String s) {
        try {
            final b0 b = u.b((g0)u.g(inputStream));
            final String[] j = JsonReader.j;
            return e(new a(b), s, true);
        }
        finally {
            g.b((Closeable)inputStream);
        }
    }
    
    public static h0 e(final a a, final String s, final boolean b) {
        try {
            Label_0032: {
                try {
                    final h a2 = w.a(a);
                    if (s != null) {
                        f.b.a.put((Object)s, (Object)a2);
                    }
                    break Label_0032;
                }
                finally {
                    if (b) {
                        g.b((Closeable)a);
                    }
                    h0 h2 = null;
                Block_6:
                    while (true) {
                        g.b((Closeable)a);
                        return;
                        final h a2;
                        h2 = new h0(a2);
                        iftrue(Label_0049:)(!b);
                        break Block_6;
                        Label_0068: {
                            return h0;
                        }
                        final Exception ex;
                        h0 = new h0(ex);
                        iftrue(Label_0068:)(!b);
                        continue;
                    }
                    g.b((Closeable)a);
                    Label_0049: {
                        return h2;
                    }
                }
            }
        }
        catch (final Exception ex2) {}
    }
    
    public static i0<h> f(final Context context, final int n, final String s) {
        return a(s, new n(new WeakReference((T)context), context.getApplicationContext(), n, s));
    }
    
    public static h0<h> g(final Context context, int i, final String s) {
        try {
            final b0 b = u.b((g0)u.g(context.getResources().openRawResource(i)));
            Boolean b3 = null;
            Label_0097: {
                try {
                    final b0 peek = b.peek();
                    final byte[] b2 = r.b;
                    int length;
                    for (length = b2.length, i = 0; i < length; ++i) {
                        if (peek.readByte() != b2[i]) {
                            b3 = Boolean.FALSE;
                            break Label_0097;
                        }
                    }
                    peek.close();
                    b3 = Boolean.TRUE;
                }
                catch (final Exception ex) {
                    c.a.getClass();
                    b3 = Boolean.FALSE;
                }
                catch (final NoSuchMethodError noSuchMethodError) {
                    b3 = Boolean.FALSE;
                }
            }
            if (b3) {
                return h(new ZipInputStream((InputStream)new b0$a(b)), s);
            }
            return d((InputStream)new b0$a(b), s);
        }
        catch (final Resources$NotFoundException ex2) {
            return new h0<h>((Throwable)ex2);
        }
    }
    
    public static h0<h> h(final ZipInputStream zipInputStream, final String s) {
        try {
            return i(zipInputStream, s);
        }
        finally {
            g.b((Closeable)zipInputStream);
        }
    }
    
    public static h0<h> i(final ZipInputStream zipInputStream, final String s) {
        final HashMap hashMap = new HashMap();
        try {
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            h h = null;
            while (zipEntry != null) {
                final String name = zipEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                }
                else if (zipEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                }
                else if (zipEntry.getName().contains(".json")) {
                    final b0 b = u.b((g0)u.g((InputStream)zipInputStream));
                    final String[] j = JsonReader.j;
                    h = (h)e(new a(b), null, false).a;
                }
                else if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    zipInputStream.closeEntry();
                }
                else {
                    final String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream((InputStream)zipInputStream));
                }
                zipEntry = zipInputStream.getNextEntry();
            }
            if (h == null) {
                return new h0<h>(new IllegalArgumentException("Unable to parse composition"));
            }
        Label_0236:
            for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
                final String s2 = entry.getKey();
                while (true) {
                    for (final d0 d0 : h.d.values()) {
                        if (d0.c.equals(s2)) {
                            if (d0 != null) {
                                d0.d = g.e(d0.a, d0.b, (Bitmap)entry.getValue());
                                continue Label_0236;
                            }
                            continue Label_0236;
                        }
                    }
                    d0 d0 = null;
                    continue;
                }
            }
            for (final Map.Entry<K, d0> entry2 : h.d.entrySet()) {
                if (entry2.getValue().d == null) {
                    final StringBuilder k = a.k("There is no image for ");
                    k.append(entry2.getValue().c);
                    return new h0<h>(new IllegalStateException(k.toString()));
                }
            }
            if (s != null) {
                f.b.a.put((Object)s, (Object)h);
            }
            return new h0<h>(h);
        }
        catch (final IOException ex) {
            return new h0<h>(ex);
        }
    }
    
    public static String j(final int n, final Context context) {
        final StringBuilder k = a.k("rawRes");
        String s;
        if ((context.getResources().getConfiguration().uiMode & 0x30) == 0x20) {
            s = "_night_";
        }
        else {
            s = "_day_";
        }
        k.append(s);
        k.append(n);
        return k.toString();
    }
}
