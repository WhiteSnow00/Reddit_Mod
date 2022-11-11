// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.util.Iterator;

public abstract class j implements Iterator
{
    public final /* synthetic */ int f;
    
    public abstract byte a();
    
    @Override
    public final void remove() {
        switch (this.f) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 0: {
                throw new UnsupportedOperationException();
            }
        }
    }
}
