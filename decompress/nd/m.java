// 
// Decompiled by Procyon v0.6.0
// 

package nd;

import java.security.NoSuchAlgorithmException;
import mg.d0;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

public final class m implements Callable
{
    public final boolean f;
    public final String g;
    public final r h;
    
    public m(final boolean f, final String g, final r h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object call() {
        final boolean f = this.f;
        final String g = this.g;
        Object o = this.h;
        int n = 0;
        String s;
        if (f || !v.a(g, (r)o, true, false).a) {
            s = "not allowed";
        }
        else {
            s = "debug cert rejected";
        }
        int i = 0;
    Label_0086_Outer:
        while (true) {
            Label_0092: {
                if (i >= 2) {
                    break Label_0092;
                }
                while (true) {
                    try {
                        MessageDigest instance;
                        if ((instance = MessageDigest.getInstance("SHA-1")) == null) {
                            ++i;
                            continue Label_0086_Outer;
                        }
                        while (true) {
                            d0.y((Object)instance);
                            o = instance.digest(((r)o).N());
                            i = ((r)o).length;
                            final char[] array = new char[i + i];
                            int n2 = 0;
                            for (i = n; i < ((r)o).length; ++i) {
                                final int n3 = o[i] & 0xFF;
                                n = n2 + 1;
                                final char[] u = oi2.d0.u;
                                array[n2] = u[n3 >>> 4];
                                n2 = n + 1;
                                array[n] = u[n3 & 0xF];
                            }
                            return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", s, g, new String(array), f, "12451000.false");
                            instance = null;
                            continue;
                        }
                    }
                    catch (final NoSuchAlgorithmException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
}
