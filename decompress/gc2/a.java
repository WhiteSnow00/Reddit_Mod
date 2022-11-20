// 
// Decompiled by Procyon v0.6.0
// 

package gc2;

public abstract class a implements Runnable
{
    public final String f;
    
    public a(final String s, final Object... array) {
        this.f = b.l(s, array);
    }
    
    public abstract void a();
    
    @Override
    public final void run() {
        final String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f);
        try {
            this.a();
        }
        finally {
            Thread.currentThread().setName(name);
        }
    }
}
