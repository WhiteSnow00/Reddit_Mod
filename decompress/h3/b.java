// 
// Decompiled by Procyon v0.6.0
// 

package h3;

import java.nio.ShortBuffer;
import com.bumptech.glide.load.EncodeStrategy;
import java.nio.ByteBuffer;
import android.util.Log;
import r8.l;
import c9.c;
import p8.g;
import ig.u;
import eg.n0;
import java.util.Iterator;
import java.util.Arrays;
import ig.x;
import java.io.IOException;
import com.google.android.play.core.internal.zzbt;
import java.util.ArrayList;
import java.util.Collection;
import ng.b0;
import java.util.List;
import ig.h0;
import v0.j;
import java.io.File;
import ig.w;
import java.util.HashSet;
import ke.y4;
import ig.s;
import ig.v;
import p8.i;
import p8.a;

public final class b implements a, i, v, s, ev2.a
{
    public final /* synthetic */ int f;
    
    public b() {
        this.f = 6;
        final Object f = y4.f;
    }
    
    public static void a(final ClassLoader classLoader, final HashSet set, final w w) {
        if (set.isEmpty()) {
            return;
        }
        final HashSet set2 = new HashSet();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            set2.add(((File)iterator.next()).getParentFile());
        }
        final Object u = j.u(classLoader);
        final d9.b b = new d9.b(u, h0.g(u, "nativeLibraryDirectories"), List.class);
        synchronized (b0.class) {
            final ArrayList list = new ArrayList((Collection<?>)b.e());
            set2.removeAll(list);
            list.addAll(set2);
            b.f(list);
            monitorexit(b0.class);
            final ArrayList list2 = new ArrayList();
            final Object[] l = w.l(u, new ArrayList(set2), list2);
            if (!list2.isEmpty()) {
                final zzbt zzbt = new zzbt("Error in makePathElements");
                for (int size = list2.size(), i = 0; i < size; ++i) {
                    final IOException ex = list2.get(i);
                }
                throw zzbt;
            }
            synchronized (b0.class) {
                new x(u, (Class)Object.class, h0.g(u, "nativeLibraryPathElements")).h((Collection)Arrays.asList(l));
            }
        }
    }
    
    public static boolean c(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        return j.x(classLoader, file, file2, b, (v)new n0(), "zip", (u)new lc.a(2));
    }
    
    @Override
    public final boolean b(final Object o, final File file, final g g) {
        final int f = this.f;
        final boolean b = false;
        final boolean b2 = false;
        switch (f) {
            default: {
                final c c = ((l)o).get();
                boolean b3;
                try {
                    l9.a.b(c.f.a.a.getData().asReadOnlyBuffer(), file);
                    b3 = true;
                }
                catch (final IOException ex) {
                    b3 = b;
                    if (Log.isLoggable("GifEncoder", 5)) {
                        Log.w("GifEncoder", "Failed to encode GIF drawable data", (Throwable)ex);
                        b3 = b;
                    }
                }
                return b3;
            }
            case 2: {
                final ByteBuffer byteBuffer = (ByteBuffer)o;
                boolean b4;
                try {
                    l9.a.b(byteBuffer, file);
                    b4 = true;
                }
                catch (final IOException ex2) {
                    b4 = b2;
                    if (Log.isLoggable("ByteBufferEncoder", 3)) {
                        Log.d("ByteBufferEncoder", "Failed to write data", (Throwable)ex2);
                        b4 = b2;
                    }
                }
                return b4;
            }
        }
    }
    
    public final Object[] d(final Object o, final ArrayList list, final File file, final ArrayList list2) {
        return (Object[])h0.e(o, "makeDexElements", (Class)ArrayList.class, list, (Class)File.class, file, (Class)ArrayList.class, list2);
    }
    
    public final EncodeStrategy e(final g g) {
        return EncodeStrategy.SOURCE;
    }
    
    public final void g(final ClassLoader classLoader, final HashSet set) {
        a(classLoader, set, (w)new gn.a());
    }
    
    public final boolean v(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        return j.x(classLoader, file, file2, b, (v)new n0(), "path", (u)new n0());
    }
    
    public final int x(final int n, final int n2, final int n3) {
        return n * 2;
    }
    
    public final void z(int i, int min, final ShortBuffer shortBuffer, final ShortBuffer shortBuffer2) {
        short value;
        for (min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2), i = 0; i < min; ++i) {
            value = shortBuffer.get();
            shortBuffer2.put(value);
            shortBuffer2.put(value);
        }
    }
}
