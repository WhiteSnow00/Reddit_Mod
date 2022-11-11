// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0GF
{
    static {
        Covode.recordClassIndex(1714);
    }
    
    public static String LIZ(final String s) {
        final StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb.append(s);
        sb.append("')");
        return sb.toString();
    }
}
