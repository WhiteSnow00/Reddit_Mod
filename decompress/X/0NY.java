// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.List;
import com.bytedance.covode.number.Covode;
import android.content.Context;

public class 0NY
{
    public static Context LIZIZ;
    public static b LIZJ;
    public static b LIZLLL;
    
    static {
        Covode.recordClassIndex(3031);
        0NY.LIZLLL = (b)new a();
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(3033);
        }
        
        boolean LIZ(final List<String> p0);
    }
    
    public static final class a implements b
    {
        static {
            Covode.recordClassIndex(3032);
        }
        
        @Override
        public final boolean LIZ(final List<String> list) {
            System.currentTimeMillis();
            for (final String s : list) {
                System.currentTimeMillis();
                if (!0NZ.LIZ(s, 0NY.LIZIZ)) {
                    return false;
                }
                System.currentTimeMillis();
            }
            return true;
        }
    }
}
