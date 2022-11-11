// 
// Decompiled by Procyon v0.6.0
// 

package w82;

import pd.r;
import ig2.j;
import a4.a0;
import sg2.e;
import com.reddit.vault.ethereum.eip712.timedforwarder.TimedForwarderEip712;
import java.math.BigInteger;
import x82.a;
import javax.inject.Inject;

public final class g implements b
{
    @Inject
    public g() {
    }
    
    public final TimedForwarderEip712 a(final a a, final a a2, final a a3, final a a4, final BigInteger bigInteger, final BigInteger bigInteger2, final BigInteger bigInteger3, final BigInteger bigInteger4, final BigInteger bigInteger5, final BigInteger bigInteger6) {
        e.f((Object)a, "recipientAddress");
        e.f((Object)a2, "verifyingContract");
        e.f((Object)a3, "from");
        e.f((Object)a4, "to");
        e.f((Object)bigInteger, "gas");
        e.f((Object)bigInteger2, "nonce");
        e.f((Object)bigInteger3, "value");
        e.f((Object)bigInteger4, "validUntil");
        e.f((Object)bigInteger5, "chainId");
        final String d0 = r.D0(j.P0(new byte[] { -14, 66, 67, 42 }, a0.I((dn2.a)a0.O0(a3), (dn2.a)a0.O0(a), a0.N0(bigInteger6, new en2.a(256)), a0.N0(new BigInteger("1"), new en2.a(256)), (dn2.a)a0.P0(new byte[0]))));
        e.g((Object)d0, "string");
        return new TimedForwarderEip712(a2, new c92.b(a3, a4, ln2.a.a(d0), bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5));
    }
}
