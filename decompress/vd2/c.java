// 
// Decompiled by Procyon v0.6.0
// 

package vd2;

import sg2.e;
import android.util.Log;

public final class c implements i
{
    public boolean a;
    public String b;
    
    public c(final int n) {
        this.a = false;
        this.b = "fetch2";
    }
    
    public final void a(final Exception ex) {
        if (this.a) {
            String b;
            if (this.b.length() > 23) {
                b = "fetch2";
            }
            else {
                b = this.b;
            }
            Log.d(b, "PriorityIterator failed access database", (Throwable)ex);
        }
    }
    
    public final void b(final String s, final Exception ex) {
        e.g((Object)s, "message");
        if (this.a) {
            String b;
            if (this.b.length() > 23) {
                b = "fetch2";
            }
            else {
                b = this.b;
            }
            Log.e(b, s, (Throwable)ex);
        }
    }
    
    public final void d(final String s) {
        e.g((Object)s, "message");
        if (this.a) {
            String b;
            if (this.b.length() > 23) {
                b = "fetch2";
            }
            else {
                b = this.b;
            }
            Log.d(b, s);
        }
    }
}
