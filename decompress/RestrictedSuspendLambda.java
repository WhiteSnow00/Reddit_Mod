// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.coroutines.jvm.internal;

import sg2.e;
import sg2.h;
import lg2.c;
import kotlin.Metadata;
import sg2.d;

@Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010" }, d2 = { "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lsg2/d;", "", "", "toString", "", "arity", "I", "getArity", "()I", "Llg2/c;", "completion", "<init>", "(ILlg2/c;)V", "(I)V", "kotlin-stdlib" }, k = 1, mv = { 1, 7, 1 })
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements d<Object>
{
    private final int arity;
    
    public RestrictedSuspendLambda(final int n) {
        this(n, null);
    }
    
    public RestrictedSuspendLambda(final int arity, final c<Object> c) {
        super((c)c);
        this.arity = arity;
    }
    
    public int getArity() {
        return this.arity;
    }
    
    public String toString() {
        String s;
        if (((BaseContinuationImpl)this).getCompletion() == null) {
            s = h.a.i((d)this);
            e.e((Object)s, "renderLambdaToString(this)");
        }
        else {
            s = super.toString();
        }
        return s;
    }
}
