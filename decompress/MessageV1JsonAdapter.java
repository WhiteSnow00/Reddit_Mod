// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.x;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/chat/model/MessageV1JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/MessageV1;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/domain/chat/model/SendBirdDataV1$EmbedData;", "nullableEmbedDataAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Gif;", "nullableGifAdapter", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Image;", "nullableImageAdapter", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class MessageV1JsonAdapter extends JsonAdapter<MessageV1>
{
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<SendBirdDataV1$EmbedData> nullableEmbedDataAdapter;
    private final JsonAdapter<SendBirdDataV1$Gif> nullableGifAdapter;
    private final JsonAdapter<SendBirdDataV1$Image> nullableImageAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public MessageV1JsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "embed_data", "snoomoji", "gif", "image", "preview_collapsed" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableEmbedDataAdapter = (JsonAdapter<SendBirdDataV1$EmbedData>)y.c((Type)SendBirdDataV1$EmbedData.class, (Set)instance, "embedData");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "snoomoji");
        this.nullableGifAdapter = (JsonAdapter<SendBirdDataV1$Gif>)y.c((Type)SendBirdDataV1$Gif.class, (Set)instance, "gif");
        this.nullableImageAdapter = (JsonAdapter<SendBirdDataV1$Image>)y.c((Type)SendBirdDataV1$Image.class, (Set)instance, "image");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "collapsedForPreview");
    }
    
    public MessageV1 fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Object o = null;
        Object o3;
        Object o2 = o3 = o;
        Object o5;
        Object o4 = o5 = o3;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f != 4) {
                                    continue;
                                }
                                o5 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            }
                            else {
                                o4 = this.nullableImageAdapter.fromJson(jsonReader);
                            }
                        }
                        else {
                            o3 = this.nullableGifAdapter.fromJson(jsonReader);
                        }
                    }
                    else {
                        o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    }
                }
                else {
                    o = this.nullableEmbedDataAdapter.fromJson(jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        return new MessageV1((SendBirdDataV1$EmbedData)o, (String)o2, (SendBirdDataV1$Gif)o3, (SendBirdDataV1$Image)o4, (Boolean)o5);
    }
    
    public void toJson(final x x, final MessageV1 messageV1) {
        f.f((Object)x, "writer");
        if (messageV1 != null) {
            x.h();
            x.w("embed_data");
            this.nullableEmbedDataAdapter.toJson(x, (Object)messageV1.getEmbedData());
            x.w("snoomoji");
            this.nullableStringAdapter.toJson(x, (Object)messageV1.getSnoomoji());
            x.w("gif");
            this.nullableGifAdapter.toJson(x, (Object)messageV1.getGif());
            x.w("image");
            this.nullableImageAdapter.toJson(x, (Object)messageV1.getImage());
            x.w("preview_collapsed");
            this.nullableBooleanAdapter.toJson(x, (Object)messageV1.getCollapsedForPreview());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(MessageV1)";
    }
}
