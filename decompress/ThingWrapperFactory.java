// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import ah2.f;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.y;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter$e;

@Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r" }, d2 = { "Lcom/reddit/data/model/v1/ThingWrapperFactory;", "Lcom/squareup/moshi/JsonAdapter$e;", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/y;", "moshi", "Lcom/squareup/moshi/JsonAdapter;", "create", "<init>", "()V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class ThingWrapperFactory implements JsonAdapter$e
{
    public JsonAdapter<?> create(final Type type, final Set<? extends Annotation> set, final y y) {
        f.f((Object)type, "type");
        f.f((Object)set, "annotations");
        f.f((Object)y, "moshi");
        if (!f.a((Object)type, (Object)ThingWrapper.class)) {
            return null;
        }
        return (JsonAdapter<?>)new ThingWrapperAdapter(y);
    }
}
