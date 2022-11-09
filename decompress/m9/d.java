// 
// Decompiled by Procyon v0.6.0
// 

package m9;

public abstract class d
{
    public static final class a extends d
    {
        public volatile boolean a;
        
        public final void a() {
            if (!this.a) {
                return;
            }
            throw new IllegalStateException("Already released");
        }
    }
}
