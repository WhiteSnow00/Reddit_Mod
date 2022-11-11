// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import qd2.a$b;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdConfig_ReactionsConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/SendBirdConfig$ReactionsConfig;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/reddit/domain/chat/model/ChatReaction;", "nullableListOfChatReactionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableChatReactionAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SendBirdConfig_ReactionsConfigJsonAdapter extends JsonAdapter<SendBirdConfig$ReactionsConfig>
{
    private volatile Constructor<SendBirdConfig$ReactionsConfig> constructorRef;
    private final JsonAdapter<ChatReaction> nullableChatReactionAdapter;
    private final JsonAdapter<List<ChatReaction>> nullableListOfChatReactionAdapter;
    private final JsonReader$b options;
    
    public SendBirdConfig_ReactionsConfigJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "short_list", "double_tap", "triple_tap" });
        final a$b d = a0.d((Class)List.class, new Type[] { ChatReaction.class });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableListOfChatReactionAdapter = (JsonAdapter<List<ChatReaction>>)y.c((Type)d, (Set)instance, "defaultReactions");
        this.nullableChatReactionAdapter = (JsonAdapter<ChatReaction>)y.c((Type)ChatReaction.class, (Set)instance, "doubleTapReaction");
    }
    
    public SendBirdConfig$ReactionsConfig fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Object o = null;
        Object o3;
        Object o2 = o3 = o;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            continue;
                        }
                        o3 = this.nullableChatReactionAdapter.fromJson(jsonReader);
                        n &= 0xFFFFFFFB;
                    }
                    else {
                        o2 = this.nullableChatReactionAdapter.fromJson(jsonReader);
                        n &= 0xFFFFFFFD;
                    }
                }
                else {
                    o = this.nullableListOfChatReactionAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFE;
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (n == -8) {
            return new SendBirdConfig$ReactionsConfig((List)o, (ChatReaction)o2, (ChatReaction)o3);
        }
        Constructor<SendBirdConfig$ReactionsConfig> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            constructorRef = SendBirdConfig$ReactionsConfig.class.getDeclaredConstructor(List.class, ChatReaction.class, ChatReaction.class, Integer.TYPE, a.c);
            f.e((Object)(this.constructorRef = constructorRef), "SendBirdConfig.Reactions\u2026his.constructorRef = it }");
        }
        final SendBirdConfig$ReactionsConfig instance = constructorRef.newInstance(o, o2, o3, n, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final SendBirdConfig$ReactionsConfig sendBirdConfig$ReactionsConfig) {
        f.f((Object)x, "writer");
        if (sendBirdConfig$ReactionsConfig != null) {
            x.h();
            x.w("short_list");
            this.nullableListOfChatReactionAdapter.toJson(x, (Object)sendBirdConfig$ReactionsConfig.getDefaultReactions());
            x.w("double_tap");
            this.nullableChatReactionAdapter.toJson(x, (Object)sendBirdConfig$ReactionsConfig.getDoubleTapReaction());
            x.w("triple_tap");
            this.nullableChatReactionAdapter.toJson(x, (Object)sendBirdConfig$ReactionsConfig.getTripleTapReaction());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SendBirdConfig.ReactionsConfig)";
    }
}
