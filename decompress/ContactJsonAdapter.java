// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

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

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/chat/model/ContactJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/Contact;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "doubleAdapter", "", "intAdapter", "nullableStringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class ContactJsonAdapter extends JsonAdapter<Contact>
{
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public ContactJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "contact_account_id", "name", "created_utc", "link_karma", "last_interaction", "comment_karma", "profile_img" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "userId");
        this.doubleAdapter = (JsonAdapter<Double>)y.c((Type)Double.TYPE, (Set)instance, "createdUtc");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "linkKarma");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "profileIcon");
    }
    
    public Contact fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Double n = null;
        Serializable s2;
        Serializable s = s2 = null;
        Serializable s4;
        Serializable s3 = s4 = s2;
        Serializable s6;
        Serializable s5 = s6 = s4;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 6: {
                    s6 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 5: {
                    s4 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (s4 != null) {
                        continue;
                    }
                    throw a.n("commentKarma", "comment_karma", jsonReader);
                }
                case 4: {
                    s3 = (Double)this.doubleAdapter.fromJson(jsonReader);
                    if (s3 != null) {
                        continue;
                    }
                    throw a.n("lastInteraction", "last_interaction", jsonReader);
                }
                case 3: {
                    s = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("linkKarma", "link_karma", jsonReader);
                }
                case 2: {
                    n = (Double)this.doubleAdapter.fromJson(jsonReader);
                    if (n != null) {
                        continue;
                    }
                    throw a.n("createdUtc", "created_utc", jsonReader);
                }
                case 1: {
                    s5 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s5 != null) {
                        continue;
                    }
                    throw a.n("name", "name", jsonReader);
                }
                case 0: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw a.n("userId", "contact_account_id", jsonReader);
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
            throw a.h("userId", "contact_account_id", jsonReader);
        }
        if (s5 == null) {
            throw a.h("name", "name", jsonReader);
        }
        if (n == null) {
            throw a.h("createdUtc", "created_utc", jsonReader);
        }
        final double doubleValue = n;
        if (s == null) {
            throw a.h("linkKarma", "link_karma", jsonReader);
        }
        final int intValue = (int)s;
        if (s3 == null) {
            throw a.h("lastInteraction", "last_interaction", jsonReader);
        }
        final double doubleValue2 = (double)s3;
        if (s4 != null) {
            return new Contact((String)s2, (String)s5, doubleValue, intValue, doubleValue2, (int)s4, (String)s6);
        }
        throw a.h("commentKarma", "comment_karma", jsonReader);
    }
    
    public void toJson(final x x, final Contact contact) {
        f.f((Object)x, "writer");
        if (contact != null) {
            x.h();
            x.w("contact_account_id");
            this.stringAdapter.toJson(x, (Object)contact.getUserId());
            x.w("name");
            this.stringAdapter.toJson(x, (Object)contact.getName());
            x.w("created_utc");
            this.doubleAdapter.toJson(x, (Object)contact.getCreatedUtc());
            x.w("link_karma");
            this.intAdapter.toJson(x, (Object)contact.getLinkKarma());
            x.w("last_interaction");
            this.doubleAdapter.toJson(x, (Object)contact.getLastInteraction());
            x.w("comment_karma");
            this.intAdapter.toJson(x, (Object)contact.getCommentKarma());
            x.w("profile_img");
            this.nullableStringAdapter.toJson(x, (Object)contact.getProfileIcon());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Contact)";
    }
}
