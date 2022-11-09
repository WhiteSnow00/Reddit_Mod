// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import a40.f;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import android.accounts.AccountManager;

public final class n extends t4
{
    public long h;
    public String i;
    public AccountManager j;
    public Boolean k;
    public long l;
    
    public n(final h4 h4) {
        super(h4);
    }
    
    public final long C() {
        ((w)this).y();
        return this.l;
    }
    
    public final long D() {
        this.A();
        return this.h;
    }
    
    public final String E() {
        this.A();
        return this.i;
    }
    
    public final boolean z() {
        final Calendar instance = Calendar.getInstance();
        this.h = TimeUnit.MINUTES.convert(instance.get(16) + instance.get(15), TimeUnit.MILLISECONDS);
        final Locale default1 = Locale.getDefault();
        final String language = default1.getLanguage();
        final Locale english = Locale.ENGLISH;
        this.i = f.n(language.toLowerCase(english), "-", default1.getCountry().toLowerCase(english));
        return false;
    }
}
