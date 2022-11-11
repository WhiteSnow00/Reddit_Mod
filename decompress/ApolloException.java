// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.exception;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t" }, d2 = { "Lcom/apollographql/apollo/exception/ApolloException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "apollo-api" }, k = 1, mv = { 1, 5, 1 }, xi = 48)
public class ApolloException extends RuntimeException
{
    public ApolloException(final String s) {
        f.g((Object)s, "message");
        super(s);
    }
    
    public ApolloException(final String s, final Throwable t) {
        f.g((Object)s, "message");
        f.g((Object)t, "cause");
        super(s, t);
    }
}
