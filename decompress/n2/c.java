// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import android.os.Build$VERSION;
import android.content.Context;

public final class c
{
    public static final b a(final Context context) {
        int fontWeightAdjustment;
        if (Build$VERSION.SDK_INT >= 31) {
            fontWeightAdjustment = context.getResources().getConfiguration().fontWeightAdjustment;
        }
        else {
            fontWeightAdjustment = 0;
        }
        return new b(fontWeightAdjustment);
    }
}
