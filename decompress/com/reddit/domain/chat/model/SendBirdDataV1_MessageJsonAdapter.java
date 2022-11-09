// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.x;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011¨\u0006$" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdDataV1_MessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Message;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/SendBirdDataV1$EmbedData;", "nullableEmbedDataAdapter", "", "nullableListOfStringAdapter", "Lcom/reddit/domain/chat/model/CommunityInvite;", "nullableCommunityInviteAdapter", "", "nullableBooleanAdapter", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Awarding;", "nullableAwardingAdapter", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Gif;", "nullableGifAdapter", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Image;", "nullableImageAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SendBirdDataV1_MessageJsonAdapter extends JsonAdapter<SendBirdDataV1$Message>
{
    private final JsonAdapter<SendBirdDataV1$Awarding> nullableAwardingAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<CommunityInvite> nullableCommunityInviteAdapter;
    private final JsonAdapter<SendBirdDataV1$EmbedData> nullableEmbedDataAdapter;
    private final JsonAdapter<SendBirdDataV1$Gif> nullableGifAdapter;
    private final JsonAdapter<SendBirdDataV1$Image> nullableImageAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public SendBirdDataV1_MessageJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "message_body", "embed_data", "reddit_username", "snoomoji", "highlights", "mod_invitation", "preview_collapsed", "awarding", "gif", "image", "clientMessageId" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "messageBody");
        this.nullableEmbedDataAdapter = (JsonAdapter<SendBirdDataV1$EmbedData>)y.c((Type)SendBirdDataV1$EmbedData.class, (Set)instance, "embedData");
        this.nullableListOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "highlights");
        this.nullableCommunityInviteAdapter = (JsonAdapter<CommunityInvite>)y.c((Type)CommunityInvite.class, (Set)instance, "communityInvite");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "collapsedForPreview");
        this.nullableAwardingAdapter = (JsonAdapter<SendBirdDataV1$Awarding>)y.c((Type)SendBirdDataV1$Awarding.class, (Set)instance, "awarding");
        this.nullableGifAdapter = (JsonAdapter<SendBirdDataV1$Gif>)y.c((Type)SendBirdDataV1$Gif.class, (Set)instance, "gif");
        this.nullableImageAdapter = (JsonAdapter<SendBirdDataV1$Image>)y.c((Type)SendBirdDataV1$Image.class, (Set)instance, "image");
    }
    
    public SendBirdDataV1$Message fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Object o = null;
        Object o3;
        Object o2 = o3 = o;
        Object o5;
        Object o4 = o5 = o3;
        Object o7;
        Object o6 = o7 = o5;
        Object o9;
        Object o8 = o9 = o7;
        Object o11;
        Object o10 = o11 = o9;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 10: {
                    o11 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 9: {
                    o10 = this.nullableImageAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    o9 = this.nullableGifAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    o8 = this.nullableAwardingAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    o7 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 5: {
                    o6 = this.nullableCommunityInviteAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    o5 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    o4 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    o2 = this.nullableEmbedDataAdapter.fromJson(jsonReader);
                    continue;
                }
                case 0: {
                    o = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        return new SendBirdDataV1$Message((String)o, (SendBirdDataV1$EmbedData)o2, (String)o3, (String)o4, (List)o5, (CommunityInvite)o6, (Boolean)o7, (SendBirdDataV1$Awarding)o8, (SendBirdDataV1$Gif)o9, (SendBirdDataV1$Image)o10, (String)o11);
    }
    
    public void toJson(final x x, final SendBirdDataV1$Message sendBirdDataV1$Message) {
        f.f((Object)x, "writer");
        if (sendBirdDataV1$Message != null) {
            x.h();
            x.w("message_body");
            this.nullableStringAdapter.toJson(x, (Object)sendBirdDataV1$Message.getMessageBody());
            x.w("embed_data");
            this.nullableEmbedDataAdapter.toJson(x, (Object)sendBirdDataV1$Message.getEmbedData());
            x.w("reddit_username");
            this.nullableStringAdapter.toJson(x, (Object)sendBirdDataV1$Message.getRedditUsername());
            x.w("snoomoji");
            this.nullableStringAdapter.toJson(x, (Object)sendBirdDataV1$Message.getSnoomoji());
            x.w("highlights");
            this.nullableListOfStringAdapter.toJson(x, (Object)sendBirdDataV1$Message.getHighlights());
            x.w("mod_invitation");
            this.nullableCommunityInviteAdapter.toJson(x, (Object)sendBirdDataV1$Message.getCommunityInvite());
            x.w("preview_collapsed");
            this.nullableBooleanAdapter.toJson(x, (Object)sendBirdDataV1$Message.getCollapsedForPreview());
            x.w("awarding");
            this.nullableAwardingAdapter.toJson(x, (Object)sendBirdDataV1$Message.getAwarding());
            x.w("gif");
            this.nullableGifAdapter.toJson(x, (Object)sendBirdDataV1$Message.getGif());
            x.w("image");
            this.nullableImageAdapter.toJson(x, (Object)sendBirdDataV1$Message.getImage());
            x.w("clientMessageId");
            this.nullableStringAdapter.toJson(x, (Object)sendBirdDataV1$Message.getClientMessageId());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SendBirdDataV1.Message)";
    }
}
