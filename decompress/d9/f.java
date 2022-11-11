// 
// Decompiled by Procyon v0.6.0
// 

package d9;

import java.lang.reflect.Method;
import com.google.android.play.core.internal.zzbx;
import gg.h0;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import android.content.res.TypedArray;
import ej2.c0;
import android.util.AttributeSet;
import android.view.View;
import gg.u;

public final class f implements n, u
{
    public int f = 1;
    
    @Override
    public Set a() {
        return Collections.emptySet();
    }
    
    public void b(final Object o) {
        final int f = this.f;
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        this.f = f * 31 + hashCode;
    }
    
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
}
