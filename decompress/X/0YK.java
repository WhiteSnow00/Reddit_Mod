// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import java.util.Map;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.covode.number.Covode;

public interface 0yk
{
    default static {
        Covode.recordClassIndex(10432);
    }
    
    a LIZ(final a p0);
    
    String LIZ(final Request p0);
    
    void LIZ(final Map<String, String> p0);
    
    void LIZ(final Map<String, String> p0, final String p1);
    
    public static final class a
    {
        public String LIZ;
        public List<0Vs> LIZIZ;
        
        static {
            Covode.recordClassIndex(10433);
        }
        
        public a(final String liz, final List<0Vs> liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
    }
}
