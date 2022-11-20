// 
// Decompiled by Procyon v0.6.0
// 

package zi2;

import cg2.j;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.internal.ThreadContextKt;
import ej2.g;
import gg2.c;
import kotlin.Result;
import cg.d;
import pu2.a;
import androidx.core.content.FileProvider;
import ng2.e;
import android.net.Uri;
import java.io.File;
import android.content.Context;

public final class h
{
    public static final s1 a() {
        return new s1((z0)null);
    }
    
    public static s1 b() {
        return new s1((z0)null);
    }
    
    public static Uri c(final Context context, final String s, final File file) {
        e.f((Object)file, "file");
        Uri uri;
        try {
            uri = FileProvider.b(context, s, file);
            e.e((Object)uri, "{\n      FileProvider.get\u2026t, authority, file)\n    }");
        }
        catch (final IllegalArgumentException ex) {
            a.a.o("Returning Uri.fromFile to avoid Huawei 'external-files-path' bug", new Object[0]);
            uri = Uri.fromFile(file);
            e.e((Object)uri, "{\n      Timber.w(\"Return\u2026 Uri.fromFile(file)\n    }");
        }
        return uri;
    }
    
    public static final Object d(Object o) {
        if (o instanceof w) {
            o = Result.constructor-impl((Object)d.B1(((w)o).a));
        }
        else {
            o = Result.constructor-impl(o);
        }
        return o;
    }
    
    public static final void e(i0 d, c context, final boolean b) {
        final Object i = ((i0)d).i();
        final Throwable d2 = ((i0)d).d(i);
        Object o;
        if (d2 != null) {
            o = d.B1(d2);
        }
        else {
            o = ((i0)d).e(i);
        }
        final Object constructor-impl = Result.constructor-impl(o);
        if (b) {
            final g g = (g)context;
            final c j = g.j;
            final Object l = g.l;
            context = j.getContext();
            final Object c = ThreadContextKt.c(context, l);
            if (c != ThreadContextKt.a) {
                d = CoroutineContextKt.d(j, context, c);
            }
            else {
                d = null;
            }
            try {
                g.j.resumeWith(constructor-impl);
                final j a = cg2.j.a;
                return;
            }
            finally {
                if (d == null || ((x1)d).G0()) {
                    ThreadContextKt.a(context, c);
                }
            }
        }
        ((c)context).resumeWith(constructor-impl);
    }
}
