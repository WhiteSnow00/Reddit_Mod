// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import java.util.List;
import java.util.Map;
import android.net.Uri;

public interface l
{
    default h[] a(final Uri uri, final Map<String, List<String>> map) {
        return this.b();
    }
    
    h[] b();
}
