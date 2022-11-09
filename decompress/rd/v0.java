// 
// Decompiled by Procyon v0.6.0
// 

package rd;

public abstract class v0<TListener>
{
    public TListener a;
    public boolean b;
    public final /* synthetic */ b c;
    
    public v0(final b c, final Boolean a) {
        this.c = c;
        this.a = (TListener)a;
        this.b = false;
    }
    
    public abstract void a();
    
    public abstract void b();
}
