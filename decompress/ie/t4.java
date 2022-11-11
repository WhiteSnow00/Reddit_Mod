// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.util.Log;

public final class t4 extends a5
{
    public t4(final x4 x4, final String s, final Long n) {
        super(x4, s, n);
    }
    
    @Override
    public final Object a(String value) {
        try {
            value = (String)Long.valueOf(Long.parseLong(value));
        }
        catch (final NumberFormatException ex) {
            super.a.getClass();
            final String b = super.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid long value for ");
            sb.append(b);
            sb.append(": ");
            sb.append(value);
            Log.e("PhenotypeFlag", sb.toString());
            value = null;
        }
        return value;
    }
}
