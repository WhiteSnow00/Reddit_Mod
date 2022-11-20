// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import sg.h;

public final class m implements h
{
    public final int f;
    
    public m(final int f) {
        this.f = f;
    }
    
    public final boolean apply(final Object o) {
        switch (this.f) {
            default: {
                return ((Class)o).isInterface();
            }
            case 0: {
                return o != null;
            }
        }
    }
}
