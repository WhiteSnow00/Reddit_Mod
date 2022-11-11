// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.util.Log;

public final class u4 extends a5
{
    public u4(final x4 x4, final String s, final Boolean b) {
        super(x4, s, b);
    }
    
    @Override
    public final Object a(final String s) {
        Boolean b;
        if (g4.b.matcher(s).matches()) {
            b = Boolean.TRUE;
        }
        else if (g4.c.matcher(s).matches()) {
            b = Boolean.FALSE;
        }
        else {
            super.a.getClass();
            final String b2 = super.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid boolean value for ");
            sb.append(b2);
            sb.append(": ");
            sb.append(s);
            Log.e("PhenotypeFlag", sb.toString());
            b = null;
        }
        return b;
    }
}
