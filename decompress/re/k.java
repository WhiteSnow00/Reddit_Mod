// 
// Decompiled by Procyon v0.6.0
// 

package re;

import ve.x;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import ve.g;
import ve.j;
import od.p;
import java.util.Collections;
import java.util.ArrayList;
import x4.a$a;
import android.content.Context;
import je.b;
import java.util.List;
import x4.a;

public final class k extends a<List<b>>
{
    public List<b> k;
    public final c l;
    
    public k(final Context context, final c l) {
        super(context.getApplicationContext());
        this.l = l;
    }
    
    public final void b(final Object o) {
        super.b(this.k = (List)o);
    }
    
    public final void c() {
        final List<b> k = this.k;
        if (k != null) {
            super.b(this.k = k);
            return;
        }
        ((x4.b)this).a();
        super.i = new a$a((a)this);
        this.e();
    }
    
    public final void d() {
        ((x4.b)this).a();
    }
    
    public final Object f() {
        final String[] split = lq0.k.V0(-1, 0L, ((x4.b)this).c.getApplicationContext(), "third_party_license_metadata").split("\n");
        final ArrayList list = new ArrayList<Comparable>(split.length);
        Object concat = null;
        for (final String s : split) {
            final int index = s.indexOf(32);
            final String[] split2 = s.substring(0, index).split(":");
            final boolean b = split2.length == 2 && index > 0;
            if (s.length() != 0) {
                concat = "Invalid license meta-data line:\n".concat(s);
            }
            else {
                concat = new String("Invalid license meta-data line:\n");
            }
            if (!b) {
                throw new IllegalStateException(String.valueOf(concat));
            }
            list.add(new b(Integer.parseInt(split2[1]), s.substring(index + 1), Long.parseLong(split2[0])));
        }
        Collections.sort((List<Comparable>)list);
        final x b2 = this.l.a.b(0, new i(list));
        try {
            j.a((g)b2);
            concat = list;
            if (b2.n()) {
                concat = b2.j();
                return concat;
            }
            return concat;
        }
        catch (final InterruptedException concat) {}
        catch (final ExecutionException ex) {}
        final String value = String.valueOf(((Throwable)concat).getMessage());
        String concat2;
        if (value.length() != 0) {
            concat2 = "Error getting license list from service: ".concat(value);
        }
        else {
            concat2 = new String("Error getting license list from service: ");
        }
        Log.w("OssLicensesLoader", concat2);
        concat = list;
        return concat;
    }
}
