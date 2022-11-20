// 
// Decompiled by Procyon v0.6.0
// 

package db;

import java.util.HashMap;
import dg.l0;
import java.util.List;
import java.util.Map;
import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;
import fb.b;
import jb.d;
import kb.h;
import kb.e;
import lb.c;
import nb.w;
import nb.c0;
import hb.a;
import java.util.ArrayList;

public final class f implements l
{
    public static final int[] f;
    public static final f.f$a g;
    
    static {
        f = new int[] { 5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14 };
        g = new f.f$a();
    }
    
    public static void a(final int n, final ArrayList list) {
        switch (n) {
            default: {
                goto Label_0500;
            }
            case 14: {
                list.add(new a());
                goto Label_0500;
            }
            case 12: {
                list.add(new ob.a());
                goto Label_0500;
            }
            case 11: {
                list.add(new c0());
                goto Label_0500;
            }
            case 10: {
                list.add(new w());
                goto Label_0500;
            }
            case 9: {
                list.add(new c());
                goto Label_0500;
            }
            case 8: {
                list.add(new e(0));
                list.add(new h(0));
                goto Label_0500;
            }
            case 7: {
                list.add(new d(0));
                goto Label_0500;
            }
            case 6: {
                list.add(new ib.d(0));
                goto Label_0500;
            }
            case 5: {
                list.add(new gb.a());
                goto Label_0500;
            }
            case 4: {
                final f.f$a g = db.f.g;
                final AtomicBoolean a = g.a;
                monitorenter(a);
                try {
                    if (g.a.get()) {
                        final Constructor b = g.b;
                        monitorexit(a);
                        goto Label_0367;
                    }
                    try {
                        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", (Class<?>[])new Class[0]).invoke(null, new Object[0]))) {
                            g.b = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(db.h.class).getConstructor(Integer.TYPE);
                            goto Label_0349;
                        }
                        goto Label_0349;
                    }
                    catch (final Exception ex) {
                        throw new RuntimeException("Error instantiating FLAC extension", ex);
                    }
                    catch (final ClassNotFoundException ex2) {
                        goto Label_0349;
                    }
                    try {
                        final Constructor b;
                        final db.h h = b.newInstance(0);
                        if (h != null) {
                            list.add(h);
                            goto Label_0500;
                        }
                        list.add(new b());
                        goto Label_0500;
                    }
                    catch (final Exception ex3) {}
                }
                finally {}
                break;
            }
            case 3: {
                goto Label_0442;
                goto Label_0442;
            }
            case 2: {
                goto Label_0457;
                goto Label_0457;
            }
            case 1: {
                goto Label_0473;
                goto Label_0473;
            }
            case 0: {
                goto Label_0488;
                goto Label_0488;
            }
        }
    }
    
    public final db.h[] b(final Uri uri, final Map<String, List<String>> map) {
        synchronized (this) {
            final ArrayList list = new ArrayList(14);
            final int c0 = l0.C0((Map)map);
            if (c0 != -1) {
                a(c0, list);
            }
            final int d0 = l0.D0(uri);
            if (d0 != -1 && d0 != c0) {
                a(d0, list);
            }
            final int[] f = db.f.f;
            for (int i = 0; i < 14; ++i) {
                final int n = f[i];
                if (n != c0 && n != d0) {
                    a(n, list);
                }
            }
            return list.toArray(new db.h[list.size()]);
        }
    }
    
    public final db.h[] c() {
        synchronized (this) {
            return this.b(Uri.EMPTY, new HashMap<String, List<String>>());
        }
    }
}
