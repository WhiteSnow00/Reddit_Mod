// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import android.os.Bundle;
import lw0.b;
import ie.c1;
import android.content.Context;

public final class z4
{
    public final Context a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public long f;
    public c1 g;
    public boolean h;
    public final Long i;
    public String j;
    
    public z4(Context applicationContext, final c1 g, final Long i) {
        this.h = true;
        lw0.b.R((Object)applicationContext);
        applicationContext = applicationContext.getApplicationContext();
        lw0.b.R((Object)applicationContext);
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
