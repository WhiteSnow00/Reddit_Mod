// 
// Decompiled by Procyon v0.6.0
// 

package ca0;

import android.content.res.Resources;
import javax.inject.Inject;
import sg2.e;
import ee0.c;
import android.content.Context;

public final class a
{
    public final Context a;
    public final c b;
    
    @Inject
    public a(final Context a, final c b) {
        e.f((Object)a, "context");
        e.f((Object)b, "themeSettings");
        this.a = a;
        this.b = b;
    }
    
    public final int a(final int n) {
        final Resources resources = this.a.getResources();
        int n2;
        if (this.b.i3(true).isNightModeTheme()) {
            n2 = 2130903079;
        }
        else {
            n2 = 2130903049;
        }
        final int[] intArray = resources.getIntArray(n2);
        e.e((Object)intArray, "context.resources.getInt\u2026sel_colors\n      },\n    )");
        return intArray[n % intArray.length];
    }
}
