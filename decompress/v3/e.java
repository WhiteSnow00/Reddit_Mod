// 
// Decompiled by Procyon v0.6.0
// 

package v3;

import android.os.LocaleList;
import android.content.res.Configuration;

public final class e
{
    public static h a(final Configuration configuration) {
        return h.e(a.a(configuration));
    }
    
    public static final class a
    {
        public static LocaleList a(final Configuration configuration) {
            return configuration.getLocales();
        }
    }
}
