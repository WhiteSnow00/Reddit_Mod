// 
// Decompiled by Procyon v0.6.0
// 

package h3;

import java.util.Iterator;
import java.util.HashSet;

public class d
{
    public HashSet<d> a;
    public int b;
    
    public d() {
        this.a = new HashSet<d>(2);
        this.b = 0;
    }
    
    public final void a(final d d) {
        this.a.add(d);
    }
    
    public final void b() {
        this.b = 1;
        final Iterator<d> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().e();
        }
    }
    
    public final void c() {
        this.b = 0;
        final Iterator<d> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().c();
        }
    }
    
    public final boolean d() {
        final int b = this.b;
        boolean b2 = true;
        if (b != 1) {
            b2 = false;
        }
        return b2;
    }
    
    public void e() {
    }
}
