// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.mod;

import com.squareup.moshi.x;
import dd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017" }, d2 = { "Lcom/reddit/domain/model/mod/ModPermissionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/mod/ModPermissions;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class ModPermissionsJsonAdapter extends JsonAdapter<ModPermissions>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader$b options;
    
    public ModPermissionsJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "access", "config", "flair", "mail", "posts", "wiki", "chat_config", "chat_operator", "all" });
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)EmptySet.INSTANCE, "access");
    }
    
    public ModPermissions fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Boolean b2 = null;
        Boolean b3 = null;
        Boolean b5;
        Boolean b4 = b5 = b3;
        Boolean b7;
        Boolean b6 = b7 = b5;
        Boolean b9;
        Boolean b8 = b9 = b7;
        while (jsonReader.hasNext()) {
            switch (jsonReader.E(this.options)) {
                default: {
                    continue;
                }
                case 8: {
                    b9 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b9 != null) {
                        continue;
                    }
                    throw a.n("all", "all", jsonReader);
                }
                case 7: {
                    b8 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b8 != null) {
                        continue;
                    }
                    throw a.n("chatOperator", "chat_operator", jsonReader);
                }
                case 6: {
                    b7 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b7 != null) {
                        continue;
                    }
                    throw a.n("chatConfig", "chat_config", jsonReader);
                }
                case 5: {
                    b6 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b6 != null) {
                        continue;
                    }
                    throw a.n("wiki", "wiki", jsonReader);
                }
                case 4: {
                    b5 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b5 != null) {
                        continue;
                    }
                    throw a.n("posts", "posts", jsonReader);
                }
                case 3: {
                    b4 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b4 != null) {
                        continue;
                    }
                    throw a.n("mail", "mail", jsonReader);
                }
                case 2: {
                    b3 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b3 != null) {
                        continue;
                    }
                    throw a.n("flair", "flair", jsonReader);
                }
                case 1: {
                    b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b2 != null) {
                        continue;
                    }
                    throw a.n("config", "config", jsonReader);
                }
                case 0: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("access", "access", jsonReader);
                }
                case -1: {
                    jsonReader.H();
                    jsonReader.G1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (b == null) {
            throw a.h("access", "access", jsonReader);
        }
        final boolean booleanValue = b;
        if (b2 == null) {
            throw a.h("config", "config", jsonReader);
        }
        final boolean booleanValue2 = b2;
        if (b3 == null) {
            throw a.h("flair", "flair", jsonReader);
        }
        final boolean booleanValue3 = b3;
        if (b4 == null) {
            throw a.h("mail", "mail", jsonReader);
        }
        final boolean booleanValue4 = b4;
        if (b5 == null) {
            throw a.h("posts", "posts", jsonReader);
        }
        final boolean booleanValue5 = b5;
        if (b6 == null) {
            throw a.h("wiki", "wiki", jsonReader);
        }
        final boolean booleanValue6 = b6;
        if (b7 == null) {
            throw a.h("chatConfig", "chat_config", jsonReader);
        }
        final boolean booleanValue7 = b7;
        if (b8 == null) {
            throw a.h("chatOperator", "chat_operator", jsonReader);
        }
        final boolean booleanValue8 = b8;
        if (b9 != null) {
            return new ModPermissions(booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, booleanValue8, b9);
        }
        throw a.h("all", "all", jsonReader);
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final ModPermissions modPermissions) {
        e.f((Object)x, "writer");
        if (modPermissions != null) {
            x.h();
            x.v("access");
            this.booleanAdapter.toJson(x, (Object)modPermissions.getAccess());
            x.v("config");
            this.booleanAdapter.toJson(x, (Object)modPermissions.getConfig());
            x.v("flair");
            this.booleanAdapter.toJson(x, (Object)modPermissions.getFlair());
            x.v("mail");
            this.booleanAdapter.toJson(x, (Object)modPermissions.getMail());
            x.v("posts");
            this.booleanAdapter.toJson(x, (Object)modPermissions.getPosts());
            x.v("wiki");
            this.booleanAdapter.toJson(x, (Object)modPermissions.getWiki());
            x.v("chat_config");
            this.booleanAdapter.toJson(x, (Object)modPermissions.getChatConfig());
            x.v("chat_operator");
            this.booleanAdapter.toJson(x, (Object)modPermissions.getChatOperator());
            x.v("all");
            this.booleanAdapter.toJson(x, (Object)modPermissions.getAll());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (ModPermissions)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(ModPermissions)";
    }
}
