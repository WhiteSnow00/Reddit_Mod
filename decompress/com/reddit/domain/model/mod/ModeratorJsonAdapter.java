// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.mod;

import com.squareup.moshi.x;
import java.io.Serializable;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/model/mod/ModeratorJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/mod/Moderator;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "longAdapter", "Lcom/reddit/domain/model/mod/ModPermissions;", "modPermissionsAdapter", "", "doubleAdapter", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class ModeratorJsonAdapter extends JsonAdapter<Moderator>
{
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<ModPermissions> modPermissionsAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public ModeratorJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "username", "authorFlairText", "id", "moddedAtUTC", "modPermissions", "accountIcon", "postKarma", "reason", "isEditable" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "username");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "authorFlairText");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "atUtc");
        this.modPermissionsAdapter = (JsonAdapter<ModPermissions>)y.c((Type)ModPermissions.class, (Set)instance, "modPermissions");
        this.doubleAdapter = (JsonAdapter<Double>)y.c((Type)Double.TYPE, (Set)instance, "postKarma");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "editable");
    }
    
    public Moderator fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Long n = null;
        Serializable s2;
        Serializable s = s2 = null;
        Serializable s4;
        String s3 = (String)(s4 = s2);
        Object o2;
        Object o = o2 = s4;
        Object o4;
        Object o3 = o4 = o2;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 8: {
                    o4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    s = (Double)this.doubleAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("postKarma", "postKarma", jsonReader);
                }
                case 5: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    o = this.modPermissionsAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("modPermissions", "modPermissions", jsonReader);
                }
                case 3: {
                    n = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n != null) {
                        continue;
                    }
                    throw a.n("atUtc", "moddedAtUTC", jsonReader);
                }
                case 2: {
                    s4 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s4 != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
                case 1: {
                    s3 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 0: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
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
        if (s2 == null) {
            throw a.h("username", "username", jsonReader);
        }
        if (s4 == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (n == null) {
            throw a.h("atUtc", "moddedAtUTC", jsonReader);
        }
        final long longValue = n;
        if (o == null) {
            throw a.h("modPermissions", "modPermissions", jsonReader);
        }
        if (s != null) {
            return new Moderator((String)s2, s3, (String)s4, longValue, (ModPermissions)o, (String)o2, (double)s, (String)o3, (Boolean)o4);
        }
        throw a.h("postKarma", "postKarma", jsonReader);
    }
    
    public void toJson(final x x, final Moderator moderator) {
        f.f((Object)x, "writer");
        if (moderator != null) {
            x.h();
            x.w("username");
            this.stringAdapter.toJson(x, (Object)moderator.getUsername());
            x.w("authorFlairText");
            this.nullableStringAdapter.toJson(x, (Object)moderator.getAuthorFlairText());
            x.w("id");
            this.stringAdapter.toJson(x, (Object)moderator.getId());
            x.w("moddedAtUTC");
            this.longAdapter.toJson(x, (Object)moderator.getAtUtc());
            x.w("modPermissions");
            this.modPermissionsAdapter.toJson(x, (Object)moderator.getModPermissions());
            x.w("accountIcon");
            this.nullableStringAdapter.toJson(x, (Object)moderator.getAccountIcon());
            x.w("postKarma");
            this.doubleAdapter.toJson(x, (Object)moderator.getPostKarma());
            x.w("reason");
            this.nullableStringAdapter.toJson(x, (Object)moderator.getReason());
            x.w("isEditable");
            this.nullableBooleanAdapter.toJson(x, (Object)moderator.getEditable());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Moderator)";
    }
}
