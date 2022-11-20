// 
// Decompiled by Procyon v0.6.0
// 

package se;

import we.v;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import we.g;
import we.j;
import pd.p;
import java.util.Collections;
import java.util.ArrayList;
import dg.l0;
import android.content.Context;
import ke.b;
import java.util.List;
import w4.a;

public final class k extends a<List<ke.b>>
{
    public List<ke.b> k;
    public final c l;
    
    public k(final Context context, final c l) {
        super(context.getApplicationContext());
        this.l = l;
    }
    
    @Override
    public final void b(final Object o) {
        super.b(this.k = (List)o);
    }
    
    @Override
    public final void c() {
        final List<ke.b> k = this.k;
        if (k != null) {
            super.b(this.k = k);
            return;
        }
        this.a();
        super.i = new a();
        this.e();
    }
    
    @Override
    public final void d() {
        this.a();
    }
    
    @Override
    public final Object f() {
        final String[] split = l0.u1(-1, 0L, super.c.getApplicationContext(), "third_party_license_metadata").split("\n");
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
            list.add((Comparable)new ke.b(Integer.parseInt(split2[1]), s.substring(index + 1), Long.parseLong(split2[0])));
        }
        Collections.sort((List<Comparable>)list);
        final v b2 = this.l.a.b(0, (p)new i(list));
        try {
            we.j.a((g)b2);
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
