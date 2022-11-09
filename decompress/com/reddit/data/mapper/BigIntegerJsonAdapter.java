// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.mapper;

import com.squareup.moshi.z;
import com.squareup.moshi.m;
import ah2.f;
import java.math.BigInteger;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t" }, d2 = { "Lcom/reddit/data/mapper/BigIntegerJsonAdapter;", "", "()V", "fromJson", "Ljava/math/BigInteger;", "string", "", "toJson", "value", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class BigIntegerJsonAdapter
{
    public static final BigIntegerJsonAdapter INSTANCE;
    
    static {
        INSTANCE = new BigIntegerJsonAdapter();
    }
    
    private BigIntegerJsonAdapter() {
    }
    
    @m
    public final BigInteger fromJson(final String s) {
        f.f((Object)s, "string");
        return new BigInteger(s);
    }
    
    @z
    public final String toJson(final BigInteger bigInteger) {
        f.f((Object)bigInteger, "value");
        throw new UnsupportedOperationException("Not supported");
    }
}
