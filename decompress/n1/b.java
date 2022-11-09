// 
// Decompiled by Procyon v0.6.0
// 

package n1;

public final class b
{
    public float a;
    public float b;
    public float c;
    public float d;
    
    public b() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }
    
    public final void a(final float n, final float n2, final float n3, final float n4) {
        this.a = Math.max(n, this.a);
        this.b = Math.max(n2, this.b);
        this.c = Math.min(n3, this.c);
        this.d = Math.min(n4, this.d);
    }
    
    public final boolean b() {
        return this.a >= this.c || this.b >= this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("MutableRect(");
        k.append(a80.a.M0(this.a));
        k.append(", ");
        k.append(a80.a.M0(this.b));
        k.append(", ");
        k.append(a80.a.M0(this.c));
        k.append(", ");
        k.append(a80.a.M0(this.d));
        k.append(')');
        return k.toString();
    }
}
