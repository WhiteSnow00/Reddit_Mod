// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2.exception;

import ng2.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006" }, d2 = { "Lcom/tonyodev/fetch2/exception/FetchException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "fetch2_release" }, k = 1, mv = { 1, 1, 16 })
public class FetchException extends RuntimeException
{
    public FetchException(final String s) {
        e.g((Object)s, "message");
        super(s);
    }
}
