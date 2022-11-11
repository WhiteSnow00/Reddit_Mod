// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.remote;

import p82.a$b;
import p82.a$a;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import p82.a;
import x82.m;
import java.math.BigInteger;
import kotlin.Metadata;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lx82/c;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.data.remote.BaseEthTransactionService$sendTransaction$tx$1", f = "BaseEthTransactionService.kt", l = { 97 }, m = "invokeSuspend")
final class BaseEthTransactionService$sendTransaction$tx$1 extends SuspendLambda implements p<b0, c<? super x82.c>, Object>
{
    public final /* synthetic */ BigInteger $chainId;
    public final /* synthetic */ m $credentials;
    public final /* synthetic */ a $gasPrice;
    public final /* synthetic */ BigInteger $nonce;
    public final /* synthetic */ x82.c $transaction;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ BaseEthTransactionService this$0;
    
    public BaseEthTransactionService$sendTransaction$tx$1(final m $credentials, final a $gasPrice, final BaseEthTransactionService this$0, final x82.c $transaction, final BigInteger $nonce, final BigInteger $chainId, final c<? super BaseEthTransactionService$sendTransaction$tx$1> c) {
        this.$credentials = $credentials;
        this.$gasPrice = $gasPrice;
        this.this$0 = this$0;
        this.$transaction = $transaction;
        this.$nonce = $nonce;
        this.$chainId = $chainId;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new BaseEthTransactionService$sendTransaction$tx$1(this.$credentials, this.$gasPrice, this.this$0, this.$transaction, this.$nonce, this.$chainId, (c<? super BaseEthTransactionService$sendTransaction$tx$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super x82.c> c) {
        return ((BaseEthTransactionService$sendTransaction$tx$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        x82.a i;
        BigInteger zero;
        Object j;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bigInteger = (BigInteger)this.L$4;
            bigInteger2 = (BigInteger)this.L$3;
            bigInteger3 = (BigInteger)this.L$2;
            i = (x82.a)this.L$1;
            final BigInteger bigInteger4 = (BigInteger)this.L$0;
            b.k0(o);
            zero = bigInteger4;
            j = o;
        }
        else {
            b.k0(o);
            zero = BigInteger.ZERO;
            i = this.$credentials.i;
            final a $gasPrice = this.$gasPrice;
            Object o2;
            if ($gasPrice instanceof a$a) {
                o2 = $gasPrice;
            }
            else {
                o2 = null;
            }
            BigInteger a2 = null;
            Label_0152: {
                if (o2 != null) {
                    final p82.b a = ((a)o2).a;
                    if (a != null) {
                        a2 = a.a;
                        break Label_0152;
                    }
                }
                a2 = null;
            }
            final boolean b = $gasPrice instanceof a$b;
            a$b a$b;
            if (b) {
                a$b = (a$b)$gasPrice;
            }
            else {
                a$b = null;
            }
            BigInteger a3 = null;
            Label_0207: {
                if (a$b != null) {
                    final p82.b b2 = a$b.b;
                    if (b2 != null) {
                        a3 = b2.a;
                        break Label_0207;
                    }
                }
                a3 = null;
            }
            a$b a$b2;
            if (b) {
                a$b2 = (a$b)$gasPrice;
            }
            else {
                a$b2 = null;
            }
            BigInteger a4 = null;
            Label_0255: {
                if (a$b2 != null) {
                    final p82.b c = a$b2.c;
                    if (c != null) {
                        a4 = c.a;
                        break Label_0255;
                    }
                }
                a4 = null;
            }
            final BaseEthTransactionService this$0 = this.this$0;
            final x82.c $transaction = this.$transaction;
            this.L$0 = zero;
            this.L$1 = i;
            this.L$2 = a2;
            this.L$3 = a3;
            this.L$4 = a4;
            this.label = 1;
            j = this$0.i($transaction, i, (c)this);
            if (j == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            bigInteger2 = a3;
            bigInteger = a4;
            bigInteger3 = a2;
        }
        return x82.c.a(this.$transaction, i, (BigInteger)j, bigInteger3, bigInteger2, bigInteger, (byte[])null, this.$nonce, zero, this.$chainId, 65);
    }
}
