// 
// Decompiled by Procyon v0.6.0
// 

package rg2;

import ng2.e;
import java.util.Random;

public final class b extends a
{
    public final b$a g;
    
    public b() {
        this.g = new b$a();
    }
    
    public final Random a() {
        final Random value = ((ThreadLocal<Random>)this.g).get();
        e.e((Object)value, "implStorage.get()");
        return value;
    }
}
