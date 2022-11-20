// 
// Decompiled by Procyon v0.6.0
// 

package w82;

import java.util.Arrays;
import ng2.e;
import java.math.BigInteger;

public final class a
{
    public final r82.a a;
    public final r82.a b;
    public final byte[] c;
    public final BigInteger d;
    public final BigInteger e;
    public final BigInteger f;
    public final BigInteger g;
    public final BigInteger h;
    
    public a(final r82.a a, final r82.a b, final byte[] c, final BigInteger d, final BigInteger e, final BigInteger f, final BigInteger g, final BigInteger h) {
        ng2.e.f((Object)a, "from");
        ng2.e.f((Object)b, "to");
        ng2.e.f((Object)c, "data");
        ng2.e.f((Object)d, "gas");
        ng2.e.f((Object)e, "nonce");
        ng2.e.f((Object)f, "value");
        ng2.e.f((Object)g, "validUntil");
        ng2.e.f((Object)h, "chainId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!ng2.e.a((Object)a.class, (Object)class1)) {
            return false;
        }
        ng2.e.d(o, "null cannot be cast to non-null type com.reddit.vault.ethereum.eip712.timedforwarder.TimedForwarderRequestParams");
        final a a = (a)o;
        return ng2.e.a((Object)this.a, (Object)a.a) && ng2.e.a((Object)this.b, (Object)a.b) && Arrays.equals(this.c, a.c) && ng2.e.a((Object)this.d, (Object)a.d) && ng2.e.a((Object)this.e, (Object)a.e) && ng2.e.a((Object)this.f, (Object)a.f) && ng2.e.a((Object)this.g, (Object)a.g) && ng2.e.a((Object)this.h, (Object)a.h);
    }
    
    @Override
    public final int hashCode() {
        return this.h.hashCode() + a.h(this.g, a.h(this.f, a.h(this.e, a.h(this.d, (Arrays.hashCode(this.c) + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31, 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("TimedForwarderRequestParams(from=");
        t.append(this.a);
        t.append(", to=");
        t.append(this.b);
        t.append(", data=");
        t.append(Arrays.toString(this.c));
        t.append(", gas=");
        t.append(this.d);
        t.append(", nonce=");
        t.append(this.e);
        t.append(", value=");
        t.append(this.f);
        t.append(", validUntil=");
        t.append(this.g);
        t.append(", chainId=");
        t.append(this.h);
        t.append(')');
        return t.toString();
    }
}
