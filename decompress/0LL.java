// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 0Ll
{
    public final String LIZ = jsonObject.optString("productId");
    public final String LIZIZ = jsonObject.optString("productType");
    
    static {
        Covode.recordClassIndex(2484);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof 0Ll)) {
            return false;
        }
        final 0Ll 0Ll = (0Ll)o;
        return this.LIZ.equals(0Ll.LIZ) && this.LIZIZ.equals(0Ll.LIZIZ);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.LIZ, this.LIZIZ });
    }
    
    @Override
    public final String toString() {
        return 0II.LIZ("{id: %s, type: %s}", new Object[] { this.LIZ, this.LIZIZ });
    }
}
