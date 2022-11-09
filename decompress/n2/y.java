// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import ah2.f;
import androidx.compose.ui.text.font.AsyncFontListLoader;
import z0.e1;

public interface y extends e1<Object>
{
    boolean c();
    
    public static final class a implements y, e1<Object>
    {
        public final AsyncFontListLoader f;
        
        public a(final AsyncFontListLoader f) {
            this.f = f;
        }
        
        @Override
        public final boolean c() {
            return this.f.l;
        }
        
        @Override
        public final Object getValue() {
            return this.f.getValue();
        }
    }
    
    public static final class b implements y
    {
        public final Object f;
        public final boolean g;
        
        public b(final Object f, final boolean g) {
            f.f(f, "value");
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final boolean c() {
            return this.g;
        }
        
        @Override
        public final Object getValue() {
            return this.f;
        }
    }
}
