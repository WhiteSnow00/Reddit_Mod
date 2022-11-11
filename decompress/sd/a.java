// 
// Decompiled by Procyon v0.6.0
// 

package sd;

import java.util.Locale;
import android.util.Log;
import pd.i;

public final class a
{
    public final String a;
    public final String b;
    public final int c;
    
    public a(final String a, final String... array) {
        final int length = array.length;
        String string;
        if (length == 0) {
            string = "";
        }
        else {
            final StringBuilder p2 = d.p('[');
            for (final String s : array) {
                if (p2.length() > 1) {
                    p2.append(",");
                }
                p2.append(s);
            }
            p2.append("] ");
            string = p2.toString();
        }
        this.b = string;
        this.a = a;
        new i(a, (String)null, 0);
        int c;
        for (c = 2; c <= 7 && !Log.isLoggable(this.a, c); ++c) {}
        this.c = c;
    }
    
    public final void a(final String s, final Object... array) {
        if (this.c <= 3) {
            Log.d(this.a, this.d(s, array));
        }
    }
    
    public final void b(final Exception ex, final String s, final Object... array) {
        Log.e(this.a, this.d(s, array), (Throwable)ex);
    }
    
    public final void c(final String s, final Object... array) {
        Log.e(this.a, this.d(s, array));
    }
    
    public final String d(final String s, final Object... array) {
        String format = s;
        if (array.length > 0) {
            format = String.format(Locale.US, s, array);
        }
        return this.b.concat(format);
    }
    
    public final void e(final String s, final Object... array) {
        if (this.c <= 2) {
            Log.v(this.a, this.d(s, array));
        }
    }
}
