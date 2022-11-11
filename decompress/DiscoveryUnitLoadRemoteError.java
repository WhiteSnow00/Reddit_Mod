// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.domain.repository;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f" }, d2 = { "Lcom/reddit/discoveryunits/domain/repository/DiscoveryUnitLoadRemoteError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class DiscoveryUnitLoadRemoteError extends RuntimeException
{
    private final Throwable cause;
    private final String message;
    
    public DiscoveryUnitLoadRemoteError() {
        this(null, null, 3, null);
    }
    
    public DiscoveryUnitLoadRemoteError(final String message, final Throwable cause) {
        this.message = message;
        this.cause = cause;
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
    
    @Override
    public String getMessage() {
        return this.message;
    }
}
