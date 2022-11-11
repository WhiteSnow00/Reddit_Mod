// 
// Decompiled by Procyon v0.6.0
// 

package na;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a
{
    public final e a;
    public final List<c> b;
    public final b c;
    public final String d;
    
    static {
        Collections.unmodifiableList((List<?>)new a().b);
    }
    
    public a(final e a, final List<c> b, final b c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static final class a
    {
        public e a;
        public ArrayList b;
        public b c;
        public String d;
        
        public a() {
            this.a = null;
            this.b = new ArrayList();
            this.c = null;
            this.d = "";
        }
    }
}
