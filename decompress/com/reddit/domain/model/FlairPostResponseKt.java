// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003" }, d2 = { "toFlair", "Lcom/reddit/domain/model/Flair;", "Lcom/reddit/domain/model/FlairPostResponse;", "model_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class FlairPostResponseKt
{
    public static final Flair toFlair(final FlairPostResponse flairPostResponse) {
        f.f((Object)flairPostResponse, "<this>");
        return new Flair(flairPostResponse.getText(), flairPostResponse.getTextEditable(), flairPostResponse.getId(), flairPostResponse.getType(), flairPostResponse.getBackgroundColor(), flairPostResponse.getTextColor(), flairPostResponse.getRichtext(), flairPostResponse.getModOnly(), flairPostResponse.getMaxEmojis(), flairPostResponse.getAllowableContent());
    }
}
