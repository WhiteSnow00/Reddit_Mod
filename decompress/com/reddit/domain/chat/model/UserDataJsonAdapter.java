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

@Metadata(bv = {}, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!" }, d2 = { "Lcom/reddit/domain/chat/model/UserDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/UserData;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "intAdapter", "", "longAdapter", "", "nullableBooleanAdapter", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class UserDataJsonAdapter extends JsonAdapter<UserData>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<UserData> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public UserDataJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "userId", "username", "iconUrl", "karma", "createdUtc", "blocked", "isNsfw", "isOperator" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "userId");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "iconUrl");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "karma");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "createdUtc");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "blocked");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isOperator");
    }
    
    public UserData fromJson(final JsonReader jsonReader) {
        final Class<Boolean> clazz = Boolean.class;
        final Class<String> clazz2 = String.class;
        f.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        int n = -1;
        Integer n2 = null;
        String s = null;
        Object o = null;
        Object o2 = null;
        Long n3 = null;
        Object o3 = null;
        Object o4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 7: {
                    false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (false != null) {
                        n &= 0xFFFFFF7F;
                        continue;
                    }
                    throw a.n("isOperator", "isOperator", jsonReader);
                }
                case 6: {
                    o4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 5: {
                    o3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    n3 = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n3 != null) {
                        continue;
                    }
                    throw a.n("createdUtc", "createdUtc", jsonReader);
                }
                case 3: {
                    n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        continue;
                    }
                    throw a.n("karma", "karma", jsonReader);
                }
                case 2: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("username", "username", jsonReader);
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("userId", "userId", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -129) {
            if (s == null) {
                throw a.h("userId", "userId", jsonReader);
            }
            if (o == null) {
                throw a.h("username", "username", jsonReader);
            }
            if (n2 == null) {
                throw a.h("karma", "karma", jsonReader);
            }
            final int intValue = n2;
            if (n3 != null) {
                return new UserData(s, (String)o, (String)o2, intValue, n3, (Boolean)o3, (Boolean)o4, false);
            }
            throw a.h("createdUtc", "createdUtc", jsonReader);
        }
        else {
            final Constructor<UserData> constructorRef = this.constructorRef;
            Constructor<UserData> declaredConstructor;
            if (constructorRef == null) {
                final Class<Integer> type = Integer.TYPE;
                declaredConstructor = UserData.class.getDeclaredConstructor(clazz2, clazz2, clazz2, type, Long.TYPE, clazz, clazz, Boolean.TYPE, type, a.c);
                f.e((Object)(this.constructorRef = declaredConstructor), "UserData::class.java.get\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (s == null) {
                throw a.h("userId", "userId", jsonReader);
            }
            if (o == null) {
                throw a.h("username", "username", jsonReader);
            }
            if (n2 == null) {
                throw a.h("karma", "karma", jsonReader);
            }
            final int intValue2 = n2;
            if (n3 != null) {
                final UserData instance = declaredConstructor.newInstance(s, o, o2, intValue2, n3, o3, o4, false, n, null);
                f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("createdUtc", "createdUtc", jsonReader);
        }
    }
    
    public void toJson(final x x, final UserData userData) {
        f.f((Object)x, "writer");
        if (userData != null) {
            x.h();
            x.w("userId");
            this.stringAdapter.toJson(x, (Object)userData.getUserId());
            x.w("username");
            this.stringAdapter.toJson(x, (Object)userData.getUsername());
            x.w("iconUrl");
            this.nullableStringAdapter.toJson(x, (Object)userData.getIconUrl());
            x.w("karma");
            this.intAdapter.toJson(x, (Object)userData.getKarma());
            x.w("createdUtc");
            this.longAdapter.toJson(x, (Object)userData.getCreatedUtc());
            x.w("blocked");
            this.nullableBooleanAdapter.toJson(x, (Object)userData.getBlocked());
            x.w("isNsfw");
            this.nullableBooleanAdapter.toJson(x, (Object)userData.isNsfw());
            x.w("isOperator");
            this.booleanAdapter.toJson(x, (Object)userData.isOperator());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(UserData)";
    }
}
