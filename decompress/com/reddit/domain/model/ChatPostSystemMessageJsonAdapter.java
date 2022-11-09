// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c" }, d2 = { "Lcom/reddit/domain/model/ChatPostSystemMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/ChatPostSystemMessage;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/reddit/domain/model/RichTextResponse;", "nullableRichTextResponseAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class ChatPostSystemMessageJsonAdapter extends JsonAdapter<ChatPostSystemMessage>
{
    private volatile Constructor<ChatPostSystemMessage> constructorRef;
    private final JsonAdapter<RichTextResponse> nullableRichTextResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public ChatPostSystemMessageJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "name", "body_html", "subreddit_id", "rtjson" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "bodyHtml");
        this.nullableRichTextResponseAdapter = (JsonAdapter<RichTextResponse>)y.c((Type)RichTextResponse.class, (Set)instance, "rtjson");
    }
    
    public ChatPostSystemMessage fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
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
                                o5 = this.nullableRichTextResponseAdapter.fromJson(jsonReader);
                                n &= 0xFFFFFFEF;
                            }
                            else {
                                o4 = this.stringAdapter.fromJson(jsonReader);
                                if (o4 == null) {
                                    throw a.n("subredditKindWithId", "subreddit_id", jsonReader);
                                }
                                n &= 0xFFFFFFF7;
                            }
                        }
                        else {
                            o3 = this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFFFB;
                        }
                    }
                    else {
                        o2 = this.stringAdapter.fromJson(jsonReader);
                        if (o2 == null) {
                            throw a.n("kindWithId", "name", jsonReader);
                        }
                        n &= 0xFFFFFFFD;
                    }
                }
                else {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o == null) {
                        throw a.n("id", "id", jsonReader);
                    }
                    n &= 0xFFFFFFFE;
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (n == -32) {
            f.d(o, "null cannot be cast to non-null type kotlin.String");
            f.d(o2, "null cannot be cast to non-null type kotlin.String");
            f.d(o4, "null cannot be cast to non-null type kotlin.String");
            return new ChatPostSystemMessage((String)o, (String)o2, (String)o3, (String)o4, (RichTextResponse)o5);
        }
        Constructor<ChatPostSystemMessage> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            constructorRef = ChatPostSystemMessage.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, RichTextResponse.class, Integer.TYPE, a.c);
            f.e((Object)(this.constructorRef = constructorRef), "ChatPostSystemMessage::c\u2026his.constructorRef = it }");
        }
        final ChatPostSystemMessage instance = constructorRef.newInstance(o, o2, o3, o4, o5, n, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final ChatPostSystemMessage chatPostSystemMessage) {
        f.f((Object)x, "writer");
        if (chatPostSystemMessage != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)chatPostSystemMessage.getId());
            x.w("name");
            this.stringAdapter.toJson(x, (Object)chatPostSystemMessage.getKindWithId());
            x.w("body_html");
            this.nullableStringAdapter.toJson(x, (Object)chatPostSystemMessage.getBodyHtml());
            x.w("subreddit_id");
            this.stringAdapter.toJson(x, (Object)chatPostSystemMessage.getSubredditKindWithId());
            x.w("rtjson");
            this.nullableRichTextResponseAdapter.toJson(x, (Object)chatPostSystemMessage.getRtjson());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(ChatPostSystemMessage)";
    }
}
