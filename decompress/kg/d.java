// 
// Decompiled by Procyon v0.6.0
// 

package kg;

import ae.b;
import android.content.Intent;
import ig.g0;
import android.content.Context;
import ig.c;
import ig.o;
import dg.k;

public final class d
{
    public static final k c;
    public o<c> a;
    public final String b;
    
    static {
        c = new k("ReviewService");
    }
    
    public d(final Context context) {
        this.b = context.getPackageName();
        if (g0.b(context)) {
            this.a = (o<c>)new o(context, d.c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), (ig.k)ae.b.s);
        }
    }
}
