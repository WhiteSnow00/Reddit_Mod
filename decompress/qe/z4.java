// 
// Decompiled by Procyon v0.6.0
// 

package qe;

import android.os.BaseBundle;
import android.os.Bundle;
import mg.d0;
import je.a1;
import android.content.Context;

public final class z4
{
    public final Context a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public long f;
    public a1 g;
    public boolean h;
    public final Long i;
    public String j;
    
    public z4(Context applicationContext, final a1 g, final Long i) {
        this.h = true;
        d0.y((Object)applicationContext);
        applicationContext = applicationContext.getApplicationContext();
        d0.y((Object)applicationContext);
        this.a = applicationContext;
        this.i = i;
        if (g != null) {
            this.g = g;
            this.b = g.k;
            this.c = g.j;
            this.d = g.i;
            this.h = g.h;
            this.f = g.g;
            this.j = g.m;
            final Bundle l = g.l;
            if (l != null) {
                this.e = ((BaseBundle)l).getBoolean("dataCollectionDefaultEnabled", true);
            }
        }
    }
}
