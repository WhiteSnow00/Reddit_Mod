// 
// Decompiled by Procyon v0.6.0
// 

package ze;

import android.animation.TypeEvaluator;

public final class b implements TypeEvaluator<Integer>
{
    public static final b a;
    
    static {
        a = new b();
    }
    
    public final Object evaluate(float c, final Object o, final Object o2) {
        final Integer n = (Integer)o;
        final Integer n2 = (Integer)o2;
        final int intValue = n;
        final float n3 = (intValue >> 24 & 0xFF) / 255.0f;
        final float n4 = (intValue >> 16 & 0xFF) / 255.0f;
        final float n5 = (intValue >> 8 & 0xFF) / 255.0f;
        final float n6 = (intValue & 0xFF) / 255.0f;
        final int intValue2 = n2;
        final float n7 = (intValue2 >> 24 & 0xFF) / 255.0f;
        final float n8 = (intValue2 >> 16 & 0xFF) / 255.0f;
        final float n9 = (intValue2 >> 8 & 0xFF) / 255.0f;
        final float n10 = (intValue2 & 0xFF) / 255.0f;
        final float n11 = (float)Math.pow(n4, 2.2);
        final float n12 = (float)Math.pow(n5, 2.2);
        final float n13 = (float)Math.pow(n6, 2.2);
        final float n14 = (float)Math.pow(n8, 2.2);
        final float n15 = (float)Math.pow(n9, 2.2);
        final float n16 = (float)Math.pow(n10, 2.2);
        final float c2 = d.c(n7, n3, c, n3);
        final float c3 = d.c(n14, n11, c, n11);
        final float c4 = d.c(n15, n12, c, n12);
        c = d.c(n16, n13, c, n13);
        final float n17 = (float)Math.pow(c3, 0.45454545454545453);
        final float n18 = (float)Math.pow(c4, 0.45454545454545453);
        c = (float)Math.pow(c, 0.45454545454545453);
        return Math.round(c * 255.0f) | (Math.round(n17 * 255.0f) << 16 | Math.round(c2 * 255.0f) << 24 | Math.round(n18 * 255.0f) << 8);
    }
}
