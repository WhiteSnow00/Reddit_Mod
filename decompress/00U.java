// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 00u
{
    static {
        Covode.recordClassIndex(83);
    }
    
    public static String LIZ(final String s) {
        try {
            final Class<?> forName = Class.forName("android.os.SystemProperties");
            return (String)forName.getMethod("get", String.class).invoke(forName, s);
        }
        catch (final Exception ex) {
            00s.LIZ(6);
            return null;
        }
    }
    
    public enum a
    {
        CHRY, 
        MZ, 
        OP, 
        SS, 
        UNKNOWN, 
        VO, 
        XM;
        
        static {
            Covode.recordClassIndex(84);
        }
    }
}
