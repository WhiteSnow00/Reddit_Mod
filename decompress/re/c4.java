// 
// Decompiled by Procyon v0.6.0
// 

package re;

import android.content.res.Resources$NotFoundException;
import android.content.Context;

public final class c4
{
    public static String a(Context context) {
        try {
            context = (Context)context.getResources().getResourcePackageName(2131952614);
        }
        catch (final Resources$NotFoundException ex) {
            context = (Context)context.getPackageName();
        }
        return (String)context;
    }
}
