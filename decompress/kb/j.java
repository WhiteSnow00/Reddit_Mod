// 
// Decompiled by Procyon v0.6.0
// 

package kb;

import com.google.common.base.b;
import tg.a$b;
import java.util.ArrayList;
import com.google.common.base.c;

public final class j
{
    public static final c d;
    public static final c e;
    public final ArrayList a;
    public int b;
    public int c;
    
    static {
        d = new c(new b(new a$b(':')));
        e = new c(new b(new a$b('*')));
    }
    
    public j() {
        this.a = new ArrayList();
        this.b = 0;
    }
    
    public static final class a
    {
        public final long a;
        public final int b;
        
        public a(final long a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
}
