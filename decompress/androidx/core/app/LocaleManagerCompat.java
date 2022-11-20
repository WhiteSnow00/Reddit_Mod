// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.app.LocaleManager;
import android.os.LocaleList;
import v3.a;
import android.content.Context;
import v3.h;
import android.content.res.Configuration;

public final class LocaleManagerCompat
{
    private LocaleManagerCompat() {
    }
    
    public static h getConfigurationLocales(final Configuration configuration) {
        return a.a(configuration);
    }
    
    private static Object getLocaleManagerForApplication(final Context context) {
        return context.getSystemService("locale");
    }
    
    public static h getSystemLocales(final Context context) {
        final h b = h.b;
        h h;
        if (v3.a.b()) {
            final Object localeManagerForApplication = getLocaleManagerForApplication(context);
            h = b;
            if (localeManagerForApplication != null) {
                h = v3.h.e(LocaleManagerCompat.b.a(localeManagerForApplication));
            }
        }
        else {
            h = getConfigurationLocales(context.getApplicationContext().getResources().getConfiguration());
        }
        return h;
    }
    
    public static final class a
    {
        public static h a(final Configuration configuration) {
            return h.a(configuration.getLocales().toLanguageTags());
        }
    }
    
    public static final class b
    {
        public static LocaleList a(final Object o) {
            return ((LocaleManager)o).getSystemLocales();
        }
    }
}
