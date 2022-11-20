// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.exceptions;

import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n" }, d2 = { "Lcom/reddit/domain/exceptions/ApiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorKey", "", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorKey", "()Ljava/lang/String;", "getErrorMessage", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ApiException extends Exception
{
    private final String errorKey;
    private final String errorMessage;
    
    public ApiException(final String errorKey, final String errorMessage) {
        e.f((Object)errorKey, "errorKey");
        e.f((Object)errorMessage, "errorMessage");
        super(errorMessage);
        this.errorKey = errorKey;
        this.errorMessage = errorMessage;
    }
    
    public final String getErrorKey() {
        return this.errorKey;
    }
    
    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
