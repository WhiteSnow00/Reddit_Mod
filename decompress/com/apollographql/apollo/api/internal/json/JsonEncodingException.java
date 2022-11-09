// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.api.internal.json;

import ah2.f;
import kotlin.Metadata;
import java.io.IOException;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006" }, d2 = { "Lcom/apollographql/apollo/api/internal/json/JsonEncodingException;", "Ljava/io/IOException;", "Lokio/IOException;", "message", "", "(Ljava/lang/String;)V", "apollo-api" }, k = 1, mv = { 1, 5, 1 }, xi = 48)
public final class JsonEncodingException extends IOException
{
    public JsonEncodingException(final String s) {
        f.g((Object)s, "message");
        super(s);
    }
}
