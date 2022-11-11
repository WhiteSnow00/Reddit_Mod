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

@Metadata(bv = {}, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#" }, d2 = { "Lcom/reddit/domain/chat/model/ContactDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/ContactData;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "booleanAdapter", "Lcom/reddit/domain/chat/model/UserStatus;", "userStatusAdapter", "nullableBooleanAdapter", "", "nullableIntAdapter", "", "nullableLongAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class ContactDataJsonAdapter extends JsonAdapter<ContactData>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ContactData> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<UserStatus> userStatusAdapter;
    
    public ContactDataJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "username", "iconUrl", "userId", "selected", "status", "isNsfw", "karma", "createdUtc" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "username");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "iconUrl");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "selected");
        this.userStatusAdapter = (JsonAdapter<UserStatus>)y.c((Type)UserStatus.class, (Set)instance, "status");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "isNsfw");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "karma");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "createdUtc");
    }
    
    public ContactData fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        int n = -1;
        String s = null;
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
                case 7: {
                    o6 = this.nullableLongAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFF7F;
                    continue;
                }
                case 6: {
                    o5 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFBF;
                    continue;
                }
                case 5: {
                    o4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o3 = this.userStatusAdapter.fromJson(jsonReader);
                    if (o3 != null) {
                        n &= 0xFFFFFFEF;
                        continue;
                    }
                    throw a.n("status", "status", jsonReader);
                }
                case 3: {
                    false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (false != null) {
                        n &= 0xFFFFFFF7;
                        continue;
                    }
                    throw a.n("selected", "selected", jsonReader);
                }
                case 2: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    o = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("username", "username", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -249) {
            if (s != null) {
                final boolean booleanValue = false;
                f.d(o3, "null cannot be cast to non-null type com.reddit.domain.chat.model.UserStatus");
                return new ContactData(s, (String)o, (String)o2, booleanValue, (UserStatus)o3, (Boolean)o4, (Integer)o5, (Long)o6);
            }
            throw a.h("username", "username", jsonReader);
        }
        else {
            Constructor<ContactData> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                constructorRef = ContactData.class.getDeclaredConstructor(String.class, String.class, String.class, Boolean.TYPE, UserStatus.class, Boolean.class, Integer.class, Long.class, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = constructorRef), "ContactData::class.java.\u2026his.constructorRef = it }");
            }
            if (s != null) {
                final ContactData instance = constructorRef.newInstance(s, o, o2, false, o3, o4, o5, o6, n, null);
                f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("username", "username", jsonReader);
        }
    }
    
    public void toJson(final x x, final ContactData contactData) {
        f.f((Object)x, "writer");
        if (contactData != null) {
            x.h();
            x.w("username");
            this.stringAdapter.toJson(x, (Object)contactData.getUsername());
            x.w("iconUrl");
            this.nullableStringAdapter.toJson(x, (Object)contactData.getIconUrl());
            x.w("userId");
            this.nullableStringAdapter.toJson(x, (Object)contactData.getUserId());
            x.w("selected");
            this.booleanAdapter.toJson(x, (Object)contactData.getSelected());
            x.w("status");
            this.userStatusAdapter.toJson(x, (Object)contactData.getStatus());
            x.w("isNsfw");
            this.nullableBooleanAdapter.toJson(x, (Object)contactData.isNsfw());
            x.w("karma");
            this.nullableIntAdapter.toJson(x, (Object)contactData.getKarma());
            x.w("createdUtc");
            this.nullableLongAdapter.toJson(x, (Object)contactData.getCreatedUtc());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(ContactData)";
    }
}
