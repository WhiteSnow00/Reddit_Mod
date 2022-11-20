// 
// Decompiled by Procyon v0.6.0
// 

package w6;

import s6.e;
import x6.h;
import s6.m;
import s6.a;
import java.util.List;
import java.util.ArrayList;

public final class c extends j
{
    public final int h;
    
    public c(final ArrayList list, final int h) {
        this.h = h;
        super(list);
    }
    
    @Override
    public final a b() {
        switch (this.h) {
            default: {
                return new m((List<c7.a<h>>)super.g);
            }
            case 0: {
                return (a)new e((List)super.g);
            }
        }
    }
}
