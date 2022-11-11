// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.sociallink;

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

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/sociallink/SocialLinkJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/sociallink/SocialLink;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "nullableStringAdapter", "Lcom/reddit/domain/model/sociallink/SocialLinkType;", "socialLinkTypeAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SocialLinkJsonAdapter extends JsonAdapter<SocialLink>
{
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<SocialLinkType> socialLinkTypeAdapter;
    private final JsonAdapter<String> stringAdapter;
    
    public SocialLinkJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "url", "position", "title", "handle", "type" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "position");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "handle");
        this.socialLinkTypeAdapter = (JsonAdapter<SocialLinkType>)y.c((Type)SocialLinkType.class, (Set)instance, "type");
    }
    
    public SocialLink fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Integer n = null;
        Serializable s = null;
        Serializable s3;
        String s2 = (String)(s3 = s);
        Serializable s5;
        String s4 = (String)(s5 = s3);
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 5: {
                    s5 = (SocialLinkType)this.socialLinkTypeAdapter.fromJson(jsonReader);
                    if (s5 != null) {
                        continue;
                    }
                    throw a.n("type", "type", jsonReader);
                }
                case 4: {
                    s4 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    s3 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s3 != null) {
                        continue;
                    }
                    throw a.n("title", "title", jsonReader);
                }
                case 2: {
                    n = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n != null) {
                        continue;
                    }
                    throw a.n("position", "position", jsonReader);
                }
                case 1: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw a.n("url", "url", jsonReader);
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (s2 == null) {
            throw a.h("url", "url", jsonReader);
        }
        if (n == null) {
            throw a.h("position", "position", jsonReader);
        }
        final int intValue = n;
        if (s3 == null) {
            throw a.h("title", "title", jsonReader);
        }
        if (s5 != null) {
            return new SocialLink((String)s, s2, intValue, (String)s3, s4, (SocialLinkType)s5);
        }
        throw a.h("type", "type", jsonReader);
    }
    
    public void toJson(final x x, final SocialLink socialLink) {
        f.f((Object)x, "writer");
        if (socialLink != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)socialLink.getId());
            x.w("url");
            this.stringAdapter.toJson(x, (Object)socialLink.getUrl());
            x.w("position");
            this.intAdapter.toJson(x, (Object)socialLink.getPosition());
            x.w("title");
            this.stringAdapter.toJson(x, (Object)socialLink.getTitle());
            x.w("handle");
            this.nullableStringAdapter.toJson(x, (Object)socialLink.getHandle());
            x.w("type");
            this.socialLinkTypeAdapter.toJson(x, (Object)socialLink.getType());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SocialLink)";
    }
}
