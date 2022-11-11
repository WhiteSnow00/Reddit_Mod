// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.remote;

import p82.f;
import okhttp3.ResponseBody;
import com.reddit.vault.ethereum.rpc.RpcService;
import com.reddit.vault.data.exception.RpcException;
import java.math.BigInteger;
import nu2.w;
import pd.r;
import yg.a;
import x82.f0;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import x82.m;
import kotlin.Metadata;
import p82.e;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lp82/e;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.data.remote.BaseEthTransactionService$sendTransaction$2", f = "BaseEthTransactionService.kt", l = { 102 }, m = "invokeSuspend")
final class BaseEthTransactionService$sendTransaction$2 extends SuspendLambda implements p<b0, c<? super e>, Object>
{
    public final /* synthetic */ m $credentials;
    public final /* synthetic */ x82.c $tx;
    public int label;
    public final /* synthetic */ BaseEthTransactionService this$0;
    
    public BaseEthTransactionService$sendTransaction$2(final BaseEthTransactionService this$0, final x82.c $tx, final m $credentials, final c<? super BaseEthTransactionService$sendTransaction$2> c) {
        this.this$0 = this$0;
        this.$tx = $tx;
        this.$credentials = $credentials;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new BaseEthTransactionService$sendTransaction$2(this.this$0, this.$tx, this.$credentials, (c<? super BaseEthTransactionService$sendTransaction$2>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super e> c) {
        return ((BaseEthTransactionService$sendTransaction$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        final String s = null;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(o);
        }
        else {
            b.k0(o);
            final BaseEthTransactionService this$0 = this.this$0;
            final RpcService a = this$0.a;
            final String b = ((f)this$0).b().b;
            final x82.c $tx = this.$tx;
            final m $credentials = this.$credentials;
            this.label = 1;
            a.getClass();
            sg2.e.f((Object)$tx, "<this>");
            sg2.e.f((Object)$credentials, "credentials");
            final String d0 = r.D0($tx.c($credentials.a(yg.a.W0($tx.c((f0)null)))));
            sg2.e.g((Object)d0, "string");
            if ((o = a.i(b, d0, (c)this)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final w w = (w)o;
        if (w.c()) {
            o = w.b;
            sg2.e.c(o);
            return new e((BigInteger)o);
        }
        final ResponseBody c = w.c;
        String string = s;
        if (c != null) {
            string = c.string();
        }
        throw new RpcException(string);
    }
}
