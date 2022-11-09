// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.HashMap;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 0c5
{
    static {
        Covode.recordClassIndex(5692);
    }
    
    public static Object LIZ(final View view, final String s) {
        if (view != null) {
            final Object tag = view.getTag();
            if (tag instanceof a) {
                final Object value = ((HashMap<K, Object>)tag).get(s);
                if (value != null) {
                    return value;
                }
            }
        }
        return null;
    }
    
    public static void LIZ(final View view, final Object o) {
        LIZ(view, "DraweeHolder", o);
    }
    
    public static boolean LIZ(final View view, final String s, final Object o) {
        if (view == null) {
            return false;
        }
        final Object tag = view.getTag();
        if (tag instanceof a) {
            ((a)tag).put(s, o);
            return true;
        }
        view.setTag((Object)new a(s, o, (byte)0));
        return true;
    }
    
    public static final class a extends HashMap<String, Object>
    {
        static {
            Covode.recordClassIndex(5693);
        }
        
        public a(final String s, final Object o) {
            this.put(s, o);
        }
    }
}
