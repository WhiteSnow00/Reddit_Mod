// 
// Decompiled by Procyon v0.6.0
// 

package lc;

import java.util.List;
import ng.e;
import java.lang.reflect.Method;
import com.google.android.play.core.internal.zzbx;
import ig.h0;
import java.io.File;
import android.content.res.TypedArray;
import aj2.c;
import android.util.AttributeSet;
import android.view.View;
import pg.j;
import ig.u;

public final class a implements u, j
{
    public int f;
    
    public boolean e(Object class1, final File file, final File file2) {
        switch (this.f) {
            default: {
                return true;
            }
            case 2: {
                class1 = class1.getClass();
                final Method h = h0.h((Class)class1, "optimizedPathFor", new Class[] { File.class, File.class });
                try {
                    return new File(String.class.cast(h.invoke(null, file, file2))).exists();
                }
                catch (final Exception ex) {
                    throw new zzbx(String.format("Failed to invoke static method %s on type %s", "optimizedPathFor", class1), (Throwable)ex);
                }
                break;
            }
        }
    }
    
    public e h(final ng.c c) {
        final int f = this.f;
        final int p = pg.a.p;
        if (c == null) {
            return null;
        }
        return ng.c.b(c.g(), 6, f, c.a(), c.i(), (List)c.e(), (List)c.d());
    }
}
