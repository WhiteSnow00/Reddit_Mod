// 
// Decompiled by Procyon v0.6.0
// 

package ae0;

import java.util.Currency;
import ah2.f;
import javax.inject.Inject;
import java.text.NumberFormat;

public final class b implements a
{
    public final ThreadLocal<NumberFormat> a;
    
    @Inject
    public b(final ThreadLocal<NumberFormat> a) {
        this.a = a;
    }
    
    public final String a(final int n) throws NumberFormatException {
        return this.b(n / (float)100);
    }
    
    public final String b(final Float n) {
        f.f((Object)n, "amount");
        final NumberFormat numberFormat = this.a.get();
        String format;
        if (numberFormat != null) {
            numberFormat.setCurrency(Currency.getInstance("USD"));
            format = numberFormat.format(n);
        }
        else {
            format = null;
        }
        if (format != null) {
            return format;
        }
        throw new IllegalStateException("No number formatter available.".toString());
    }
}
