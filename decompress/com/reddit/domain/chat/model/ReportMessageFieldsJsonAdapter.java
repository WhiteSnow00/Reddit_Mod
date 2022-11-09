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

@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c" }, d2 = { "Lcom/reddit/domain/chat/model/ReportMessageFieldsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/ReportMessageFields;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class ReportMessageFieldsJsonAdapter extends JsonAdapter<ReportMessageFields>
{
    private volatile Constructor<ReportMessageFields> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public ReportMessageFieldsJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "channelUrl", "createdAt", "messageId", "userId", "userNickname", "customType", "customData", "messageBody", "fileUrl" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "channelUrl");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "createdAt");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "messageBody");
    }
    
    public ReportMessageFields fromJson(final JsonReader jsonReader) {
        final Class<String> clazz = String.class;
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Long n2 = null;
        String s = null;
        Long n3 = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 8: {
                    o6 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFEFF;
                    continue;
                }
                case 7: {
                    o5 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    o4 = this.stringAdapter.fromJson(jsonReader);
                    if (o4 != null) {
                        continue;
                    }
                    throw a.n("customData", "customData", jsonReader);
                }
                case 5: {
                    o3 = this.stringAdapter.fromJson(jsonReader);
                    if (o3 != null) {
                        continue;
                    }
                    throw a.n("customType", "customType", jsonReader);
                }
                case 4: {
                    o2 = this.stringAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        continue;
                    }
                    throw a.n("userNickname", "userNickname", jsonReader);
                }
                case 3: {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("userId", "userId", jsonReader);
                }
                case 2: {
                    n3 = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n3 != null) {
                        continue;
                    }
                    throw a.n("messageId", "messageId", jsonReader);
                }
                case 1: {
                    n2 = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        continue;
                    }
                    throw a.n("createdAt", "createdAt", jsonReader);
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("channelUrl", "channelUrl", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -257) {
            if (s == null) {
                throw a.h("channelUrl", "channelUrl", jsonReader);
            }
            if (n2 == null) {
                throw a.h("createdAt", "createdAt", jsonReader);
            }
            final long longValue = n2;
            if (n3 == null) {
                throw a.h("messageId", "messageId", jsonReader);
            }
            final long longValue2 = n3;
            if (o == null) {
                throw a.h("userId", "userId", jsonReader);
            }
            if (o2 == null) {
                throw a.h("userNickname", "userNickname", jsonReader);
            }
            if (o3 == null) {
                throw a.h("customType", "customType", jsonReader);
            }
            if (o4 != null) {
                return new ReportMessageFields(s, longValue, longValue2, (String)o, (String)o2, (String)o3, (String)o4, (String)o5, (String)o6);
            }
            throw a.h("customData", "customData", jsonReader);
        }
        else {
            final Constructor<ReportMessageFields> constructorRef = this.constructorRef;
            Constructor<ReportMessageFields> declaredConstructor;
            if (constructorRef == null) {
                final Class<Long> type = Long.TYPE;
                declaredConstructor = ReportMessageFields.class.getDeclaredConstructor(clazz, type, type, clazz, clazz, clazz, clazz, clazz, clazz, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = declaredConstructor), "ReportMessageFields::cla\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (s == null) {
                throw a.h("channelUrl", "channelUrl", jsonReader);
            }
            if (n2 == null) {
                throw a.h("createdAt", "createdAt", jsonReader);
            }
            final long longValue3 = n2;
            if (n3 == null) {
                throw a.h("messageId", "messageId", jsonReader);
            }
            final long longValue4 = n3;
            if (o == null) {
                throw a.h("userId", "userId", jsonReader);
            }
            if (o2 == null) {
                throw a.h("userNickname", "userNickname", jsonReader);
            }
            if (o3 == null) {
                throw a.h("customType", "customType", jsonReader);
            }
            if (o4 != null) {
                final ReportMessageFields instance = declaredConstructor.newInstance(s, longValue3, longValue4, o, o2, o3, o4, o5, o6, n, null);
                f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("customData", "customData", jsonReader);
        }
    }
    
    public void toJson(final x x, final ReportMessageFields reportMessageFields) {
        f.f((Object)x, "writer");
        if (reportMessageFields != null) {
            x.h();
            x.w("channelUrl");
            this.stringAdapter.toJson(x, (Object)reportMessageFields.getChannelUrl());
            x.w("createdAt");
            this.longAdapter.toJson(x, (Object)reportMessageFields.getCreatedAt());
            x.w("messageId");
            this.longAdapter.toJson(x, (Object)reportMessageFields.getMessageId());
            x.w("userId");
            this.stringAdapter.toJson(x, (Object)reportMessageFields.getUserId());
            x.w("userNickname");
            this.stringAdapter.toJson(x, (Object)reportMessageFields.getUserNickname());
            x.w("customType");
            this.stringAdapter.toJson(x, (Object)reportMessageFields.getCustomType());
            x.w("customData");
            this.stringAdapter.toJson(x, (Object)reportMessageFields.getCustomData());
            x.w("messageBody");
            this.nullableStringAdapter.toJson(x, (Object)reportMessageFields.getMessageBody());
            x.w("fileUrl");
            this.nullableStringAdapter.toJson(x, (Object)reportMessageFields.getFileUrl());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(ReportMessageFields)";
    }
}
