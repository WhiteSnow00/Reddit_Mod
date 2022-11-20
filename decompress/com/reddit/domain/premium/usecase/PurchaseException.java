// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.premium.usecase;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n" }, d2 = { "Lcom/reddit/domain/premium/usecase/PurchaseException;", "", "NotLoggedInException", "PurchaseFailedException", "UnableToCreateOrderIdException", "UnableToPurchaseException", "Lcom/reddit/domain/premium/usecase/PurchaseException$NotLoggedInException;", "Lcom/reddit/domain/premium/usecase/PurchaseException$PurchaseFailedException;", "Lcom/reddit/domain/premium/usecase/PurchaseException$UnableToCreateOrderIdException;", "Lcom/reddit/domain/premium/usecase/PurchaseException$UnableToPurchaseException;", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public abstract class PurchaseException extends Throwable
{
    public PurchaseException(Throwable t, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            t = null;
        }
        this(t, null);
    }
    
    public PurchaseException(final Throwable t, final DefaultConstructorMarker defaultConstructorMarker) {
        super(t);
    }
}
