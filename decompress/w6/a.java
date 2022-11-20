// 
// Decompiled by Procyon v0.6.0
// 

package w6;

import s6.b;
import s6.l;
import java.util.List;
import java.util.ArrayList;

public final class a extends j
{
    public final int h;
    
    public a(final ArrayList list, final int h) {
        this.h = h;
        super(list);
    }
    
    @Override
    public final s6.a b() {
        switch (this.h) {
            default: {
                return (s6.a)new l((List)super.g);
            }
            case 0: {
                return (s6.a)new b((List)super.g);
            }
        }
    }
}
