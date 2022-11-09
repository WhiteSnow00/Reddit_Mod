// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.meta.model;

import androidx.viewpager.widget.c;
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

@Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\b¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/meta/model/MetaCommunityInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/meta/model/MetaCommunityInfo;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableLongAdapter", "Lcom/reddit/domain/meta/model/MetaCommunityCurrency;", "nullableMetaCommunityCurrencyAdapter", "Lcom/reddit/domain/meta/model/Nomenclature;", "nomenclatureAdapter", "", "nullableStringAdapter", "", "intAdapter", "metaCommunityCurrencyAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class MetaCommunityInfoJsonAdapter extends JsonAdapter<MetaCommunityInfo>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<MetaCommunityCurrency> metaCommunityCurrencyAdapter;
    private final JsonAdapter<Nomenclature> nomenclatureAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<MetaCommunityCurrency> nullableMetaCommunityCurrencyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public MetaCommunityInfoJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "specialMembershipsEnabled", "specialMembershipsBoughtBefore", "userMembershipStart", "userMembershipEnd", "userMembershipCurrency", "showSpecialMembershipBanner", "nomenclature", "pointsName", "pointsImageGrayUrl", "pointsImageFilledUrl", "pointsDecimals", "currency", "renews", "subscriptionAddress" });
        final Class<Boolean> type = Boolean.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)type, (Set)instance, "specialMembershipsEnabled");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "userMembershipStart");
        this.nullableMetaCommunityCurrencyAdapter = (JsonAdapter<MetaCommunityCurrency>)y.c((Type)MetaCommunityCurrency.class, (Set)instance, "userMembershipCurrency");
        this.nomenclatureAdapter = (JsonAdapter<Nomenclature>)y.c((Type)Nomenclature.class, (Set)instance, "nomenclature");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "pointsName");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "pointsDecimals");
        this.metaCommunityCurrencyAdapter = (JsonAdapter<MetaCommunityCurrency>)y.c((Type)MetaCommunityCurrency.class, (Set)instance, "currency");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Serializable s = null;
        Serializable s2;
        Boolean b2 = (Boolean)(s2 = s);
        Serializable s4;
        Serializable s3 = s4 = s2;
        Object o;
        Long n = (Long)(o = s4);
        Object o3;
        Object o2 = o3 = o;
        Object o5;
        Object o4 = o5 = o3;
        Object o7;
        Object o6 = o7 = o5;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 13: {
                    o7 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 12: {
                    s3 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (s3 != null) {
                        continue;
                    }
                    throw a.n("renews", "renews", jsonReader);
                }
                case 11: {
                    o6 = this.metaCommunityCurrencyAdapter.fromJson(jsonReader);
                    if (o6 != null) {
                        continue;
                    }
                    throw a.n("currency", "currency", jsonReader);
                }
                case 10: {
                    s2 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw a.n("pointsDecimals", "pointsDecimals", jsonReader);
                }
                case 9: {
                    o5 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    o4 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    o2 = this.nomenclatureAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        continue;
                    }
                    throw a.n("nomenclature", "nomenclature", jsonReader);
                }
                case 5: {
                    b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b2 != null) {
                        continue;
                    }
                    throw a.n("showSpecialMembershipBanner", "showSpecialMembershipBanner", jsonReader);
                }
                case 4: {
                    o = this.nullableMetaCommunityCurrencyAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    n = (Long)this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    s4 = (Long)this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    s = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("specialMembershipsBoughtBefore", "specialMembershipsBoughtBefore", jsonReader);
                }
                case 0: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("specialMembershipsEnabled", "specialMembershipsEnabled", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (b == null) {
            throw a.h("specialMembershipsEnabled", "specialMembershipsEnabled", jsonReader);
        }
        final boolean booleanValue = b;
        if (s == null) {
            throw a.h("specialMembershipsBoughtBefore", "specialMembershipsBoughtBefore", jsonReader);
        }
        final boolean booleanValue2 = (boolean)s;
        if (b2 == null) {
            throw a.h("showSpecialMembershipBanner", "showSpecialMembershipBanner", jsonReader);
        }
        final boolean booleanValue3 = b2;
        if (o2 == null) {
            throw a.h("nomenclature", "nomenclature", jsonReader);
        }
        if (s2 == null) {
            throw a.h("pointsDecimals", "pointsDecimals", jsonReader);
        }
        final int intValue = (int)s2;
        if (o6 == null) {
            throw a.h("currency", "currency", jsonReader);
        }
        if (s3 != null) {
            return new MetaCommunityInfo(booleanValue, booleanValue2, (Long)s4, n, (MetaCommunityCurrency)o, booleanValue3, (Nomenclature)o2, (String)o3, (String)o4, (String)o5, intValue, (MetaCommunityCurrency)o6, (boolean)s3, (String)o7);
        }
        throw a.h("renews", "renews", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final MetaCommunityInfo metaCommunityInfo = (MetaCommunityInfo)o;
        f.f((Object)x, "writer");
        if (metaCommunityInfo != null) {
            x.h();
            x.w("specialMembershipsEnabled");
            a.v(metaCommunityInfo.a, (JsonAdapter)this.booleanAdapter, x, "specialMembershipsBoughtBefore");
            a.v(metaCommunityInfo.b, (JsonAdapter)this.booleanAdapter, x, "userMembershipStart");
            this.nullableLongAdapter.toJson(x, (Object)metaCommunityInfo.c);
            x.w("userMembershipEnd");
            this.nullableLongAdapter.toJson(x, (Object)metaCommunityInfo.d);
            x.w("userMembershipCurrency");
            this.nullableMetaCommunityCurrencyAdapter.toJson(x, (Object)metaCommunityInfo.e);
            x.w("showSpecialMembershipBanner");
            a.v(metaCommunityInfo.f, (JsonAdapter)this.booleanAdapter, x, "nomenclature");
            this.nomenclatureAdapter.toJson(x, (Object)metaCommunityInfo.g);
            x.w("pointsName");
            this.nullableStringAdapter.toJson(x, (Object)metaCommunityInfo.h);
            x.w("pointsImageGrayUrl");
            this.nullableStringAdapter.toJson(x, (Object)metaCommunityInfo.i);
            x.w("pointsImageFilledUrl");
            this.nullableStringAdapter.toJson(x, (Object)metaCommunityInfo.j);
            x.w("pointsDecimals");
            c.n(metaCommunityInfo.k, this.intAdapter, x, "currency");
            this.metaCommunityCurrencyAdapter.toJson(x, (Object)metaCommunityInfo.l);
            x.w("renews");
            a.v(metaCommunityInfo.m, (JsonAdapter)this.booleanAdapter, x, "subscriptionAddress");
            this.nullableStringAdapter.toJson(x, (Object)metaCommunityInfo.n);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(MetaCommunityInfo)";
    }
}
