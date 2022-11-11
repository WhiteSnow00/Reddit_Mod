// 
// Decompiled by Procyon v0.6.0
// 

package gc2;

import java.util.Collections;
import java.util.List;

public final class a implements Cloneable
{
    public static final a h;
    public List<Object> f;
    public List<Object> g;
    
    static {
        h = new a();
    }
    
    public a() {
        this.f = Collections.emptyList();
        this.g = Collections.emptyList();
    }
    
    public final Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new AssertionError((Object)ex);
        }
    }
}
