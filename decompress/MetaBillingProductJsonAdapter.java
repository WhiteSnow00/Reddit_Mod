// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.meta.model;

import androidx.viewpager.widget.c;
import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.math.BigInteger;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0013" }, d2 = { "Lcom/reddit/domain/meta/model/MetaBillingProductJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/meta/model/MetaBillingProduct;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigInteger;", "nullableBigIntegerAdapter", "Lcom/reddit/domain/meta/model/MetaCommunityCurrency;", "metaCommunityCurrencyAdapter", "", "booleanAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class MetaBillingProductJsonAdapter extends JsonAdapter<MetaBillingProduct>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<MetaCommunityCurrency> metaCommunityCurrencyAdapter;
    private final JsonAdapter<BigInteger> nullableBigIntegerAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public MetaBillingProductJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "googlePlayPackageName", "googlePlayProductId", "pointsPrice", "currency", "gifsEnabled" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "googlePlayPackageName");
        this.nullableBigIntegerAdapter = (JsonAdapter<BigInteger>)y.c((Type)BigInteger.class, (Set)instance, "pointsPrice");
        this.metaCommunityCurrencyAdapter = (JsonAdapter<MetaCommunityCurrency>)y.c((Type)MetaCommunityCurrency.class, (Set)instance, "currency");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "gifsEnabled");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Object o2;
        Object o = o2 = null;
        Object o4;
        Object o3 = o4 = o2;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f != 4) {
                                    continue;
                                }
                                b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                if (b != null) {
                                    continue;
                                }
                                throw a.n("gifsEnabled", "gifsEnabled", jsonReader);
                            }
                            else {
                                o4 = this.metaCommunityCurrencyAdapter.fromJson(jsonReader);
                                if (o4 != null) {
                                    continue;
                                }
                                throw a.n("currency", "currency", jsonReader);
                            }
                        }
                        else {
                            o3 = this.nullableBigIntegerAdapter.fromJson(jsonReader);
                        }
                    }
                    else {
                        o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    }
                }
                else {
                    o = this.nullableStringAdapter.fromJson(jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (o4 == null) {
            throw a.h("currency", "currency", jsonReader);
        }
        if (b != null) {
            return new MetaBillingProduct((String)o, (String)o2, (BigInteger)o3, (MetaCommunityCurrency)o4, (boolean)b);
        }
        throw a.h("gifsEnabled", "gifsEnabled", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final MetaBillingProduct metaBillingProduct = (MetaBillingProduct)o;
        f.f((Object)x, "writer");
        if (metaBillingProduct != null) {
            x.h();
            x.w("googlePlayPackageName");
            this.nullableStringAdapter.toJson(x, (Object)metaBillingProduct.f);
            x.w("googlePlayProductId");
            this.nullableStringAdapter.toJson(x, (Object)metaBillingProduct.g);
            x.w("pointsPrice");
            this.nullableBigIntegerAdapter.toJson(x, (Object)metaBillingProduct.h);
            x.w("currency");
            this.metaCommunityCurrencyAdapter.toJson(x, (Object)metaBillingProduct.i);
            x.w("gifsEnabled");
            c.u(metaBillingProduct.j, this.booleanAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(MetaBillingProduct)";
    }
}
