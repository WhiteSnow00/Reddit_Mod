// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import java.util.Iterator;
import java.util.zip.ZipEntry;
import android.graphics.Bitmap;
import java.util.Map;
import android.graphics.BitmapFactory;
import android.content.res.Resources$NotFoundException;
import fk2.k0;
import ng2.e;
import b7.c;
import java.lang.ref.WeakReference;
import a7.w;
import fk2.b0;
import java.io.Closeable;
import b7.g;
import com.airbnb.lottie.parser.moshi.a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import fk2.g0;
import fk2.u;
import java.io.InputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import v6.f;
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
    
    public static j0<h> a(final String s, final Callable<i0<h>> callable) {
        Object o;
        if (s == null) {
            o = null;
        }
        else {
            o = f.b.a.get((Object)s);
        }
        if (o != null) {
            return new j0<h>(new o(o, 0), false);
        }
        if (s != null) {
            final HashMap a = r.a;
            if (a.containsKey(s)) {
                return (j0<h>)a.get(s);
            }
        }
        final j0 j0 = new j0(callable, false);
        if (s != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            j0.b(new p(s, atomicBoolean));
            j0.a(new q(s, atomicBoolean));
            if (!atomicBoolean.get()) {
                r.a.put(s, j0);
            }
        }
        return j0;
    }
    
    public static j0<h> b(final Context context, final String s) {
        final String l = b.l("asset_", s);
        return a(l, new m(context.getApplicationContext(), 0, s, l));
    }
    
    public static i0<h> c(final Context context, final String s, final String s2) {
        try {
            if (!s.endsWith(".zip") && !s.endsWith(".lottie")) {
                return d(context.getAssets().open(s), s2);
            }
            return h(new ZipInputStream(context.getAssets().open(s)), s2);
        }
        catch (final IOException ex) {
            return new i0<h>(ex);
        }
    }
    
    public static i0<h> d(final InputStream inputStream, final String s) {
        try {
            final b0 b = u.b((g0)u.g(inputStream));
            final String[] j = JsonReader.j;
            return e(new a(b), s, true);
        }
        finally {
            g.b((Closeable)inputStream);
        }
    }
    
    public static i0 e(final a a, final String s, final boolean b) {
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
                    Label_0068: {
                        return;
                    }
                    final h a2;
                    final i0 i2 = new i0(a2);
                    iftrue(Label_0049:)(!b);
                    g.b((Closeable)a);
                    Label_0049:
                    return i2;
                    g.b((Closeable)a);
                    return;
                    final Exception ex;
                    i0 = new i0(ex);
                    iftrue(Label_0068:)(!b);
                }
            }
        }
        catch (final Exception ex2) {}
    }
    
    public static j0<h> f(final Context context, final int n, final String s) {
        return a(s, new n(new WeakReference((T)context), context.getApplicationContext(), n, s));
    }
    
    public static i0<h> g(final Context context, int i, final String s) {
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
                return h(new ZipInputStream(new InputStream(b) {
                    public final b0 f;
                    
                    @Override
                    public final int available() {
                        final b0 f = this.f;
                        if (!f.h) {
                            return (int)Math.min(f.g.g, Integer.MAX_VALUE);
                        }
                        throw new IOException("closed");
                    }
                    
                    @Override
                    public final void close() {
                        this.f.close();
                    }
                    
                    @Override
                    public final int read() {
                        final b0 f = this.f;
                        if (f.h) {
                            throw new IOException("closed");
                        }
                        final fk2.c g = f.g;
                        if (g.g == 0L && f.f.read(g, 8192L) == -1L) {
                            return -1;
                        }
                        return this.f.g.readByte() & 0xFF;
                    }
                    
                    @Override
                    public final int read(final byte[] array, final int n, final int n2) {
                        e.f((Object)array, "data");
                        if (this.f.h) {
                            throw new IOException("closed");
                        }
                        k0.b(array.length, n, n2);
                        final b0 f = this.f;
                        final fk2.c g = f.g;
                        if (g.g == 0L && f.f.read(g, 8192L) == -1L) {
                            return -1;
                        }
                        return this.f.g.read(array, n, n2);
                    }
                    
                    @Override
                    public final String toString() {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(this.f);
                        sb.append(".inputStream()");
                        return sb.toString();
                    }
                }), s);
            }
            return d(new InputStream(b) {
                public final b0 f;
                
                @Override
                public final int available() {
                    final b0 f = this.f;
                    if (!f.h) {
                        return (int)Math.min(f.g.g, Integer.MAX_VALUE);
                    }
                    throw new IOException("closed");
                }
                
                @Override
                public final void close() {
                    this.f.close();
                }
                
                @Override
                public final int read() {
                    final b0 f = this.f;
                    if (f.h) {
                        throw new IOException("closed");
                    }
                    final fk2.c g = f.g;
                    if (g.g == 0L && f.f.read(g, 8192L) == -1L) {
                        return -1;
                    }
                    return this.f.g.readByte() & 0xFF;
                }
                
                @Override
                public final int read(final byte[] array, final int n, final int n2) {
                    e.f((Object)array, "data");
                    if (this.f.h) {
                        throw new IOException("closed");
                    }
                    k0.b(array.length, n, n2);
                    final b0 f = this.f;
                    final fk2.c g = f.g;
                    if (g.g == 0L && f.f.read(g, 8192L) == -1L) {
                        return -1;
                    }
                    return this.f.g.read(array, n, n2);
                }
                
                @Override
                public final String toString() {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.f);
                    sb.append(".inputStream()");
                    return sb.toString();
                }
            }, s);
        }
        catch (final Resources$NotFoundException ex2) {
            return new i0<h>((Throwable)ex2);
        }
    }
    
    public static i0<h> h(final ZipInputStream zipInputStream, final String s) {
        try {
            return i(zipInputStream, s);
        }
        finally {
            g.b((Closeable)zipInputStream);
        }
    }
    
    public static i0<h> i(final ZipInputStream zipInputStream, final String s) {
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
                    final b0 b = u.b((g0)u.g(zipInputStream));
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
                return new i0<h>(new IllegalArgumentException("Unable to parse composition"));
            }
        Label_0234:
            for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
                final String s2 = entry.getKey();
                while (true) {
                    for (final e0 e0 : h.d.values()) {
                        if (e0.c.equals(s2)) {
                            if (e0 != null) {
                                e0.d = g.e(e0.a, e0.b, (Bitmap)entry.getValue());
                                continue Label_0234;
                            }
                            continue Label_0234;
                        }
                    }
                    e0 e0 = null;
                    continue;
                }
            }
            for (final Map.Entry<K, e0> entry2 : h.d.entrySet()) {
                if (entry2.getValue().d == null) {
                    final StringBuilder t = a.t("There is no image for ");
                    t.append(entry2.getValue().c);
                    return new i0<h>(new IllegalStateException(t.toString()));
                }
            }
            if (s != null) {
                f.b.a.put((Object)s, (Object)h);
            }
            return new i0<h>(h);
        }
        catch (final IOException ex) {
            return new i0<h>(ex);
        }
    }
    
    public static String j(final int n, final Context context) {
        final StringBuilder t = a.t("rawRes");
        String s;
        if ((context.getResources().getConfiguration().uiMode & 0x30) == 0x20) {
            s = "_night_";
        }
        else {
            s = "_day_";
        }
        t.append(s);
        t.append(n);
        return t.toString();
    }
}
