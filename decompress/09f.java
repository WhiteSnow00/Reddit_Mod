// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.Editable;
import com.bytedance.covode.number.Covode;
import android.text.Editable$Factory;

public final class 09f extends Editable$Factory
{
    public static final Object LIZ;
    public static volatile Editable$Factory LIZIZ;
    public static Class<?> LIZJ;
    
    static {
        Covode.recordClassIndex(1009);
        LIZ = new Object();
    }
    
    public 09f() {
        try {
            09f.LIZJ = this.getClass().getClassLoader().loadClass("android.text.DynamicLayout$ChangeWatcher");
        }
        finally {}
    }
    
    public static Editable$Factory LIZ() {
        if (09f.LIZIZ == null) {
            synchronized (09f.LIZ) {
                if (09f.LIZIZ == null) {
                    09f.LIZIZ = new 09f();
                }
            }
        }
        return 09f.LIZIZ;
    }
    
    public final Editable newEditable(final CharSequence charSequence) {
        final Class<?> lizj = 09f.LIZJ;
        if (lizj != null) {
            return (Editable)new 09o(lizj, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
