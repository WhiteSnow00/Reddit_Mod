// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

public final class b0
{
    public final q0 a;
    public final m0$d b;
    public final RecyclerView.Adapter<RecyclerView.f0> c;
    public final b d;
    public int e;
    public b0$a f;
    
    public b0(final RecyclerView.Adapter c, final g d, final p0 p4, final m0$d b) {
        this.f = new b0$a(this);
        this.c = c;
        this.d = (b)d;
        p4.getClass();
        this.a = (q0)new p0$a(p4, this);
        this.b = b;
        this.e = c.getItemCount();
        c.registerAdapterDataObserver((RecyclerView.i)this.f);
    }
    
    public interface b
    {
    }
}
