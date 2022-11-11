// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 167 implements 0Cl
{
    public final String LIZ;
    public final Object[] LIZIZ;
    
    static {
        Covode.recordClassIndex(1316);
    }
    
    public 167(final String liz) {
        this.LIZ = liz;
        this.LIZIZ = null;
    }
    
    public 167(final String s, final byte b) {
        this(s);
    }
    
    @Override
    public final void LIZ(final 0Ck 0Ck) {
        final Object[] liziz = this.LIZIZ;
        if (liziz != null) {
            final int length = liziz.length;
            int i = 0;
            while (i < length) {
                final Object o = liziz[i];
                ++i;
                if (o == null) {
                    0Ck.LIZ(i);
                }
                else if (o instanceof byte[]) {
                    0Ck.LIZ(i, (byte[])o);
                }
                else if (o instanceof Float) {
                    0Ck.LIZ(i, (float)o);
                }
                else if (o instanceof Double) {
                    0Ck.LIZ(i, (double)o);
                }
                else if (o instanceof Long) {
                    0Ck.LIZ(i, (long)o);
                }
                else if (o instanceof Integer) {
                    0Ck.LIZ(i, (int)o);
                }
                else if (o instanceof Short) {
                    0Ck.LIZ(i, (short)o);
                }
                else if (o instanceof Byte) {
                    0Ck.LIZ(i, (byte)o);
                }
                else if (o instanceof String) {
                    0Ck.LIZ(i, (String)o);
                }
                else {
                    if (!(o instanceof Boolean)) {
                        final StringBuilder sb = new StringBuilder("Cannot bind ");
                        sb.append(o);
                        sb.append(" at index ");
                        sb.append(i);
                        sb.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    long n;
                    if (o) {
                        n = 1L;
                    }
                    else {
                        n = 0L;
                    }
                    0Ck.LIZ(i, n);
                }
            }
        }
    }
    
    @Override
    public final String LIZIZ() {
        return this.LIZ;
    }
}
