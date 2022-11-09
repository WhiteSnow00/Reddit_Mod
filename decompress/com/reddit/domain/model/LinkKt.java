// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003" }, d2 = { "age", "", "Lcom/reddit/domain/model/Link;", "model_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class LinkKt
{
    public static final long age(final Link link) {
        f.f((Object)link, "<this>");
        return TimeUnit.MILLISECONDS.toDays(Calendar.getInstance().getTime().getTime() - TimeUnit.SECONDS.toMillis(link.getCreatedUtc()));
    }
}
