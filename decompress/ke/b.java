// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

public final class b
{
    public a a;
    public a b;
    public final ArrayList c;
    
    public b() {
        this.a = new a(0L, "", null);
        this.b = new a(0L, "", null);
        this.c = new ArrayList();
    }
    
    public b(final a a) {
        this.a = a;
        this.b = a.a();
        this.c = new ArrayList();
    }
}
