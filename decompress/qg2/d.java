// 
// Decompiled by Procyon v0.6.0
// 

package qg2;

import java.util.NoSuchElementException;
import sg2.e;
import tg2.a;
import java.util.Iterator;
import java.io.BufferedReader;
import bj2.k;

public final class d implements k<String>
{
    public final BufferedReader a;
    
    public d(final BufferedReader a) {
        this.a = a;
    }
    
    public final Iterator<String> iterator() {
        return new Iterator<String>() {
            public String f;
            public boolean g;
            public final /* synthetic */ d h;
            
            @Override
            public final boolean hasNext() {
                final String f = this.f;
                boolean b = true;
                if (f == null && !this.g && (this.f = this.h.a.readLine()) == null) {
                    this.g = true;
                }
                if (this.f == null) {
                    b = false;
                }
                return b;
            }
            
            @Override
            public final Object next() {
                if (this.hasNext()) {
                    final String f = this.f;
                    this.f = null;
                    e.c((Object)f);
                    return f;
                }
                throw new NoSuchElementException();
            }
            
            @Override
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
