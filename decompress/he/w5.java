// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.io.IOException;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import android.content.SharedPreferences;
import d9.b;
import android.preference.PreferenceManager;
import android.content.Context;

public final class w5 implements jc
{
    public final Object f;
    public final Object g;
    
    public w5(Context applicationContext, final String s) {
        this.g = "GenericIdpKeyset";
        applicationContext = applicationContext.getApplicationContext();
        if (s == null) {
            this.f = PreferenceManager.getDefaultSharedPreferences(applicationContext);
            return;
        }
        this.f = applicationContext.getSharedPreferences(s, 0);
    }
    
    public w5(final b g, final jc f) {
        this.g = g;
        this.f = f;
    }
    
    public final void a(final String s) {
        ((jc)this.f).a(s);
    }
    
    public final byte[] b() throws IOException {
        try {
            final String string = ((SharedPreferences)this.f).getString((String)this.g, (String)null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.g));
            }
            if (string.length() % 2 == 0) {
                final int n = string.length() / 2;
                final byte[] array = new byte[n];
                for (int i = 0; i < n; ++i) {
                    final int n2 = i + i;
                    final int digit = Character.digit(string.charAt(n2), 16);
                    final int digit2 = Character.digit(string.charAt(n2 + 1), 16);
                    if (digit == -1 || digit2 == -1) {
                        throw new IllegalArgumentException("input is not hexadecimal");
                    }
                    array[i] = (byte)(digit * 16 + digit2);
                }
                return array;
            }
            throw new IllegalArgumentException("Expected a string of even length");
        }
        catch (final ClassCastException | IllegalArgumentException ex) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.g));
        }
    }
    
    public final /* bridge */ void c(final cc cc) {
        final qd qd = (qd)cc;
        final b b = (b)this.g;
        q5.h((q5)b.h, qd, (r5)b.g, (jc)this);
    }
}
