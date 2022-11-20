// 
// Decompiled by Procyon v0.6.0
// 

package pj2;

public final class e
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    
    public e() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = true;
        this.g = "    ";
        this.h = false;
        this.i = false;
        this.j = "type";
        this.k = false;
        this.l = true;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("JsonConfiguration(encodeDefaults=");
        t.append(this.a);
        t.append(", ignoreUnknownKeys=");
        t.append(this.b);
        t.append(", isLenient=");
        t.append(this.c);
        t.append(", allowStructuredMapKeys=");
        t.append(this.d);
        t.append(", prettyPrint=");
        t.append(this.e);
        t.append(", explicitNulls=");
        t.append(this.f);
        t.append(", prettyPrintIndent='");
        t.append(this.g);
        t.append("', coerceInputValues=");
        t.append(this.h);
        t.append(", useArrayPolymorphism=");
        t.append(this.i);
        t.append(", classDiscriminator='");
        t.append(this.j);
        t.append("', allowSpecialFloatingPointValues=");
        return d.n(t, this.k, ')');
    }
}
