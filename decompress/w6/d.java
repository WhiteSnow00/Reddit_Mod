// 
// Decompiled by Procyon v0.6.0
// 

package w6;

import s6.f;
import s6.p;
import s6.a;
import java.util.List;

public final class d extends j
{
    public final int h;
    
    public d(final List list, final int h) {
        this.h = h;
        super(list);
    }
    
    @Override
    public final a b() {
        switch (this.h) {
            default: {
                return (a)new p((List)super.g);
            }
            case 0: {
                return (a)new f((List)super.g);
            }
        }
    }
}
