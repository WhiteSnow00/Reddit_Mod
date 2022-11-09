// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.os.RemoteException;
import android.util.Log;
import zd.b;
import rd.n1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import yd.a;
import rd.m1;

public abstract class r extends m1
{
    public final int b;
    
    public r(final byte[] array) {
        yd.a.K0(array.length == 25);
        this.b = Arrays.hashCode(array);
    }
    
    public static byte[] m(final String s) {
        try {
            return s.getBytes("ISO-8859-1");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public abstract byte[] J();
    
    public final boolean equals(final Object o) {
        if (o != null) {
            if (o instanceof n1) {
                try {
                    final n1 n1 = (n1)o;
                    if (n1.s() != this.b) {
                        return false;
                    }
                    final zd.a u = n1.u();
                    return u != null && Arrays.equals(this.J(), (byte[])zd.b.J(u));
                }
                catch (final RemoteException ex) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex);
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return this.b;
    }
    
    public final int s() {
        return this.b;
    }
    
    public final zd.a u() {
        return new b<Object>(this.J());
    }
}
