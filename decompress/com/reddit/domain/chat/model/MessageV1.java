// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B;\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/chat/model/MessageV1;", "", "embedData", "Lcom/reddit/domain/chat/model/SendBirdDataV1$EmbedData;", "snoomoji", "", "gif", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Gif;", "image", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Image;", "collapsedForPreview", "", "(Lcom/reddit/domain/chat/model/SendBirdDataV1$EmbedData;Ljava/lang/String;Lcom/reddit/domain/chat/model/SendBirdDataV1$Gif;Lcom/reddit/domain/chat/model/SendBirdDataV1$Image;Ljava/lang/Boolean;)V", "getCollapsedForPreview", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEmbedData", "()Lcom/reddit/domain/chat/model/SendBirdDataV1$EmbedData;", "getGif", "()Lcom/reddit/domain/chat/model/SendBirdDataV1$Gif;", "getImage", "()Lcom/reddit/domain/chat/model/SendBirdDataV1$Image;", "getSnoomoji", "()Ljava/lang/String;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MessageV1
{
    private final Boolean collapsedForPreview;
    private final SendBirdDataV1.EmbedData embedData;
    private final SendBirdDataV1.Gif gif;
    private final SendBirdDataV1.Image image;
    private final String snoomoji;
    
    public MessageV1(@n(name = "embed_data") final SendBirdDataV1.EmbedData embedData, final String snoomoji, final SendBirdDataV1.Gif gif, final SendBirdDataV1.Image image, @n(name = "preview_collapsed") final Boolean collapsedForPreview) {
        this.embedData = embedData;
        this.snoomoji = snoomoji;
        this.gif = gif;
        this.image = image;
        this.collapsedForPreview = collapsedForPreview;
    }
    
    public final Boolean getCollapsedForPreview() {
        return this.collapsedForPreview;
    }
    
    public final SendBirdDataV1.EmbedData getEmbedData() {
        return this.embedData;
    }
    
    public final SendBirdDataV1.Gif getGif() {
        return this.gif;
    }
    
    public final SendBirdDataV1.Image getImage() {
        return this.image;
    }
    
    public final String getSnoomoji() {
        return this.snoomoji;
    }
}
