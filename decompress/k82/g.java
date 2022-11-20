// 
// Decompiled by Procyon v0.6.0
// 

package k82;

import kotlin.NoWhenBranchMatchedException;
import r82.c0$a;
import com.reddit.vault.data.remote.MetaTransactionService;
import r82.c0$b;
import r82.c0$c;
import r82.c0;
import javax.inject.Inject;
import ng2.e;
import java.util.LinkedHashMap;
import d20.a;
import com.reddit.vault.ethereum.rpc.RpcService;
import com.reddit.vault.data.remote.RemoteVaultDataSource;

public final class g
{
    public final RemoteVaultDataSource a;
    public final RpcService b;
    public final a c;
    public final LinkedHashMap d;
    
    @Inject
    public g(final RemoteVaultDataSource a, final RpcService b, final a c) {
        e.f((Object)a, "remoteVaultDataSource");
        e.f((Object)b, "rpcService");
        e.f((Object)c, "dispatcherProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new LinkedHashMap();
    }
    
    public final f a(final c0 c0) {
        e.f((Object)c0, "provider");
        final LinkedHashMap d = this.d;
        Object value;
        if ((value = d.get(c0)) == null) {
            if (c0 instanceof c0$c) {
                value = new d(this.b, this.c);
            }
            else if (c0 instanceof c0$b) {
                value = new MetaTransactionService(c0, this.a, this.b, this.c);
            }
            else {
                if (!(c0 instanceof c0$a)) {
                    throw new NoWhenBranchMatchedException();
                }
                value = new c(c0, this.b, this.c);
            }
            d.put(c0, value);
        }
        return (f)value;
    }
}
