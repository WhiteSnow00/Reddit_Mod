// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.util.Log;

public final class v4 extends a5
{
    public v4(final x4 x4, final Double n) {
        super(x4, "measurement.test.double_flag", n);
    }
    
    @Override
    public final Object a(String value) {
        try {
            value = (String)Double.valueOf(Double.parseDouble(value));
        }
        catch (final NumberFormatException ex) {
            super.a.getClass();
            final String b = super.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid double value for ");
            sb.append(b);
            sb.append(": ");
            sb.append(value);
            Log.e("PhenotypeFlag", sb.toString());
            value = null;
        }
        return value;
    }
}
