// 
// Decompiled by Procyon v0.6.0
// 

package k82;

import ng2.e;
import d20.a;
import com.reddit.vault.ethereum.rpc.RpcService;
import r82.c0;
import com.reddit.vault.data.remote.BaseEthTransactionService;

public final class c extends BaseEthTransactionService
{
    public final c0 d;
    public final String e;
    
    public c(final c0 d, final RpcService rpcService, final a a) {
        ng2.e.f((Object)d, "provider");
        ng2.e.f((Object)rpcService, "rpc");
        ng2.e.f((Object)a, "dispatcherProvider");
        super(rpcService, a);
        this.d = d;
        this.e = "ETH";
    }
    
    public final c0 b() {
        return this.d;
    }
    
    public final String e() {
        return this.e;
    }
}
