// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import android.accounts.AccountManager;

public final class n extends v4
{
    public long h;
    public String i;
    public AccountManager j;
    public Boolean k;
    public long l;
    
    public n(final h4 h4) {
        super(h4);
    }
    
    @Override
    public final boolean N() {
        final Calendar instance = Calendar.getInstance();
        this.h = TimeUnit.MINUTES.convert(instance.get(16) + instance.get(15), TimeUnit.MILLISECONDS);
        final Locale default1 = Locale.getDefault();
        final String language = default1.getLanguage();
        final Locale english = Locale.ENGLISH;
        this.i = a.k(language.toLowerCase(english), "-", default1.getCountry().toLowerCase(english));
        return false;
    }
    
    public final long Q() {
        this.M();
        return this.l;
    }
    
    public final long R() {
        this.O();
        return this.h;
    }
    
    public final String S() {
        this.O();
        return this.i;
    }
}
