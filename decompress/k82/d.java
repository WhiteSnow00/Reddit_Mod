// 
// Decompiled by Procyon v0.6.0
// 

package k82;

import r82.c0;
import ng2.e;
import d20.a;
import com.reddit.vault.ethereum.rpc.RpcService;
import r82.c0$c;
import com.reddit.vault.data.remote.BaseEthTransactionService;

public final class d extends BaseEthTransactionService
{
    public final c0$c d;
    public final String e;
    
    public d(final RpcService rpcService, final a a) {
        ng2.e.f((Object)rpcService, "rpc");
        ng2.e.f((Object)a, "dispatcherProvider");
        super(rpcService, a);
        this.d = c0$c.c;
        this.e = "ETH";
    }
    
    public final c0 b() {
        return (c0)this.d;
    }
    
    public final String e() {
        return this.e;
    }
}
