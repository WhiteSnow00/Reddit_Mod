// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

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

@Metadata(bv = {}, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/SendBirdConfig;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "nullableIntAdapter", "Lcom/reddit/domain/chat/model/SendBirdConfig$ReactionsConfig;", "nullableReactionsConfigAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SendBirdConfigJsonAdapter extends JsonAdapter<SendBirdConfig>
{
    private volatile Constructor<SendBirdConfig> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<SendBirdConfig$ReactionsConfig> nullableReactionsConfigAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public SendBirdConfigJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "proxy_host", "max_message_length", "type_ahead_min_chars", "autoload_messages_max_attempts", "reactions", "media_host" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "proxyHost");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "maxMessageLength");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "autoloadMessagesMaxAttempts");
        this.nullableReactionsConfigAdapter = (JsonAdapter<SendBirdConfig$ReactionsConfig>)y.c((Type)SendBirdConfig$ReactionsConfig.class, (Set)instance, "reactionsConfig");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "mediaHost");
    }
    
    public SendBirdConfig fromJson(final JsonReader jsonReader) {
        final Class<String> clazz = String.class;
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Integer n2 = null;
        String s = null;
        Integer n3 = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 5: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o2 = this.nullableReactionsConfigAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFEF;
                    continue;
                }
                case 3: {
                    o = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFF7;
                    continue;
                }
                case 2: {
                    n3 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n3 != null) {
                        continue;
                    }
                    throw a.n("typeAheadMinChars", "type_ahead_min_chars", jsonReader);
                }
                case 1: {
                    n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        continue;
                    }
                    throw a.n("maxMessageLength", "max_message_length", jsonReader);
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("proxyHost", "proxy_host", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -57) {
            if (s == null) {
                throw a.h("proxyHost", "proxy_host", jsonReader);
            }
            if (n2 == null) {
                throw a.h("maxMessageLength", "max_message_length", jsonReader);
            }
            final int intValue = n2;
            if (n3 != null) {
                return new SendBirdConfig(s, intValue, (int)n3, (Integer)o, (SendBirdConfig$ReactionsConfig)o2, (String)o3);
            }
            throw a.h("typeAheadMinChars", "type_ahead_min_chars", jsonReader);
        }
        else {
            final Constructor<SendBirdConfig> constructorRef = this.constructorRef;
            Constructor<SendBirdConfig> declaredConstructor;
            if (constructorRef == null) {
                final Class<Integer> type = Integer.TYPE;
                declaredConstructor = SendBirdConfig.class.getDeclaredConstructor(clazz, type, type, Integer.class, SendBirdConfig$ReactionsConfig.class, clazz, type, a.c);
                f.e((Object)(this.constructorRef = declaredConstructor), "SendBirdConfig::class.ja\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (s == null) {
                throw a.h("proxyHost", "proxy_host", jsonReader);
            }
            if (n2 == null) {
                throw a.h("maxMessageLength", "max_message_length", jsonReader);
            }
            final int intValue2 = n2;
            if (n3 != null) {
                final SendBirdConfig instance = declaredConstructor.newInstance(s, intValue2, n3, o, o2, o3, n, null);
                f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("typeAheadMinChars", "type_ahead_min_chars", jsonReader);
        }
    }
    
    public void toJson(final x x, final SendBirdConfig sendBirdConfig) {
        f.f((Object)x, "writer");
        if (sendBirdConfig != null) {
            x.h();
            x.w("proxy_host");
            this.stringAdapter.toJson(x, (Object)sendBirdConfig.getProxyHost());
            x.w("max_message_length");
            this.intAdapter.toJson(x, (Object)sendBirdConfig.getMaxMessageLength());
            x.w("type_ahead_min_chars");
            this.intAdapter.toJson(x, (Object)sendBirdConfig.getTypeAheadMinChars());
            x.w("autoload_messages_max_attempts");
            this.nullableIntAdapter.toJson(x, (Object)sendBirdConfig.getAutoloadMessagesMaxAttempts());
            x.w("reactions");
            this.nullableReactionsConfigAdapter.toJson(x, (Object)sendBirdConfig.getReactionsConfig());
            x.w("media_host");
            this.nullableStringAdapter.toJson(x, (Object)sendBirdConfig.getMediaHost());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SendBirdConfig)";
    }
}
