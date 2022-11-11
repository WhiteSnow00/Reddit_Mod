// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import java.util.HashMap;
import lw0.b;
import java.util.List;
import java.util.Map;
import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;
import ib.d;
import jb.h;
import jb.e;
import kb.c;
import mb.w;
import mb.c0;
import gb.a;
import java.util.ArrayList;

public final class f implements l
{
    public static final int[] f;
    public static final a g;
    
    static {
        f = new int[] { 5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14 };
        g = new a();
    }
    
    public static void c(final int n, final ArrayList list) {
        switch (n) {
            default: {
                goto Label_0490;
            }
            case 14: {
                list.add(new gb.a());
                goto Label_0490;
            }
            case 12: {
                list.add(new nb.a());
                goto Label_0490;
            }
            case 11: {
                list.add(new c0());
                goto Label_0490;
            }
            case 10: {
                list.add(new w());
                goto Label_0490;
            }
            case 9: {
                list.add(new c());
                goto Label_0490;
            }
            case 8: {
                list.add(new e(0));
                list.add(new h(0));
                goto Label_0490;
            }
            case 7: {
                list.add(new d(0));
                goto Label_0490;
            }
            case 6: {
                list.add(new hb.d(0));
                goto Label_0490;
            }
            case 5: {
                list.add(new fb.a());
                goto Label_0490;
            }
            case 4: {
                final a g = cb.f.g;
                final AtomicBoolean a = g.a;
                monitorenter(a);
                try {
                    if (g.a.get()) {
                        final Constructor<? extends cb.h> b = g.b;
                        monitorexit(a);
                        goto Label_0358;
                    }
                    try {
                        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", (Class<?>[])new Class[0]).invoke(null, new Object[0]))) {
                            g.b = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(cb.h.class).getConstructor(Integer.TYPE);
                            goto Label_0343;
                        }
                        goto Label_0343;
                    }
                    catch (final Exception ex) {
                        throw new RuntimeException("Error instantiating FLAC extension", ex);
                    }
                    catch (final ClassNotFoundException ex2) {
                        goto Label_0343;
                    }
                    try {
                        final Constructor<? extends cb.h> b;
                        final cb.h h = (cb.h)b.newInstance(0);
                        if (h != null) {
                            list.add(h);
                            goto Label_0490;
                        }
                        list.add(new eb.c());
                        goto Label_0490;
                    }
                    catch (final Exception ex3) {}
                }
                finally {}
                break;
            }
            case 3: {
                goto Label_0432;
                goto Label_0432;
            }
            case 2: {
                goto Label_0447;
                goto Label_0447;
            }
            case 1: {
                goto Label_0463;
                goto Label_0463;
            }
            case 0: {
                goto Label_0478;
                goto Label_0478;
            }
        }
    }
    
    @Override
    public final cb.h[] a(final Uri uri, final Map<String, List<String>> map) {
        synchronized (this) {
            final ArrayList list = new ArrayList(14);
            final int c1 = b.c1((Map)map);
            if (c1 != -1) {
                c(c1, list);
            }
            final int d1 = b.d1(uri);
            if (d1 != -1 && d1 != c1) {
                c(d1, list);
            }
            final int[] f = cb.f.f;
            for (int i = 0; i < 14; ++i) {
                final int n = f[i];
                if (n != c1 && n != d1) {
                    c(n, list);
                }
            }
            return list.toArray(new cb.h[list.size()]);
        }
    }
    
    @Override
    public final cb.h[] b() {
        synchronized (this) {
            return this.a(Uri.EMPTY, new HashMap<String, List<String>>());
        }
    }
    
    public static final class a
    {
        public final AtomicBoolean a;
        public Constructor<? extends cb.h> b;
        
        public a() {
            this.a = new AtomicBoolean(false);
        }
    }
}
